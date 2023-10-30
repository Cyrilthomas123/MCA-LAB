package com.example.myapplication;

import android.graphics.Typeface;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Gravity;
import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.myapplication.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {
    LinearLayout ll;
    TextView t;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ll=new LinearLayout(this);
        t=new TextView(this);
        b=new Button(this);
        LinearLayout.LayoutParams dim=new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ActionBar.LayoutParams.MATCH_PARENT);
        ll.setLayoutParams(dim);
        LinearLayout.LayoutParams vdim=new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        vdim.setMargins(0,50,0,0);
        t.setLayoutParams(vdim);
        b.setLayoutParams(vdim);
        ll.setOrientation(LinearLayout.VERTICAL);
        ll.setVerticalGravity(Gravity.CENTER);
        t.setText("HEllO ALL");
        t.setGravity(Gravity.CENTER);
        t.setTextSize(35);
        t.setTextColor(Color.BLUE);
        t.setTypeface(Typeface.DEFAULT_BOLD);
        b.setText("HI BUTTON");
        b.setBackgroundColor(Color.YELLOW);
        ll.addView(t);
        ll.addView(b);
        setContentView(ll);

    }
}
