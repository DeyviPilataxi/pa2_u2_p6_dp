package ec.edu.uce.domain.repository;

import ec.edu.uce.domain.model.Materia;

public interface MateriaRepository {

    public void crear(Materia materia);

    public Materia consultarPorId(Integer id);

}
