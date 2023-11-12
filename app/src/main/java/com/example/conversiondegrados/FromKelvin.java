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
import com.example.conversiondegrados.models.Far;

public class FromKelvin extends AppCompatActivity {

    private EditText valueKel;
    private TextView valueCel;
    private TextView valueFar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_from_kelvin);

        valueKel = findViewById(R.id.valueFar);
        valueFar = findViewById(R.id.valueKel);
        valueCel = findViewById(R.id.valueCel);

        valueKel.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String inputValue = valueKel.getText().toString();

                if (!inputValue.isEmpty()) {
                    Double kelValue = Double.parseDouble(inputValue);

                    Far far = Far.fromKel(kelValue);
                    Cel cel = Cel.fromKel(kelValue);

                    valueFar.setText(String.valueOf(far.getValor())+" °F");
                    valueCel.setText(String.valueOf(cel.getValor())+" °C");
                } else {
                    valueFar.setText("");
                    valueCel.setText("");
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }
}