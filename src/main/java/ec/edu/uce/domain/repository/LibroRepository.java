package ec.edu.uce.domain.repository;

import ec.edu.uce.domain.model.Autor;
import ec.edu.uce.domain.model.Libro;

public interface LibroRepository {

    public void crear(Libro libro);

    public Libro consultarPorId(Integer id);

}
