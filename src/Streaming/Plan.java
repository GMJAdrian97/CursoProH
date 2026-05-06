package Streaming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Plan {
    /*Atributos de clase*/
    /*List<String> tipoPlan = Arrays.asList("basico", "gold", "premium");*/
    String tipoPlan;
    double precio;

    public Plan() {
    }

    public Plan(String tipoPlan, double precio) {
        this.tipoPlan = tipoPlan;
        this.precio = precio;
    }

    public String getTipoPlan() {
        return tipoPlan;
    }

    public void setTipoPlan(String tipoPlan) {
        this.tipoPlan = tipoPlan;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
