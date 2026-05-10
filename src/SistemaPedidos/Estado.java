package SistemaPedidos;

public enum Estado {
    CREADO("Peido Creado"),
    PAGADO("Peido Pagado"),
    CANCELADO("Peido Cancelado");

    // Atributo privado para guardar información extra
    private final String mensaje;

    // El constructor siempre es privado en los enums
    Estado(String mensaje) {
        this.mensaje = mensaje;
    }

    // Metodo para obtener el valor del atributo
    public String getMensaje() {
        return mensaje;
    }
}
