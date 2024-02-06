package com.corenetworks._Febrero_Validaciones.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ResumenDTO {

    private BigInteger contador;
    private double sueldoPromedio;
}
