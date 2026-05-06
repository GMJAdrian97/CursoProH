package Streaming;

public class Suscripcion {
    /*Atributos de clase*/
    Plan palan;
    String fechaInicio;

    public Suscripcion() {
    }

    public Suscripcion(Plan palan, String fechaInicio) {
        this.palan = palan;
        this.fechaInicio = fechaInicio;
    }

    public Plan getPalan() {
        return palan;
    }

    public void setPalan(Plan palan) {
        this.palan = palan;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
}
