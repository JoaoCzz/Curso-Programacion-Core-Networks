package com.corenetworks.ExamenModulo4JoaoCozzarelli.Ejercicio1.Modelo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("ig")
public class ivaGeneral implements IImpuesto{
    @Override
    public double calcularImpuesto(Producto p1) {
        return (p1.getPrecio()*0.21);
    }
}
