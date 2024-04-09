/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.util.regex.Pattern;
import Clases.Cliente;

/**
 * Clase para manejar la logica del cliente 
 * @author UTPL
 */
public class LCliente {
        public static boolean ValidaCedula(Cliente objCliente){
                String regex = "[0-9]+]";
                
                Pattern pattern = Pattern. compile(regex);
                
                return pattern.matcher(objCliente.getCedula()).matches();
    }
}
