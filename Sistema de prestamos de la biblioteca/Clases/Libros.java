package Clases;

public class Libros {

    //ATRIBUTOS DE LA CLASE//
    public static String tipo = "Libro";

    //ATRIBUTOS//
    private String titulo;
    private String autor;
    private Double precioDeReemplazo;

    public Libros(String titulo, String autor, Double precioDeReemplazo){
        this.titulo = titulo;
        this.autor = autor;
        this.precioDeReemplazo = precioDeReemplazo;
    }

    @Override  
    public String toString() {  
        return "Título: " + titulo + ", Autor: " + autor;  
    }  


    //getter y setter para titulo//
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    //getter y setter para autor//
    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    //getter y setter para precio//
    public double getPrecioDeReemplazo(){
        return precioDeReemplazo;
    }
    public void setPrecioDeReemplazo(Double precioDeReemplazo){
        this.precioDeReemplazo = precioDeReemplazo;
    }

    
    
}