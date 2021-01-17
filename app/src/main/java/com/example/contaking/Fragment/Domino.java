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


public class Domino extends Fragment {

    private TextView giocatore1;
    private TextView giocatore2;
    private TextView giocatore3;
    private TextView giocatore4;

    private TextView meno1;
    private TextView piu1;
    private TextView meno2;
    private TextView piu2;
    private TextView meno3;
    private TextView piu3;
    private TextView meno4;
    private TextView piu4;

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
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_domino, container, false);

        //collegiamo i componenti
        giocatore1 = (TextView) view.findViewById(R.id.G1);
        giocatore2 = (TextView) view.findViewById(R.id.G2);
        giocatore3 = (TextView) view.findViewById(R.id.G3);
        giocatore4 = (TextView) view.findViewById(R.id.G4);
        //testo per fare vedere a schermo chi prende punti e chi li perde
        meno1 = (TextView) view.findViewById(R.id.meno1);
        piu1 = (TextView) view.findViewById(R.id.piu1);
        meno2 = (TextView) view.findViewById(R.id.meno2);
        piu2 = (TextView) view.findViewById(R.id.piu2);
        meno3 = (TextView) view.findViewById(R.id.meno3);
        piu3 = (TextView) view.findViewById(R.id.piu3);
        meno4 = (TextView) view.findViewById(R.id.meno4);
        piu4 = (TextView) view.findViewById(R.id.piu4);
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
        //set visibility
        if(Data.getDomino().equals(Data.getPlayer1())){
            meno1.setVisibility(View.GONE);
            piu1.setVisibility(View.VISIBLE);
            meno2.setVisibility(View.VISIBLE);
            //
            piu2.setVisibility(View.GONE);
            meno3.setVisibility(View.VISIBLE);
            piu3.setVisibility(View.GONE);
            meno4.setVisibility(View.VISIBLE);
            piu4.setVisibility(View.GONE);
        }else if(Data.getDomino().equals(Data.getPlayer2())){
            meno2.setVisibility(View.GONE);
            piu2.setVisibility(View.VISIBLE);
            //
            meno1.setVisibility(View.VISIBLE);
            piu1.setVisibility(View.GONE);
            meno3.setVisibility(View.VISIBLE);
            piu3.setVisibility(View.GONE);
            meno4.setVisibility(View.VISIBLE);
            piu4.setVisibility(View.GONE);
        }else if(Data.getDomino().equals(Data.getPlayer3())){
            meno3.setVisibility(View.GONE);
            piu3.setVisibility(View.VISIBLE);
            //
            meno1.setVisibility(View.VISIBLE);
            piu1.setVisibility(View.GONE);
            meno2.setVisibility(View.VISIBLE);
            piu2.setVisibility(View.GONE);
            meno4.setVisibility(View.VISIBLE);
            piu4.setVisibility(View.GONE);
        }else if(Data.getDomino().equals(Data.getPlayer4())){
            meno4.setVisibility(View.GONE);
            piu4.setVisibility(View.VISIBLE);
            //
            meno1.setVisibility(View.VISIBLE);
            piu1.setVisibility(View.GONE);
            meno2.setVisibility(View.VISIBLE);
            piu2.setVisibility(View.GONE);
            meno3.setVisibility(View.VISIBLE);
            piu3.setVisibility(View.GONE);
        }
        //botton event
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Data.getDomino().equals(Data.getPlayer1())){
                    Data.addPlayerpoin1(Integer.parseInt(String.valueOf(point1.getText())));
                    Data.subPlapoint2(Integer.parseInt(String.valueOf(point2.getText())));
                    Data.subPlapoint3(Integer.parseInt(String.valueOf(point3.getText())));
                    Data.subPlapoint4(Integer.parseInt(String.valueOf(point4.getText())));
                }else if(Data.getDomino().equals(Data.getPlayer2())){
                    Data.addPlayerpoin2(Integer.parseInt(String.valueOf(point2.getText())));
                    Data.subPlapoint1(Integer.parseInt(String.valueOf(point1.getText())));
                    Data.subPlapoint3(Integer.parseInt(String.valueOf(point3.getText())));
                    Data.subPlapoint4(Integer.parseInt(String.valueOf(point4.getText())));
                }else if(Data.getDomino().equals(Data.getPlayer3())){
                    Data.addPlayerpoin3(Integer.parseInt(String.valueOf(point3.getText())));
                    Data.subPlapoint2(Integer.parseInt(String.valueOf(point2.getText())));
                    Data.subPlapoint1(Integer.parseInt(String.valueOf(point1.getText())));
                    Data.subPlapoint4(Integer.parseInt(String.valueOf(point4.getText())));
                }else if(Data.getDomino().equals(Data.getPlayer4())){
                    Data.addPlayerpoin4(Integer.parseInt(String.valueOf(point4.getText())));
                    Data.subPlapoint2(Integer.parseInt(String.valueOf(point2.getText())));
                    Data.subPlapoint3(Integer.parseInt(String.valueOf(point3.getText())));
                    Data.subPlapoint1(Integer.parseInt(String.valueOf(point1.getText())));
                }
                //cambio fragment
                NavHostFragment.findNavController(Domino.this)
                        .navigate(R.id.action_navigation_domino_to_navigation_dichiarazione1);
            }
        });

        return  view;
    }
}