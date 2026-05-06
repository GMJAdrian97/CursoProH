package Streaming;

public class Mensajes {
    // Contantes de color de texo
    public static final String RESET = "\u001B[0m";
    public static final String ROJO = "\u001B[31m";
    public static final String VERDE = "\u001B[32m";
    public static final String AMARILLO = "\u001B[33m";
    public static final String AZUL = "\u001B[34m";
    public static final String CIAN = "\u001B[36m";

    public void msjBienvenida() {
        System.out.println(AZUL + "Bienvenido al gestor de suscripciones de Strming \n " + RESET);
    }

    public void msjMenu() {
        System.out.println(AZUL + "Elige alguna de las siguientes Opciones \n \n" +
                "1.- Ver base de usuarios \n" +
                "2.- Obetener los usuarios con plan Premiun (Nombre y Correos) \n" +
                "3.- Calcular el la ganancia mensual de los usuaroios activos \n" +
                "4.- Ver usuarios VIP (Gold) \n" +
                "5.- Reporte de usuarios por domio que pagan mas de 9.99 \n" +
                "6.- salir" + RESET);
    }

    public void msjDespedida() {
        System.out.println(AMARILLO + "Adiosito" + RESET);
    }


    public void imprimirMjsCargaDeUsuarios() {
        System.out.println(VERDE + "Base de usuarios cargada con exito" + RESET);
    }

    public void imprimirUsuariosPremiun() {
        System.out.println(VERDE + "Los usuarios con cuenta Premium son:");
    }

    public void imprimirGananciaUsActivos() {
        System.out.println(AMARILLO + "La ganacia total de los usuarios es de: ");
    }

    public void imprimirUsusariosGold() {
        System.out.println(CIAN + "Los Uusariod VIP son: \n");
    }



    public void resetearCOLOR() {
        System.out.println(RESET);
    }

}
