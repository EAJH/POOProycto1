package pooproyecto1;

import java.util.Scanner;

public class Pista 
{
    //Atributos
    private int longitud;
    private String pais;
    
    Scanner sc = new Scanner(System.in);

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Pista(int longitud, String pais) {
        this.longitud = longitud;
        this.pais = pais;

    }
    
    public Pista(){
    }
   
}
