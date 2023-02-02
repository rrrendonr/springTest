package com.platzi.market.persistence.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "compras")
public class Compra {

    @Id
    @Column(name = "id_compra")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCompra;

    @Column(name = "id_cliente")
    private String idCilente;

    private LocalDateTime fecha;

    @Column(name = "medio_pago")
    private String medioPago;

    private String comentario;
    private String estado;

    @ManyToOne
    @JoinColumn(name = "id_cliente", insertable = false, updatable = false)
    private Cliente cliente;

    @OneToMany(mappedBy = "compra")
    private List<ComprasProducto> productos;

    public Compra() {
    }

    public Integer getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
    }

    public String getIdCilente() {
        return idCilente;
    }

    public void setIdCilente(String idCilente) {
        this.idCilente = idCilente;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
