package com.example.contaking.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.contaking.MainActivity;
import com.example.contaking.Model.Data;
import com.example.contaking.R;

public class NumPlayer extends Fragment {

    private EditText giocatore1;
    private EditText giocatore2;
    private EditText giocatore3;
    private EditText giocatore4;
    private Button start;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_num_player, container, false);
        //connetiamo tutti i componenti
        giocatore1 = (EditText) view.findViewById(R.id.giocatore1);
        giocatore2 = (EditText) view.findViewById(R.id.giocatore2);
        giocatore3 = (EditText) view.findViewById(R.id.giocatore3);
        giocatore4 = (EditText) view.findViewById(R.id.giocatore4);
        start = (Button) view.findViewById(R.id.button);

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

                NavHostFragment.findNavController(NumPlayer.this)
                        .navigate(R.id.action_navigation_NumPlayer_to_navigation_noKnoJ);
            }
        });


        return view;
    }


}