/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.trabalho.classes;

import java.util.Objects;

/**
 *
 * @author emerson
 */
public class Item_venda {
    private int Id;
    private float V_produto;
    private int Qtd;
    private Produto produto;
    private boolean Ativo;
    
    //----
    
    public Item_venda(){
        Id = 0;
        V_produto = 0;
        Qtd = 0;
        
    }
    
    //---

    public int getId() {
        return Id;
    }

    public void setId(int Id) throws ErroValidacaoException {
        if(Id >= 0){
            this.Id = Id;
        }else{
            throw new ErroValidacaoException("Id não pode ser menor que zero");
        }
    }

    public float getV_produto() {
        return V_produto;
    }

    public void setV_produto(float V_produto) {
        this.V_produto = V_produto;
    }

    public int getQtd() {
        return Qtd;
    }
    
    public boolean isAtivo(){
        return Ativo;
    }
    
    public void setAtivo(boolean Ativo){
        this.Ativo = Ativo;
    }

    public void setQtd(int Qtd) throws ErroValidacaoException {
        if(Qtd > 0){
            this.Qtd = Qtd;
        }else{
            throw new ErroValidacaoException("Quantidade não pode ser menor ou igual a zero!");
        }
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Item_venda other = (Item_venda) obj;
        if (this.Id != other.Id) {
            return false;
        }
        if (Float.floatToIntBits(this.V_produto) != Float.floatToIntBits(other.V_produto)) {
            return false;
        }
        if (this.Qtd != other.Qtd) {
            return false;
        }
        if (!Objects.equals(this.produto, other.produto)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Item_venda{" + "Id=" + Id + ", V_produto=" + V_produto + ", Qtd=" + Qtd + ", produto=" + produto + '}';
    }
    
    
}
