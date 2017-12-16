package sas.eschool.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import sas.eschool.Chat;
import sas.eschool.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class TeachersList_messging extends Fragment {

    public TeachersList_messging() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_teachers_list_messging, container, false);
        CardView teacher = view.findViewById(R.id.first_teacher);
        return view;
    }

}
