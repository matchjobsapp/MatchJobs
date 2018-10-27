package io.github.matchjobsapp.matchjobs.view.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

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
public class ProfissionalActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profissional);
    }

    @Override
    public void onBackPressed() {
        Intent i = new Intent(this, LoginActivity.class);
        startActivity(i);
        finish();
    }
}
