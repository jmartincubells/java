package web.portfolio.com.entity;
//ctrl + shift + i

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity

public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nombre;

    private String apellido;

    private int edad;

    private String domicilio;
    private String barrio;
    private String disponibilidad;

    private String fechanacimiento;
    private String contacto;
    private String banner;
    private String info;
    private String nivel;
    

    private String titulo;

    @Lob
    private String email;

    private String password;

    //alt + insert
    public Persona() {
    }

    public Persona(int id,String nivel, String info, String domicilio, String barrio,String disponibilidad,String fechanacimiento, String contacto, String nombre, String apellido, int edad, String banner, String titulo, String email, String password) {
        this.id = id;
        this.domicilio = domicilio;
        this.barrio = barrio;
        this.disponibilidad = disponibilidad;
        this.fechanacimiento = fechanacimiento;
        this.contacto = contacto;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.banner = banner;
        this.titulo = titulo;
        this.email = email;
        this.password = password;
        this.info = info;
        this.nivel = nivel;
        
    }
    
    //Getters y Setters
    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getNivel() {
        return nivel;
    }

    
    public void setNivel(String nivel) {    
        this.nivel = nivel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }


    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    public String getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(String fechanacimiento) {
        this.fechanacimiento= fechanacimiento;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
