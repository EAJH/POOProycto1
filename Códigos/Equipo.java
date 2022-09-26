package pooproyecto1;

import java.time.LocalDate;
import java.util.Scanner;

public class Equipo
{
    //Atributos
    private String[] patrocinadores;
    private Piloto[] pilotos;
    private String nombreEquipo;
    private int posicion;
    LocalDate fechaCompeticion;

    //Constructores
    public Equipo() {
    }

        
    public Equipo(String[] patrocinadores, Piloto[] pilotos, String nombreEquipo) {
        this.patrocinadores = patrocinadores;
        this.pilotos = pilotos;
        this.nombreEquipo = nombreEquipo;
    }
    
    
    //Métodos de acceso
    public String[] getPatrocinadores() {
        return patrocinadores;
    }

    public void setPatrocinadores(String[] patrocinadores) {
        if(patrocinadores.length <= 0){
            System.out.println("No hay patrocinadores");
        }else{
            this.patrocinadores = patrocinadores;
        }
            
    }

    
    
    public Piloto[] getPilotos() {
        return pilotos;
    }

    public void setPilotos(Piloto[] pilotos) {
        this.pilotos = pilotos;
    }

    
    
    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        if(nombreEquipo == ""){
            Scanner sc = new Scanner(System.in);
            System.out.println("No existe un nombre para el equipo.");
            System.out.println("Ingrese un nombre:");
            String nombre = sc.nextLine();
            this.nombreEquipo = nombre;
        }else{
            this.nombreEquipo = nombreEquipo;
        }
        
    }
    
    
    
    public int getPosicion(){
        return posicion;
    }
    
    public void setPosicion(int posicion){
        if(posicion < 0){
            this.posicion = posicion;
        }else{
            this.posicion =  posicion;
        }
    }
    
    
}