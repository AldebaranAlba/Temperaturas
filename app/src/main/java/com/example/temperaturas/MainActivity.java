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

        Button btnAccion1 = findViewById(R.id.button1);
        Button btnAccion2 = findViewById(R.id.button2);
        Button btnAccion3 = findViewById(R.id.button3);
        Button btnAccion4 = findViewById(R.id.button4);
        Button btnAccion5 = findViewById(R.id.button5);
        Button btnAccion6 = findViewById(R.id.button6);


//        TextView mostrarCelciusKelvin = findViewById(R.id.textViewCelciusKelvin);
//        TextView mostrarCelciusFarenheit = findViewById(R.id.textViewCelciusFarenheit);
//
//        TextView mostrarFarenheitCelcius = findViewById(R.id.textViewFarenheitCelcius);
//        TextView mostrarFarenheitKelvin = findViewById(R.id.textViewFarenheitKelvin);
//
//        TextView mostrarKelvinCelcius = findViewById(R.id.textViewKelvinCelcius);
//        TextView mostrarKelvinFarenheit = findViewById(R.id.textViewKelvinFarenheit);



        btnAccion1.setOnClickListener(v->{
            //Celcius por defefecto
            EditText valor_kelvin_texto = findViewById(R.id.editTextText1);
            TextView mostrar_final = findViewById(R.id.textView);

            double valor = Double.parseDouble(valor_kelvin_texto.getText().toString());

            Celcius celcius = new Celcius(0);
            Kelvin kelvin = new Kelvin(valor);
//            double kelvin = Double.parseDouble(ingresarKelvin.getText().toString());
//            double farenheit = Double.parseDouble(ingresarFarenheit.getText().toString());

             Celcius resultado = celcius.parse(kelvin);

             mostrar_final.setText(resultado.getValor()+resultado.getUnidad());

        });

        btnAccion2.setOnClickListener(v->{
            EditText valor_farenheit_texto = findViewById(R.id.editTextText2);
            TextView mostrar_final = findViewById(R.id.textView);

            double valor = Double.parseDouble(valor_farenheit_texto.getText().toString());

            Celcius celcius = new Celcius(0);
            Farenheit farenheit = new Farenheit(valor);


            Celcius resultado = celcius.parse(farenheit);

            mostrar_final.setText(resultado.getValor()+resultado.getUnidad());
        });

        btnAccion3.setOnClickListener(v->{
            EditText valor_celcius_texto = findViewById(R.id.editTextText3);
            TextView mostrar_final = findViewById(R.id.textView2);

            double valor = Double.parseDouble(valor_celcius_texto.getText().toString());

            Kelvin kelvin = new Kelvin(0);
            Celcius celcius = new Celcius(valor);


            Kelvin resultado = kelvin.parse(celcius);

            mostrar_final.setText(resultado.getValor()+resultado.getUnidad());


        });

        btnAccion4.setOnClickListener(v->{
            EditText valor_farenheit_texto = findViewById(R.id.editTextText4);
            TextView mostrar_final = findViewById(R.id.textView2);

            double valor = Double.parseDouble(valor_farenheit_texto.getText().toString());

            Kelvin kelvin = new Kelvin(0);
            Farenheit farenheit = new Farenheit(valor);


            Kelvin resultado = kelvin.parse(farenheit);

            mostrar_final.setText(resultado.getValor()+resultado.getUnidad());

        });

        btnAccion5.setOnClickListener(v->{
            EditText valor_celcius_texto = findViewById(R.id.editTextText5);
            TextView mostrar_final = findViewById(R.id.textView3);

            double valor = Double.parseDouble(valor_celcius_texto.getText().toString());

            Farenheit farenheit = new Farenheit(0);
            Celcius celcius = new Celcius(valor);


            Farenheit resultado = farenheit.parse(celcius);

            mostrar_final.setText(resultado.getValor()+resultado.getUnidad());

        });

        btnAccion6.setOnClickListener(v->{
            EditText valor_kelvin_texto = findViewById(R.id.editTextText6);
            TextView mostrar_final = findViewById(R.id.textView3);

            double valor = Double.parseDouble(valor_kelvin_texto.getText().toString());

            Farenheit farenheit = new Farenheit(0);
            Kelvin kelvin = new Kelvin(valor);


            Farenheit resultado = farenheit.parse(kelvin);

            mostrar_final.setText(resultado.getValor()+resultado.getUnidad());

        });


    }
}