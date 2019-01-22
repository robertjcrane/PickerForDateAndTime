package net.robertcrane.pickerfordate;

import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }//end onCreate

    public void showDatePicker(View view) {
        DialogFragment dateFragment = new DatePickerFragment();
        dateFragment.show(getSupportFragmentManager(), "datePicker");
    }//end showDatePicker

    public void showTimePicker(View view) {
        DialogFragment timeFragment = new TimePickerFragment();
        timeFragment.show(getSupportFragmentManager(), "timePicker");
    }//end showDatePicker

    public void processDatePickerResult(int y, int m, int d) {
        String m_string = Integer.toString(m + 1);
        String d_string = Integer.toString(d);
        String y_string = Integer.toString(y);
        String dateMessage = (d_string + "-" + m_string + "-" + y_string);
        Toast.makeText(this, getString(R.string.date)+dateMessage,Toast.LENGTH_SHORT).show();
    }

    public void processTimePickerResult(int h, int m) {
        String m_string = Integer.toString(m);
        String h_string = Integer.toString(h);
        String dateMessage = (h_string + ":" + m_string);
        Toast.makeText(this, getString(R.string.date)+dateMessage,Toast.LENGTH_SHORT).show();
    }

}
