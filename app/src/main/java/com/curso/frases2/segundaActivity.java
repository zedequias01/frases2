package com.curso.frases2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class segundaActivity extends AppCompatActivity {

    private Button proximaImagen;
    private ImageView imagem;
    private String[] opcao = {"as_vezes", "dias_ruins", "imagine", "levanta", "nem_todos", "pra_hoje", "que_o_dia", "sorria", "todo_dia", "um_pequeno_pensamento"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        imagem = (ImageView) findViewById(R.id.imagemId);
        proximaImagen = (Button) findViewById(R.id.proximaImagemId);
        Bundle extra = getIntent().getExtras();
        if (extra != null) {
            String opcaoEscolhida = extra.getString("opcao");
            if (opcaoEscolhida.equals("as_vezes")) {
                imagem.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.as_vezes));
            }
            if (opcaoEscolhida.equals("dias_ruins")) {
                imagem.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.dias_ruins));
            }
            if (opcaoEscolhida.equals("imagine")) {
                imagem.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.imagine));
            }
            if (opcaoEscolhida.equals("levanta")) {
                imagem.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.levanta));
            }
            if (opcaoEscolhida.equals("nem_todos")) {
                imagem.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.nem_todos));
            }
            if (opcaoEscolhida.equals("pra_hoje")) {
                imagem.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.pra_hoje));
            }
            if (opcaoEscolhida.equals("que_o_dia")) {
                imagem.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.que_o_dia));
            }
            if (opcaoEscolhida.equals("sorria")) {
                imagem.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.sorria));
            }
            if (opcaoEscolhida.equals("todo_dia")) {
                imagem.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.todo_dia));
            }
            if(opcaoEscolhida.equals("um_pequeno_pensamento")) {
                imagem.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.um_pequeno_pensamento));
            }

        }


        proximaImagen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomico = new Random();
                int numeroAleatorio = randomico.nextInt(10);

                Intent intent = new Intent(segundaActivity.this, segundaActivity.class);
                intent.putExtra("opcao", opcao[numeroAleatorio]);

                startActivity(intent);
            }
        });
    }
}
