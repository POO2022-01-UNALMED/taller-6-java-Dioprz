package vehiculos;

import java.util.*;

public class Fabricante{

    public static ArrayList<Fabricante> listaFabricantes = new Arraylist<Fabricante>();
    public int autosPorFabricante;
    private String nombre;
    private Pais pais;

    public static Fabricante fabricaMayorVentas(){
        Fabricante fabricaMayorVentas;
        for (int i = 0; i < listaFabricantes.size(); i++){
            if (fabricaMayorVentas.autosPorFabricante < listaFabricantes.get(i).autosPorFabricante){
                fabricaMayorVentas = listaFabricantes.get(i);
            }
        }
        return fabricaMayorVentas;
    }

    public String getNombre(){
        return nombre;
    }

    public Pais getPais(){
        return pais;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setPais(Pais pais){
        this.pais = pais;
    }
}


