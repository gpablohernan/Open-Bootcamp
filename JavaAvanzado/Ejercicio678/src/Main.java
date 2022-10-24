public class Main {
    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        singleton.setNombre("Pepe");
        System.out.println("Nombre: " + singleton.getNombre() + " dirección de memoria: " + singleton);

        singleton2.setNombre("Beto");
        System.out.println("Nombre: " + singleton2.getNombre() + " dirección de memoria: " + singleton);


    }
}

/*
Los principales patrones de diseño más conocidos son, creacionales, estructurales y de comportamiento

Creacionales: Sirven a la hora de crear instancias de objetos, ya que nos ayudan a encapsular la creación de objetos.
Ejemplos de patrones creacionales serían el patrón builder, que nos permite por ejemplo crear un sistema para crear objetos de forma fácil,
o el método factory como si fuera una fábrica de clases. Otro ejemplo sería prototype que nos permite clonar todas las propiedades de un objeto
que ya existe y crear un objeto clonando un objeto o el Singleton, que crea una instancia unica de una clase.

Estructurales: Solucionan diseños de composición o de agregación de clases y objetos, ya que cohesionan diferentes clases. En lugar de tener varias
clases independientes, un patrón estructural las acopla para que trabajemos mejor con ellas.
El más típico hoy en día es el Facade (Fachada), ante una serie de clases complejas, sobre esas clases se crea una clase que tenga un metodo sencillo
y por debajo de esa clase se ocupe de invocar a todas las demas y hacer toda la logica. Luego se llama a esa clase sencilla y automaticamente toda la
logica compleja queda oculta, o el Adapter, que teniendo un grupo de clases distintas mediante una clase unica las une.

De comportamiento: ofrecen soluciones entre la interacción y lo que hace cada clase y cada objeto, en otras palabras, reacciona ante algo.
Un ejemplo sería el patrón observer, que tiene emisores y receptores. Cuando un emisor habla, los receptores están a la espera que de eso pase,
y cuando pasa actúan en consecuencia.

 */