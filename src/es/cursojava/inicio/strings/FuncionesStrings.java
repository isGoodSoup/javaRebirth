package es.cursojava.inicio.strings;

public class FuncionesStrings {
    public static void main( String[] args ) {

        String nombre = "Martinez";
        String nombre2 = "Eva";
//      String nombre3 = new String(" ");
        String nombre3 = "Mario";
//      nombre3 = null;

        System.out.println(nombre3.toUpperCase());
        System.out.println(nombre + ", " + nombre2 + ", " + nombre3);

//      Strings son variables de tipo objeto, una clase llamada 'String', immutables.
//      Variables: nombres que asignamos a los objetos.
//      Objetos: NO son variables.

        for (int i = 0; i < nombre.length() * 2; i++) {
            System.out.print("=");
        }
        System.out.println();

//      System.out.println(nombre.charAt(0));
//      Con el siguiente método (chatAt y length) se consigue el último caracter.
        System.out.println(nombre.charAt(nombre.length() - 1));
//      El método contains devuelve un booleano.
        System.out.println(nombre.contains("nez"));
        System.out.println(nombre.contains("Mo"));

//      Ambos retornan booleanos, endsWith y startsWith.
        System.out.println(nombre2.endsWith("va"));
        System.out.println(nombre.startsWith("Ma"));

        String cadena = "Esto es una prueba de Strings";
        System.out.println(cadena.indexOf("e"));
        System.out.println(cadena.lastIndexOf("e"));
        System.out.println(cadena.replace("a", "A"));

        for (int i = 0; i < nombre.length() * 2; i++) {
            System.out.print("=");
        }
        System.out.println();

        cadena = "  e  ";
        System.out.println("isBlank = " + cadena.isBlank());
        System.out.println("isEmpty = " + cadena.isEmpty());

        for (int i = 0; i < nombre.length() * 2; i++) {
            System.out.print("=");
        }
        System.out.println();

        System.out.println(cadena.strip());
        System.out.println("'" + cadena + "'");
        System.out.println(cadena.substring(0));

    }
}
