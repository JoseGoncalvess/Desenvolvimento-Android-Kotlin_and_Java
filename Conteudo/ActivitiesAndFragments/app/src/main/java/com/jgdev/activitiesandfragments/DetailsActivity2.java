package com.jgdev.activitiesandfragments;

import android.os.Build;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.jgdev.activitiesandfragments.models.Anime;
import com.jgdev.activitiesandfragments.models.User;

public class DetailsActivity2 extends AppCompatActivity {


     Button btnfechar = null;
     TextView textResult = null;
     TextView textResult2 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_details2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        init();
        var buble = getIntent().getExtras();

        if(buble != null){
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU){
                User user =  buble.getSerializable("usuario", User.class); // TODO MODO ANTIGO
                Anime anime =  buble.getParcelable("anime", Anime.class); // VERSÃO NOVO RECOMENDANDA
                textResult.setText("Usuario: "+user.getNome()+" Idade: "+user.getAge());
                textResult2.setText("Usuario: "+anime.getNome()+" Nº Ep: "+anime.getQtdEp());

            }else {
                User user = (User) buble.getSerializable("usuario"); // TODO MODO ANTIGO
                Anime anime =  buble.getParcelable("anime"); // VERSÃO NOVO RECOMENDANDA
                textResult.setText("Usuario: "+user.getNome()+" Idade: "+user.getAge());
                textResult2.setText("Usuario: "+anime.getNome()+" Nº Ep: "+anime.getQtdEp());
            }

        }



        btnfechar.setOnClickListener(v -> {
            finish();
        });



    }

    private void  init(){

        btnfechar = findViewById(R.id.btn_voltar);
        textResult = findViewById(R.id.textView2);
        textResult2 = findViewById(R.id.textView3);
    }
}