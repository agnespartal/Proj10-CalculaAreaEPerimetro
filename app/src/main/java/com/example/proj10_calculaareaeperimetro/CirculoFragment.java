package com.example.proj10_calculaareaeperimetro;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.proj10_calculaareaeperimetro.controller.GeometriaController;
import com.example.proj10_calculaareaeperimetro.model.Circulo;


public class CirculoFragment extends Fragment {

        private EditText txtRaio;
        private TextView txtResultado;
        private View view;
        private Button btnCalcula;


    public CirculoFragment() {
        super();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_circulo, container, false);

        txtRaio = view.findViewById(R.id.txtRaio);
        txtResultado = view.findViewById(R.id.txtResultadoCirculo);
        btnCalcula = view.findViewById(R.id.btnCalculaCirculo);
        btnCalcula.setOnClickListener(op->Calcula());


        return view;
    }

    private void Calcula() {
        Circulo circulo = new Circulo();
        circulo.setRaio(Float.parseFloat(txtRaio.getText().toString()));

        GeometriaController gc = new GeometriaController();
        float resultado = gc.CalculaArea(circulo);

        String res  = "A área é: " + resultado;
        txtResultado.setText(res);
    }
}