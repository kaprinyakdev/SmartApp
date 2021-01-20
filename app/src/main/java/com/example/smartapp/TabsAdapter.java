package com.example.smartapp;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class TabsAdapter extends FragmentStatePagerAdapter {

    int tabs;

    public TabsAdapter(FragmentManager fm, int tabs){
        super(fm);
        this.tabs = tabs;
    }

    @Override
    public int getCount() {
        return tabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                CalculatorFragment calculator = new CalculatorFragment();
                return calculator;
            case 1:
                ConverterFragment converter = new ConverterFragment();
                return converter;
            default:
                return null;
        }
    }
}
