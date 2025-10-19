package com.example.backendproductos.model;
import jakarta.persistence.*;

@Entity
@Table(name = "productos")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private int precio;
    private int stock;

    public Producto(){
    }

    public Producto(Long id, String nombre, int precio, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    public Long getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public int getPrecio() {
        return precio;
    }
    public int getStock() {
        return stock;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setNombre(String marca) {
        this.nombre = marca;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
}
