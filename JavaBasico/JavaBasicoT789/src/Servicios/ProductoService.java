package Servicios;
import Entidad.Producto;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProductoService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Producto crearProducto(){
        Producto producto = new Producto();


        System.out.println("Ingrese el producto:");
        producto.setNombre(leer.next().toUpperCase());
        System.out.println("Ingrese el precio:");
        producto.setPrecio(leer.nextDouble());

        return producto;
    }

    public HashMap<String, Double> crearBDProductos(){

        HashMap<String, Double> productos = new HashMap<>();
        String opcion;
        do {
            Producto producto = crearProducto();
            productos.put(producto.getNombre() , producto.getPrecio());
            do {
                System.out.println("Desea ingresar otro producto? (s/n)");
                opcion = leer.next();
            } while (!(opcion.equalsIgnoreCase("s") || opcion.equalsIgnoreCase("n")));
        } while (opcion.equalsIgnoreCase("s"));
        return productos;
    }

    public void agregarProductos(HashMap<String, Double> bDProductos){

        String opcion;
        do {
            Producto producto = crearProducto();
            bDProductos.put(producto.getNombre() , producto.getPrecio());
            do {
                System.out.println("Desea ingresar otro producto? (s/n)");
                opcion = leer.next();
            } while (!(opcion.equalsIgnoreCase("s") || opcion.equalsIgnoreCase("n")));
        } while (opcion.equalsIgnoreCase("s"));

    }

    public void eliminarProductos(HashMap<String, Double> bDProductos){
        String productoAEliminar;
        double precioAEliminar;
        System.out.println("Ingrese el producto a eliminar:");
        productoAEliminar = leer.next().toUpperCase();
        System.out.println("Ingrese el precio del producto a eliminar:");
        precioAEliminar = leer.nextDouble();
        if (bDProductos.remove(productoAEliminar, precioAEliminar)){
            System.out.println("El producto ingresado se eliminó correctamente");
        } else {
            System.out.println("El producto no se pudo eliminar de la lista");
        }

    }

    public void modificarProductos(HashMap<String, Double> bDProductos) {
        String productoAModificar;
        double nuevoPrecio;
        System.out.println("Ingrese el producto a modificar:");
        productoAModificar = leer.next().toUpperCase();
        boolean flag = false;

        for (Map.Entry<String, Double> aux : bDProductos.entrySet()) {
            if (aux.getKey().equals(productoAModificar)) {
                System.out.println("Ingrese el nuevo precio:");
                nuevoPrecio = leer.nextDouble();
                bDProductos.replace(productoAModificar, nuevoPrecio);
                flag = true;
            }

        }
        if (flag) {
            System.out.println("El producto ingresado se modificó correctamente");
        } else {
            System.out.println("El producto ingresado no existe en la lista");
        }
    }

    public void mostrarProductos(HashMap<String, Double> bDProductos) {
        for (Map.Entry<String, Double> aux : bDProductos.entrySet()) {
            String key = aux.getKey();
            Double value = aux.getValue();

            System.out.println("Producto: " + key + '\t' + '\t' + "Precio: " + value);
        }
    }

    public void guardarProductos(HashMap<String, Double> bDProductos){
        try {
            PrintStream ficheroProductos = new PrintStream("productos.txt");
            for (Map.Entry<String, Double> aux : bDProductos.entrySet()) {
                String key = aux.getKey();
                Double value = aux.getValue();

                ficheroProductos.println("Producto: " + key  + " Precio: " + value);
            }
            ficheroProductos.close();
            System.out.println("Los productos se cuardaron correctamente");

        } catch (Exception e){
            System.out.println("Excepción: " + e.getMessage());
        }

    }
}
