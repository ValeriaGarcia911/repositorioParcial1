package model;

import java.util.List;

//Atributos de Huesped
public class Huesped {
    public String nombre;
    public int documento;
    public int telefono;
    public String correo;
    public String pais;


    //Relaciones de la clase Huesped
    private List<Habitacion> listHuespedHabitacion;

    /**
     * Metodo contructor del Huesped
     * @param nombre del Huesped
     * @param documento del Huesped
     * @param telefono del Huesped
     * @param correo del Huesped
     * @param pais del Huesped
     */
    public Huesped(String nombre,int documento,int telefono,String correo,String pais){
        this.nombre = nombre;
        this.documento = documento;
        this.telefono = telefono;
        this.correo = correo;
        this.pais = pais;

    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int getDocumento() {
        return documento;
    }
    public void setDocumento(int documento){
        this.documento = documento;
    }
    public int getTelefono() {
        return telefono;
    }
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreoe(String correo){
        this.correo = correo;
    }
    public String getPais() {
        return pais;
    }
    public void setPais(String pais){
        this.pais = pais;
    }

    public String toString(){
        return "Huesped{" +
                " nombre ='" + nombre + '\'' +
                ", documento ='" + documento + '\'' +
                ", telefono ='" + telefono + '\'' +
                ", correo ='" + correo + '\'' +
                ", pais  ='" + pais + '\'' +
                '}';
    }
}


