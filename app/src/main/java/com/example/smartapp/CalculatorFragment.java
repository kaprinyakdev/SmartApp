package com.example.smartapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class CalculatorFragment extends Fragment {

    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonPlus, buttonMinus, buttonEqual, buttonMultiply, buttonDivide, buttonDot;
    TextView resultText;
    Float numberOne, numberTwo;
    boolean isPlus, isMinus, isDivide, isMultiply = false;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_calculator, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {

        button0 = getView().findViewById(R.id.button0);
        button1 = getView().findViewById(R.id.button1);
        button2 = getView().findViewById(R.id.button2);
        button3 = getView().findViewById(R.id.button3);
        button4 = getView().findViewById(R.id.button4);
        button5 = getView().findViewById(R.id.button5);
        button6 = getView().findViewById(R.id.button6);
        button7 = getView().findViewById(R.id.button7);
        button8 = getView().findViewById(R.id.button8);
        button9 = getView().findViewById(R.id.button9);
        buttonPlus = getView().findViewById(R.id.buttonPlus);
        buttonMinus = getView().findViewById(R.id.buttonMinus);
        buttonMultiply = getView().findViewById(R.id.buttonMultiply);
        buttonDivide = getView().findViewById(R.id.buttonDivide);
        buttonEqual = getView().findViewById(R.id.buttonEqual);
        buttonDot = getView().findViewById(R.id.buttonDot);
        resultText = getView().findViewById(R.id.resultText);

        button0.setOnClickListener(v -> {
            resultText.setText(resultText.getText()+"0");
        });

        button1.setOnClickListener(v -> {
            resultText.setText(resultText.getText()+"1");
        });

        button2.setOnClickListener(v -> {
            resultText.setText(resultText.getText()+"2");
        });

        button3.setOnClickListener(v -> {
            resultText.setText(resultText.getText()+"3");
        });

        button4.setOnClickListener(v -> {
            resultText.setText(resultText.getText()+"4");
        });

        button5.setOnClickListener(v -> {
            resultText.setText(resultText.getText()+"5");
        });

        button6.setOnClickListener(v -> {
            resultText.setText(resultText.getText()+"6");
        });

        button7.setOnClickListener(v -> {
            resultText.setText(resultText.getText()+"7");
        });

        button8.setOnClickListener(v -> {
            resultText.setText(resultText.getText()+"8");
        });

        button9.setOnClickListener(v -> {
            resultText.setText(resultText.getText()+"9");
        });

        buttonPlus.setOnClickListener(v -> {
            numberOne = Float.parseFloat(resultText.getText()+"");
            resultText.setText(null);
            isPlus = true;
        });

        buttonMinus.setOnClickListener(v -> {
            numberOne = Float.parseFloat(resultText.getText()+"");
            resultText.setText(null);
            isMinus = true;
        });

        buttonMultiply.setOnClickListener(v -> {
            numberOne = Float.parseFloat(resultText.getText()+"");
            resultText.setText(null);
            isMultiply = true;
        });

        buttonDivide.setOnClickListener(v -> {
            numberOne = Float.parseFloat(resultText.getText()+"");
            resultText.setText(null);
            isDivide = true;
        });

        buttonEqual.setOnClickListener(v -> {

            numberTwo = Float.parseFloat(resultText.getText() + "");

            Float val;
            NumberFormat nf = new DecimalFormat("##.##");

            if (isPlus) {
                val = numberOne + numberTwo;
                resultText.setText(nf.format(val) + "");
                isPlus = false;
            }

            else if (isMinus){
                val = numberOne - numberTwo;
                resultText.setText(nf.format(val) + "");
                isMinus = false;
            }

            else if (isMultiply){
                val = numberOne * numberTwo;
                resultText.setText(nf.format(val) + "");
                isMultiply = false;
            }

            else if (isDivide){
                if (numberOne >= numberTwo){
                    val = numberOne / numberTwo;
                    resultText.setText(nf.format(val) + "");
                    isDivide = false;
                } else {
                    resultText.setText("Hibás értékek!");
                }
            }
        });
    }
}
