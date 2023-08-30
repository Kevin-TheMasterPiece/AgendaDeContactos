/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agendacontactos;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
/**
 *
 * @author WORKING
 */
public class Contacto {
    private String nombre;
    private int num;
    private static ArrayList<Contacto> contacto = new ArrayList();

    public Contacto() {
    }

    public Contacto(String nombre, int num) {
        this.nombre = nombre;
        this.num = num;
        contacto.add(this);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public static ArrayList<Contacto> getContacto() {
        return contacto;
    }

    public static void setContacto(ArrayList<Contacto> contacto) {
        Contacto.contacto = contacto;
    }
    
    
    public String mostrarContacto (String nombre){
        String contacto = "";    
        for (int i = 0; i < Contacto.contacto.size(); i++) {
        Contacto contactoActual = Contacto.contacto.get(i);
            if (contactoActual.getNombre().equalsIgnoreCase(nombre)) {
                contacto+="INFORMACION DEL CONTACTO:"+"\n NOMBRE: "+contactoActual.getNombre()+"\nNUMERO: "+contactoActual.getNum();
                break;
            }
         }
       return contacto;
    }
    public String borrar (int opcion, String nombre){
        
        for (int i = 0; i < contacto.size(); i++) {
        Contacto contactoActual = contacto.get(i);
            if (contactoActual.getNombre().equalsIgnoreCase(nombre)) {
                if(opcion == 1){
                contacto.remove(i);
                break;
                }else{
                    JOptionPane.showMessageDialog(null,"Contacto NO eliminado");
                }
            }
         }
        return "CONTACTO ELIMINADO";
    }
    public static void agregar(){
        String nombre; 
        int numero;
        nombre = JOptionPane.showInputDialog("Nombre del contacto: ");
        numero = Integer.parseInt(JOptionPane.showInputDialog("Numero de contacto: : "));
        Contacto c = new Contacto(nombre, numero);
    }
    public static void lista(){
        Iterator it = contacto.iterator();
            while ( it.hasNext() ) { 
                Object objeto = it.next(); 
                Contacto co = (Contacto)objeto; 
                System.out.println("\tNombre: "+co.getNombre()+"\t Contacto:"+co.getNum());
            } 
        System.out.println(" Agenda con " + contacto.size() +" contactos");
    }
}