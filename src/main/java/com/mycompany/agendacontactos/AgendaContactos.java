/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.agendacontactos;

import javax.swing.JOptionPane;

/**
 *
 * @author WORKING
 */
public class AgendaContactos {

    public static void main(String[] args) {
        int opcion = 0, borrar = 0;
        String nombre;
        Contacto contacto = new Contacto();
        JOptionPane.showMessageDialog(null, "     Agenda Contactos");
        do{
         opcion=Integer.parseInt(JOptionPane.showInputDialog(null, "¿Qué desea realizar?\n  1.  Agregar Contacto\n  2.  Buscar Contacto\n  3.  Eliminar Contacto\n  4.  Mostrar lista de contacto\n 5.  Salir"));
         switch(opcion){
             case 1: 
                 Contacto.agregar();
                 break;
             case 2: nombre= JOptionPane.showInputDialog("Nombre del contacto que desea buscar: ");
                 JOptionPane.showMessageDialog(null, contacto.mostrarContacto(nombre));
                break;
             case 3: nombre= JOptionPane.showInputDialog("Nombre del contacto que desea eliminar: ");
             JOptionPane.showMessageDialog(null, contacto.mostrarContacto(nombre));
             borrar = Integer.parseInt(JOptionPane.showInputDialog("Confirma la eliminacion 1=si, 2=no"));
             contacto.borrar(borrar, nombre);
             break;
             case 4: Contacto.lista();
             break;
             case 5: JOptionPane.showMessageDialog(null, "HASTA LA PROXIMA...");
             break;
             default: JOptionPane.showMessageDialog(null, "DIGITE UNA OPCION VALIDA");
         }
        }while(opcion != 5);
    }
}
