package vehiculos;

public class Automovil extends Vehiculo{

    private static int cantidadAutomoviles;
    private int puestos;
    private int puertas = 4;
    private float velocidadMaxima = 100;
    private String traccion = "FWD";

    public Automovil(int puestos, intString placa, String nombre, float precio, float peso, Fabricante fabricante){
        this.puestos = puestos;
        this.placa = placa;
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
        this.fabricante = fabricante;
        Vehiculo.cantidadVehiculos++;
        Automovil.cantidadAutomoviles++;
        fabricante.autosPorFabricante++;
        fabricante.getPais().autosPorPais++;
        
    }

    public void setPuestos(int puestos){
        this.puestos = puestos;
    }

    public int getPuestos(){
        return puestos;
    }

    public static int getCantidadAutomoviles(){
        return Automovil.cantidadAutomoviles;
    }

}



