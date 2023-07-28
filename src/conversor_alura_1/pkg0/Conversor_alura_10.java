/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXSwingMain.java to edit this template
 */
package conversor_alura_1.pkg0;

import javax.swing.JOptionPane;

/**
 *
 * @author gguri
 */
public class Conversor_alura_10 {

    public static void main(String[] args) {
        String[] opciones = {"Convertir moneda", "Convertir temperatura", "Salir"};

        int seleccion = JOptionPane.showOptionDialog(null, "Selecciona una opción", "Menú",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);

        while (seleccion != 2) {
            if (seleccion == 0) {
                convertirMoneda();
            } else if (seleccion == 1) {
                convertirTemperatura();
            } else {
                JOptionPane.showMessageDialog(null, "Opción inválida", "Error", JOptionPane.ERROR_MESSAGE);
            }

            seleccion = JOptionPane.showOptionDialog(null, "Selecciona una opción", "Menú",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
        }
    }

    public static void convertirMoneda() {

        double cantidad = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir:"));

        String[] opciones = {"Pesos Colombianos a Dólar", "Pesos Colombianos a Euro", "Pesos Colombianos a Libra",
            "Pesos Colombianos a Yen", "Pesos Colombianos a Won Coreano", "Dólar a Pesos Colombianos",
            "Euro a Pesos Colombianos", "Libra a Pesos Colombianos", "Salir"};

         String seleccion = (String) JOptionPane.showInputDialog(null, "Elije la moneda a la que deseas convertir tu dinero", "Monedas",
                 JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);

        while (seleccion != "Salir") {
            switch (seleccion) {
                case "Pesos Colombianos a Dólar":
                    pesosACambio("Dólar", 0.00025, cantidad);
                    break;
                case "Pesos Colombianos a Euro":
                    pesosACambio("Euro", 0.00023, cantidad);
                    break;
                case "Pesos Colombianos a Libra":
                    pesosACambio("Libra", 0.00020, cantidad);
                    break;
                case "Pesos Colombianos a Yen":
                    pesosACambio("Yen", 0.035, cantidad);
                    break;
                case "Pesos Colombianos a Won Coreano":
                    pesosACambio("Won Coreano", 0.32, cantidad);
                    break;
                case "Dólar a Pesos Colombianos":
                    cambioAPesos("Dólar", 3956.0, cantidad);
                    break;
                case "Euro a Pesos Colombianos":
                    cambioAPesos("Euro", 4452.0, cantidad);
                    break;
                case "Libra a Pesos Colombianos":
                    cambioAPesos("Libra", 5059.49, cantidad);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida", "Error", JOptionPane.ERROR_MESSAGE);
                    break;
            }

            seleccion =  (String) JOptionPane.showInputDialog(null, "Selecciona una opción de conversión", "Menú",
                 JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);}
    }

    public static void pesosACambio(String moneda, double tasa, double pesos) {

        double resultado = pesos * tasa;

        JOptionPane.showMessageDialog(null, pesos + " pesos colombianos equivale(n) a " + resultado + " " + moneda,
                "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void cambioAPesos(String moneda, double tasa, double cantidad) {

        double resultado = cantidad * tasa;

        JOptionPane.showMessageDialog(null, cantidad + " " + moneda + " equivale(n) a " + resultado + " pesos colombianos",
                "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void convertirTemperatura() {
        String[] opcionesTemperatura = {"Celsius a Fahrenheit", "Fahrenheit a Celsius"};

        String seleccionTemperatura = (String) JOptionPane.showInputDialog(null,
                "Selecciona una conversión de temperatura", "Convertir Temperatura", JOptionPane.PLAIN_MESSAGE, null,
                opcionesTemperatura, opcionesTemperatura[0]);

        if (seleccionTemperatura == null) {
            return; // El usuario cerró la ventana o canceló la selección
        }

        double temperatura = Double.parseDouble(JOptionPane.showInputDialog("Introduce la temperatura a convertir:"));

        double resultado;

        switch (seleccionTemperatura) {
            case "Celsius a Fahrenheit":
                resultado = (temperatura * 9 / 5) + 32; // Conversión de Celsius a Fahrenheit
                JOptionPane.showMessageDialog(null,
                        temperatura + " grados Celsius equivale(n) a " + resultado + " grados Fahrenheit", "Resultado",
                        JOptionPane.INFORMATION_MESSAGE);
                break;
            case "Fahrenheit a Celsius":
                resultado = (temperatura - 32) * 5 / 9; // Conversión de Fahrenheit a Celsius
                JOptionPane.showMessageDialog(null,
                        temperatura + " grados Fahrenheit equivale(n) a " + resultado + " grados Celsius", "Resultado",
                        JOptionPane.INFORMATION_MESSAGE);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción inválida", "Error", JOptionPane.ERROR_MESSAGE);
                break;
        }
    }
}
