public class Calculadora {
    //Traibutos de la clase
    private double resultado;

    //Metodos
    public void sumar (double numero1, double numero2) {

        resultado = (numero1 + numero2);
    }

    public void restar (double numero1, double numero2) {

        resultado = (numero1 - numero2);
    }

    public void multiplicar (double numero1, double numero2) {

        resultado = (numero1 * numero2);
    }

    public void dividir (double numero1, double numero2) {
        if(numero2 != 0){
            resultado = (numero1 / numero2);
        }else{
            System.out.println("Nos eas wey no se puede dividor entre 0");
        }
    }

    public void operar(char operador, double numero1, double numero2){
        switch (operador){
            case '+':
                resultado = numero1 + numero2;
                break;
            case '-':
                resultado = numero1 - numero2;
                break;
            case '*':
                resultado = numero1 * numero2;
                break;
            case '/':
                resultado = numero1 / numero2;
                break;
        }
    }

    public void operarLibre(String operacion){
        double numero1, numero2;
        char signo;
        numero1 = operacion.charAt(0);
        Double.parseDouble(String.valueOf(numero1));
        signo  = operacion.charAt(1);
        numero2 = operacion.charAt(2);
        Double.parseDouble(String.valueOf(numero2));
        switch (signo){
            case '+':
                resultado = numero1 + numero2;
                break;
            case '-':
                resultado = numero1 - numero2;
                break;
            case '*':
                resultado = numero1 * numero2;
                break;
            case '/':
                resultado = numero1 / numero2;
                break;
        }
    }

    public void listarTblMultiplicar(int tabla){
        for (int i = 0; i <= 10; i++){ //ciclo for se ejecuta hasta llegar a un numero de iteraciones
            int resultado = tabla * i;
            System.out.println(tabla + " X " + i + " = " + resultado );
        }
    }

    public double getResultado(){
        return resultado;
    }

}
