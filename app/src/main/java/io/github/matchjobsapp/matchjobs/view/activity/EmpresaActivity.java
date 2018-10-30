package io.github.matchjobsapp.matchjobs.view.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import io.github.matchjobsapp.matchjobs.R;
import io.github.matchjobsapp.matchjobs.model.Empresa;

/**
 * ╭────────────────────────────────────────────────────╮
 * │                                                    │
 * │   @author: Ivam H. M. Santos                       │
 * │   https://www.linkedin.com/in/ivamsantos           |
 * |   ivamks@gmail.com                                 |
 * |   Project: MatchJobs                               |
 * |   Create at 27/10/18                               │
 * │                                                    │
 * ╰────────────────────────────────────────────────────╯
 */
public class EmpresaActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empresa);

        EditText etNomeEmpresa = findViewById(R.id.etNomeEmpresa);
        EditText etEmailEmpresa = findViewById(R.id.etNomeEmpresa);
        EditText etSenhaEmpresa = findViewById(R.id.etNomeEmpresa);

        Button btSalvarEmpresa = findViewById(R.id.btSalvarEmpresa);
        btSalvarEmpresa.setOnClickListener(view -> {
            clickSalvar(
                    etNomeEmpresa.getText().toString(),
                    etEmailEmpresa.getText().toString(),
                    etSenhaEmpresa.getText().toString()
            );
        } );

    }

    @Override
    public void onBackPressed() {
        Intent i = new Intent(this, LoginActivity.class);
        startActivity(i);
        finish();
    }

    private void clickSalvar(String nomeEmpresa, String email, String senha){
        Empresa empresa = new Empresa();
        empresa.setNomeEmpresa(nomeEmpresa);
        empresa.setEmail(email);
        empresa.setSenha(senha);

        // TODO Service de salvar senha.
    }
}
