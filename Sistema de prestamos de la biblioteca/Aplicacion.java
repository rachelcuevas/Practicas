import Clases.Prestamo;
import Clases.Libros;


public class Aplicacion {

    public static void main(String[] args) {

        //Crea 2 préstamos con usuarios no especificados.
        Prestamo prestamo1 = new Prestamo ("Invitado", true);
        Prestamo prestamo2 = new Prestamo("Invitado", false);

        //Crea 3 préstamos personalizados con nombres diferentes.
        Prestamo prestamo3 = new Prestamo("Simon", true);
        Prestamo prestamo4 = new Prestamo("Alexander", true);
        Prestamo prestamo5 = new Prestamo("Javier", false);

        //crea libros

        Libros libro1 = new Libros("El amor en los tiempos de colera", "Gabriel Garcia Marquez", 10.99);
        Libros libro2 = new Libros("Cien años de soledad", "Gabriel Garcia Marquez", 13.99);
        Libros libro3 = new Libros("Orgullo y prejuicio", "Jane Austen", 19.99);
        Libros libro4 = new Libros("Buscando a Alaska", "John Green", 11.90);
        Libros libro5 = new Libros("Los juegos del hambre", "Susan Collin", 14.99);
        Libros libro6 = new Libros("Bajo la misma estrella", "John Green", 15.99);
        Libros libro7 = new Libros("El retrato de Dorian Gray", "Oscar Wilde", 17.99);
        Libros libro8 = new Libros("Harry Potter y la piedra filosofal", "J. K. Rowling", 20.99);
        Libros libro9 = new Libros("Harry Potter y la camara secreta", "J. K. Rowling", 25.99);
        Libros libro10 = new Libros("Harry Potter y el prisioneron de Azkaban", "J. K. Rowling", 30.99);

        //Crea y añade al menos 2 libros a cada préstamo.
        prestamo1.agregarLibro(libro1);
        prestamo1.agregarLibro(libro2);
        prestamo2.agregarLibro(libro3);
        prestamo2.agregarLibro(libro4);
        prestamo3.agregarLibro(libro5);
        prestamo3.agregarLibro(libro6);
        prestamo4.agregarLibro(libro7);
        prestamo4.agregarLibro(libro8);
        prestamo5.agregarLibro(libro9);
        prestamo5.agregarLibro(libro10);



                    //Muestra los detalles de cada préstamo usando el método 

                    prestamo1.detallesPrestamo();
                    prestamo2.detallesPrestamo();
                    prestamo3.detallesPrestamo();
                    prestamo4.detallesPrestamo();
                    prestamo5.detallesPrestamo();

                    //Mostrar estatus

                    prestamo1.mostrarEstatus();
                    prestamo2.mostrarEstatus();
                    prestamo3.mostrarEstatus();
                    prestamo4.mostrarEstatus();
                    prestamo5.mostrarEstatus();




    }    
}