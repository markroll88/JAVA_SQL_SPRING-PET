package conexion;

import java.sql.Date;

//representacion de la tabla de la base de datos
public class Clientes {
    Integer id;
    String nombre;
    String apellido;
    String mascota;
    String edad;
    Date fecha_nacimiento;
    String alimento;
    Integer telefono;
    String email;
    String usuario;
    String clave;

    public Clientes() {

    }

    public Clientes(Integer id, String nombre, String apellido, String mascota, String edad,  String fecha_nacimiento, String alimento, Integer telefono, String email, String usuario, String clave) {

        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.mascota = mascota;
        this.mascota = edad;
        this.fecha_nacimiento = Date.valueOf(fecha_nacimiento);
        this.alimento = alimento;
        this.telefono = telefono;
        this.email = email;
        this.usuario = usuario;
        this.clave = clave;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomre() {
        return nombre;
    }

    public void setNomre(String nomre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getMascota() {
        return mascota;
    }

    public void setMascota(String mascota) {
        this.mascota = mascota;
    }


    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = Date.valueOf(fecha_nacimiento);
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
}
