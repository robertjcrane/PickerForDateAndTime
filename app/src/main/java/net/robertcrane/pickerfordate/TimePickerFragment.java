package net.robertcrane.pickerfordate;


import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.TimePicker;

import java.sql.Time;
import java.util.Calendar;

/**
 * A simple {@link Fragment} subclass.
 */
public class TimePickerFragment extends DialogFragment implements TimePickerDialog.OnTimeSetListener {


    public TimePickerFragment() {
        // Required empty public constructor
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        final Calendar c = Calendar.getInstance();
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int min = c.get(Calendar.MINUTE);

        return new TimePickerDialog(getActivity(), this, hour, min, DateFormat.is24HourFormat(getActivity()));
    }//end onCreateDialog

    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        MainActivity activity = (MainActivity) getActivity();
        activity.processTimePickerResult(hourOfDay, minute);
    }//end onTimeSet
}
