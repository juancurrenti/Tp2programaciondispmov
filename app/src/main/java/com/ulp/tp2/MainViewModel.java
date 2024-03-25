package com.ulp.tp2;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import java.util.ArrayList;

public class MainViewModel extends ViewModel {
    private MutableLiveData<ArrayList<Inmueble>> lista = new MutableLiveData<>();

    public LiveData<ArrayList<Inmueble>> getLista() {
        return lista;
    }

    public void cargarDatos(){
        ArrayList<Inmueble> tempLista = new ArrayList<>();
        tempLista.add(new Inmueble(R.drawable.casa1, "Juana Koslay", 10000));
        tempLista.add(new Inmueble(R.drawable.casa2, "Potrero de los Funes", 30000));
        tempLista.add(new Inmueble(R.drawable.casa3, "Juana Koslay", 70000));
        tempLista.add(new Inmueble(R.drawable.casa4, "San Francisco", 60000));
        tempLista.add(new Inmueble(R.drawable.casa5, "La Punta", 90000));
        lista.setValue(tempLista);
    }
}