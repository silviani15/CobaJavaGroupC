public class Main {

    public static void main(String args[]){
        System.out.println("Hello World");

        lampu lampu = new lampu();
        System.out.println(lampu.warnaSekarang());
        lampu.gantiWarna("Merah");
        lampu.warna = "kuning";
        System.out.println(lampu.warnaSekarang());
    }
}
