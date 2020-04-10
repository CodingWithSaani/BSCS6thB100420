package com.ekorydes.bscs6thb100420;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView=findViewById(R.id.tv);

        try {
            if (getIntent() != null) {
                Student object = getIntent().getParcelableExtra("student");
                textView.setText("Student data:" + object.getMadSubject().getSubjectName());
            } else {
                Toast.makeText(this, "No data is available", Toast.LENGTH_SHORT).show();
            }
        }
        catch (Exception e)
        {
            Toast.makeText(this, "E:"+e.getMessage(), Toast.LENGTH_SHORT).show();
        }

    }
}
