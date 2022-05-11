package vehiculos;

public class Camioneta extends Vehiculo{

    private static int cantidadCamionetas;
    private boolean volco;
    private float velocidadMaxima = 90;
    private String traccion = "4X4";

    public Camioneta(String placa, int puertas, String nombre, float precio, float peso, Fabricante fabricante, boolean volco){
        this.volco = volco;
        this.placa = placa;
        this.puertas = puertas;
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
        this.fabricante = fabricante;
        Vehiculo.cantidadVehiculos++;
        Camioneta.cantidadCamionetas++;
        fabricante.autosPorFabricante++;
        fabricante.getPais().autosPorPais++;
    }

    public void setVolco(boolean volco){
        this.volco = volco;
    }

    public boolean isVolco(){
        return volco;
    }

    public static int getCantidadCamionetas(){
        return Camioneta.cantidadCamionetas;
    }
}


