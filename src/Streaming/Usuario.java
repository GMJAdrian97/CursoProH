package Streaming;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    /*Atributos de clase*/
    String nombre, mail;
    Suscripcion suscripcion;
    List<Usuario> ltsusuarios = new ArrayList<>();


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Suscripcion getSuscripcion() {
        return suscripcion;
    }

    public void setSuscripcion(Suscripcion suscripcion) {
        this.suscripcion = suscripcion;
    }

    public void setLtsusuarios(List<Usuario> ltsusuarios) {
        this.ltsusuarios = ltsusuarios;
    }
    public Usuario() {
    }

    public Usuario(String nombre, String mail, Suscripcion suscripcion, List<Usuario> usuarios) {
        this.nombre = nombre;
        this.mail = mail;
        this.suscripcion = suscripcion;
        this.ltsusuarios = usuarios;
    }

    public Usuario(String nombre, String mail, Suscripcion suscripcion) {
        this.nombre = nombre;
        this.mail = mail;
        this.suscripcion = suscripcion;
    }

    public boolean cargarUsuarios() {
        boolean usuariosCargados = false;
        ltsusuarios.add(new Usuario("paco", "paco@gmail.com", new Suscripcion(new Plan("basico", 9.99), "2023-01-23")));
        ltsusuarios.add(new Usuario("Josue", "josue@gmail.com", new Suscripcion(new Plan("premium", 15.99), "2023-01-15")));
        ltsusuarios.add(new Usuario("Adrian", "adrian@outlook.com", new Suscripcion(new Plan("basico", 9.99), "2023-05-20")));
        ltsusuarios.add(new Usuario("Gaby", "gaby@gmail.com", new Suscripcion(new Plan("gold", 19.99), "2023-03-10")));
        ltsusuarios.add(new Usuario("Carlos", "charles@hotmail.com", new Suscripcion(new Plan("premium", 15.99), "2022-12-01")));
        ltsusuarios.add(new Usuario("Ana", "ana@yahoo.com", new Suscripcion(new Plan("basico", 9.99), "2024-02-14")));
        ltsusuarios.add(new Usuario("Luis", "luis@gmail.com", new Suscripcion(new Plan("gold", 19.99), "2023-08-25")));
        ltsusuarios.add(new Usuario("Maria", "maria@empresa.com", new Suscripcion(new Plan("premium", 15.99), "2024-01-05")));
        ltsusuarios.add(new Usuario("Pedro", "pedrito@outlook.com", new Suscripcion(new Plan("basico", 9.99), "2023-11-30")));
        ltsusuarios.add(new Usuario("Lucia", "lucia@gmail.com", new Suscripcion(new Plan("gold", 19.99), "2023-06-12")));
        ltsusuarios.add(new Usuario("Roberto", "beto@gmail.com", new Suscripcion(new Plan("premium", 15.99), "2023-09-18")));


        if (ltsusuarios != null && !ltsusuarios.isEmpty()) {
            usuariosCargados = true;
            return usuariosCargados;
        }

        return usuariosCargados;
    }

    public List<Usuario> getLtsusuarios() {
        return ltsusuarios;
    }

    public List<String> obteberUsuariosPremium(){
        List<String> usuariosPremium = ltsusuarios.stream()
                .filter(usuarioP -> usuarioP.getSuscripcion().getPalan().getTipoPlan().equalsIgnoreCase("Premium"))
                .map(usuarioP -> "Usuario: "+ usuarioP.getNombre() + "| Email:" + usuarioP.getMail())
                .toList();
        return usuariosPremium;
    }

    public double obtenerCostoTotalUsuariosActivos(){
        double costoTotal = ltsusuarios.stream()
                .mapToDouble(costoxUs -> costoxUs.getSuscripcion().getPalan().getPrecio())
                .sum();
        return costoTotal;
    }

    public List<String> ObtebnerusuariosVIP (){
        List<String> usuariosVIP = ltsusuarios.stream()
                .filter(usVIP-> usVIP.getSuscripcion().getPalan().tipoPlan.equalsIgnoreCase("Gold"))
                .map(usVIP -> "Nombre: " + usVIP.getNombre() + " | Email: " + usVIP.getMail() + " | Suscripcion: Gold" + usVIP.getSuscripcion().getPalan().tipoPlan)
                .toList();
        return usuariosVIP;
    }

    public List<String> obtenerDominiosGmail (){
        List<String> ltsDiomionsGmail = ltsusuarios.stream()
                .filter(usGamail -> usGamail.getMail().toLowerCase().endsWith("@gmail.com") && usGamail.getSuscripcion().getPalan().precio > 9.99)
                .map(usGamail -> "Usuario: " + usGamail.getNombre() + " | Email: " + usGamail.getMail() + " | Precio: " + usGamail.getSuscripcion().getPalan().precio)
                .toList();
        return ltsDiomionsGmail;
    }


}
