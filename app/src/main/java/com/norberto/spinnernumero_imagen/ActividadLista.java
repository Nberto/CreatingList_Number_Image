package com.norberto.spinnernumero_imagen;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;



public class ActividadLista extends AppCompatActivity{
    private ListView lista1;
    private ImageView img1;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listaimg);

        lista1=(ListView)findViewById(R.id.lista);
        img1=(ImageView)findViewById(R.id.img);

        final String [] selec={"1","2","3","4","5"};
        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,selec);
        lista1.setAdapter(adapter);

        lista1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (parent.getItemAtPosition(position).toString()){

                    case "1":
                        Drawable uno=getBaseContext().getResources().getDrawable(R.drawable.roger1);
                        img1.setImageDrawable(uno);
                        break;
                    case "2":
                        Drawable dos=getBaseContext().getResources().getDrawable(R.drawable.roger2);
                        img1.setImageDrawable(dos);
                        break;
                    case "3":
                        Drawable tres=getBaseContext().getResources().getDrawable(R.drawable.roger3);
                        img1.setImageDrawable(tres);
                        break;
                    case "4":
                        Drawable cuatro=getBaseContext().getResources().getDrawable(R.drawable.roger4);
                        img1.setImageDrawable(cuatro);
                        break;
                    case "5":
                        Drawable cinco=getBaseContext().getResources().getDrawable(R.drawable.roger5);
                        img1.setImageDrawable(cinco);
                        break;

                }
            }
        });
    }

}
