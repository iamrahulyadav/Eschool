package sas.eschool.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import sas.eschool.R;
import sas.eschool.Studentdetails_classRoom;
import sas.eschool.StudentsList_classRoom;

/**
 * A simple {@link Fragment} subclass.
 */
public class StudentsList_msging extends Fragment {


    public StudentsList_msging() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

       View view = inflater.inflate(R.layout.fragment_students_list_msging, container, false);

        CardView student1 = view.findViewById(R.id.student1);
        student1.setOnClickListener(v -> {
            startActivity(new Intent(getActivity(), Studentdetails_classRoom.class));

        });


        return view;
    }

}
