package productos;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

/**
 * 
 */
public class glo {//extends Buscar_productos {
    private String URL;
    private double id_producto;
    private String nombre_prod;
    private String precio;
    private double calificacion;

    public glo(String URL, double id_producto, String nombre_prod ,String precio, double calificacion) {
        this.URL = URL;
        this.id_producto = id_producto;
        this.nombre_prod = nombre_prod;
        this.precio = precio;
        this.calificacion = calificacion;
    }

    public String get_URL() {
        return URL;
    }
    public void setURL(String URL) {
        this.URL = URL;
    }

    
    public double getId_producto() 
    {
        return id_producto;
    }
    public void setId_producto(double id_p) {
        this.id_producto = id_p;
    }

    public String getnombre_prod() {
        return nombre_prod;
    }

    public void setNombre_prod(String nom) {
        this.nombre_prod = nom;
    }

    public String getPrecio() {
        return precio;
    }
    public void sePrecio(String pre) {
        this.precio = pre;
    }

    public double getCalificacionL() {
        return calificacion;
    }

    public void setCalificacion(double califi) {
        this.calificacion = califi;
    }

    public static void main(String[] args) 
    {
        String URL;
        String nombre_prod;
        int id_producto;
        int precio = 500;
        double calificacion;

        glo datos[] = new glo[2];
        Scanner sc = new Scanner(System.in);

        System.out.println("ingrese su URL "  + " : ");
        URL = sc.next();
        System.out.println("ingrese nombre del producto "  + " : ");
        nombre_prod = sc.next();
        System.out.println("ingrese su id_producto "  + " : ");
        id_producto = sc.nextInt();
        System.out.println("Producto buscado es: "  + nombre_prod);
        System.out.println("El precio del producto es: "  + precio);
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yy/MM/dd HH:mm:ss");
        System.out.println("La fecha de consulta es: "+dtf2.format(LocalDateTime.now()));
        
        int num = 0;
        System.out.println("Ingresar calificacion ");
        System.out.println("1) Si ");
        System.out.println("2) No ");
        System.out.println("3) Salir ");
        num = sc.nextInt();
        
        String dayString;
          // switch con tipo de datos int
        switch (num){
            case 1:  
                System.out.println("Ingrese Calificacion de 1 al 5: ");
                calificacion = sc.nextDouble();
                     break;
            case 2:  
            
                     break;
            case 3:  
                System.out.println("Finalizando...");
                System.exit(0);
                     break;

        }
    }


    
}