package com.curso.frases2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView primeiraImagem;
    private String[] opcao = {"as_vezes", "dias_ruins", "imagine", "levanta", "nem_todos", "pra_hoje", "que_o_dia", "sorria", "todo_dia", "um_pequeno_pensamento"};
    private Button novaImagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        primeiraImagem = findViewById(R.id.primeiraImagemId);
        novaImagem = findViewById(R.id.botaoNovaImagemId);
        novaImagem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random randomico = new Random();
                int numeroAleatorio = randomico.nextInt(10);

                Intent intent = new Intent(MainActivity.this, segundaActivity.class);
                intent.putExtra("opcao", opcao[numeroAleatorio]);

                startActivity(intent);
                finish();

            }
        });
    }
}
