/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.farmaciaproyecto.controlador;
import com.mycompany.farmaciaproyecto.modelo.Pedido;

/**
 *
 * @author nparedes
 */
public class ControladorPedido {
    public String validarDatosPedido(String nombre, String tipo, String cantidadStr, String distribuidor, boolean principal, boolean secundaria){
        if (nombre == null || nombre.trim().isEmpty()) {
            return "Por favor escriba el nombre del medicamento";
        }
        
        if (!nombre.matches("[a-zA-Z0-9 ]+")) {
            return "El nombre del medicamento debe contener solo caracteres alfanuméricos.";
        }

        if (tipo.equals("Seleccionar")) {
            return "Por favor seleccionar un tipo de medicamento.";
        }
        
        if (cantidadStr == null || cantidadStr.trim().isEmpty()) {
            return "Por favor ingrese una cantidad";
        }
        
        int cantidad;
        try {
            cantidad = Integer.parseInt(cantidadStr);
            if (cantidad <= 0) {
                return "Por favor ingresar un entero positivo.";
            }
        } catch (NumberFormatException e) {
            return "La cantidad debe ser un número válido.";
        }
        
        if (cantidad <= 0) {
                return "Por favor ingresar un entero positivo.";
        }
        
        
        if(distribuidor.isEmpty()){
            return "Por favor seleccionar un distribuidor";
        }
        
        if(!principal&&!secundaria){
            return "Por favor seleccione almenos una farmacia";
        }
        
        return "Pedido verificado";
        
    }
                

}
