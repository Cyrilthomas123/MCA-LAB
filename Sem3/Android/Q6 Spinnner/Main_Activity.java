package com.example.spinner1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    int image[] = {R.drawable.fi1, R.drawable.fi2, R.drawable.fi3};
    Spinner sp;
    ImageView i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp = (Spinner) findViewById(R.id.sp);
        sp.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {
        i = (ImageView) findViewById(R.id.img);
        i.setImageResource(image[position]);
        TextView myText = (TextView) view;
        Toast.makeText(this,"You selected: "+myText.getText(),Toast.LENGTH_LONG).show();
    }
    
    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
