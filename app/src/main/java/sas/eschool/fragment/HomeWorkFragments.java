package sas.eschool.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import sas.eschool.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeWorkFragments extends Fragment {


    public HomeWorkFragments() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View V = inflater.inflate(R.layout.fragment_home_work_fragments, container, false);


        return V;
    }

}
