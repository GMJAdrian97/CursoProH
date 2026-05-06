import POO.*;
import PelisSeries.Catalogo;
import PelisSeries.Contenido;
import PelisSeries.Serie;
import PracticaCineRecomendacion.GestorCine;
import PracticaCineRecomendacion.Pelicula;
import Streaming.Mensajes;
import Streaming.Usuario;
import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*public class Main {

    public static void main(String[] args) {
        VariablesyAtributos vya = new VariablesyAtributos(); //Intanciamos el objeto
        vya.sumar(1);
        vya.sumar(1);
        System.out.println(vya.resultado);

        //Intanciamos objeto de la clase Calculadora
        Calculadora cal =  new Calculadora();
        //Ciclos(for, while, do-while)... (foreach, map, stream)
        boolean continuar = false;
        int tabla, opcion = 0;
        double numero1, numero2;
        char operador;
        String operacion;

        do{ //ciclo do se ejecuta hasta que una bandera cambie de valor
            System.out.println("********** Menu mamalon de operaciones **********");
            System.out.println("1.- Suma");
            System.out.println("2.- Resta");
            System.out.println("3.- Multiplicacion");
            System.out.println("4.- Divicion");
            System.out.println("5.- Libre");
            System.out.println("6.- Escribe la opreacion");
            System.out.println("7.- Mostrar una tabla de multiplicacion");
            System.out.println("Ingresa la opcion deseada");
            //Guardamos la entrada de texto del teclado
            Scanner sc = new Scanner(System.in);
            opcion = sc.nextInt();

            //
            switch (opcion){
                case 1: // Operacion Suma
                    System.out.println("Dame el primer numero a sumar");
                    numero1 = sc.nextDouble();
                    System.out.println("Dame el segundo numero a sumar");
                    numero2 = sc.nextDouble();
                    cal.sumar(numero1, numero2);
                    System.out.println("El resultado de tu suma es: " + cal.getResultado());
                    break;
                case 2: // Operacion resta
                    System.out.println("Damel el primer numero a restar");
                    numero1 = sc.nextDouble();
                    System.out.println("Dame el segundo numero a restar");
                    numero2 = sc.nextDouble();
                    cal.restar(numero1,numero2);
                    System.out.println("El resultado de la resta es: " + cal.getResultado());
                    break;
                case 3: // Operacion Multiplicacion
                    System.out.println("Dame el primer nuemero a multiplicar");
                    numero1 = sc.nextDouble();
                    System.out.println("Dame el segundo numero a multiplicar");
                    numero2 = sc.nextDouble();
                    cal.multiplicar(numero1, numero2);
                    System.out.println("El resultado de la multiplicacion es: " + cal.getResultado());
                    break;
                case 4: // Operacion Divicion
                    System.out.println("Dame el dividendo");
                    numero1 = sc.nextDouble();
                    System.out.println("Dame el divisor");
                    numero2 = sc.nextDouble();
                    cal.dividir(numero1, numero2);
                    System.out.println("El resultado de la multiplicacion es: " + cal.getResultado());
                    break;
                case 5: // Operacion Libre
                    System.out.println("Dame el signo de la operacion que deseas hacer");
                    operador = sc.next().charAt(0);
                    System.out.println("Dame el primer numero a operar");
                    numero1 = sc.nextDouble();
                    System.out.println("Dame el segundo numero a operar");
                    numero2 = sc.nextDouble();
                    cal.operar(operador,numero1,numero2);
                    System.out.println("El resultado de la operacion es: " + cal.getResultado());
                    break;
                case 6: // Operacion Mas libre Libre
                    System.out.println("teclea toda la operacion que deseas hacer");
                    operacion = sc.next();
                    cal.operarLibre(operacion);
                    System.out.println("El resultado de la operacion es: " + cal.getResultado());
                    break;
                case 7: // Operacion Mas libre Libre
                    System.out.println("Dame la tabla que quieres ver");
                    tabla = sc.nextInt();
                    cal.listarTblMultiplicar(tabla);
                    System.out.println("Tu tabla es " + cal.getResultado());
                    break;
                default:
                    System.out.println("Adiosito para el gears");
            }
            System.out.println("Quires hacer otra operacion? ... Teclea 1 para volver a legir, preciona cualquier tecla para salir");
            int regresar = sc.nextInt();
            continuar = regresar == 1;
        } while(continuar);
        System.out.println("Adiosito para el gears");

    }

}*/

/*public class Main {

    public static void main(String[] args) {
        String nombre, especie;
        int confirmacionRegistro, edad, OpcionMenu;
        boolean BanderaMenu = true;

        Animal animalperro = new Perro("Spayk","Perro", 2);
        animalperro.hacerSonido();

        Animal animalGato = new Gato("Ceniza", "Gato",2);
        animalGato.hacerSonido();

        ListaAnimales lstAnimales = new ListaAnimales();

       do{
           System.out.println("********** Bienvenido Al Refugio De Patitas **********");
           System.out.println("********** Porfavor Elige Una Opcion **********");
           System.out.println("********** 1.- Registrar un Animal **********");
           System.out.println("********** 2.- Ver la lista de los aniamles **********");
           System.out.println("********** 3.- Hacer que todos hablen **********");
           System.out.println("********** 4.- Salir **********");
           Scanner st = new Scanner(System.in);
           OpcionMenu = st.nextInt();
           if(OpcionMenu == 4){
               BanderaMenu = false;
               System.out.println("********** Gracias por su visita, vuelva pronto **********");
               System.exit(0);
           }else {
               switch (OpcionMenu) {
                   case 1:
                       System.out.println("********** Registro de animal **********");
                       System.out.println("Escribe la especie de la cuel será tu animal?");
                       System.out.println("Perro");
                       System.out.println("Gato");
                       System.out.println("Mapache");
                       System.out.println("Pajaro");
                       Scanner scAnimal = new Scanner(System.in);
                       especie = scAnimal.next();

                       switch (especie) {
                           case "Perro":
                               System.out.println("Como se llama tu "+especie+"?");
                               nombre = scAnimal.next();
                               System.out.println("Correcto, y que edad tiene "+nombre+"?");
                               edad = scAnimal.nextInt();
                               System.out.println("Perfecto entonces quires registrar a "+nombre+", el cuel es un "+especie+" y tiene la edad de "+ edad+" años?");
                               System.out.println("1.- Si");
                               System.out.println("2.- No");
                               confirmacionRegistro = scAnimal.nextInt();
                               if(confirmacionRegistro == 1){
                                   Animal nuevoAnimal = new Perro(nombre, especie, edad);
                                   lstAnimales.RegistrarAnimal(nuevoAnimal);
                                   System.out.println("Se dio de alta un nuevo "+especie);
                               }
                               break;
                           case "Gato":
                               System.out.println("Como se llama tu "+especie+"?");
                               nombre = scAnimal.next();
                               System.out.println("Correcto, y que edad tiene "+nombre+"?");
                               edad = scAnimal.nextInt();
                               System.out.println("Perfecto entonces quires registrar a "+nombre+", el cuel es un "+especie+" y tiene la edad de "+ edad+" años?");
                               System.out.println("1.- Si");
                               System.out.println("2.- No");
                               confirmacionRegistro = scAnimal.nextInt();
                               if(confirmacionRegistro == 1){
                                   Animal nuevoAnimal = new Gato(nombre, especie, edad);
                                   lstAnimales.RegistrarAnimal(nuevoAnimal);
                                   System.out.println("Se dio de alta un nuevo "+especie);
                               }
                               break;
                           case "Mapache":
                               System.out.println("Como se llama tu "+especie+"?");
                               nombre = scAnimal.next();
                               System.out.println("Correcto, y que edad tiene "+nombre+"?");
                               edad = scAnimal.nextInt();
                               System.out.println("Perfecto entonces quires registrar a "+nombre+", el cuel es un "+especie+" y tiene la edad de "+ edad+" años?");
                               System.out.println("1.- Si");
                               System.out.println("2.- No");
                               confirmacionRegistro = scAnimal.nextInt();
                               if(confirmacionRegistro == 1){
                                   Animal nuevoAnimal = new Mapache(nombre, especie, edad);
                                   lstAnimales.RegistrarAnimal(nuevoAnimal);
                                   System.out.println("Se dio de alta un nuevo "+especie);
                               }
                               break;
                           case "Pajaro":
                               System.out.println("Como se llama tu "+especie+"?");
                               nombre = scAnimal.next();
                               System.out.println("Correcto, y que edad tiene "+nombre+"?");
                               edad = scAnimal.nextInt();
                               System.out.println("Perfecto entonces quires registrar a "+nombre+", el cuel es un "+especie+" y tiene la edad de "+ edad+" años?");
                               System.out.println("1.- Si");
                               System.out.println("2.- No");
                               confirmacionRegistro = scAnimal.nextInt();
                               if(confirmacionRegistro == 1){
                                   Animal nuevoAnimal = new Pajaro(nombre, especie, edad);
                                   lstAnimales.RegistrarAnimal(nuevoAnimal);
                                   System.out.println("Se dio de alta un nuevo "+especie);
                               }
                               break;
                           default:
                               System.out.println("No tecleaste una especie valida");

                       }

                       break;
                   case 2:
                        lstAnimales.MostrarAnimales();
                       break;
                   case 3:

                       break;
                   case 4:
                       System.out.println("Caso 4");
                       break;
                   default:
                       System.out.println("Elige una opcion valida 1 - 4");
               }
           }
           System.out.println("Quires reegrsar al menú ?");
           System.out.println("1.- Si");
           System.out.println("2.- No");
           int regresar = st.nextInt();
           BanderaMenu = regresar == 1;
       }while(BanderaMenu);
        System.out.println("********** Gracias por su visita, vuelva pronto **********");*/

/*---------- Pelis y Series  ----------*/
/*
public class Main {

    public static void main(String[] args) {

        boolean BanderaMenu = true;

        Catalogo catalogo = new Catalogo();
        catalogo.agregarContenido(new Pelicula("Tom",2000,120,"CN"));
        catalogo.agregarContenido(new Serie("LALA",2000,120,2, 2));
        do {
            System.out.println("********** Peliculas y series **********");
            System.out.println(" --- Porfavor Elige Una Opcion ---");
            System.out.println(" 1.- Añadir Pelicula/Serie ");
            System.out.println(" 2.- Buscar Contenido ");
            System.out.println(" 3.- Listar Catalogo ");
            System.out.println(" 4.- Salir ");
            Scanner seleccionMenu = new Scanner(System.in);
            int OpcionMenu = seleccionMenu.nextInt();
            switch (OpcionMenu) {
                case 1:
                    System.out.println("Anadir pelicula \n");
                    System.out.println("Que tipo de contenido agregaras? \n 1.- Pelicula \n 2.- Serie \n");
                    int Op = seleccionMenu.nextInt();
                    String titulo, director;
                    int year, duracionEnMinutos;
                    seleccionMenu.nextLine();
                    System.out.println("Escribe el titulo de tu "+((Op == 1) ? "Peli" : "Serie"+"."));
                    titulo = seleccionMenu.nextLine();
                    System.out.println("Dame el año de la "+((Op == 1) ? "Peli" : "Serie"+"."));
                    year = seleccionMenu.nextInt();
                    System.out.println("Dame la duracion de la "+((Op == 1) ? "Peli" : "Serie"+" en minutos"));
                    duracionEnMinutos = seleccionMenu.nextInt();
                    if (Op == 1) {
                        System.out.println("Dame el nombre del director de tu peli");
                        director = seleccionMenu.next();
                        Contenido peli = new Pelicula(titulo, year, duracionEnMinutos, director);
                        catalogo.agregarContenido(peli);
                    } else {
                        int episodios, temporadas;
                        System.out.println("Dame los episodios");
                        episodios = seleccionMenu.nextInt();
                        System.out.println("Dame las temporadas");
                        temporadas = seleccionMenu.nextInt();
                        Contenido serie = new Serie(titulo, year, duracionEnMinutos, episodios, temporadas);
                        catalogo.agregarContenido(serie);
                    }
                    break;
                case 2:
                    seleccionMenu.nextLine();
                    System.out.println("Buscar pelicula \n ");
                    System.out.println("Escribe el titulo que deseas buscar");
                    titulo = seleccionMenu.nextLine();
                    catalogo.buscarPorTitulo(titulo);
                    break;
                case 3:
                    System.out.println("Listar Catalogo \n");
                    catalogo.mostrarTodo();
                    break;
                case 4:
                    BanderaMenu = false;
                    break;
                default:
                    System.out.println("********** Elige una opcion valida **********");
            }
        } while (BanderaMenu);
        System.out.println("********** Gracias por su visita, vuelva pronto **********");

        */
/*System.out.println("Holis");*//*


    }

}*/

/*-------------------- Cine Recomendador  --------------------*/

/*
public class Main {

    public static void main(String[] args) {

*/
/*Variables*//*


        Scanner scnGestorCine = new Scanner(System.in);
        GestorCine gsCine = new GestorCine();
        boolean continuarMenu = true;
        int opcionMenu, calificacionPeli;
        String tituloPeli, genero;

        do{
            System.out.println("\n Hola, Yo soy el Cine recomendador, te puedo ayudar a crear una lista de tus peliculas favoritas para que despues las puedas buscar, calificar y ver tu Ranking de peliculas mejores califficadas por ti. \n" +
                    "Bien, comencemos. \n" +
                    "Elige alguna de las siguientes opciones. \n" +
                    "1.- Agregar una Pelicula \n" +
                    "2.- Ver Peliculas \n" +
                    "3.- Calificar pelicula \n" +
                    "4.- Ver tu Ranking \n" +
                    "5.- Clasificar peliculas por Genero \n" +
                    "6.- Salir");

            opcionMenu = scnGestorCine.nextInt();
            switch (opcionMenu){
                case 1:
                    scnGestorCine.nextLine(); // se limpia la variable scaner
                    String titulo, clasificacionGenero;
                    int duracion, calificacion;
                    System.out.println("******************* Añadir Pelicula ******************* \n" +
                            "NOTA: al ingresar la pelicula nueva, esta tomará la calificacion de 0 en automatico \n" +
                            "Dame el nombre de tu Pelicula");
                    titulo = scnGestorCine.nextLine();
                    System.out.println("Ahora dame el genero de tu Pelicula");

                    genero = scnGestorCine.nextLine();
                    System.out.println("Por ultimo dame la duracion de tu pelicula (en minutos)");

                    duracion = scnGestorCine.nextInt();
                    System.out.println("\n La pelicula que agregaste es: " + titulo + "\n Pertenece al genero de: " + genero + "\n Con una duracion de: " + duracion);

                    calificacion = 0;

                    Pelicula peli = new Pelicula(titulo, genero, duracion, calificacion);
                    gsCine.agregarPeli(peli);

                    break;
                case 2:
                    gsCine.mostrarPelis();
                    break;
                case 3:
                    scnGestorCine.nextLine(); // se limpia la variable scaner
                    System.out.println("Hay que calificar alguna de tus peliculas!!! \n" +
                            "estas son las pelis que tienes: \n");
                    gsCine.mostrarPelis();
                    System.out.println("escribe el nombre de la peli de la que quieres calificar");
                    tituloPeli = scnGestorCine.nextLine();

                    System.out.println("Ahora dale una calificacion de las siguiente lista: 1, 2, 3, 4, 5 Donde 5 es la mayor calificacion y 1 es la menor");
                    calificacion = scnGestorCine.nextInt();
                    if (calificacion <= 0 || calificacion > 5){
                        System.out.println("Error, no se pude calificar la pelicula porque no escribiste un numero dentro de los limites dados (del 1 al 5)");
                    }else{
                        gsCine.calificarPeli(tituloPeli, calificacion);
                    }
                    break;
                case 4:
                    System.out.println("Las peliculas que mejor valoraste con 4 y 5 son las siguientes");
                    gsCine.clasificacionMejoresValoradas();
                    break;
                case 5:
                    scnGestorCine.nextLine(); // se limpia la variable scaner
                    System.out.println("Vamos a clasificar tu lista de peliculas, lo haremos por genero, teclea el nombre del genero que quieres buscar");
                    clasificacionGenero = scnGestorCine.nextLine();
                    gsCine.clasificarPorGnero(clasificacionGenero);
                    break;
                case 6:
                    System.out.println("Espero te haya sido de utilidad, adios...");
                    continuarMenu = false;
            }
        }while(continuarMenu);
    }
}
*/


    /*-------------------- Striming  --------------------*/


public class Main {

    public static void main(String[] args) {

/*Variables*/

        int opcionMenu;
        boolean continuarMenu = true;
        Scanner scnSteam = new Scanner(System.in);
        Usuario usuarios = new Usuario();
        Mensajes mensajes = new Mensajes();
        List<Usuario> ltsUsuarosTotales = usuarios.getLtsusuarios();

        if(usuarios.cargarUsuarios() == true){
            mensajes.imprimirMjsCargaDeUsuarios();
        }

        mensajes.msjBienvenida();
        do{
            mensajes.msjMenu();
            opcionMenu = scnSteam.nextInt();
            switch (opcionMenu){
                case 1:
                    int item = 1;
                    for(Usuario itemUsuario : ltsUsuarosTotales){
                        System.out.println("-------------------------------------- \n" +
                                "Subcricpcion N°" + item + "\n" +
                                "Usuario: " + itemUsuario.getNombre() + "\n" +
                                "Email: " + itemUsuario.getMail() + "\n" +
                                "Plan: " + itemUsuario.getSuscripcion().getPalan().getTipoPlan() + "\n" +
                                "Fecha de Inicio: " + itemUsuario.getSuscripcion().getFechaInicio() + "\n" +
                                "Precio: " + itemUsuario.getSuscripcion().getPalan().getPrecio());
                        item++;
                    }
                    break;
                case 2:
                    if(usuarios.obteberUsuariosPremium() != null && !usuarios.obteberUsuariosPremium().isEmpty()){
                        List<String> ltsUsuariosPremium = usuarios.obteberUsuariosPremium();
                        mensajes.imprimirUsuariosPremiun();
                        int itemUsPre = 1;
                        for(String itemUsuarioPremiun : ltsUsuariosPremium){
                            System.out.println("---------------------------------");
                            System.out.println("Usuario Premium N°"+itemUsPre);
                            System.out.println(itemUsuarioPremiun.toString() + "\n");
                            itemUsPre++;
                        }

                    }
                    break;
                case 3:
                    mensajes.imprimirGananciaUsActivos();
                    System.out.println(usuarios.obtenerCostoTotalUsuariosActivos());
                    break;
                case 4:
                    mensajes.imprimirUsusariosGold();
                    int iteUsVIP = 1;
                    List<String> suariosVip = usuarios.ObtebnerusuariosVIP();
                    for (String itemUsVIP : suariosVip){
                        System.out.println("---------------------------------");
                        System.out.println("Usuario VIP N°"+iteUsVIP);
                        System.out.println(itemUsVIP.toString());
                        iteUsVIP++;
                    }
                    break;
                case 5:
                    List<String> usuariosGmail = usuarios.obtenerDominiosGmail();
                    int iteUsGmail = 1;
                    for(String usDominioGamil : usuariosGmail){
                        System.out.println("---------------------------------");
                        System.out.println("Usuario con dominio Gmial N°"+iteUsGmail);
                        System.out.println(usDominioGamil.toString());
                        iteUsGmail++;
                    }
                    break;
                case 6:
                    continuarMenu = false;
                    mensajes.msjDespedida();
                    break;
            }
        }while(continuarMenu);

    }
}
