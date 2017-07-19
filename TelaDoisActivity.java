package br.com.lucasalves.aula01layout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class TelaDoisActivity extends AppCompatActivity {

    private Button btnVoltar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scrollview_layout_activity);

        btnVoltar = (Button) findViewById(R.id.btnVoltar);

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(
                R.menu.menu_exemplo,    //menu XML que vamos converter em submenu
                menu                    //objeto Menu que recebe os dados de XML
        );
        //Retornar true ou false. Se true exibe o menu, se false esconde  menu
        //O método super.onCreateOptionsMenu(menu) sempre retorna true
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu_novo:
                Toast.makeText(getBaseContext(),"Cliquei Aqui!",Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_voltar:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
