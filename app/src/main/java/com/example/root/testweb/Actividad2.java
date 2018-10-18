package com.example.root.testweb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Actividad2 extends AppCompatActivity {


    //Creamos una varible del objeto webView
    private WebView webView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);

        //Realizamos una referencia del objeto webview de nuestro layout
        webView1 = (WebView) findViewById(R.id.webview);

        //Almacenamos lo que nos manda la otra actividad en una variable del bundle
        Bundle bundle  = getIntent().getExtras();
        //Cargamos la pagina en al WebView
        webView1.loadUrl("http://"+bundle.getString("direccion"));
        //Creamos un cliente el cual permite que la pagina se cargue dentrode nuestra app, evitan que tenga que
        //llamar a otra aplicacion
        webView1.setWebViewClient(new WebViewClient());

    }

    //Método que permite terminar nuestra acctividad
    public void finalizar (View v){

        finish();
    }
}
