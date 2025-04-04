package com.example.appnumbers;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private TextView display;
    private TextView historyDisplay;
    private double firstNumber = 0.0;
    private String operation = "";
    private boolean newNumber = true;
    private String currentExpression = "";
    private List<String> history = new ArrayList<>();
    private boolean showingHistory = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.display);
        historyDisplay = findViewById(R.id.historyDisplay);

        int[] numberButtons = {
            R.id.btn0, R.id.btn1, R.id.btn2, R.id.btn3, R.id.btn4,
            R.id.btn5, R.id.btn6, R.id.btn7, R.id.btn8, R.id.btn9
        };

        for (int i = 0; i < numberButtons.length; i++) {
            final int number = i;
            Button button = findViewById(numberButtons[i]);
            button.setOnClickListener(v -> onNumberClick(number));
        }

        Button btnPlus = findViewById(R.id.btnPlus);
        btnPlus.setOnClickListener(v -> onOperationClick("+"));

        Button btnMinus = findViewById(R.id.btnMinus);
        btnMinus.setOnClickListener(v -> onOperationClick("-"));

        Button btnMultiply = findViewById(R.id.btnMultiply);
        btnMultiply.setOnClickListener(v -> onOperationClick("×"));

        Button btnDivide = findViewById(R.id.btnDivide);
        btnDivide.setOnClickListener(v -> onOperationClick("÷"));

        Button btnClear = findViewById(R.id.btnClear);
        btnClear.setOnClickListener(v -> {
            display.setText("0");
            firstNumber = 0.0;
            operation = "";
            newNumber = true;
            currentExpression = "";
            if (showingHistory) {
                toggleHistory();
            }
        });

        Button btnEquals = findViewById(R.id.btnEquals);
        btnEquals.setOnClickListener(v -> calculateResult());

        Button btnHistory = findViewById(R.id.btnHistory);
        btnHistory.setOnClickListener(v -> toggleHistory());
    }

    private void toggleHistory() {
        showingHistory = !showingHistory;
        if (showingHistory) {
            StringBuilder historyText = new StringBuilder();
            for (String entry : history) {
                historyText.append(entry).append("\n");
            }
            historyDisplay.setText(historyText.toString());
            historyDisplay.setVisibility(android.view.View.VISIBLE);
        } else {
            historyDisplay.setVisibility(android.view.View.GONE);
        }
    }

    private void onNumberClick(int number) {
        if (newNumber) {
            display.setText(String.valueOf(number));
            newNumber = false;
        } else {
            display.setText(display.getText().toString() + number);
        }
        

        if (operation.isEmpty()) {
            currentExpression = display.getText().toString();
        } else {
            currentExpression = formatNumber(firstNumber) + " " + operation + " " + display.getText().toString();
        }
    }

    private void onOperationClick(String op) {
        firstNumber = Double.parseDouble(display.getText().toString());
        operation = op;
        newNumber = true;
        

        currentExpression = formatNumber(firstNumber) + " " + operation;
        display.setText(currentExpression);
    }

    private String formatNumber(double number) {
        if (number % 1 == 0.0) {
            return String.valueOf((long) number);
        } else {
            return String.valueOf(number);
        }
    }

    private void calculateResult() {
        if (operation.isEmpty() || newNumber) return;

        double secondNumber = Double.parseDouble(display.getText().toString());
        double result;

        switch (operation) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "×":
                result = firstNumber * secondNumber;
                break;
            case "÷":
                result = secondNumber != 0.0 ? firstNumber / secondNumber : Double.POSITIVE_INFINITY;
                break;
            default:
                result = secondNumber;
        }


        currentExpression = formatNumber(firstNumber) + " " + operation + " " + formatNumber(secondNumber) + " = " + formatNumber(result);
        display.setText(currentExpression);
        

        history.add(0, currentExpression);
        if (history.size() > 10) {
            history.remove(history.size() - 1);
        }
        
        newNumber = true;
    }
} 
