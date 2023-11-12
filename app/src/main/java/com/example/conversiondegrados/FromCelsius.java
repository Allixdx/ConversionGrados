package com.example.conversiondegrados;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

import com.example.conversiondegrados.models.Cel;
import com.example.conversiondegrados.models.Far;
import com.example.conversiondegrados.models.Kel;

public class FromCelsius extends AppCompatActivity {

    private EditText valueCel;
    private TextView valueKel;
    private TextView valueFar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_from_celsius);

        valueKel = findViewById(R.id.valueKel);
        valueFar = findViewById(R.id.valueFar);
        valueCel = findViewById(R.id.valueCel);

        valueCel.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String inputValue = valueCel.getText().toString();

                if (!inputValue.isEmpty()) {
                    Double celValue = Double.parseDouble(inputValue);

                    Far far = Far.fromCel(celValue);
                    Kel kel = Kel.fromCel(celValue);

                    valueFar.setText(String.valueOf(far.getValor()));
                    valueKel.setText(String.valueOf(kel.getValor()));
                } else {
                    valueFar.setText("");
                    valueKel.setText("");
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }
}