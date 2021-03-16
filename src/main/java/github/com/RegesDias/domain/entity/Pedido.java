package github.com.RegesDias.domain.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name="pedido")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @OneToMany (mappedBy = "Pedido")
    Set<ItemPedido> ItemPedido;

    @Column(name="data_Pedido")
    private LocalDate dataPedido;

    @Column(name="total", length = 20, precision = 2)
    private BigDecimal total;

    //Construtor
    public Pedido() {
    }
    public Pedido(Integer id, Cliente cliente, LocalDate dataPedido, BigDecimal total) {
        this.id = id;
        this.cliente = cliente;
        this.dataPedido = dataPedido;
        this.total = total;
    }
    //GetSet
    public Set<github.com.RegesDias.domain.entity.ItemPedido> getItemPedido() {
        return ItemPedido;
    }

    public void setItemPedido(Set<github.com.RegesDias.domain.entity.ItemPedido> itemPedido) {
        ItemPedido = itemPedido;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(LocalDate dataPedido) {
        this.dataPedido = dataPedido;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    //toString
    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", cliente=" + cliente +
                ", dataPedido=" + dataPedido +
                ", total=" + total +
                '}';
    }
}
