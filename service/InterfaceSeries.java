package Aula06_Integradora2.service;

import Aula06_Integradora2.exceptions.SerieNaoHabilitadaException;

public interface InterfaceSeries {

    String getSerie(String titulo) throws SerieNaoHabilitadaException;

}
