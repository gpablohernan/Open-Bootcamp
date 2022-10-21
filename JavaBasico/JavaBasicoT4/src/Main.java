public class Main {
    public static void main(String[] args) {

        SmartDevice ipod = new SmartDevice(83, 5, 80, "Apple", "Ipod Touch", "lightning");
        SmartDevice movil = new SmartPhone(56, 6, 210, "Xiaomi", "Redmi Note 10", "USB C", 4);
        SmartDevice reloj = new SmartWatch(63, 1.5, 12, "Amazfit", "Gts 2", "Micro USB", true,"silicona");

        System.out.println(ipod.toString());
        System.out.println(movil.toString());
        System.out.println(reloj.toString());
    }
}
