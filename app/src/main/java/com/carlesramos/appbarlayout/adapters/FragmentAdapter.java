package com.carlesramos.appbarlayout.adapters;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.carlesramos.appbarlayout.fragments.FragmentAcceso;
import com.carlesramos.appbarlayout.fragments.FragmentPersonal;
import com.carlesramos.appbarlayout.fragments.FragmentProfesional;

public class FragmentAdapter extends FragmentPagerAdapter {

    private final int N_PAGINAS = 3;
    public FragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                FragmentPersonal fragmentPersonal = new FragmentPersonal();
                return fragmentPersonal;
            case 1:
                FragmentProfesional fragmentProfesional = new FragmentProfesional();
                return fragmentProfesional;
            case 2:
                FragmentAcceso fragmentAcceso = new FragmentAcceso();
                return fragmentAcceso;
        }
        return null;
    }

    @Override
    public int getCount() {
        return N_PAGINAS;
    }
}
