package model;

import java.util.ArrayList;
import java.util.List;

//Atributos de Reserva
public class Reserva {
    public int codReserva;
    public String fechaRealizacion, fechaEntrada, fechaSalida;
    public String estadoReserva;
    public String metodoPago;
    public double valorTotal;
    public String habitacionReservada;
    public String serviosAdicionales;
    public int estadia;

    //Relaciones de la clase Reserva
    private List<Habitacion> listReservaHabitacion;
    private List<AdicionalServicio> listReservaAdicionalServicio;
    private List<Huesped> listReservaHuesped;


    /**
     * Metodo constructor de la Reserva
     * @param codReserva de la Reserva
     * @param fechaRealizacion de la Reserva
     * @param fechaEntrada de la Reserva
     * @param fechaSalida de la Reserva
     * @param estadoReserva de la Reserva
     * @param metodoPago de la Reserva
     * @param valorTotal de la Reserva
     * @param habitacionReservada de la Reserva
     * @param serviosAdicionales de la Reserva
     * @param estadia de la Reserva
     */
    public Reserva(int codReserva,String fechaRealizacion,String fechaEntrada,String fechaSalida,String estadoReserva,String metodoPago, double valorTotal,String habitacionReservada,String serviosAdicionales,int estadia){
        this.codReserva = codReserva;
        this.fechaRealizacion = fechaRealizacion;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.estadoReserva = estadoReserva;
        this.metodoPago = metodoPago;
        this.valorTotal = valorTotal;
        this.habitacionReservada = habitacionReservada;
        this.serviosAdicionales = serviosAdicionales;
        this.estadia = estadia;

        this.listReservaHuesped = new ArrayList<>();
        this.listReservaHabitacion = new ArrayList<>();
        this.listReservaAdicionalServicio = new ArrayList<>();
    }

}

