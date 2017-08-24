public class Libro
{
    private String titulo;
    private String autor;
    
    public Libro(String nombre, String escritor)
    {
        titulo=nombre;
        autor=escritor;
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
}