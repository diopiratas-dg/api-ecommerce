package br.com.digitalhouse.apiecommerce.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "pedido")
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, name = "id_pedido")
    private Integer idPedido;

    @Column(nullable = false, name = "nota_fiscal")
    private String notaFiscal;

    @Column(nullable = false, name = "data_solicitacao")
    private LocalDateTime dataSolicitacao;

    @Column(nullable = false, name = "valor_total", columnDefinition = "10,2")
    private Double valorTotal;

    @Column(nullable = false, length = 20)
    private String status;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_id_cliente_pedido")
    private Client idCliente;

    public Orders(){};

    public Integer getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
    }

    public String getNotaFiscal() {
        return notaFiscal;
    }

    public void setNotaFiscal(String notaFiscal) {
        this.notaFiscal = notaFiscal;
    }

    public LocalDateTime getDataSolicitacao() {
        return dataSolicitacao;
    }

    public void setDataSolicitacao(LocalDateTime dataSolicitacao) {
        this.dataSolicitacao = dataSolicitacao;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Client getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Client idCliente) {
        this.idCliente = idCliente;
    }
}
