package ec.edu.uce.domain.repository;

import ec.edu.uce.domain.model.Autor;
import ec.edu.uce.domain.model.Libro;

public interface AuthorRepository {

    public void crear(Autor autor);

    public Autor consultarPorId(Integer id);

}
