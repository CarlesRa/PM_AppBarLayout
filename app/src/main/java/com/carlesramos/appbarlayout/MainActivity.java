package com.carlesramos.appbarlayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;


import android.os.Bundle;

import com.carlesramos.appbarlayout.adapters.FragmentAdapter;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private FragmentAdapter adapter;
    private ViewPager pager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.tbMain);
        setSupportActionBar(toolbar);

        TabLayout tabLayout = findViewById(R.id.tbLayout);

        adapter = new FragmentAdapter(getSupportFragmentManager(),this);

        pager = findViewById(R.id.vpMain);
        pager.setAdapter(adapter);

        pager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(pager));


    }
}
