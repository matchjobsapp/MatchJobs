package io.github.matchjobsapp.matchjobs.view.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

import io.github.matchjobsapp.matchjobs.R;
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
public class LoginActivity extends Activity {

    private AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText etEmail = findViewById(R.id.etEmail);
        EditText etPassword = findViewById(R.id.etPassword);
        Switch sProfissionalOuEmpresa = findViewById(R.id.switch1);
        Button btCadastrar = findViewById(R.id.btCadastrar);
        Button btLogin = findViewById(R.id.btLogin);

        btCadastrar.setOnClickListener(v->{
            click(!sProfissionalOuEmpresa.isChecked());
        });

        btLogin.setOnClickListener(v->{
            click(etEmail.getText().toString(), etPassword.getText().toString(), !sProfissionalOuEmpresa.isChecked());
        });

        builder = new AlertDialog.Builder(this, R.style.AppDialog);
    }

    private void click(Boolean profissional){
        Intent i = new Intent(this, profissional? ProfissionalActivity.class : EmpresaActivity.class);
        startActivity(i);
        finish();
    }

    private void click(String email, String senha, Boolean profissional){
        Intent i = new Intent(this, profissional? PesquisarVaga.class : PesquisarProfissional.class);
        startActivity(i);
        finish();
    }

    @Override
    public void onBackPressed() {
        builder.setTitle(getResources().getString(R.string.atencao));
        builder.setMessage(getResources().getString(R.string.sairSistema));
        builder.setPositiveButton(getResources().getString(R.string.sim), (dialog, which) -> {
            Toast.makeText(getApplicationContext(), getResources().getString(R.string.saindo), Toast.LENGTH_LONG).show();
            finish();
        });
        builder.setNegativeButton(getResources().getString(R.string.nao), null);
        builder.show();

    }
}
