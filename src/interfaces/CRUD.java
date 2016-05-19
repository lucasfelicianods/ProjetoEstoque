
package interfaces;
import estoque.Produto;
import java.sql.SQLException;
import java.util.ArrayList;

public interface CRUD {
   // public void incluir(Contato objeto)throws SQLException;
    public ArrayList listar() throws SQLException;
    public void excluir(String nome) throws SQLException;
    public Produto consultar(String nome) throws SQLException;
    public void alterar(String nome) throws SQLException;
}
