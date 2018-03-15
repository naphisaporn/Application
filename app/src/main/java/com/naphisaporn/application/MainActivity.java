package com.naphisaporn.application;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.checkbox_friendly:
                if (checked)
                    System.out.println("Put some meat on the sandwich");
                else
                    System.out.println("Remove the meat");
                break;
            case R.id.checkbox_clever:
                if (checked)
                    System.out.println("Cheese me");
                else
                    System.out.println("I'm lactose intolerant");
                break;
            case R.id.checkbox_awake:
                if (checked)
                    System.out.println("Cheese me");
                else
                    System.out.println("I'm lactose intolerant");
                break;
            case R.id.checkbox_brave:
                if (checked)
                    System.out.println("Cheese me");
                else
                    System.out.println("I'm lactose intolerant");
                break;
            case R.id.checkbox_energy:
                if (checked)
                    System.out.println("Cheese me");
                else
                    System.out.println("I'm lactose intolerant");
                break;
            case R.id.checkbox_loyal:
                if (checked)
                    System.out.println("Cheese me");
                else
                    System.out.println("I'm lactose intolerant");
                break;
            case R.id.checkbox_friendly2:
                if (checked)
                    System.out.println("Put some meat on the sandwich");
                else
                    System.out.println("Remove the meat");
                break;
            case R.id.checkbox_clever2:
                if (checked)
                    System.out.println("Cheese me");
                else
                    System.out.println("I'm lactose intolerant");
                break;
            case R.id.checkbox_awake2:
                if (checked)
                    System.out.println("Cheese me");
                else
                    System.out.println("I'm lactose intolerant");
                break;
            case R.id.checkbox_brave2:
                if (checked)
                    System.out.println("Cheese me");
                else
                    System.out.println("I'm lactose intolerant");
                break;
            case R.id.checkbox_energy2:
                if (checked)
                    System.out.println("Cheese me");
                else
                    System.out.println("I'm lactose intolerant");
                break;
            case R.id.checkbox_loyal2:
                if (checked)
                    System.out.println("Cheese me");
                else
                    System.out.println("I'm lactose intolerant");
                break;
            case R.id.checkbox_curious:
                if (checked)
                    System.out.println("Cheese me");
                else
                    System.out.println("I'm lactose intolerant");
                break;
            case R.id.checkbox_canny:
                if (checked)
                    System.out.println("Cheese me");
                else
                    System.out.println("I'm lactose intolerant");
                break;
        }
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radio_germany:
                if (checked)
                    System.out.println("Pirates are the best");
                break;
            case R.id.radio_america:
                if (checked)
                    System.out.println("Ninjas rule ");
                break;
            case R.id.radio_germany2:
                if (checked)
                    System.out.println("Pirates are the best");
                break;
            case R.id.radio_america2:
                if (checked)
                    System.out.println("Ninjas rule ");
                break;
            case R.id.radio_thai:
                if (checked)
                    System.out.println("Ninjas rule ");
                break;
        }
    }
}
