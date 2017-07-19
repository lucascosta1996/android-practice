package br.com.lucasalves.aula01layout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // declarar objetos para interagir com a tela
    private Button btnExibir, btnAbtir, btnSair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        setContentView(R.layout.linear_layout_activity);
        //Vincular elementos XML com os objetos criados
        btnAbtir = (Button) findViewById(R.id.btnAbrir);
        btnExibir = (Button) findViewById(R.id.btnExibir);
        btnSair = (Button) findViewById(R.id.btnSair);

        // adiciona eventos nos objetos
        btnSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        btnExibir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(),"Olá",Toast.LENGTH_LONG).show();
                Log.d("AULA01_LAYOUT", // 1 - tag para identificar no logCat
                        "Olá!" // 2 - Conteúdo para exibir na tela
                );
            }
        });
        btnAbtir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btnAbtir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //create the Intent (Intention to execute something)
                Intent intent = new Intent(
                        getBaseContext(),       // 1 - Where I am. Activity wich executes the Intent
                        TelaDoisActivity.class  //2 - Activity wich is open by the Intent
                );
                //executes the Intent
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(
                0,                          //Grupo do menu. Em geral é 0
                ABRIR_TELA_DOIS,            //Chave para identificar que o botão foi clicado
                0,                          //Posição que aparece. Se 0 usa a ordem adicionada
                R.string.btnAbrirTela       //String para exibir na tela

                );

        return super.onCreateOptionsMenu(menu);
    }
}
