package vehiculos;

import java.util.*;

public class Pais{

    public static ArrayList<Pais> listaPaises = new ArrayList<>();
    public int autosPorPais;
    private String pais;

    public Pais(String pais){
        this.pais = pais;
        listaPaises.add(this);
    }

    public static Pais paisMasVendedor(){
        Pais paisMasVendedor = new Pais("base");
        for (int i = 0; i < listaPaises.size(); i++){
            if (paisMasVendedor.autosPorPais < listaPaises.get(i).autosPorPais){
                paisMasVendedor = listaPaises.get(i);
            }
        }
        return paisMasVendedor;
    }

    public void setPais(String pais){
        this.pais = pais;
    }

    public String getPais(){
        return pais;
    }
}




