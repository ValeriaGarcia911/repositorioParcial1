package model;

import java.util.ArrayList;
import java.util.List;

//Atributos del Hotel
public class Hotel{
    public String nombre;
    public int nIT;
    public String paginaWeb;
    public String direccion;
    public int telefono;



    //Relaciones de la clase Hotel
    private List<Huesped> listHotelHuesped;
    private List<Reserva> listHotelReserva;
    private List<Habitacion> listHotelHabitacion;
    private List<AdicionalServicio> listHotelAdicionalServicio;

    /**
     * constructor de la clase Hotel
     * @param nombre
     * @param nIT
     * @param paginaWeb
     * @param direccion
     * @param telefono
     * @param listHotelHuesped
     * @param listHotelReserva
     * @param listHotelHabitacion
     * @param listHotelAdicionalServicio
     */

    public Hotel(String nombre, int nIT, String paginaWeb, String direccion, int telefono, List<Huesped> listHotelHuesped, List<Reserva> listHotelReserva, List<Habitacion> listHotelHabitacion, List<AdicionalServicio> listHotelAdicionalServicio) {
        this.nombre = nombre;
        this.nIT = nIT;
        this.paginaWeb = paginaWeb;
        this.direccion = direccion;
        this.telefono = telefono;
        this.listHotelHuesped = listHotelHuesped;
        this.listHotelReserva = listHotelReserva;
        this.listHotelHabitacion = listHotelHabitacion;
        this.listHotelAdicionalServicio = listHotelAdicionalServicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getnIT() {
        return nIT;
    }

    public void setnIT(int nIT) {
        this.nIT = nIT;
    }

    public String getPaginaWeb() {
        return paginaWeb;
    }

    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public List<Huesped> getListHotelHuesped() {
        return listHotelHuesped;
    }

    public void setListHotelHuesped(List<Huesped> listHotelHuesped) {
        this.listHotelHuesped = listHotelHuesped;
    }

    public List<Reserva> getListHotelReserva() {
        return listHotelReserva;
    }

    public void setListHotelReserva(List<Reserva> listHotelReserva) {
        this.listHotelReserva = listHotelReserva;
    }

    public List<Habitacion> getListHotelHabitacion() {
        return listHotelHabitacion;
    }

    public void setListHotelHabitacion(List<Habitacion> listHotelHabitacion) {
        this.listHotelHabitacion = listHotelHabitacion;
    }

    public List<AdicionalServicio> getListHotelAdicionalServicio() {
        return listHotelAdicionalServicio;
    }

    public void setListHotelAdicionalServicio(List<AdicionalServicio> listHotelAdicionalServicio) {
        this.listHotelAdicionalServicio = listHotelAdicionalServicio;
    }


    /**
     * Metodo para registrar un nuevo huesped
     * @param nombre
     * @param documento
     * @param telefono
     * @param correo
     * @param pais
     * @return
     */
    public String registrarHuesped(String nombre, int documento, int telefono, String correo, String pais) {
        String registrado;
        Huesped huesped = buscarHuesped(documento);
        if (huesped == null) {
            listHotelHuesped.add(new Huesped(nombre, documento, telefono, correo, pais));
            registrado = "El Huesped de nombre " + nombre + " fue añadido exitosamente";
        } else {
            registrado = "El Huesped de nombre " + nombre + " ya esta registrado";
        }
        return registrado;
    }

    /**
     * Metodo que permite encontrar a un Huesped registrado
     * @param documento
     * @return
     */
    public Huesped buscarHuesped(int documento) {
        for (Huesped huesped : listHotelHuesped) {
            if (huesped.getDocumento() == documento) {
                return huesped;
            }
        }
        return null;
    }

    /**
     * Elimina un huesped registrado, si existe.
     * @param documento
     * @return
     */
    public boolean eliminarHuesped(int documento) {
        Huesped huesped = buscarHuesped(documento);
        if (huesped != null) {
            listHotelHuesped.remove(huesped);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "nombre='" + nombre + '\'' +
                ", nit=" + nit +
                ", paginaWeb='" + paginaWeb + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono=" + telefono +
                ", listhotelHuesped=" + listhotelHuesped +
                ", listhotelReserva=" + listhotelReserva +
                ", listhotelHabitacion=" + listhotelHabitacion +
                ", listHotelAdicionalServicio=" + listHotelAdicionalServicio +
                '}';
    }

}

