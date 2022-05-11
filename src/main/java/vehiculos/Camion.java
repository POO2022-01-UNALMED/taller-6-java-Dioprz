package vehiculos;

public class Camion extends Vehiculo{

    private static int cantidadCamiones;
    private int ejes;
    private int puertas = 2;
    private float velocidadMaxima = 80;
    private String traccion = "4X2";

    public Camion(String placa, String nombre, float precio, float peso, Fabricante fabricante, int ejes){
        this.ejes = ejes;
        this.placa = placa;
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
        this.fabricante = fabricante;
        Vehiculo.cantidadVehiculos++;
        Camion.cantidadCamiones++;
        fabricante.autosPorFabricante++;
        fabricante.getPais().autosPorPais++;
    }

    public void setEjes(int ejes){
        this.ejes = ejes;
    }

    public int getEjes(){
        return ejes;
    }

    public static int getCantidadCamiones(){
        return Camion.cantidadCamiones;
    }
}

