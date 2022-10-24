public class Singleton {

    private static Singleton Singleton;
    private String nombre;

    private Singleton(){};
    public static Singleton getInstance(){
        if(Singleton == null){
            Singleton = new Singleton();
        }
        return Singleton;
    }

    public Singleton(String nombre) {
        this.nombre = nombre;
    }

    public static Singleton getSingleton() {
        return Singleton;
    }

    public static void setSingleton(Singleton singleton) {
        Singleton = singleton;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
