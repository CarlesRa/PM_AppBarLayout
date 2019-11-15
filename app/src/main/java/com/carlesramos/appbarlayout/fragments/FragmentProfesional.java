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

public class FragmentProfesional extends Fragment {
    private TextView tvRazonSocial;
    private TextView tvCif;
    private TextView tvDireccion;
    private TextView tvWebSite;
    private TextView tvEmail;
    private Persona p;

    public FragmentProfesional(Persona p) {
        this.p = p;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.frg_profesional, container, false);

        return layout;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        tvRazonSocial = getActivity().findViewById(R.id.tvRazonSocial);
        tvCif = getActivity().findViewById(R.id.tvCif);
        tvDireccion = getActivity().findViewById(R.id.tvDireccion);
        tvWebSite = getActivity().findViewById(R.id.tvWeb);
        tvEmail = getActivity().findViewById(R.id.tvEmail);
        tvRazonSocial.setText(p.getRaoSocial());
        tvCif.setText(p.getCif());
        tvDireccion.setText(p.getDireccio());
        tvWebSite.setText(p.getWebSite());
        tvEmail.setText(p.getEmail());
    }
}
