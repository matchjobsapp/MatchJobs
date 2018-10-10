package io.github.matchjobsapp.matchjobs.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import io.github.matchjobsapp.matchjobs.R;


public class Fragment_ChatR extends android.support.v4.app.Fragment {

    private ListView listview;
    private ArrayAdapter adapter;
    private ArrayList<String> contatos;



    public Fragment_ChatR() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_chat, container, false);

        listview =  v.findViewById(R.id.lv_contatosId);
        contatos = new ArrayList<>();
        adapter = new ArrayAdapter(
                getActivity(),
                android.R.layout.simple_list_item_1,
                contatos
        );

        //teste
        contatos.add("Maikson");

        listview.setAdapter( adapter );


        return v;
    }

}
