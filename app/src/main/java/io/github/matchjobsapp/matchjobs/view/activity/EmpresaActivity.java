package io.github.matchjobsapp.matchjobs.view.activity;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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


    private AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empresa);

        EditText etNomeEmpresa = findViewById(R.id.etNomeEmpresa);
//        EditText etCnpj = findViewById(R.id.etCnpj);
//        EditText etEndereco = findViewById(R.id.etEndereco);
//        EditText etTelefone = findViewById(R.id.etTelefone);
        EditText etEmailEmpresa = findViewById(R.id.etEmailEmpresa);
        EditText etSenhaEmpresa = findViewById(R.id.etSenhaEmpresa);

        Button btSalvarEmpresa = findViewById(R.id.btSalvarEmpresa);
        btSalvarEmpresa.setOnClickListener(view -> {
            clickSalvar(
                    etNomeEmpresa.getText().toString(),
                    etEmailEmpresa.getText().toString(),
                    etSenhaEmpresa.getText().toString()
            );
        } );

        builder = new AlertDialog.Builder(this, R.style.AppDialog);

    }

    @Override
    public void onBackPressed() {
            builder.setTitle(getResources().getString(R.string.atencao));
            builder.setMessage(getResources().getString(R.string.cancelarCadastro));
            builder.setPositiveButton(getResources().getString(R.string.sim), (dialog, which) -> {
                Intent i = new Intent(this, LoginActivity.class);
                startActivity(i);
                finish();
            });
            builder.setNegativeButton(getResources().getString(R.string.nao), null);
            builder.show();
    }

    private void clickSalvar(String nomeEmpresa, String email, String senha){
        Empresa empresa = new Empresa();
        empresa.setNomeEmpresa(nomeEmpresa);
        empresa.setEmail(email);
        empresa.setSenha(senha);

        // TODO Service de salvar senha.
    }
}
