package com.example.studentapp;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class DashboardActivty extends AppCompatActivity {
Button b1,b2,b3,b4,b5;
SharedPreferences mypreference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_activty);
        mypreference=getSharedPreferences("login",MODE_PRIVATE);

        b1= (AppCompatButton) findViewById(R.id.addcourse);
        b2=(AppCompatButton) findViewById(R.id.addfaculty);
        b3=(AppCompatButton) findViewById(R.id.addexam);
        b4=(AppCompatButton) findViewById(R.id.website);
        b5=(AppCompatButton)findViewById(R.id.logout);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
          SharedPreferences.Editor myedit=mypreference.edit();
          myedit.clear();
          myedit.commit();
                Toast.makeText(getApplicationContext(), " logged out succesfully", Toast.LENGTH_SHORT).show();

                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), WebSite.class);
                startActivity(i);

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {
                                      Intent i = new Intent(getApplicationContext(), AddExam.class);
                                      startActivity(i);
                                  }
});
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(getApplicationContext(), AddFaculty.class);
                        startActivity(i);
                    }
                });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),AddCourse.class);
                startActivity(i);

                }

        });
    }
}