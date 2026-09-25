import model.Hotel;
import model.Huesped;

import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{
    public static void main(String[] args) {
//Prueba
        Hotel hotel = new Hotel("StayPlus", 90182, "StayPlus@gmail.com", "StayPlusHotel.com.co", 0, 0, 0, 0, "True");

        int opcion = 0;
        while (opcion != 7) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, """
                    MENÚ HOTEL STAYPLAY
                    1. Registrarse como huesped
                    2. Buscar un huesped
                    3. Hacer una reserva
                    4. Mostrar información del Hotel
                    5. ¿Tu numero es perfecto?
                    6. Añadir servicios a tu reservacion
                    7. Salir
                    Seleccione una opción:
                    """));
            if (opcion == 1) {
                String nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre");
                int telefono = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su telefono"));
                String correo = JOptionPane.showInputDialog(null, "Ingrese su correo electronico");
                String pais = JOptionPane.showInputDialog(null, "Ingrese su pais de procedencia");
                int documento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su documento"));
                hotel.registrarHuesped(nombre, documento, telefono, correo, pais);
            }else if (opcion == 2) {
                int documento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del documento registrado:"));
                Huesped huesped = hotel.buscarHuesped(documento);
                if (huesped != null) {
                    JOptionPane.showMessageDialog(null, "Huesped encontrado:\n" + huesped.toString());
                } else {
                    JOptionPane.showMessageDialog(null, "El huesped no existe");
                }else if(opcion == 3){
                int codReserva = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un codigo"));
                int fechaRealizacion = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la fecha de Realizacion"));
                int fechaEntrada = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la fecha de Entrada"));
                int fechaSalida = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la fecha de Salida"));
                String metodoPago = JOptionPane.showInputDialog(null, "Ingrese su medio de pago (Efectivo, tarjeta o transferencia)");
                int serAdicional = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Desea algun cervio adicional?(1 Restaurante, 2 Lavanderia, 3 Transporte, 4 Servicio a la habitacion)"));
                int habitacionReservada = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccione el tipo de habitacion (1 individual, 2 Doble, 3 Suit"));
                hotel.registarReserva(codReserva,fechaRealizacion,fechaEntrada,fechaSalida,metodoPago,habitacionReservada,serAdicional);
                }else if (opcion == 4) {
                    int codReserva = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo con el que registro su reserva:"));
                    Reserva reserva = hotel.buscarReserva(codReserva);
                 if (reserva != null) {
                     JOptionPane.showMessageDialog(null, "Reserva encontrada:\n" + reserva.toString());
            }else {
                     JOptionPane.showMessageDialog(null, "La reserva no existe");
                 }
            }
        }
    }
}

            }
        }
    }
}
