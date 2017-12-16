package sas.eschool.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import sas.eschool.R;

public class Events_parentsFragment extends Fragment {


    public Events_parentsFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_events_parents, container, false);

        ImageView lov1 = view.findViewById(R.id.lov1);
        ImageView lov2 = view.findViewById(R.id.lov2);
        ImageView lov3 = view.findViewById(R.id.lov3);

        lov1.setImageResource(R.drawable.like2);
        lov2.setImageResource(R.drawable.like);
        lov3.setImageResource(R.drawable.like2);

        return view;

    }
}
