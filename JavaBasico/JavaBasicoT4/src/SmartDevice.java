public class SmartDevice {

    private int nivelBateria;
    private double tamanioPantalla;
    private double peso;
    private String marca;
    private String modelo;
    private String tipoCarga;

    public SmartDevice() {
    }

    public SmartDevice(int nivelBateria, double tamanioPantalla, double peso, String marca, String modelo, String tipoCarga) {
        this.nivelBateria = nivelBateria;
        this.tamanioPantalla = tamanioPantalla;
        this.peso = peso;
        this.marca = marca;
        this.modelo = modelo;
        this.tipoCarga = tipoCarga;
    }

    public int getNivelBateria() {
        return nivelBateria;
    }

    public void setNivelBateria(int nivelBateria) {
        this.nivelBateria = nivelBateria;
    }

    public double getTamanioPantalla() {
        return tamanioPantalla;
    }

    public void setTamanioPantalla(double tamanioPantalla) {
        this.tamanioPantalla = tamanioPantalla;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
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

    public String getTipoCarga() {
        return tipoCarga;
    }

    public void setTipoCarga(String tipoCarga) {
        this.tipoCarga = tipoCarga;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "nivelBateria=" + nivelBateria +
                ", tamanioPantalla=" + tamanioPantalla +
                ", peso=" + peso +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", tipoCarga='" + tipoCarga + '\'' +
                '}';
    }
}
