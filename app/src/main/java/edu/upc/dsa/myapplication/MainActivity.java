package edu.upc.dsa.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView)findViewById(R.id.TextoCalcu);
    }

    public void igualarem(View view) {

    }

    public void Ponemenos(View view) {

    }

    public void Añademas(View view) {

    }

    public void Añadir0(View view) {

    }

    public void Añadir9(View view) {

    }

    public void Añadir8(View view) {

    }

    public void Añadir7(View view) {

    }

    public void Añadir6(View view) {

    }

    public void Añadir5(View view) {

    }

    public void Poner4(View view) {
        String a ="";
        a = textView.getText().toString();
        a = a + "4";
        textView.setText(a);
    }

    public void Poner3(View view) {
        String a ="";
        a = textView.getText().toString();
        a = a + "3";
        textView.setText(a);

    }

    public void Poner2(View view) {
        String a ="";
        a = textView.getText().toString();
        a = a + "2";
        textView.setText(a);
    }

    public void Poner1(View view) {
        String a ="";
        a = textView.getText().toString();
        a = a + "1";
        textView.setText(a);
    }

    public void limpiarbutton(View view) {

    }
}