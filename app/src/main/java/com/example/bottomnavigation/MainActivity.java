package com.example.bottomnavigation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    BottomNavigationView bottomNavigationView;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView=(BottomNavigationView)findViewById(R.id.bottomNavigation_id);
        txt=(TextView)findViewById(R.id.text_id);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        int id= menuItem.getItemId();

        switch (id){


            case R.id.recents_id:

                txt.setText(getResources().getText(R.string.recents));
               return true;
            case R.id.nearby_id:
                txt.setText(getResources().getText(R.string.nearby));
                return true;
            case R.id.favorites_id:
                txt.setText(getResources().getText(R.string.favorites));
                return true;

        }


        return false;
    }
}
