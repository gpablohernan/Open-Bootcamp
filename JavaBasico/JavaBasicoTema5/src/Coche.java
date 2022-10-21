public class Coche {

    private String marca;
    private String modelo;
    private String color;
    private int cantPuertas;

    public Coche() {
    }

    public Coche(String marca, String modelo, String color, int cantPuertas) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.cantPuertas = cantPuertas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCantPuertas() {
        return cantPuertas;
    }

    public void setCantPuertas(int cantPuertas) {
        this.cantPuertas = cantPuertas;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", cantPuertas=" + cantPuertas +
                '}';
    }
}
