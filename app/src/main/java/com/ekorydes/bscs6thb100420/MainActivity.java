package com.ekorydes.bscs6thb100420;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import javax.security.auth.Subject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void moveData(View view)
    {
        try
        {
            Student objectStudent=new Student();
            objectStudent.setName("Ali Sheraz");

            objectStudent.setRoll(123);
            Subjects madSubject=new Subjects();

            madSubject.setSubjectName("Mobile Application");
            objectStudent.setMadSubject(madSubject);

            startActivity(new Intent(this,SecondActivity.class)
            .putExtra("student",objectStudent)
            );
        }
        catch (Exception e)
        {
            Toast.makeText(this, ""+e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
}
