package com.example.contaking;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class NumPlayer extends Fragment {

    private EditText giocatore1;
    private EditText giocatore2;
    private EditText giocatore3;
    private EditText giocatore4;

    public NumPlayer() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_num_player, container, false);

        setAllWidget(view);
        Button start = (Button) view.findViewById(R.id.button);

        //click sul bottone
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //salviamo i dati nel model
                Data.setPlayer1(giocatore1.getText().toString());
                Data.setPlayer2(giocatore2.getText().toString());
                Data.setPlayer3(giocatore3.getText().toString());
                Data.setPlayer4(giocatore4.getText().toString());

                //cambio fragment

            }
        });

        return view;
    }

    //connettiamo tutti i dati
    private void setAllWidget(View view) {
        giocatore1 =(EditText) view.findViewById(R.id.Text1);
        giocatore2 =(EditText) view.findViewById(R.id.Text2);
        giocatore3 =(EditText) view.findViewById(R.id.Text3);
        giocatore4 =(EditText) view.findViewById(R.id.Text4);
    }
}