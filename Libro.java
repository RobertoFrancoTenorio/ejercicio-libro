public class Libro
{
    private String titulo;
    private String autor;
    private int paginas;
    
    /**
     * Este metodo se encarga de registrar los libros
     * @param Recibe los datos de el libro como nombre, escritor y paginas
     */
    public Libro(String nombre, String escritor, int noPaginas)
    {
        titulo=nombre;
        autor=escritor;
        paginas=noPaginas;
    }
    
    /**
     * Metodo encargado de proporcionarnos la info. de el autor
     */
    public String dimeAutor()
    {
        String cadena=" ";
        
        cadena+=autor;
        return(cadena);
    }
    
    /**
     * Metodo encargado de mostrar el titulo de el libro
     */
    public String dimeTuTitulo()
    {
        String aux=" ";
        
        aux+=titulo;
        return(aux);
    }
    
    public int dimePaginas()
    {
        int aux=0;
        
        aux+=paginas;
        return(aux);
    }
    
    /**
     * Metodo que nos muestra la inforacion general de el libro
     */
    public String dimeDetalles()
    {
        String aux=" ";
        
        aux+="Titulo: ";
        aux+=titulo;
        aux+=", ";
        aux+="Autor: ";
        aux+=autor;
        aux+=", ";
        aux+="Paginas: ";
        aux+=paginas;
        
        return(aux);
    }
}