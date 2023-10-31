package br.com.etecia.appinsta;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends AppCompatActivity {
    BottomNavigationView bottomNav;
    ViewPager2 viewPager2;
    BottomAdapter bottomAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_layout);

        bottomNav = findViewById(R.id.idBottomNav);
        viewPager2 = findViewById(R.id.idViewPager);

        bottomAdapter = new BottomAdapter(this);

        viewPager2.setAdapter(bottomAdapter);

    }
}