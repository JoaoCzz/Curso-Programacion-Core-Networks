package com.corenetworks.ExamenModulo4JoaoCozzarelli.Ejercicio1.Modelo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("ir")
public class ivaSuperReducido implements IImpuesto{
    @Override
    public double calcularImpuesto(Producto p1) {
        return (p1.getPrecio()*0.12);
    }
}
