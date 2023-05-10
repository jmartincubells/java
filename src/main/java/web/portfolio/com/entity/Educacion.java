package web.portfolio.com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Educacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    //Atributos 
    private String imagen;
    private String institucion;

    private String inicio;
    private String fin;
    private String especialidad;
    private String estado;

    //Constructores
    public Educacion() {
    }

    public Educacion(String imagen, String institucion, String inicio, String fin, String especialidad, String estado) {
        this.institucion = institucion;
        this.inicio = inicio;
        this.fin = fin;
        this.especialidad = especialidad;
        this.estado = estado;
        this.imagen = imagen;
    }

    //Getters y Setters
    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getFin() {
        return fin;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
