package interfaces;

import bin.Fornecedor;
import java.util.Iterator;

public interface FornecedorDAO {
    public void insert(Fornecedor f);
    public Iterator<Fornecedor> read();
    public void update(Fornecedor f);
    public void delete(Fornecedor f);
}
