package com.corenetworks.ExamenModulo4JoaoCozzarelli.Ejercicio1.Modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Component
public class Factura {
    @Qualifier("ig")
    @Autowired
    private IImpuesto impuesto;
    private List<Producto> productos;


    public double CalcularTotalFactura(){
        double factura = 0;
        for (Producto elemento:productos){
            factura+= elemento.getPrecio()+impuesto.calcularImpuesto(elemento);
        }
        return factura;
    }
}
