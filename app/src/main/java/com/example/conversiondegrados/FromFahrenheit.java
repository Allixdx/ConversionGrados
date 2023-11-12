package com.example.conversiondegrados;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

import com.example.conversiondegrados.models.Cel;
import com.example.conversiondegrados.models.Kel;

public class FromFahrenheit extends AppCompatActivity {

    private TextView valueCel;
    private TextView valueKel;
    private EditText valueFar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_from_fahrenheit);

        valueCel=findViewById(R.id.valueCel);
        valueKel=findViewById(R.id.valueKel);
        valueFar=findViewById(R.id.valueFar);

        valueFar.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String inputValue = valueFar.getText().toString();

                if (!inputValue.isEmpty()) {
                    Double farValue = Double.parseDouble(inputValue);

                    Cel cel = Cel.fromFar(farValue);
                    Kel kel = Kel.fromFar(farValue);

                    valueCel.setText(String.valueOf(cel.getValor())+" °C");
                    valueKel.setText(String.valueOf(kel.getValor())+" °K");
                } else {
                    valueCel.setText("");
                    valueKel.setText("");
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }
}