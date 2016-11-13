package at.fh.swengb.ohmscalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editTextU;
    EditText editTextI;
    EditText editTextR;
    TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextU = (EditText) findViewById(R.id.editTextU);
        editTextI = (EditText) findViewById(R.id.editTextI);
        editTextR = (EditText) findViewById(R.id.editTextR);
        textViewResult = (TextView) findViewById(R.id.textViewResult);
    }

    public void calcU(View view){
        try {
            double i = Double.parseDouble(editTextI.getText().toString());
            double r = Double.parseDouble(editTextR.getText().toString());
            double u = i * r;
            textViewResult.setText("Voltage U: " + i + " x " + r + " = " + u + " Volt");
        } catch (NumberFormatException e) {
            textViewResult.setText("WRONG INPUT!");
            e.printStackTrace();
        }
    }
    public void calcI(View view){
        try {
            double u = Double.parseDouble(editTextU.getText().toString());
            double r = Double.parseDouble(editTextR.getText().toString());
            double i = u / r;
            textViewResult.setText("Current I: " + u + " / " + r + " = " + i + " Ampere");
        } catch (NumberFormatException e) {
            textViewResult.setText("WRONG INPUT!");
            e.printStackTrace();
        }
    }
    public void calcR(View view){
        try {
            double u = Double.parseDouble(editTextU.getText().toString());
            double i = Double.parseDouble(editTextI.getText().toString());
            double r = u / i;
            textViewResult.setText("Resistor R: " + u + " / " + i + " = " + r + " Ohm");
        } catch (NumberFormatException e) {
            textViewResult.setText("WRONG INPUT!");
            e.printStackTrace();
        }
    }
}
