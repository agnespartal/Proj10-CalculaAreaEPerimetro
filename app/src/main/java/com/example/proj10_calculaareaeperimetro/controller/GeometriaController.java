package com.example.proj10_calculaareaeperimetro.controller;

import com.example.proj10_calculaareaeperimetro.model.Circulo;
import com.example.proj10_calculaareaeperimetro.model.Retangulo;

public class GeometriaController implements IGeometriaController{


    @Override
    public float CalculaArea(Circulo circulo) {
        float raio = circulo.getRaio();
        return Float.parseFloat(String.valueOf(Math.PI * Math.pow(raio,2)));
    }

    @Override
    public float CalculaPerimetro(Retangulo retangulo) {
        float base = retangulo.getBase();
        float altura = retangulo.getAltura();
        return 2 * (base+altura);
    }
}
