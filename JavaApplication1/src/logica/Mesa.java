package Logica;

public class Mesa {
    // Atributos
    int clavos;
    String madera;
    int patas;
    boolean superficiePlana;

    // Constructor vacío
    public Mesa() {}

    // Constructor con cosaa
    public Mesa(int clavos, String madera, int patas, boolean superficiePlana) {
        this.clavos = clavos;
        this.madera = madera;
        this.patas = patas;
        this.superficiePlana = superficiePlana;
    }

    // Métodos
    public void cargarPeso(double peso) {
        System.out.println("La mesa soporta un peso de " + peso + " kg.");
    }

    public void colocarObjeto(String objeto) {
        System.out.println("Se ha colocado un " + objeto + " sobre la mesa.");
    }

    public void pintar(String color) {
        System.out.println("La mesa ha sido pintada de color " + color + ".");
    }
}