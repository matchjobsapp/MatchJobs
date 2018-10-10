package io.github.matchjobsapp.matchjobs.fragment;

import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import io.github.matchjobsapp.matchjobs.R;


public class Fragment_MatchRecrutador extends android.support.v4.app.Fragment {

    ConstraintLayout matchLayout;


    public Fragment_MatchRecrutador() {
        // Required empty public constructor


    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_match_recrutador, container, false);

        //INSTANCIANDO VARIAVEIS
        matchLayout = v.findViewById(R.id.matchLayoutId);

        return v;
    }

}



