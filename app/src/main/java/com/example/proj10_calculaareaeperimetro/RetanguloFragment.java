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
import com.example.proj10_calculaareaeperimetro.model.Retangulo;


public class RetanguloFragment extends Fragment {

    private EditText txtBase;
    private EditText txtAltura;
    private TextView txtResultado;
    private View view;
    private Button btnCalcula;



    public RetanguloFragment() {
        super();
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_retangulo, container, false);

        txtAltura = view.findViewById(R.id.txtAltura);
        txtBase = view.findViewById(R.id.txtBase);
        txtResultado = view.findViewById(R.id.txtResultadoRetangulo);

        btnCalcula = view.findViewById(R.id.btnCalculaRetangulo);
        btnCalcula.setOnClickListener(op->Calcula());

        return view;
    }

    private void Calcula() {
        Retangulo retangulo = new Retangulo();
        retangulo.setAltura(Float.parseFloat(txtAltura.getText().toString()));
        retangulo.setAltura(Float.parseFloat(txtBase.getText().toString()));

        GeometriaController gc = new GeometriaController();
        float resultado = gc.CalculaPerimetro(retangulo);
        String res = "Perimetro é: " + resultado;

        txtResultado.setText(res);

    }
}