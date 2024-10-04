package com.example.temperaturas;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnAccion1 = findViewById(R.id.button);
        Button btnAccion2 = findViewById(R.id.button2);
        Button btnAccion3 = findViewById(R.id.button3);

        EditText ingresarCelcius = findViewById(R.id.editTextCelcius);
        EditText ingresarKelvin = findViewById(R.id.editTextKelvin);
        EditText ingresarFarenheit = findViewById(R.id.editTextFarenheit);



        TextView mostrarCelciusKelvin = findViewById(R.id.textViewCelciusKelvin);
        TextView mostrarCelciusFarenheit = findViewById(R.id.textViewCelciusFarenheit);

        TextView mostrarFarenheitCelcius = findViewById(R.id.textViewFarenheitCelcius);
        TextView mostrarFarenheitKelvin = findViewById(R.id.textViewFarenheitKelvin);

        TextView mostrarKelvinCelcius = findViewById(R.id.textViewKelvinCelcius);
        TextView mostrarKelvinFarenheit = findViewById(R.id.textViewKelvinFarenheit);



        btnAccion1.setOnClickListener(v->{
            double celcius = Double.parseDouble(ingresarCelcius.getText().toString());
            double kelvin = Double.parseDouble(ingresarKelvin.getText().toString());
            double farenheit = Double.parseDouble(ingresarFarenheit.getText().toString());

            Celcius cel = new Celcius(celcius);
            Kelvin kel = new Kelvin(kelvin);
            Farenheit far = new Farenheit(farenheit);

            String resKel = cel.parse(kel) + "";
            String resFar = cel.parse(far) + "";

            mostrarCelciusKelvin.setText(resKel);
            mostrarCelciusFarenheit.setText(resFar);
        });

        btnAccion2.setOnClickListener(v->{
            double celcius = Double.parseDouble(ingresarCelcius.getText().toString());
            double kelvin = Double.parseDouble(ingresarKelvin.getText().toString());
            double farenheit = Double.parseDouble(ingresarFarenheit.getText().toString());

            Celcius cel = new Celcius(celcius);
            Kelvin kel = new Kelvin(kelvin);
            Farenheit far = new Farenheit(farenheit);

            String resCel = far.parse(cel) + "";
            String resKel = far.parse(kel) + "";

            mostrarFarenheitCelcius.setText(resCel);
            mostrarFarenheitKelvin.setText(resKel);
        });

        btnAccion3.setOnClickListener(v->{
            double celcius = Double.parseDouble(ingresarCelcius.getText().toString());
            double kelvin = Double.parseDouble(ingresarKelvin.getText().toString());
            double farenheit = Double.parseDouble(ingresarFarenheit.getText().toString());

            Celcius cel = new Celcius(celcius);
            Kelvin kel = new Kelvin(kelvin);
            Farenheit far = new Farenheit(farenheit);

            String resCel = kel.parse(cel) + "";
            String resFar = kel.parse(far) + "";

            mostrarKelvinCelcius.setText(resCel);
            mostrarKelvinFarenheit.setText(resFar);
        });

    }
}