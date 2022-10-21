import java.io.*;
import java.util.*;
import Servicios.ProductoService;
import java.util.HashMap;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String cadena = "hola mundo";
        out.println(reverse(cadena));

        String[] unidimensional = new String[5];
        unidimensional[0] = "Hola ";
        unidimensional[1] = "gente ";
        unidimensional[2] = "de ";
        unidimensional[3] = "Open ";
        unidimensional[4] = "Bootcamp";
        for (int i = 0; i< unidimensional.length; i++){
            out.print(unidimensional[i]);
        }
        out.println("");

        int[][] bidimensional = new int[2][2];
        bidimensional[0][0]= 43;
        bidimensional[0][1]= 25;
        bidimensional[1][0]= 99;
        bidimensional[1][1]= 12;

        for (int i = 0; i<2; i++){
            for (int j = 0; j<2; j++){
                out.println("[" + i + "]" + "[" + j + "] = " + bidimensional[i][j]);
            }
        }

        Vector<Integer> nums = new Vector<>();
        nums.add(23);
        nums.add(40);
        nums.add(11);
        nums.add(85);
        nums.add(66);
        nums.remove(1);
        nums.remove(2);
        out.println("Vector:");
        for (int nu: nums) {
            out.println(nu);
        }

        /*
        Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo tiempo.
        RTA: Se crearían copias en memoria y gastarían muchos más recursos.
         */

        ArrayList<String> personas = new ArrayList<>();
        personas.add("Pedro");
        personas.add("Pablo");
        personas.add("José");
        personas.add("Juan");
        LinkedList<String> personas2 = new LinkedList<>(personas);
        out.println("ArrayList:");
        for (String pers: personas) {
            out.print(pers + '\t');
        }
        out.println("");
        out.println("LinkedList:");
        for (String pers: personas2) {
            out.print(pers + '\t');
        }
        out.println("");

        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i=1; i<=10; i++){
            numeros.add(i);
        }
        for (int num: numeros) {
            out.println(num);
        }
        for (int i = 0; i<numeros.size(); i++) {
            if (numeros.get(i) % 2 == 0){
                numeros.remove(i);
            }
        }
        for (int num: numeros) {
            out.println(num);
        }

        int num1;
        int num2;
        out.println("Ingrese dos números para dividirlos");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        out.println("El resultado es: " + dividePorCero(num1,num2));


        try {
            PrintStream fichero1 = new PrintStream("fichero1.txt");
            fichero1.println("Hola mundo");
            fichero1.close();

            InputStream in = new FileInputStream("fichero1.txt");
            //byte []datos= in.readAllBytes();
            PrintStream fichero2 = new PrintStream("fichero2.txt");
            //fichero2.write(datos);
            copiaFichero(in, fichero2);
        } catch (Exception e){
            System.out.println("Excepción:" + e.getMessage());
        }

        ProductoService producto = new ProductoService();
        HashMap<String, Double> bDProductos;
        bDProductos = producto.crearBDProductos();
        menu(bDProductos, producto);

    }


    public static String reverse(String texto) {
        String reves ="";
        for (int i=texto.length(); i>0; i--){
            reves += texto.charAt(i-1);
        }
        return reves;
    }

    public static int dividePorCero (int num1, int num2) throws ArithmeticException{
        int resultado;
        try {
            resultado = num1 / num2;
        } catch (Exception e){
            out.println("Esto no puede hacerse");
            throw new ArithmeticException();
        } finally {
            out.println("Demo de código");
        }
        return resultado;
    }


    static void copiaFichero (InputStream fileIn, OutputStream fileOut) {
        try {
            byte []datos= fileIn.readAllBytes();
            fileOut.write(datos);
        } catch (Exception e){
            System.out.println("Excepción: " + e.getMessage());
        }

    }

    public static void menu(HashMap<String, Double> bDProductos, ProductoService producto){
        Scanner leer = new Scanner(System.in);
        int op;
        System.out.println("MENÚ" + '\n' + '\n' +
                "1 -- AGREGAR PRODUCTOS" + '\n' +
                "2 -- MODIFICAR PRODUCTOS" + '\n' +
                "3 -- ELIMINAR PRODUCTOS" + '\n' +
                "4 -- MOSTRAR PRODUCTOS" + '\n' +
                "5 -- GUARDAR PRODUCTOS EN UN ARCHIVO" + '\n' +
                "6 -- SALIR" + '\n'
        );
        System.out.println("Ingrese una opción");
        op = leer.nextInt();
        switch (op){
            case 1:
                producto.agregarProductos(bDProductos);
                menu(bDProductos, producto);
                break;
            case 2:
                producto.modificarProductos(bDProductos);
                menu(bDProductos, producto);
                break;
            case 3:
                producto.eliminarProductos(bDProductos);
                menu(bDProductos, producto);
                break;
            case 4:
                producto.mostrarProductos(bDProductos);
                menu(bDProductos, producto);
                break;
            case 5:
                producto.guardarProductos(bDProductos);
                menu(bDProductos, producto);
                break;
            case 6:
                System.out.println("Gracias por utilizar el programa. Que tenga un buen día");
                break;
            default:
                System.out.println("La opción ingresada es incorrecta");
                menu(bDProductos, producto);
                break;
        }
    }

}
