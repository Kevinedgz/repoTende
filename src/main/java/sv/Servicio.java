/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv;

import java.util.HashMap;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author LENOVO
 */
@WebService(serviceName = "Servicio")
public class Servicio {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
   @WebMethod(operationName = "Potencia")
    public Double Potencia(@WebParam(name = "Base") Double Base, @WebParam(name = "Exponente") Double Exponente) {
        double valor = Math.pow(Base, Exponente);

        return valor;
    }

    @WebMethod(operationName = "Par_Impar")
    public String Par_Impar(@WebParam(name = "parametro") int parametro) {
        //TODO write your implementation code here:
        String valor1 = "par";
        String valor2 = "impar";
        if (parametro % 2 == 0) {
            return valor1;
        } else {
            return valor2;

        }
    }
  String mensaje = "";

    @WebMethod(operationName = "Diccionario")
    public String Diccionario(@WebParam(name = "Palabra") String Palabra) {
        try {

      
                HashMap<String, String> Palabras = new HashMap<>();
                Palabras.put("Bicicleta","Medio de transporte ocupa dos ruedas y no tiene motor");
                Palabras.put("Leche", "Extracto de la vaca");
                Palabras.put("GlasFish", "Servidor usado en java.");
                Palabras.put("Hola", "Saludo o expresion de bienvenida.");
                Palabras.put("Perro", "Mascota conocida como mejor amigo del hombre.");
                Palabras.put("Futbol", "Deporte que se paractica con los pies");
                
                boolean res = Palabras.containsKey(Palabra);
                if (res == true) {
                    String significado = Palabras.get(Palabra);
                    mensaje = Palabra + ": " + significado;
                }
        } catch (Exception e) {
            mensaje = "Ingrese una palabra";
        }

        return mensaje;
    }
}
