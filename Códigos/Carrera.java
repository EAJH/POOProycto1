package pooproyecto1;

import java.time.LocalDate;

public class Carrera 
{
    Pista pista;
    int noVueltas;
    LocalDate fechaDeLaCarrera;
    Equipo[] equiposAcompetir; //Podemos usar una lista enlazada para almacenarlos
    
    //Constructores

    public Carrera() {
    }

    public Carrera(Pista pista, int noVueltas) {
        this.pista = pista;
        this.noVueltas = noVueltas;
    }
    
    //Métodos de acceso

    public Pista getPista() {
        return pista;
    }

    public void setPista(Pista pista) {
        this.pista = pista;
    }

    public int getNoVueltas() {
        return noVueltas;
    }

    public void setNoVueltas(int noVueltas) {
        this.noVueltas = noVueltas;
    }

    public LocalDate getFechaDeLaCarrera() {
        return fechaDeLaCarrera;
    }

    public void setFechaDeLaCarrera(LocalDate fechaDeLaCarrera) {
        this.fechaDeLaCarrera = fechaDeLaCarrera;
    }

    public Equipo[] getEquiposAcompetir() {
        return equiposAcompetir;
    }

    public void setEquiposAcompetir(Equipo[] equiposAcompetir) {
        this.equiposAcompetir = equiposAcompetir;
    }
    
}
