package productos;

public class calificacion_prod {

    private String id_prod;
    private double calificacion;

    /**
     * Default constructor
     */
    public calificacion_prod(String id_prod, double calificacion) {
        this.id_prod = id_prod;
        this.calificacion = calificacion;
    }


    public String geId_prod() {
        return id_prod;
    }
    public void setId_prod(String id_p) {
        this.id_prod = id_p;
    }

    public double getCalificacionL() {
        return calificacion;
    }

    public void setCalificacion(double califi) {
        this.calificacion = califi;
    }


    // public static void main(String[] args) 
    // {
    //     String calificacion;
    //     calificacion_prod datos[] = new calificacion_prod[2];
    //     Scanner sc = new Scanner(System.in);

    //     System.out.println("ingrese calificaion del producto "  + " : ");
    //     calificacion = sc.next();
    // }

}
