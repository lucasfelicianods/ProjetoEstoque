/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estoque;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import interfaces.CRUD;
import java.sql.SQLException;
import java.sql.Connection;
import estoque.Conexao;
import estoque.Produto;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;

/**
 *
 * @author Francisco
 */
public class ProdutoDao {
    Produto p ;
    public void incluir(Produto produto){
        try {
            Connection con = Conexao.getConnection();
            try{
                PreparedStatement pstmt = con.prepareStatement("insert into produto "
                        + "(nome, codigo, qtd_estoque, und_med, valor_venda, valor_compra, qtd_estoque_min) "
                        + "values "
                        + "(?, ?, ?, ?, ?, ?, ?)");
                int idx = 1;
                pstmt.setString(idx++, produto.getNome());
                pstmt.setString(idx++, produto.getCodigo());
                pstmt.setDouble(idx++, produto.getQtdEstoque());
                pstmt.setString(idx++, produto.getUnidadeMedida());
                pstmt.setDouble(idx++, produto.getValorVenda());
                pstmt.setDouble(idx++, produto.getValorCompra());
                pstmt.setDouble(idx++, produto.getQtdEstoqueMin());
                pstmt.executeUpdate();
            }finally{
                con.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
   
 
    public ArrayList listar() throws SQLException {
        ArrayList dados = new ArrayList();
        Connection con = Conexao.getConnection();
        String comando = "select * from produto";
        PreparedStatement ps = con.prepareStatement(comando);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            
            p = new Produto();
           
           p.setCodigo(rs.getString("Codigo"));
           p.setNome(rs.getString("nome"));
           p.setQtdEstoque(rs.getDouble("qtd_estoque"));
           p.setQtdEstoqueMin(rs.getDouble("qtd_estoque_min"));
           p.setUnidadeMedida(rs.getString("und_med"));
           p.setValorCompra(rs.getDouble("valor_compra"));
           p.setValorVenda(rs.getDouble("valor_venda"));
            dados.add(p);
        }
        return dados;
    }
    
   public Produto consultar(String nome) throws SQLException {
        String comando = "select * from produto where nome = ?";
        Connection con = Conexao.getConnection();
        PreparedStatement ps = con.prepareStatement(comando);
        ps.setString(1, nome);
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            
            p = new Produto();
           
            p.setId(rs.getInt("id"));
           p.setCodigo(rs.getString("codigo"));
           p.setNome(rs.getString("nome"));
           p.setUnidadeMedida(rs.getString("und_med"));
           p.setQtdEstoque(rs.getDouble("qtd_estoque"));
           p.setQtdEstoqueMin(rs.getDouble("qtd_estoque_min"));
           p.setValorCompra(rs.getDouble("valor_compra"));
           p.setValorVenda(rs.getDouble("valor_venda"));
           
            return p;
        }
        return null;
    }
    public void alterar (Produto objeto) throws Exception{
        
        String comando = ("update produto set nome=?"
                        + ",codigo=?,und_med=?,valor_venda=?,valor_compra=?,qtd_estoque =?,qtd_estoque_min=? where id=?");
        Connection con = Conexao.getConnection();
        PreparedStatement ps = con.prepareStatement(comando);
        
        
        ps.setString(1, objeto.getNome());
        ps.setString(2, objeto.getCodigo());
        ps.setString(3, objeto.getUnidadeMedida());
        ps.setDouble(4, objeto.getValorVenda());
        ps.setDouble(5, objeto.getValorCompra());
        ps.setDouble(6, objeto.getQtdEstoque());
        ps.setDouble(7, objeto.getQtdEstoqueMin());
        ps.setInt(8, objeto.getId());
        ps.executeUpdate();
       
       

    }

  public void deletar(String nome )  throws SQLException{
      
      String comando = "delete from produto where nome=?";
      
      Connection con = Conexao.getConnection();
        PreparedStatement ps = con.prepareStatement(comando);
        ps.setString(1, nome);
        ps.executeUpdate();
  }

          
   }


