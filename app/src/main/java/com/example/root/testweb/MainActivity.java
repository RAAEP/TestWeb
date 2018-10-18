package com.example.root.testweb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //Creamos una variable del tipo EditText
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //Realizamos una referencia del layout a nuestra clase
        editText = (EditText) findViewById(R.id.editText);

    }



    //Creamos un método onClick que permite ejecutar nuestras acciones
    public void ejecutar (View v){
        //Creamos una intención que lo que realiza es mandar la cadena de nuestro EditText a otra actividad
        Intent i = new Intent(this,Actividad2.class);

        i.putExtra("direccion",editText.getText().toString());
        startActivity(i);
    }

    public boolean OnCreatOptions(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.gama_menu,menu);
        return true;
    }

}
