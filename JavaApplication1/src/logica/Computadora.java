package Logica;

public class Computadora {
    // Atributos
    String gabinete;
    boolean boton;
    String procesador;
    String fuenteEnergia;
    int almacenamiento;
    int ventiladores;

    // Constructor vacío
    public Computadora() {}

    // Constructor con cosas
    public Computadora(String gabinete, boolean boton, String procesador, String fuenteEnergia, int almacenamiento, int ventiladores) {
        this.gabinete = gabinete;
        this.boton = boton;
        this.procesador = procesador;
        this.fuenteEnergia = fuenteEnergia;
        this.almacenamiento = almacenamiento;
        this.ventiladores = ventiladores;
    }

    // Métodos
    public void encender(boolean estado) {
        if (estado) {
            System.out.println("Encendiendo la computadora.");
        } else {
            System.out.println("La computadora está apagada.");
        }
    }

    public void apagar(boolean estado) {
        if (!estado) {
            System.out.println("Apagando la computadora...");
        } else {
            System.out.println("La computadora sigue encendida.");
        }
    }

    public void abrirBlogDeNotas(String mensaje) {
        System.out.println("Abriendo Bloc de Notas...");
        System.out.println("Escribiendo: " + mensaje);
    }

    public void copiarPegar(String texto) {
        System.out.println("Texto copiado y pegado: " + texto);
    }
}
