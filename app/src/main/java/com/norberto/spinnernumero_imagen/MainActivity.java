package com.norberto.spinnernumero_imagen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner1;
    private TextView Valor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ejemplo);

        spinner1=(Spinner)findViewById(R.id.spinner);
        Valor=(TextView)findViewById(R.id.Resultado);

        String[]selec={"1","2","3","4","5","6","7","8","9","10"};
        ArrayAdapter<String>adapter= new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,selec);
        spinner1.setAdapter(adapter);

        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), "El numero seleccionado es: " + parent.getItemIdAtPosition(position + 1), Toast.LENGTH_LONG).show();
                Valor.setText("El numero seleccionado es: "+parent.getItemIdAtPosition(position+1));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
