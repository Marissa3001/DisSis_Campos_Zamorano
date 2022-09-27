package productos;

//import java.util.*;

public class Agregar_carrito {
    private String carrito;
    private double id_producto;
    private String nombre_prod;
    private double fecha;

    /**
     * Default constructor
     */
    public Agregar_carrito(String carrito, double id_producto, String nombre_prod, double fecha) {
        this.carrito = carrito;
        this.id_producto = id_producto;
        this.nombre_prod = nombre_prod;
        this.fecha = fecha;
    }

    public String getCarrito() {
        return carrito;
    }

    public void setCarrito(String carr) {
        this.carrito = carr;
    }
    /**
     * 
     */

    public double getId_producto() 
    {
        return id_producto;
    }
    public void setId_producto(double id_p) {
        this.id_producto = id_p;
    }

    /**
     * 
     */
    public String getnombre_prod() {
        return nombre_prod;
    }

    public void setNombre_prod(String nom) {
        this.nombre_prod = nom;
    }

    /**
     * 
     */

    public double getFecha() {
        return fecha;
    }
    public void setFecha(int fech) {
        this.fecha = fech;
    }

 // public static void main(String[] args) 
    // {
    //     String id_comentarios;
    //     //String fecha;
    //     Ingresar_pagina datos[] = new Ingresar_pagina[2];
    //     Scanner sc = new Scanner(System.in);

    //     System.out.println("ingrese su comentario "  + " : ");
    //     id_comentarios = sc.next();
    // }
    
}