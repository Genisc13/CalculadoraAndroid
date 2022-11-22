package edu.upc.dsa.myapplication;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView)findViewById(R.id.TextoCalcu);
    }

    public void igualarem(View view) {

        String a= textView.getText().toString();
        String[] b=a.split("");
        for(int i=0; i<a.length();i++){
            a="0";
        }
    }

    public void Ponemenos(View view) {
        String a;
        a = textView.getText().toString();
        a = a + "-";
        textView.setText(a);

    }

    public void Ponermas(View view) {
        String a;
        a = textView.getText().toString();
        a = a + "+";
        textView.setText(a);

    }

    public void Poner0(View view) {
        String a;
        a = textView.getText().toString();
        a = a + "0";
        textView.setText(a);
    }

    public void Poner9(View view) {
        String a;
        a = textView.getText().toString();
        a = a + "9";
        textView.setText(a);

    }

    public void Poner8(View view) {
        String a;
        a = textView.getText().toString();
        a = a + "8";
        textView.setText(a);

    }

    public void Poner7(View view) {
        String a;
        a = textView.getText().toString();
        a = a + "7";
        textView.setText(a);

    }

    public void Poner6(View view) {
        String a;
        a = textView.getText().toString();
        a = a + "6";
        textView.setText(a);

    }

    public void Poner5(View view) {
        String a;
        a = textView.getText().toString();
        a = a + "5";
        textView.setText(a);

    }

    public void Poner4(View view) {
        String a;
        a = textView.getText().toString();
        a = a + "4";
        textView.setText(a);
    }

    public void Poner3(View view) {
        String a;
        a = textView.getText().toString();
        a = a + "3";
        textView.setText(a);

    }

    public void Poner2(View view) {
        String a;
        a = textView.getText().toString();
        a = a + "2";
        textView.setText(a);
    }

    public void Poner1(View view) {
        String a;
        a = textView.getText().toString();
        a = a + "1";
        textView.setText(a);
    }

    public void limpiarbutton(View view) {
        textView.setText("");

    }

    public void Ponerpor(View view) {
        String a;
        a = textView.getText().toString();
        a = a + "*";
        textView.setText(a);
    }

    public void Ponerdividido(View view) {
        String a;
        a = textView.getText().toString();
        a = a + "/";
        textView.setText(a);
    }
}