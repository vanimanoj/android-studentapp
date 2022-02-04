package com.example.studentapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AddFaculty extends AppCompatActivity {
EditText ed1,ed2,ed3,ed4;
AppCompatButton b1,b2;
String getfacultyname,getdepartment,getdesignation,getmoblieno;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_faculty);
        ed1=(EditText) findViewById(R.id.facultyname);
        ed2=(EditText) findViewById(R.id.department);
        ed3=(EditText) findViewById(R.id.designation);
        ed4=(EditText) findViewById(R.id.mobileno);
        b1=(AppCompatButton) findViewById(R.id.submit);
        b2=(AppCompatButton) findViewById(R.id.backtodashboard);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),DashboardActivty.class);
                startActivity(i);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               getfacultyname=ed1.getText().toString();
               getdepartment=ed2.getText().toString();
               getdesignation=ed3.getText().toString();
               getmoblieno=ed4.getText().toString();
                Toast.makeText(getApplicationContext(),getfacultyname,Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getdepartment,Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getdesignation,Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getmoblieno,Toast.LENGTH_SHORT).show();
            }
        });
    }
}