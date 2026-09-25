package model;

import java.util.ArrayList;
import java.util.List;

//Atributos del Hotel
public class Hotel{
    public String nombre;
    public int nIT;
    public String paginaWeb;
    public int numHuesped, numReserva, numHabitacion;

    //Relaciones de la clase Hotel
    private List<Huesped> listHotelHuesped;
    private List<Reserva> listHotelReserva;
    private List<Habitacion> listHotelHabitacion;

    /**
     * Metodo constructor del Hotel
     *
     * @param nombre          del Hotel
     * @param nIT             del Hotel
     * @param correo          del Hotel
     * @param paginaWeb       del Hotel
     * @param numHuesped      del Hotel
     * @param numReserva      del Hotel
     * @param numHabitacion   del Hotel
     */

    public Hotel(String nombre, int nIT, String paginaWeb, String direccion, int telefono, List<Huesped> listHotelHuesped, List<Reserva> listHotelReserva, List<Habitacion> listHotelHabitacion, List<AdicionalServicio> listHotelAdicionalServicio) {
        this.nombre = nombre;
        this.nIT = nIT;
        this.paginaWeb = paginaWeb;
        this.numHuesped = numHuesped;
        this.numReserva = numReserva;
        this.numHabitacion = numHabitacion;

        this.listHotelHuesped = new ArrayList<>();
        this.listHotelReserva = new ArrayList<>();
        this.listHotelHabitacion = new ArrayList<>();
    }

    /**
     * Metodo para registarar un nuevo huesped
     *
     * @param nombre    del nuevo huesped
     * @param documento del nuevo huesped
     * @param telefono  del nuevo huesped
     * @param correo    del nuevo huesped
     * @param pais      del nuevo huesped
     */
    public String registrarHuesped(String nombre, int documento, int telefono, String correo, String pais){
        String registrado = "";
        Huesped huesped = buscarHuesped(documento);
        if(huesped == null){
            Huesped huesped1 = new Huesped(nombre, documento, telefono, correo, pais);
            listHotelHuesped.add(huesped1);
            registrado = "El Huesped de nombre" + nombre + "Fue añadido exitosamente";
        }else {
            registrado = "El Huesped de nombre" + nombre + "Ya esta registrado";
        }
        return registrado;
    }

    /**
     * Metodo para hacer una reserva
     *
     * @param codReserva          para hacer una reserva
     * @param fechaRealizacion    para hacer una reserva
     * @param fechaEntrada        para hacer una reserva
     * @param fechaSalida         para hacer una reserva
     * @param metodoPago          para hacer una reserva
     * @param habitacionReservada para hacer una reserva
     * @param serAdicional para hacer una reserva
     * @return
     */
    public String registarReserva(int codReserva, int fechaRealizacion, int fechaEntrada, int fechaSalida, String metodoPago, int habitacionReservada, int serAdicional){
        String registro = "";
        Reserva reserva = buscarReserva(codReserva);
        if (reserva == null){
            Reserva res1 = new Reserva(codReserva,fechaRealizacion,fechaEntrada,fechaSalida,metodoPago,habitacionReservada, serAdicional);
            listHotelReserva.add(res1);
            registro = "La reserva de codigo" + codReserva + "Fue añadido exitosamente";
        }else{
            registro = "La reserva con el codigo" + codReserva + "Ya existe, intenta otro codigo";
        }
        return registro;
    }

    /**
     * Metodo que permite encontrar a un Huesped registrado
     * @param documento del huesped a encontrar
     * @return
     */
    public Huesped buscarHuesped(int documento){
        Huesped encontrado = null;
        for(int i = 0; i < listHotelHuesped.size(); i++) {
            Huesped huesped = listHotelHuesped.get(i);
            if (huesped.getDocumento() == documento) {
                encontrado = huesped;
                break;
            }
        }
        return encontrado;
    }

    /**
     * Metodo para buscar una reserva
     * @param codReserva para buscar una reserva
     * @return
     */
    public  Reserva buscarReserva(int codReserva){
        Reserva encontrar = null;
        for(int i = 0; i < listHotelReserva.size();i++){
            Reserva reserva = listHotelReserva.get(i);
            if (reserva.getCodReserva() == codReserva){
                encontrar = reserva;
                break;
            }

        }
        return encontrar;
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
    }
}

