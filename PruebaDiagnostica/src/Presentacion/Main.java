/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Presentacion;

import Logica.LCliente;
import java.util.Scanner;

import Clases.Cliente;

/**
 *
 * @author UTPL
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada =new Scanner (System.in);
        String campo;
        Cliente objCliente = new Cliente();
        LCliente objLCliente = new LCliente();

        
        System.out.println("Ingrese su numero de cédula");      
        campo = entrada.nextLine();
        objCliente.setCedula(campo);
        
        System.out.println("Ingrese sus nombre");
        campo = entrada.nextLine();
        objCliente.setNombre(campo);
        
        System.out.println("Ingrese sus apellidos");
        campo = entrada.nextLine();
        objCliente.setApellidos(campo);
        
        if (objLCliente.ValidaCedula(objCliente))
            System.out.println(objCliente.toString());
        else
            System.out.println(objCliente.toString());
        
    }
    

}
