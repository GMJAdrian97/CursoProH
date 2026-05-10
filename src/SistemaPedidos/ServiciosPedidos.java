package SistemaPedidos;

import javax.swing.text.StyledEditorKit;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServiciosPedidos {
    Mensajes coloresMnesjaes = new Mensajes();

    // Atrubutos de clase
    public List<Producto> dataBaseProductos = new ArrayList<>();

    //Cargar DataBase de productos
    public List<Producto> cargaDeProductos (){
        dataBaseProductos.add(new Producto(1,"Gears Of War", "Xbox", 499.99));
        dataBaseProductos.add(new Producto(2,"Gears Of War 2", "Xbox", 699.99));
        dataBaseProductos.add(new Producto(3,"Gears Of War 3", "Xbox", 799.99));
        dataBaseProductos.add(new Producto(4,"The Last Of Us", "Play Station", 999.99));
        dataBaseProductos.add(new Producto(5,"The Last Of Us Part II", "Play Station", 699.99));
        dataBaseProductos.add(new Producto(6,"God Of War", "Play Station", 1099.99));
        dataBaseProductos.add(new Producto(7,"Zelda", "Nintendo", 1099.99));
        dataBaseProductos.add(new Producto(8,"Super Mario Bros", "Nintendo", 1199.99));
        dataBaseProductos.add(new Producto(9,"Samus", "Nintendo", 999.99));
        dataBaseProductos.add(new Producto(10,"Minecraft", "PC", 499.99));

        return dataBaseProductos;
    }

    public void MostrarMenuProductos (){
        //Variables de metodo
        Producto producto = new Producto();
        Boolean banderaMenuProducto = true;
        Mensajes msj = new Mensajes();
        Scanner scMenuProducto = new Scanner(System.in);

        do {
            msj.msjMenuProductos();
            int opMenu = scMenuProducto.nextInt();
            switch (opMenu){
                case 1:
                    producto.MostrarProductos(dataBaseProductos);
                    break;
                case 2:
                    int idProducto;
                    String nombreProducto, categoriaProducto;
                    Double precioProducto;
                    scMenuProducto.nextLine(); //limpiamos buffer
                    System.out.println(coloresMnesjaes.VERDE + "Dame el nombre de tu producto");
                    nombreProducto = scMenuProducto.nextLine();
                    System.out.println(coloresMnesjaes.VERDE + "Dame la categoria de tu producto");
                    categoriaProducto = scMenuProducto.nextLine();
                    System.out.println(coloresMnesjaes.VERDE + "Dame el precio de tu producto");
                    precioProducto = scMenuProducto.nextDouble();
                    //hacemos referencia a el ultimo objeto de la lista de prodeuctos y no traemos su id para despues sumarle 1 siempre que se gener uno nuevo
                    // de esta forma hacemos un autoincrementable el id
                    idProducto = (dataBaseProductos.get(dataBaseProductos.size()-1).idProducto) + 1;
                    Producto newProducto = new Producto(idProducto, nombreProducto, categoriaProducto, precioProducto);
                    producto.AgregarProducto(dataBaseProductos, newProducto);
                    break;
                case 3:
                    banderaMenuProducto = false;
                    System.out.println("Regresando al menú principal...");
                    scMenuProducto.nextLine(); // <-- Limpia el buffer
                    break;
            }
        }while (banderaMenuProducto == true);
    }

    public void MostrarMenuPedidos (){
        //Variables de metodo
        List<Pedido> listaPedidos = new ArrayList<>();
        Boolean banderaMenuPedido = true;
        Mensajes msj = new Mensajes();
        Scanner scMenuPedido = new Scanner(System.in);
        Producto producto = new Producto();
        Pedido pedido = new Pedido();

        do {
            msj.msjMenuPedidos();
            int opMenu = scMenuPedido.nextInt();
            switch (opMenu){
                case 1:
                    if (!listaPedidos.isEmpty()){
                        System.out.println("Tiene datos");
                        pedido.MostrarPedidos(listaPedidos);
                    }else{System.out.println(msj.ROJO + "No hay pedidos por mostrar");}
                    break;
                case 2:
                    pedido.AgregarPedido(listaPedidos);
                    break;
                case 3:
                    pedido.AgregarProductos(listaPedidos, dataBaseProductos);
                    break;
                case 6:
                    banderaMenuPedido = false;
                    System.out.println("Regresando al menú principal...");
                    scMenuPedido.nextLine(); // <-- Limpia el buffer
                    break;
            }
        }while (banderaMenuPedido == true);
    }

    public Pedido EncontarPedidoById (int idPedido, List<Pedido> listaPedidos){
        for (Pedido itemPedido : listaPedidos){
            if (itemPedido.idPedido == idPedido){
                return itemPedido;
            }
        }
        // Si el ciclo termina y nunca entró al 'if', significa que no existe
        System.out.println("No existe el pedido con ID: " + idPedido);
        return null;
    }

    public Producto EncontarProductoById (int idProducto, List<Producto> dataBaseProductos){
        for (Producto itemProducto : dataBaseProductos){
            if (itemProducto.idProducto == idProducto){
                return itemProducto;
            }
        }
        // Si el ciclo termina y nunca entró al 'if', significa que no existe
        System.out.println("No existe el producto con ID: " + idProducto);
        return null;
    }

}
