package com.example.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button adminbtn;
    private Button studentbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        adminbtn = (Button) findViewById(R.id.adminbtn);
        studentbtn = (Button) findViewById(R.id.studentbtn);

        adminbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAdminActivity();
            }
        });
        studentbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openStudentActivity();
            }
        });



    }



    public void openAdminActivity(){
        Intent intent = new Intent(this, CategoryActivity.class);
        startActivity(intent);
    }

    public void openStudentActivity(){
        Intent intent = new Intent(MainActivity.this, StdCategoryActivity.class);
        startActivity(intent);
    }
}