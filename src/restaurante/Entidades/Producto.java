/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurante.Entidades;

/**
 *
 * @author MaRio
 */
public class Producto {
    private int id_producto;
    private String nombreProducto;
    private double precio;
    private int stock;
    private boolean estado;

    public Producto() {
    }

    public Producto(int id_producto, String nombreProducto, double precio, int stock, boolean estado) {
        this.id_producto = id_producto;
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.stock = stock;
        this.estado = estado;
    }

    public Producto(String nombreProducto, double precio, int stock, boolean estado) {
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.stock = stock;
        this.estado = estado;
    }

    public Producto(String nombreProducto, double precio) {
        this.nombreProducto = nombreProducto;
        this.precio = precio;
    }        

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return  id_producto + ", " + nombreProducto ;
    }

    
    

}
