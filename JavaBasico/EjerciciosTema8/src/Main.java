import Entidad.Persona;

public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona();

        persona.setNombre("Pepe");
        persona.setEdad(32);
        persona.setTelefono(223647829);

        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Teléfono: " + (persona.getTelefono()));

    }
}