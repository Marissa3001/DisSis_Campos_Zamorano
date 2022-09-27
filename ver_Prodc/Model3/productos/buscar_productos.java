package productos;
//import java.util.*;

public class buscar_productos {

    private String id_prod;
    private String precio;
    private String nombre;

    /**
     * Default constructor
     */
    public buscar_productos(String id_prod,String precio,String nombre) {
        this.id_prod = id_prod;
        this.precio = precio;
        this.nombre = nombre;
    }


    public String geId_prod() {
        return id_prod;
    }
    public void setId_prod(String id_p) {
        this.id_prod = id_p;
    }


    public String getPrecio() {
        return precio;
    }
    public void sePrecio(String pre) {
        this.precio = pre;
    }

    public String geNombre() {
        return nombre;
    }
    public void setNombre(String nom) {
        this.nombre = nom;
    }




    // public static void main(String[] args) 
    // {
    //     String id_prod;
    //     String precio;
    //     String nombre;
    //     buscar_productos datos[] = new buscar_productos[2];
    //     Scanner sc = new Scanner(System.in);

    //     System.out.println("El administrador colocara los isguientes datos: ");
    //     System.out.println("ingrese su id_prod "  + " : ");
    //     id_prod = sc.next();
    //     System.out.println("ingrese su precio "  + " : ");
    //     precio = sc.next();
    //     System.out.println("ingrese su nombre producto "  + " : ");
    //     nombre = sc.next();
    // }
}
