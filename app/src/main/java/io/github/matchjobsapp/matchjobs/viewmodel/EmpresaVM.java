package io.github.matchjobsapp.matchjobs.viewmodel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.view.View;

import java.lang.invoke.MutableCallSite;
import java.util.List;

import io.github.matchjobsapp.matchjobs.model.Empresa;

/**
 * @Author: Bruna L. Guanabara
 * brunal.guanabara@gmail.com
 * Project: MatchJobs
 * Date: 23/10/2018
 */
public class EmpresaVM extends ViewModel {
    private MutableLiveData<List<Empresa>> Empresa;
    public LiveData<List<Empresa>> getEmpresa() {
        if (Empresa == null) {
            Empresa = new MutableLiveData<List<Empresa>>();
            loadEmpresa();
        }
        return Empresa;
    }
    private void loadEmpresa(){

    }
}
