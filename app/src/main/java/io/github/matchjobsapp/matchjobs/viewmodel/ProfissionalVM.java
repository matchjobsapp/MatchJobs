package io.github.matchjobsapp.matchjobs.viewmodel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import java.util.List;

import io.github.matchjobsapp.matchjobs.model.Profissional;

/**
 * @Author: Bruna L. Guanabara
 * brunal.guanabara@gmail.com
 * Project: MatchJobs
 * Date: 27/10/2018
 */
public class ProfissionalVM extends ViewModel {
    private MutableLiveData<List<Profissional>> Profissional;
    public LiveData<List<Profissional>> getProfissional() {
        if (Profissional == null) {
            Profissional = new MutableLiveData<List<Profissional>>();
            loadProfissional();
        }
        return Profissional;
    }
    private void loadProfissional(){
    }
}