package com.example.smartapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class ConverterFragment extends Fragment {

    View view;
    Spinner spinnerFrom;
    TextView converterText;
    Button spinnerButton;


    /*

     - panelek
     - összesítő az összes váltóról

     */


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_converter, container, false);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        /*spinnerFrom = (Spinner) getView().findViewById(R.id.spinnerFrom);
        converterText = (TextView) getView().findViewById(R.id.converterText);
        spinnerButton = (Button) getView().findViewById(R.id.spinnerButton);

        spinnerButton.setOnClickListener(v -> {
            converterText.setText(spinnerFrom.getSelectedItem().toString());
        });*/
    }

}
