package es.cursojava.inicio.condicionales.ejercicios;

public class CondicionalesSwitch {
    
    public static void main(String[] args) {
    
        String mes = "";
        
        switch (mes) {
            case "enero" : System.out.println("invierno");
            case "febrero" : System.out.println("invierno");
            case "marzo" : System.out.println("primavera");
            case "abril" : System.out.println("primavera");
            case "mayo" : System.out.println("primavera");
            case "junio" : System.out.println("verano");
            case "julio" : System.out.println("verano");
            case "agosto" : System.out.println("verano");
            case "septiembre" : System.out.println("otoño");
            case "octubre" : System.out.println("otoño");
            case "noviembre" : System.out.println("otoño");
            case "diciembre" : System.out.println("invierno");
            default : System.out.println("Mes incorrecto");
        }
    }
}
