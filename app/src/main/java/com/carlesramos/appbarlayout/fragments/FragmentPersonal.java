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

public class FragmentPersonal extends Fragment {

    private TextView tvPersonal;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.frg_personal, container, false);
        tvPersonal = getActivity().findViewById(R.id.tvPersonal);
        return layout;
    }
}
