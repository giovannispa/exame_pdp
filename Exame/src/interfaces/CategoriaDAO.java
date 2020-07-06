package interfaces;

import bin.Categoria;
import java.util.Iterator;

public interface CategoriaDAO {
    public void insert(Categoria c);
    public Iterator<Categoria> read();
    public void update(Categoria c);
    public void delete(Categoria c);
    public Categoria retornaCategoria(String category);
}
