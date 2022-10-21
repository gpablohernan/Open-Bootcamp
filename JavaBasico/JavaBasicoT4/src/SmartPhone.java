public class SmartPhone extends SmartDevice {
    private int cantCamarasTraseras;

    public SmartPhone() {
    }

    public SmartPhone(int cantCamarasTraseras) {
        this.cantCamarasTraseras = cantCamarasTraseras;
    }

    public SmartPhone(int nivelBateria, double tamanioPantalla, double peso, String marca, String modelo, String tipoCarga, int cantCamarasTraseras) {
        super(nivelBateria, tamanioPantalla, peso, marca, modelo, tipoCarga);
        this.cantCamarasTraseras = cantCamarasTraseras;
    }

    public int getCantCamarasTraseras() {
        return cantCamarasTraseras;
    }

    public void setCantCamarasTraseras(int cantCamarasTraseras) {
        this.cantCamarasTraseras = cantCamarasTraseras;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "nivelBateria=" + this.getNivelBateria() +
                ", tamanioPantalla=" + this.getTamanioPantalla() +
                " peso=" + this.getPeso() +
                ", marca='" + this.getMarca() + '\'' +
                ", modelo='" + this.getModelo() + '\'' +
                ", tipoCarga='" + this.getTipoCarga() + '\'' +
                "cantCamarasTraseras=" + cantCamarasTraseras +
                '}';
    }
}
