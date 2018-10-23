package io.github.matchjobsapp.matchjobs.viewmodel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import java.util.List;

import io.github.matchjobsapp.matchjobs.model.Experiencia;

/**
 * @Author: Bruna L. Guanabara
 * brunal.guanabara@gmail.com
 * Project: MatchJobs
 * Date: 23/10/2018
 */
public class ExperienciaVM extends ViewModel {
    private MutableLiveData<List<Experiencia>> Experiencia;
    public LiveData<List<Experiencia>> getExperiencia() {
        if (Experiencia == null) {
            Experiencia = new MutableLiveData<List<Experiencia>>();
            loadExperiencia();
        }
        return Experiencia;
    }
        private void loadExperiencia(){

        }
    }

