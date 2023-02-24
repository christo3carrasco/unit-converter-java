package com.carrasco.util;

import java.util.Arrays;
import java.util.List;

public interface Factor {
    //TIPO DE CAMBIO: 23/02/2023
    //Dólares | Euros | Libras esterlinas | Yen japonés | Won surcoreano
    List<Double> solesToAnother = Arrays.asList(0.2627, 0.2479, 0.2187, 35.3954, 341.5992);
    List<Double> anotherToSoles = Arrays.asList(3.8061, 4.0343, 4.5741, 0.0283, 0.0029);
}
