package interfaces;

import bin.Produto;
import java.util.Iterator;


public interface ProdutoDAO {
    
    public void insert(Produto p);
    public Iterator<Produto> read();
    public void update(Produto p);
    public void delete(Produto p);
    
}
