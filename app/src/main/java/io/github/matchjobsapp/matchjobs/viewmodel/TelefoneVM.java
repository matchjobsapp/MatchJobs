package io.github.matchjobsapp.matchjobs.viewmodel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import java.util.List;

import io.github.matchjobsapp.matchjobs.model.Telefone;

/**
 * @Author: Bruna L. Guanabara
 * brunal.guanabara@gmail.com
 * Project: MatchJobs
 * Date: 27/10/2018
 */
public class TelefoneVM extends ViewModel {
    private MutableLiveData<List<Telefone>> Telefone;
    public LiveData<List<Telefone>> getTelefone(){
    if (Telefone == null ){
        Telefone = new MutableLiveData<List<Telefone>>();
        loadTelefone();
        }
        return Telefone;
    }
    private void loadTelefone(){
    }

}
