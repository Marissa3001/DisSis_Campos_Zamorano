package productos;

public class imagen_prod {

    private String id_prod;
    private String titulo;
    private String foto;

    public imagen_prod(String id_prod,String titulo,String foto) {
        this.id_prod = id_prod;
        this.titulo = titulo;
        this.foto = foto;
    }

    public String geId_prod() {
        return id_prod;
    }
    public void setId_prod(String id_p) {
        this.id_prod = id_p;
    }


    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String tit) {
        this.titulo = tit;
    }


    public String geFoto() {
        return foto;
    }
    public void setFoto(String fot) {
        this.foto = fot;
    }

    
    // public static void main(String[] args) 
    // {
    //     String id_prod;
    //     String titulo;
    //     String fot;
    //     imagen_prod datos[] = new imagen_prod[2];
    //     Scanner sc = new Scanner(System.in);

    //     System.out.println("ingrese su URL "  + " : ");
    //     id_prod = sc.next();
    // }
}
