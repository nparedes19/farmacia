/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.farmaciaproyecto.modelo;

/**
 *
 * @author nparedes
 */
public class Pedido {
    private String nombreMedicamento;
    private String tipoMedicamento;
    private int cantidad;
    private String distribuidor;
    private boolean sucursalPrincipal;
    private boolean sucursalSecundaria;
    
    public Pedido(String nombreMedicamento, String tipoMedicamento, int cantidad,
                  String distribuidor, boolean sucursalPrincipal, boolean sucursalSecundaria) {
        this.nombreMedicamento = nombreMedicamento;
        this.tipoMedicamento = tipoMedicamento;
        this.cantidad = cantidad;
        this.distribuidor = distribuidor;
        this.sucursalPrincipal = sucursalPrincipal;
        this.sucursalSecundaria = sucursalSecundaria;
        
    }
        
    public String getResumenPedido() {
        StringBuilder resumen = new StringBuilder();
        resumen.append(cantidad).append(" unidades del ").append(tipoMedicamento)
               .append(" ").append(nombreMedicamento);

        resumen.append("Para la farmacia situada en ");
        if (sucursalPrincipal) resumen.append("Calle de la Rosa n.28 ");
        if (sucursalPrincipal && sucursalSecundaria) resumen.append("y ");
        if (sucursalSecundaria) resumen.append("Calle Alcazabilla n.3");

        return resumen.toString();
    }
}

