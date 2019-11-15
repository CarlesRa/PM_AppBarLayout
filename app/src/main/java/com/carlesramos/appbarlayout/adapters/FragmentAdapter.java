package com.carlesramos.appbarlayout.adapters;
import android.content.Context;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.carlesramos.appbarlayout.R;
import com.carlesramos.appbarlayout.fragments.FragmentAcceso;
import com.carlesramos.appbarlayout.fragments.FragmentPersonal;
import com.carlesramos.appbarlayout.fragments.FragmentProfesional;
import com.carlesramos.appbarlayout.modelo.Persona;

public class FragmentAdapter extends FragmentPagerAdapter {

    private final int N_PAGINAS = 3;
    private Context context;

    public FragmentAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        Persona persona = new Persona("53215474Y","Carlos","Ramos Moll","15/08/1982"
        ,"Muñoz 4 2ºD","Gravity apps","H234234234","www.gravityapps.com"
        ,"jcramos8282@gmail.com","si");
        switch (position){
            case 0:
                FragmentPersonal fragmentPersonal = new FragmentPersonal(persona);
                return fragmentPersonal;
            case 1:
                FragmentProfesional fragmentProfesional = new FragmentProfesional(persona);
                return fragmentProfesional;
            case 2:
                FragmentAcceso fragmentAcceso = new FragmentAcceso(persona);
                return fragmentAcceso;
        }
        return null;
    }

    @Override
    public int getCount() {
        return N_PAGINAS;
    }

}
