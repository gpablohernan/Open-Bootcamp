public class JavaBasicoT2 {
    public static void main(String[] args) {
        double precioSinIVA = 1500;
        double precioTotal = precioConIVA(precioSinIVA);
        System.out.println("El precio total es: " + precioTotal);
    }


    public static double precioConIVA(double precio){
        double total = precio + precio *.21;
        return total;
    }
}

