public class TiendaOnline {
    public static void main(String[] args) {
        // VARIABLES DE LA TIENDA
        // Mensajes de la aplicación
        String mensajeBienvenida = "Bienvenido a nuestra tienda en línea, ";
        String mensajeConfirmacion = ", tu pedido ha sido confirmado";
        String mensajeRechazo = ", lamentablemente el artículo seleccionado está agotado";
        String mensajeMostrarTotal = "El total de tu compra es: $";
       
        // Variables de productos (agrega las tuyas a continuación)
        double precioLibro = 15.99;
        double precioCamiseta = 25.50;
        double precioPantalones = 30.99;
        double precioZapatos = 49.50;
        double error = precioZapatos + precioLibro + precioPantalones + precioCamiseta;
        // Variables de clientes (agrega las tuyas a continuación)
        String cliente1 = "Ana";
        String cliente2 = "Alex";
        String cliente3= "Miguel";
   
        // Estado de pedidos (agrega las tuyas a continuación)
        boolean pedidoConfirmadoCliente1 = true;
        boolean pedidoConfirmadoCliente2 = true;
        boolean pedidoConfirmadoCliente3 = true;
        boolean devolucionCliente3 = true;
   
        // INTERACCIÓN DE LA APLICACIÓN
        System.out.println(mensajeBienvenida + cliente1); // Muestra "Bienvenido a nuestra tienda en línea, Ana"
        // ** Aquí irán las declaraciones de impresión relacionadas con la interacción del cliente ** //
        
        //Ana ha pedido un pantalón. Imprime el mensaje del estado de su pedido haciendo uso de una sentencia if.
        if (pedidoConfirmadoCliente1){
        System.out.println(cliente1 + " " + "ha pedido un pantalon" + mensajeConfirmacion);
        } else {
            System.out.println(mensajeRechazo);
        }

        //Miguel ha pedido unos zapatos y un libro. Imprime el mensaje del estado de su pedido haciendo uso de una sentencia if.
        if (pedidoConfirmadoCliente3){
            System.out.println(cliente3 + " " + "ha pedido zapatos y un libro" + mensajeConfirmacion);
        } else {
            System.out.println(mensajeRechazo);
        }

        //Alex ha comprado 2 pares de zapatos, una camiseta y unos pantalones. Imprime el total de su orden e imprime el mensaje del estado de su pedido haciendo uso de una sentencia if.

            if (pedidoConfirmadoCliente2){
            double suma =  precioZapatos + precioZapatos + precioCamiseta + precioPantalones;
            System.out.println(cliente2 + mensajeConfirmacion + " " + mensajeMostrarTotal  + suma);
        } else {
            System.out.println(mensajeRechazo);
        }
        // Miguel se ha dado cuenta que le cobraron unos pantalones y una camiseta. Imprime un mensaje con su nuevo total calculando la diferencia entre el pedido con error con su pedido actual.
        
        if (devolucionCliente3) {
            double cobroErroneo = precioPantalones + precioCamiseta;
            double resultado = error - cobroErroneo;
            System.out.println(cliente3 + " " + mensajeMostrarTotal + "" + resultado);
        } else {
            System.out.println(cliente3 + " " + mensajeMostrarTotal + error);
        }

    }
}
