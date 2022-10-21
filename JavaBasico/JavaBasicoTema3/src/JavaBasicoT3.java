public class JavaBasicoT3 {
    public static void main(String[] args) {
        String[] palabras = {"Hola ", "gente ", "de ", "Open ", "Bootcamp!"};
        String oracion = "";
        for (int i=0; i<palabras.length; i++){
            oracion += palabras[i];
        }
        System.out.println(oracion);
    }
}
