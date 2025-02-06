package Logica;

public class Principal {
    public static void main(String[] args) {
        // Crear objeto Computadora con constructor vacío y luego asignar valores
        Computadora pc = new Computadora();
        pc.gabinete = "Deepcool";
        pc.boton = true;
        pc.procesador = "Intel i9";
        pc.fuenteEnergia = "750W";
        pc.almacenamiento = 250;
        pc.ventiladores = 3;

        pc.encender(true);
        pc.abrirBlogDeNotas("Hola clase de POO.");
        pc.copiarPegar("xd.");
        pc.apagar(false);

        System.out.println(); // Espaciado en consola

        // Crear objeto Mesa con constructor vacío y luego asignar valores
        Mesa mesaTrabajo = new Mesa();
        mesaTrabajo.clavos = 20;
        mesaTrabajo.madera = "Roble";
        mesaTrabajo.patas = 4;
        mesaTrabajo.superficiePlana = true;

        mesaTrabajo.cargarPeso(50.5);
        mesaTrabajo.colocarObjeto("libro");
        mesaTrabajo.pintar("Verde");
    }
}