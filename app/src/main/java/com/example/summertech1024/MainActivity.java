package com.example.summertech1024;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    String[] img_descrip;
    int[] imgs = {R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4};
    private Toolbar mToolbar;
    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolbar = findViewById(R.id.main_toolbar);
        setSupportActionBar(mToolbar);

        mRecyclerView = findViewById(R.id.mRecyclerView);
        img_descrip = getResources().getStringArray(R.array.img_description);

        myAdapter madapter = new myAdapter(this, img_descrip, imgs);
        mRecyclerView.setAdapter(madapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.about:
                Intent intent0 = new Intent(this, About.class);
                startActivity(intent0);
                break;
            case R.id.help:
                Intent intent1 = new Intent(this, Help.class);
                startActivity(intent1);
                break;
            case R.id.setting:
                Intent intent2 = new Intent(this, Settings.class);
                startActivity(intent2);
                break;
            case R.id.history:
                Intent intent3 = new Intent(this, History.class);
                startActivity(intent3);
                break;

            default:
                Toast.makeText(this, "developed by ones", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public void showToast(View view) {
        Toast.makeText(this, "developed by onesmus", Toast.LENGTH_SHORT).show();
    }
}