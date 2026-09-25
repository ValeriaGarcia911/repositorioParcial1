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
                }
            }
        }
    }
}
