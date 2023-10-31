package br.com.etecia.appinsta;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class HomeActivity extends AppCompatActivity {
    BottomNavigationView bottomNav;

    HomeFragment homeFragment = new HomeFragment();
    NewPublishFragment newPublishFragment = new NewPublishFragment();
    ProfileFragment profileFragment = new ProfileFragment();
    ReelsFragment reelsFragment = new ReelsFragment();
    SearchFragment searchFragment = new SearchFragment();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_layout);

        bottomNav = findViewById(R.id.idBottomNav);


        getSupportFragmentManager().beginTransaction().replace(R.id.idContainer, homeFragment).commit();

        bottomNav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                if (item.getItemId() == R.id.mHome) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.idContainer, homeFragment).commit();
                    return true;
                } else if (item.getItemId() == R.id.mSearch) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.idContainer, searchFragment).commit();
                    return true;
                } else if (item.getItemId() == R.id.mNewPublish) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.idContainer, newPublishFragment).commit();
                    return true;
                } else if (item.getItemId() == R.id.mMedia) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.idContainer, reelsFragment).commit();
                    return true;
                } else if (item.getItemId() == R.id.mPerfil) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.idContainer, profileFragment).commit();
                    return true;
                }

                return false;
            }
        });


    }
}