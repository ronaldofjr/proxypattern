package Aula06_Integradora2.service;

import Aula06_Integradora2.exceptions.FilmeNaoHabilitadoException;
import Aula06_Integradora2.model.Filme;

public interface InterfaceGradeFilmes {

    Filme getFilme(String titulo) throws FilmeNaoHabilitadoException;

}
