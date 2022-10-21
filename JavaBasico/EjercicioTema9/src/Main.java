import Entidades.Cliente;
import Entidades.Trabajador;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();

        cliente.setNombre("Pepe");
        cliente.setEdad(32);
        cliente.setTelefono(223647829);
        cliente.setCredito(100000);

        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Edad: " + cliente.getEdad());
        System.out.println("Teléfono: " + (cliente.getTelefono()));
        System.out.println("Crédito: $" + (cliente.getCredito()));

        trabajador.setNombre("Claudia");
        trabajador.setEdad(53);
        trabajador.setTelefono(223796541);
        trabajador.setSalario(83500);

        System.out.println("Nombre: " + trabajador.getNombre());
        System.out.println("Edad: " + trabajador.getEdad());
        System.out.println("Teléfono: " + (trabajador.getTelefono()));
        System.out.println("Salario: $" + (trabajador.getSalario()));

    }
}