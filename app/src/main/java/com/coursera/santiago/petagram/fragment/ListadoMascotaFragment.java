package com.coursera.santiago.petagram.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.coursera.santiago.petagram.R;
import com.coursera.santiago.petagram.adapter.MascotaAdaptador;
import com.coursera.santiago.petagram.pojo.ListadoMascotas;
import com.coursera.santiago.petagram.pojo.Mascota;

import java.util.ArrayList;


public class ListadoMascotaFragment extends Fragment {

    RecyclerView rvMascostas;

    public ListadoMascotaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_listado_mascota, container, false);

        rvMascostas = v.findViewById(R.id.rvMascostas);

        LinearLayoutManager llmMascota = new LinearLayoutManager(getActivity());
        llmMascota.setOrientation(LinearLayoutManager.VERTICAL);

        rvMascostas.setLayoutManager(llmMascota);
        crearListadoMascota();
        inicializarAdaptador();
        return v;
    }

    public void inicializarAdaptador(){
        MascotaAdaptador adaptador = new MascotaAdaptador(ListadoMascotas.getMascotas());
        rvMascostas.setAdapter(adaptador);
    }


    public void crearListadoMascota(){
        if(ListadoMascotas.getMascotas().isEmpty()){
            ArrayList<Mascota> alMascotas = new ArrayList<Mascota>();
            alMascotas.add(new Mascota("Bobby",R.drawable.cachorro1,0));
            alMascotas.add(new Mascota("Catty",R.drawable.cachorro2,0));
            alMascotas.add(new Mascota("Tommy",R.drawable.cachorro3,0));
            alMascotas.add(new Mascota("Tom",R.drawable.cachorro4,0));
            alMascotas.add(new Mascota("Lazy",R.drawable.cachorro5,0));
            alMascotas.add(new Mascota("Doki",R.drawable.cachorro6,0));
            alMascotas.add(new Mascota("Samy",R.drawable.cachorro7,0));
            ListadoMascotas.setMascotas(alMascotas);
        }
    }

}
