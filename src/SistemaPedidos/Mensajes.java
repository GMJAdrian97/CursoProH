package SistemaPedidos;

public class Mensajes {
    // Contantes de color de texo
    public static final String RESET = "\u001B[0m";
    public static final String ROJO = "\u001B[31m";
    public static final String VERDE = "\u001B[32m";
    public static final String AMARILLO = "\u001B[33m";
    public static final String AZUL = "\u001B[34m";
    public static final String CIAN = "\u001B[36m";

    public void msjBienvenida() {
        System.out.println(RESET + "\n Bienvenido al gestor de Pedidos \n " + RESET);
    }

    public void msDataDaseCargada(){
        System.out.println(AMARILLO + "\n La Base de datos ha sido cargada con exito \n " + RESET);
    }

    public void msjMenuPincipal() {
        System.out.println(RESET + "\n Elige alguna de las siguientes Opciones \n \n" +
                "1.- Seccion de productos \n" +
                "2.- Seccion de pedidos \n" +
                "3.- salir" + RESET);
    }

    public void msjMenuProductos() {
        System.out.println(AZUL + " \n Elige alguna de las siguientes Opciones \n \n" +
                "1.- Ver productos \n" +
                "2.- Dar de alta productos \n" +
                "3.- Regresar a menu principal" + RESET);
    }

    public void msjMenuPedidos() {
        System.out.println(VERDE + " \n Elige alguna de las siguientes Opciones \n \n" +
                "1.- Ver pedidos \n" +
                "2.- Dar de alta pedios \n" +
                "3.- Agregar Productos a los pedidos" +
                "3.- Pagar / cancelar pedidos" +
                "3.- Regresar a menu principal" + RESET);
    }

    public  void msjDespedida(){
        System.out.println(RESET + "\n Adiosito pal Gears \n " + AMARILLO);
    }

}
