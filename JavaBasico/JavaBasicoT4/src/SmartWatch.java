public class SmartWatch extends SmartDevice{
    private boolean cuentaPasos;
    private String materialCorrea;

    public SmartWatch() {
    }

    public SmartWatch(boolean cuentaPasos, String materialCorrea) {
        this.cuentaPasos = cuentaPasos;
        this.materialCorrea = materialCorrea;
    }

    public SmartWatch(int nivelBateria, double tamanioPantalla, double peso, String marca, String modelo, String tipoCarga, boolean cuentaPasos, String materialCorrea) {
        super(nivelBateria, tamanioPantalla, peso, marca, modelo, tipoCarga);
        this.cuentaPasos = cuentaPasos;
        this.materialCorrea = materialCorrea;
    }

    public boolean isCuentaPasos() {
        return cuentaPasos;
    }

    public void setCuentaPasos(boolean cuentaPasos) {
        this.cuentaPasos = cuentaPasos;
    }

    public String getMaterialCorrea() {
        return materialCorrea;
    }

    public void setMaterialCorrea(String materialCorrea) {
        this.materialCorrea = materialCorrea;
    }

    @Override
    public String toString() {
        return
                "SmartWatch{" +
                "nivelBateria=" + this.getNivelBateria() +
                ", tamanioPantalla=" + this.getTamanioPantalla() +
                " peso=" + this.getPeso() +
                ", marca='" + this.getMarca() + '\'' +
                ", modelo='" + this.getModelo() + '\'' +
                ", tipoCarga='" + this.getTipoCarga() + '\'' +
                "cuentaPasos=" + cuentaPasos +
                ", materialCorrea='" + materialCorrea + '\'' +
                '}';
    }
}
