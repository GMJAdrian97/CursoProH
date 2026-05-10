package SistemaPedidos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pedido {
    //Atributos de clase
    int idPedido;
    String fechaPedido;
    Estado estadoPedido;
    List<Producto> ltsProductosAgregados = new ArrayList<>();
    Mensajes coloresMnesjaes = new Mensajes();

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public String getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(String fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public Estado getEstadoPedido() {
        return estadoPedido;
    }

    public void setEstadoPedido(Estado estadoPedido) {
        this.estadoPedido = estadoPedido;
    }

    public List<Producto> getLtsProductosAgregados() {
        return ltsProductosAgregados;
    }

    public void setLtsProductosAgregados(List<Producto> ltsProductosAgregados) {
        this.ltsProductosAgregados = ltsProductosAgregados;
    }

    //Cosntructores


    public Pedido() {
    }

    public Pedido(int idPedido, String fechaPedido, List<Producto> ltsProductosAgregados) {
        this.idPedido = idPedido;
        this.fechaPedido = fechaPedido;
        this.ltsProductosAgregados = ltsProductosAgregados;
    }

    public Pedido(int idPedido, String fechaPedido, Estado estadoPedido, List<Producto> ltsProductosAgregados) {
        this.idPedido = idPedido;
        this.fechaPedido = fechaPedido;
        this.estadoPedido = estadoPedido;
        this.ltsProductosAgregados = ltsProductosAgregados;
    }

    Producto producto = new Producto();

    //Metodos

    public void MostrarPedidos (List<Pedido> listaPedidos){
        //Variables de metodo
        for (Pedido itemPedido : listaPedidos){
            System.out.println(coloresMnesjaes.CIAN + "-------------------------------------- \n" +
                    "Id: " + itemPedido.idPedido + "\n" +
                    "Fecha: " + itemPedido.fechaPedido + "\n" +
                    "Estado: " + itemPedido.estadoPedido + "\n" +
                    "Productos: " + itemPedido.ltsProductosAgregados.toString() + "\n" );
        }
    }

    public void AgregarPedido(List<Pedido> listaPedidos){
        if (!listaPedidos.isEmpty()){
            idPedido = (listaPedidos.get(listaPedidos.size()-1).idPedido) + 1;
            fechaPedido = LocalDate.now().toString();
            ltsProductosAgregados = new ArrayList<>();
            Pedido newPeido = new Pedido(idPedido, fechaPedido, Estado.CREADO,ltsProductosAgregados);
            listaPedidos.add(newPeido);
            System.out.println(coloresMnesjaes.AMARILLO + "Se agrego un nuevo pedido");
        }else{
            idPedido = 1;
            fechaPedido = LocalDate.now().toString();
            ltsProductosAgregados = new ArrayList<>();
            Pedido primerPeido = new Pedido(idPedido, fechaPedido, Estado.CREADO,ltsProductosAgregados);
            listaPedidos.add(primerPeido);
            System.out.println(coloresMnesjaes.AMARILLO + "Se agrego un nuevo pedido");
        }


    }

    public void AgregarProductos (List<Pedido> listaPedidos, List<Producto> dataBaseProductos){
        Scanner scPedido = new Scanner(System.in);
        ServiciosPedidos servPedidos = new ServiciosPedidos();
        System.out.println(coloresMnesjaes.VERDE + "Escribe el id del pedigo al que deseas agregar produtos");
        int idPedido = scPedido.nextInt();
        Pedido pedidoEncontrado = servPedidos.EncontarPedidoById(idPedido, listaPedidos);
        if (pedidoEncontrado != null){
            System.out.println(coloresMnesjaes.AMARILLO + "Pedido: " + pedidoEncontrado.idPedido + " seleccionado" +
                    "\n Escribe el id del producto que deseas agregar");
            for (Producto itemProducto : dataBaseProductos){
                System.out.println(coloresMnesjaes.CIAN + "-------------------------------------- \n" +
                        "Id: " + itemProducto.idProducto + "\n" +
                        "Nombre: " + itemProducto.nombreProducto + "\n" +
                        "Categoria: " + itemProducto.categoriaProducto + "\n" +
                        "Precvio: " + itemProducto.precioProducto + "\n" );
            }
            int idProductoAgregar = scPedido.nextInt();
            Producto productoSeleccionado = servPedidos.EncontarProductoById(idProductoAgregar, dataBaseProductos);
            producto.AgregarProductosalPedido(pedidoEncontrado, ltsProductosAgregados, productoSeleccionado );

        }
    }
}
