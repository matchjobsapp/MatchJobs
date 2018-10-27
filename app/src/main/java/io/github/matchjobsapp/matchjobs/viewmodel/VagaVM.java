package io.github.matchjobsapp.matchjobs.viewmodel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.view.View;

import java.util.List;

import io.github.matchjobsapp.matchjobs.model.Vaga;

/**
 * @Author: Bruna L. Guanabara
 * brunal.guanabara@gmail.com
 * Project: MatchJobs
 * Date: 27/10/2018
 */
public class VagaVM extends ViewModel {
    private MutableLiveData<List<Vaga>> Vaga;
    public LiveData<List<Vaga>> getVaga(){
        if (Vaga == null){
            Vaga = new MutableLiveData<List<Vaga>>();
            loadVaga();
        }
        return Vaga;
    }
    private void loadVaga(){
    }
}
