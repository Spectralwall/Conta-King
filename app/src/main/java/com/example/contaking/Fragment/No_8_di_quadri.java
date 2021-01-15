package com.example.contaking.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.contaking.Model.Data;
import com.example.contaking.R;


public class No_8_di_quadri extends Fragment {

    private TextView giocatore1;
    private TextView giocatore2;
    private TextView giocatore3;
    private TextView giocatore4;

    private EditText point1;
    private EditText point2;
    private EditText point3;
    private EditText point4;

    private Button next;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_no_8_di_quadri, container, false);

        //collegiamo i componenti
        giocatore1 = (TextView) view.findViewById(R.id.G1);
        giocatore2 = (TextView) view.findViewById(R.id.G2);
        giocatore3 = (TextView) view.findViewById(R.id.G3);
        giocatore4 = (TextView) view.findViewById(R.id.G4);
        //
        point1 = (EditText) view.findViewById(R.id.p1);
        point2 = (EditText) view.findViewById(R.id.p2);
        point3 = (EditText) view.findViewById(R.id.p3);
        point4 = (EditText) view.findViewById(R.id.p4);
        //
        next = (Button) view.findViewById(R.id.button2);
        //set text view
        giocatore1.setText(Data.getPlayer1());
        giocatore2.setText(Data.getPlayer2());
        giocatore3.setText(Data.getPlayer3());
        giocatore4.setText(Data.getPlayer4());
        //botton event
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Data.subPlapoint1(Integer.parseInt(String.valueOf(point1.getText())));
                Data.subPlapoint2(Integer.parseInt(String.valueOf(point2.getText())));
                Data.subPlapoint3(Integer.parseInt(String.valueOf(point3.getText())));
                Data.subPlapoint4(Integer.parseInt(String.valueOf(point4.getText())));

                System.out.println(Data.getPlayer1point());
                System.out.println(Data.getPlayer2point());
                System.out.println(Data.getPlayer3point());
                System.out.println(Data.getPlayer4point());
                //cambio fragment

                NavHostFragment.findNavController(No_8_di_quadri.this)
                        .navigate(R.id.action_navigation_no8_di_quadri_to_navigation_no_re_di_cuori);
            }
        });

        return view;
    }
}