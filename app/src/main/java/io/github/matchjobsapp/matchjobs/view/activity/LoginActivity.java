package io.github.matchjobsapp.matchjobs.view.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

import io.github.matchjobsapp.matchjobs.R;

public class LoginActivity extends Activity {

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
    }

    private void click(Boolean profissional){
        //TODO
    }

    private void click(String email, String senha, Boolean profissional){
        //TODO
    }
}
