package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Intent intent,chooser=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void verify(View v) {
        if (v.getId() == R.id.btn)
            intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("geo:10.065306,76.629128"));
        chooser = Intent.createChooser(intent, "launchmaps");
        startActivity(chooser);
    }

}
