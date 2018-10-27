package io.github.matchjobsapp.matchjobs.viewmodel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import java.util.List;

import io.github.matchjobsapp.matchjobs.model.Formacao;

/**
 * @Author: Bruna L. Guanabara
 * brunal.guanabara@gmail.com
 * Project: MatchJobs
 * Date: 27/10/2018
 */
public class FormacaoVM extends ViewModel {
    private MutableLiveData<List<Formacao>> Formacao;
    public LiveData<List<Formacao>> getFormacao(){
        if (Formacao == null){
            Formacao = new MutableLiveData<List<Formacao>>();
            loadFormacao();
            }
            return Formacao;
        }
        private void loadFormacao(){
    }
}
