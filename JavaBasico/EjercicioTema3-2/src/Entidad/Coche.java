package Entidad;

public class Coche {
   private int puertas = 3;

   public Coche() {
    }

    public Coche(int puertas) {
        this.puertas = puertas;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
}
