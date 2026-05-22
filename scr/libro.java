public class libro{
    //aatributo
    private String titulo;
    private String autor;
    private int  numeropaginas;
    private final String isbn;
    private static int contadorlibros=0;

    //constructor por defecto//
    public libro() {
     this.titulo = "desconocido";
     this.autor="desconocido";
     this.numeropaginas =0;
     this.isbn="000-0000000000";
     contadorlibros++;
    }
    
    //constructor parametriado//
    public libro(String titulo, String autor, int numeropaginas, String isbn ){
        this.titulo=titulo;
        this.autor=autor;
        this.numeropaginas=numeropaginas;
        
       this.isbn=isbn;//atributo final se inicializa aqui//
       contadorlibros++;
    }

     public String getTitulo() {
        return titulo;
    }

    public void setnumeropaginas(int paginas) {
        this.numeropaginas = paginas;
    }

    public int getnumeropaginas(){
        return this.numeropaginas;
    }

    public void mostrarInfo() {
        System.out.println("'" + titulo + "' por " + autor + " ( " + numeropaginas + " páginas). ISBN: " + isbn);
    }

    public static int getTotalLibros() {
        return contadorlibros;
    }
}



