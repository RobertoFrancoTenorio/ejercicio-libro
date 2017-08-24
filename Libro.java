public class Libro
{
    private String titulo;
    private String autor;
    private int paginas;
    
    public Libro(String nombre, String escritor, int noPaginas)
    {
        titulo=nombre;
        autor=escritor;
        paginas=noPaginas;
    }
    
    public String dimeAutor()
    {
        String cadena=" ";
        
        cadena+=autor;
        return(cadena);
    }
    
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