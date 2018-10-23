package io.github.matchjobsapp.matchjobs.viewmodel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import java.util.List;

import io.github.matchjobsapp.matchjobs.model.Endereco;

/**
 * @Author: Bruna L. Guanabara
 * brunal.guanabara@gmail.com
 * Project: MatchJobs
 * Date: 23/10/2018
 */
public class EnderecoVM extends ViewModel {
    private MutableLiveData<List<Endereco>> Endereco;
    public LiveData<List<Endereco>> getEndereco (){
        if (Endereco == null) {
            Endereco = new MutableLiveData<List<Endereco>>();
            loadEndereco();
        }
        return Endereco;
    }
    private void loadEndereco(){

    }

}
