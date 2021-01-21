package com.example.smartapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity implements TabLayout.OnTabSelectedListener {

    Button calculatorFragment, converterFragment;


    TabLayout tabs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_screen);

        TabLayout tabs = findViewById(R.id.tab);
            tabs.addTab(tabs.newTab().setText("CALCULATOR").setIcon(R.drawable.calculator_icon));
            tabs.addTab(tabs.newTab().setText("CONVERTER").setIcon(R.drawable.converter_icon));
            tabs.setTabGravity(TabLayout.GRAVITY_FILL);

        ViewPager viewPager = findViewById(R.id.viewp);
        TabsAdapter tabsAdapter = new TabsAdapter(getSupportFragmentManager(), tabs.getTabCount());
        viewPager.setAdapter(tabsAdapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabs));
        tabs.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

       /* tabs = (TabLayout) findViewById(R.id.tabLayout);

        tabs.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {

                                          @Override
                                          public void onTabSelected(TabLayout.Tab tab) {
                                              Log.i("asd",tab.getText().toString());
                                          }

                                          @Override
                                          public void onTabUnselected(TabLayout.Tab tab) {

                                          }

                                          @Override
                                          public void onTabReselected(TabLayout.Tab tab) {

                                          }
                                      }
        );*/


      /*  calculatorFragment = (Button) findViewById(R.id.calculatorFragment);
        converterFragment = (Button) findViewById(R.id.converterFragment);

        calculatorFragment.setOnClickListener(v -> {
            loadFragment(new CalculatorFragment());
        });

        converterFragment.setOnClickListener(v -> {
            loadFragment(new ConverterFragment());
        });*/

    }

    private void loadFragment(Fragment fragment){
        FragmentManager fm = getFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout, fragment);
        fragmentTransaction.commit();
    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {
        Toast.makeText(this,tab.getText().toString(),Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {
        Toast.makeText(this,tab.getText().toString(),Toast.LENGTH_SHORT).show();
    }


}