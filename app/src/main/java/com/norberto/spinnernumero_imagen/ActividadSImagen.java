package com.norberto.spinnernumero_imagen;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class ActividadSImagen extends AppCompatActivity {
    private Spinner spinner1;
    private ImageView img1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.imagensp);

        img1=(ImageView)findViewById(R.id.img1);
        spinner1=(Spinner)findViewById(R.id.spinner1);

        String[]selec={"uno","dos"};
        ArrayAdapter<String>adapter= new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,selec);
        spinner1.setAdapter(adapter);

        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String tres=parent.getItemAtPosition(position).toString();
                switch (tres){
                    case "uno":
                        Drawable drawable = getBaseContext().getResources().getDrawable(R.drawable.roger1);
                        img1.setImageDrawable(drawable);
                        break;
                    case "dos":
                        Drawable drawable1 = getBaseContext().getResources().getDrawable(R.drawable.roger2);
                        img1.setImageDrawable(drawable1);
                        break;


                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
