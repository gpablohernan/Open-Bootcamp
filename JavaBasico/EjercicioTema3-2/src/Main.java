import Entidad.Coche;
import Servicios.CocheService;

public class Main {
    public static void main(String[] args) {
        CocheService coche = new CocheService();
        Coche miCoche = new Coche();

        coche.numeroPuertas(miCoche);
        System.out.println("El número de puertas actual del coche es: " + miCoche.getPuertas());
    }
}