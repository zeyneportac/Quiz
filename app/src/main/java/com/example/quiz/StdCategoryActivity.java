package com.example.quiz;

import static com.example.quiz.SplashActivity.catList;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;


public class StdCategoryActivity extends AppCompatActivity {

    private ListView catListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_std_category);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Categories");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        catListView = findViewById(R.id.catListview);


        CatGridAdapter adapter = new CatGridAdapter(catList);
        catListView.setAdapter(adapter);


    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId() == android.R.id.home)
        {
            StdCategoryActivity.this.finish();
        }

        return super.onOptionsItemSelected(item);
    }
}