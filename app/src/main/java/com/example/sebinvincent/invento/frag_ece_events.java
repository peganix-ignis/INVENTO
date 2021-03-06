package com.example.sebinvincent.invento;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class frag_ece_events extends Fragment {

    ImageView competitions;
    ImageView workshops;
    ImageView talks;

    public frag_ece_events() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View view;


        view=inflater.inflate(R.layout.frag_ece_events, container, false);
        competitions =(ImageView)view.findViewById(R.id.ececomp);
        talks = (ImageView)view.findViewById(R.id.ece_talksndshow);


        competitions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                frag_ece_comp_list ececomp =new frag_ece_comp_list();
                FragmentManager manager=getFragmentManager();
                manager.beginTransaction().replace(R.id.Container,ececomp,ececomp.getTag()).addToBackStack("").commit();

            }
        });


        talks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                frag_ece_talk_list ecetalk =new frag_ece_talk_list();
                FragmentManager manager=getFragmentManager();
                manager.beginTransaction().replace(R.id.Container,ecetalk,ecetalk.getTag()).addToBackStack("").commit();

            }
        });


        return view;
    }

}
