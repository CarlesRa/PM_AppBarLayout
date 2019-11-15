package com.carlesramos.appbarlayout.fragments;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.carlesramos.appbarlayout.R;
import com.carlesramos.appbarlayout.modelo.Persona;

import static android.content.Context.INPUT_METHOD_SERVICE;

public class FragmentAcceso extends Fragment {

    private TextView tvUserName;
    private TextView tvNombre;
    private TextView tvLblYourPass;
    private TextView tvLblNewPass;
    private TextView tvLblRepeatPass;
    private EditText etActualPass;
    private EditText etNewPass;
    private EditText etPassRepeat;
    private Persona p;
    private Button btChangePass;
    private Button btSaveChanges;

    public FragmentAcceso(Persona p) {
        this.p = p;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.frg_acceso, container, false);

        return layout;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        tvUserName = getActivity().findViewById(R.id.tvLblUserName);
        tvNombre = getActivity().findViewById(R.id.tvUser);
        tvLblYourPass = getActivity().findViewById(R.id.tvLblYourPass);
        tvLblNewPass = getActivity().findViewById(R.id.tvLblNewPass);
        tvLblRepeatPass = getActivity().findViewById(R.id.tvLblRepeatPass);
        etActualPass = getActivity().findViewById(R.id.etYourPass);
        etNewPass = getActivity().findViewById(R.id.etNewPass);
        etPassRepeat = getActivity().findViewById(R.id.etRepitPass);
        tvNombre.setText(p.getNom());
        btChangePass = getActivity().findViewById(R.id.btChangePass);
        btChangePass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarElementos();
            }
        });
        btSaveChanges = getActivity().findViewById(R.id.btSaveChanges);
        btSaveChanges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (p.setContrasenya(etActualPass.getText().toString()
                        ,etNewPass.getText().toString(),etPassRepeat.getText().toString()) == 0){
                    ocultarElementos();
                    resetTexts();
                    Toast toast = Toast.makeText(getActivity(),"Contraseña cambiada!!",Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER,0,0);
                    toast.show();
                }
                else if(p.setContrasenya(etActualPass.getText().toString()
                        ,etNewPass.getText().toString(),etPassRepeat.getText().toString()) == 1){
                    etPassRepeat.requestFocus();
                    resetNewPassText();
                    Toast toast = Toast.makeText(getActivity(),"Error la nueva contraseña no coicide!!",Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER,0,0);
                    toast.show();
                }
                else{
                    resetTexts();
                    etActualPass.requestFocus();
                    Toast toast = Toast.makeText(getActivity(),"Error contraseña actual erronea!!",Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER,0,0);
                    toast.show();
                }
            }
        });
    }

    public void ocultarElementos(){
        tvLblYourPass.setVisibility(View.INVISIBLE);
        tvLblNewPass.setVisibility(View.INVISIBLE);
        tvLblRepeatPass.setVisibility(View.INVISIBLE);
        etActualPass.setVisibility(View.INVISIBLE);
        etNewPass.setVisibility(View.INVISIBLE);
        etPassRepeat.setVisibility(View.INVISIBLE);
        btSaveChanges.setVisibility(View.INVISIBLE);
    }

    public void mostrarElementos(){
        tvLblYourPass.setVisibility(View.VISIBLE);
        tvLblNewPass.setVisibility(View.VISIBLE);
        tvLblRepeatPass.setVisibility(View.VISIBLE);
        etActualPass.setVisibility(View.VISIBLE);
        etNewPass.setVisibility(View.VISIBLE);
        etPassRepeat.setVisibility(View.VISIBLE);
        btSaveChanges.setVisibility(View.VISIBLE);
    }

    public void resetTexts(){
        etActualPass.setText("");
        etNewPass.setText("");
        etPassRepeat.setText("");
    }

    public void resetNewPassText(){
        etPassRepeat.setText("");
    }
}
