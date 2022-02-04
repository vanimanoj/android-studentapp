package com.example.studentapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AddExam extends AppCompatActivity {
EditText ed1,ed2,ed3,ed4;
AppCompatButton b1,b2;
String getsemester,getexamname,getexamdate,getremark;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_exam);
        ed1=(EditText) findViewById(R.id.semester);
        ed2=(EditText) findViewById(R.id.examname);
        ed3=(EditText) findViewById(R.id.examdate);
        ed4=(EditText) findViewById(R.id.remark);
        b1=(AppCompatButton) findViewById(R.id.submit);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getsemester=ed1.getText().toString();
                getexamname=ed2.getText().toString();
                getexamdate=ed3.getText().toString();
                getremark=ed4.getText().toString();
                Toast.makeText(getApplicationContext(),getsemester, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getexamname, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getexamdate,Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getremark,Toast.LENGTH_SHORT).show();

            }
        });
        b2=(AppCompatButton) findViewById(R.id.backtodashboard);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),DashboardActivty.class);
                startActivity(i);
            }
        });
    }
}