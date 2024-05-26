package com.example.proj10_calculaareaeperimetro.controller;

import com.example.proj10_calculaareaeperimetro.model.Circulo;
import com.example.proj10_calculaareaeperimetro.model.Retangulo;

public interface IGeometriaController {

    public float CalculaArea(Circulo circulo);
    public float CalculaPerimetro (Retangulo retangulo);
}
