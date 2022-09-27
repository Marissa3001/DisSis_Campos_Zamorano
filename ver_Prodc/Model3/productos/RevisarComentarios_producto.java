package productos;

public class RevisarComentarios_producto {

    private String id_comentarios;
    private int id_usuario;
    private double fecha;

    public RevisarComentarios_producto(String id_comentarios, int id_usuario, double fecha) {
        this.id_comentarios = id_comentarios;
        this.id_usuario = id_usuario;
        this.fecha = fecha;
    }



    public String getId_comentarios() {
        return id_comentarios;
    }

    /**
     * 
     */
    public void setId_comentarios(String id_c) {
        this.id_comentarios = id_c;
    }

    /**
     * 
     */
    public double getId_usuario() {
        return id_usuario;
    }

    /**
     * 
     */
    public void setId_usuario(int id_u) {
        this.id_usuario = id_u;
    }

    public double getFecha() {
        return fecha;
    }

    /**
     * 
     */
    public void setFechao(int fech) {
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