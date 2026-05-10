package SistemaPedidos;

import java.util.List;
import java.util.Scanner;

public class Producto {
    int idProducto;
    String nombreProducto, categoriaProducto;
    Double precioProducto;
    Mensajes coloresMnesjaes = new Mensajes();
    ServiciosPedidos servPedidos = new ServiciosPedidos();

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getCategoriaProducto() {
        return categoriaProducto;
    }

    public void setCategoriaProducto(String categoriaProducto) {
        this.categoriaProducto = categoriaProducto;
    }

    public Double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(Double precioProducto) {
        this.precioProducto = precioProducto;
    }

    //Cosntructores

    public Producto() {
    }

    public Producto(int idProducto, String nombreProducto, String categoriaProducto, Double precioProducto) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.categoriaProducto = categoriaProducto;
        this.precioProducto = precioProducto;
    }

    //Metodos


    @Override
    public String toString() {
        return "Producto{" +
                "precioProducto=" + precioProducto +
                ", categoriaProducto='" + categoriaProducto + '\'' +
                ", nombreProducto='" + nombreProducto + '\'' +
                ", idProducto=" + idProducto +
                '}';
    }

    public void MostrarProductos(List<Producto> dataBaseProductos){
        for (Producto itemProducto : dataBaseProductos){
            System.out.println(coloresMnesjaes.CIAN + "-------------------------------------- \n" +
                    "Id: " + itemProducto.idProducto + "\n" +
                    "Nombre: " + itemProducto.nombreProducto + "\n" +
                    "Categoria: " + itemProducto.categoriaProducto + "\n" +
                    "Precio: " + itemProducto.precioProducto + "\n" );
        }
    }

    public void AgregarProducto (List<Producto> dataBaseProductos, Producto newProducto){
        dataBaseProductos.add(newProducto);
        System.out.println(coloresMnesjaes.AMARILLO + "Producto Agrgeado con exito");
    }

    public void AgregarProductosalPedido (Pedido pedidoEncontrado, List<Producto> ltsProductosAgregados, Producto productoSeleccionado){
        pedidoEncontrado.ltsProductosAgregados.add(productoSeleccionado);
        System.out.println(coloresMnesjaes.AMARILLO + "Producto Agregado correcatmenet");
    }
}
