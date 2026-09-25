package model;

import java.util.ArrayList;
import java.util.List;

//Atributos del Hotel
public class Hotel{
    public String nombre;
    public int nIT;
    public String correo;
    public String paginaWeb;
    private int ganancia;
    private int numHuesped, numReserva, numHabitacion;
    private String servioAdicional;

    //Relaciones de la clase Hotel
    private List<Huesped> listHotelHuesped;
    private List<Reserva> listHotelReserva;
    private List<Habitacion> listHotelHabitacion;
    private List<AdicionalServicio> listHotelAdicionalServicio;


    /**
     * Metodo constructor del Hotel
     *
     * @param nombre          del Hotel
     * @param nIT             del Hotel
     * @param correo          del Hotel
     * @param paginaWeb       del Hotel
     * @param ganancia        del Hotel
     * @param numHuesped      del Hotel
     * @param numReserva      del Hotel
     * @param numHabitacion   del Hotel
     * @param servioAdicional del Hotel
     */
    public Hotel(String nombre, int nIT, String correo, String paginaWeb, int ganancia, int numHuesped, int numReserva, int numHabitacion, String servioAdicional) {
        this.nombre = nombre;
        this.nIT = nIT;
        this.correo = correo;
        this.paginaWeb = paginaWeb;
        this.ganancia = ganancia;
        this.numHuesped = numHuesped;
        this.numReserva = numReserva;
        this.numHabitacion = numHabitacion;
        this.servioAdicional = servioAdicional;

        this.listHotelHuesped = new ArrayList<>();
        this.listHotelReserva = new ArrayList<>();
        this.listHotelHabitacion = new ArrayList<>();
        this.listHotelAdicionalServicio = new ArrayList<>();
    }

    /**
     * Metodo para registarar un nuevo huesped
     *
     * @param nombre    del nuevo huesped
     * @param documento del nuevo huesped
     * @param telefono  del nuevo huesped
     * @param correo    del nuevo huesped
     * @param pais      del nuevo huesped
     * @return
     */
    public String registrarHuesped(String nombre, int documento, int telefono, String correo, String pais) {
        String registrado = "";
        Huesped huesped = buscarHuesped(documento);
        if (huesped == null) {
            Huesped huesped1 = new Huesped(nombre, documento, telefono, correo, pais);
            listHotelHuesped.add(huesped1);
            registrado = "El Huesped de nombre" + nombre + "Fue añadido exitosamente";
        } else {
            registrado = "El Huesped de nombre" + nombre + "Ya esta registrado";
        }
        return registrado;
    }

    /**
     * Metodo que permite encontrar a un Huesped registrado
     *
     * @param documento del huesped a encontrar
     * @return
     */
    public Huesped buscarHuesped(int documento) {
        Huesped encontrado = null;
        for (int i = 0; i < listHotelHuesped.size(); i++) {
            Huesped huesped = listHotelHuesped.get(i);
            if (huesped.getDocumento() == documento) {
                encontrado = huesped;
                break;
            }
        }
        return encontrado;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "nIT=" + nIT +
                ", nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", paginaWeb='" + paginaWeb + '\'' +
                '}';
    }
}

