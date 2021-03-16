package github.com.RegesDias.domain.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

@Entity
@Table(name="produto")
public class Produto {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name="descricao")
    private String descricao;

    @Column(name = "preco_unitario")
    private BigDecimal preco;

    //Construtor
    public Produto() {
    }
    public Produto(Integer id, String descricao, BigDecimal preco) {
        this.id = id;
        this.descricao = descricao;
        this.preco = preco;
    }

    //GetSet
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    //toString
    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                '}';
    }
}
