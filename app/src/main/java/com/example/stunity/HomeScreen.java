package com.example.stunity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class HomeScreen extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    HomeFragment homeFragment = new HomeFragment();
    TopicsFragment topicsFragment = new TopicsFragment();
    ChatsFragment chatsFragment = new ChatsFragment();
    AccountFragment accountFragment = new AccountFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        BadgeDrawable badgeDrawable = bottomNavigationView.getOrCreateBadge(R.id.Chats);
        badgeDrawable.setVisible(true);
        badgeDrawable.setNumber(6);
        bottomNavigationView = findViewById(R.id.bottom_navigation);
        getSupportFragmentManager().beginTransaction().replace(R.id.container,homeFragment).commit();
        bottomNavigationView.setOnItemReselectedListener(new NavigationBarView.OnItemReselectedListener() {
            @Override
            public void onNavigationItemReselected( MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, homeFragment).commit();
                        return;

                    case R.id.topics:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,topicsFragment).commit();
                        return;
                    case R.id.Chats:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,chatsFragment).commit();
                        return;
                    case R.id.Account:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,accountFragment).commit();
                        return;
                }
            }
        });
    }
}