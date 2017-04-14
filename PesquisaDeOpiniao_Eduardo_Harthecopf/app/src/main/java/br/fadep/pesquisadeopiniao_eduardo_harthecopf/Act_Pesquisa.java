package br.fadep.pesquisadeopiniao_eduardo_harthecopf;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class Act_Pesquisa extends AppCompatActivity {

        private Button btnBom, btnRuim, btnResultado, btnIniciar;
        private Integer vBons = 0;
        private Integer vRuins = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesquisa);

        btnBom = (Button)findViewById(R.id.btnBom);
        btnRuim = (Button)findViewById(R.id.btnRuim);
        btnResultado = (Button)findViewById(R.id.btnResultado);
        btnIniciar = (Button)findViewById(R.id.btnIniciar);

        btnIniciar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                iniciaPesquisa();
            }

        });

        btnBom.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                somaVotoBom();
            }
        });

        btnRuim.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                somaVotoRuim();
            }
        });

        btnResultado.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                mostraResultado();
            }
        });


    }

    public  void somaVotoBom() {
        vBons = vBons + 1;
    }

    public void somaVotoRuim() {
        vRuins = vRuins + 1;
    }

    public void iniciaPesquisa() {
        vBons = 0;
        vRuins = 0;
    }

    public void mostraResultado(){
        Toast.makeText(this,"Bons: " + vBons + "\n " + "Ruins: " + vRuins ,Toast.LENGTH_LONG).show();
    }
}
