package br.com.etecia.mybooks;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    //DEclarar a variavel global
    RecyclerView ListaLivros;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListaLivros = findViewById(R.id.idRecyclerViewLivros);

        //implamentando o layout que será utilizado
        ListaLivros.setLayoutManager(new GridLayoutManager(getApplicationContext(),3));

        //otimizar a lista qunando for chamada
        ListaLivros.hasFixedSize();

        //carregar o adaptador ao RecyclerView
        //ListaLivros.setAdapter();
    }
}