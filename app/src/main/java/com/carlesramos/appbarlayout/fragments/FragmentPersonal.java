package com.carlesramos.appbarlayout.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


import com.carlesramos.appbarlayout.R;
import com.carlesramos.appbarlayout.modelo.Persona;

public class FragmentPersonal extends Fragment {

    private TextView tvDni;
    private TextView tvNombre;
    private TextView tvApellido;
    private TextView tvFechaNac;
    private TextView tvDireccion;
    private Persona p;

    public FragmentPersonal(Persona persona) {
        this.p = persona;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.frg_personal, container, false);

        return layout;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        tvDni = getActivity().findViewById(R.id.tvDni);
        tvNombre = getActivity().findViewById(R.id.tvNombre);
        tvApellido = getActivity().findViewById(R.id.tvApellido);
        tvFechaNac = getActivity().findViewById(R.id.tvFechaNac);
        tvDireccion = getActivity().findViewById(R.id.tvLblDireccion);
        tvDni.setText(p.getNif());
        tvNombre.setText(p.getNom());
        tvApellido.setText(p.getCognom());
        tvFechaNac.setText(p.getFecha());
        tvDireccion.setText(p.getDireccio());
    }

}
