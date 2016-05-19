/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estoque;

import javax.swing.JTextField;

/**
 *
 * @author Francisco
 */
public class Produto {
    
    private int id;
    
    private String nome;
    
    private String codigo;
    
    private double qtdEstoque;
    
    private double qtdEstoqueMin;
    
    private String unidadeMedida;
    
    private  double valorVenda;
    
    private double valorCompra;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the qtdEstoque
     */
    public double getQtdEstoque() {
        return qtdEstoque;
    }

    /**
     * @param qtdEstoque the qtdEstoque to set
     */
    public void setQtdEstoque(double qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    /**
     * @return the qtdEstoqueMin
     */
    public double getQtdEstoqueMin() {
        return qtdEstoqueMin;
    }

    /**
     * @param qtdEstoqueMin the qtdEstoqueMin to set
     */
    public void setQtdEstoqueMin(double qtdEstoqueMin) {
        this.qtdEstoqueMin = qtdEstoqueMin;
    }

    /**
     * @return the unidadeMedida
     */
    public String getUnidadeMedida() {
        return unidadeMedida;
    }

    /**
     * @param unidadeMedida the unidadeMedida to set
     */
    public void setUnidadeMedida(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    /**
     * @return the valorVenda
     */
    public double getValorVenda() {
        return valorVenda;
    }

    /**
     * @param valorVenda the valorVenda to set
     */
    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    /**
     * @return the valorCompra
     */
    public double getValorCompra() {
        return valorCompra;
    }

    /**
     * @param valorCompra the valorCompra to set
     */
    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public Produto setNome(JTextField txtNome1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setCodigo(JTextField txtCodigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
