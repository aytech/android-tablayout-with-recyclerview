package com.oleg;

import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.oleg.fragments.TabOneFragment;
import com.oleg.fragments.TabThreeFragment;
import com.oleg.fragments.TabTwoFragment;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();

        assert actionBar != null;
        actionBar.setDisplayHomeAsUpEnabled(true);

        TabLayout tabLayout = findViewById(R.id.tabLayout);
        ViewPager viewPager = findViewById(R.id.viewpager);
        setupViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);

        Objects.requireNonNull(tabLayout.getTabAt(0)).setIcon(R.drawable.ic_action_person);
        Objects.requireNonNull(tabLayout.getTabAt(1)).setIcon(R.drawable.ic_action_group);
        Objects.requireNonNull(tabLayout.getTabAt(2)).setIcon(R.drawable.ic_action_call);
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new TabOneFragment(), "One");
        adapter.addFragment(new TabTwoFragment(), "Two");
        adapter.addFragment(new TabThreeFragment(), "Three");
        viewPager.setAdapter(adapter);
    }
}
