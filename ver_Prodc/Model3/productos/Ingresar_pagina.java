package productos;

//import java.util.*;

/**
 * 
 */
public class Ingresar_pagina {//extends Buscar_productos {
    private String URL;
    /**
     * Default constructor
     */
    public Ingresar_pagina(String URL) {
        this.URL = URL;
    }

    /**
     * 
     */
    //public String ingresa_URL;

    /**
     * 
     */
    public String get_URL() {
        return URL;
    }

    /**
     * 
     */
    public void setURL(String URL) {
        this.URL = URL;
    }
    // public static void main(String[] args) 
    // {
    //     String URL;
    //     Ingresar_pagina datos[] = new Ingresar_pagina[2];
    //     Scanner sc = new Scanner(System.in);

    //     System.out.println("ingrese su URL "  + " : ");
    //     URL = sc.next();
    // }
}