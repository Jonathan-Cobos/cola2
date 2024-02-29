/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package co.edu.unipiloto.estdatos20241.listas.pila;

/**
 *
 * @author sg701-21
 */
public class ColaMein {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ColaDoble<String> cola = new ColaDoble<>();
        System.out.println("La cola esta vacia? " + cola.isEmpty());
        System.out.println("El tamaño es " + cola.size());
        cola.adqueue("marte");
        cola.adqueue("Tierra");

        System.out.println("La cola esta vacia? " + cola.isEmpty());
        System.out.println("El tamaño " + cola.size());

        for (String s : cola) {
            System.out.println(s.toString());
        }
        //eliminamos el ultimo    
        System.out.println("Se elimino toda la cola" + cola.dequeue2());
        for (String s : cola) {
            System.out.println(s.toString());
        }
        //revisa si esta llena o no 
        System.out.println("Se atendio a  " + cola.dequeue());
        for (String s : cola) {
            System.out.println(s.toString());
        }
        //adicionamos 
        cola.adqueue("luna");
        cola.adqueue("saturno");
        cola.adqueue("jupiter");
        cola.adqueue("neptuno");
        System.out.println("La cola esta vacia? " + cola.isEmpty());
        System.out.println("El tamaño " + cola.size());

        for (String s : cola) {
            System.out.println(s.toString());
        }
        //eliminamos el primero 
        System.out.println("Se atendio a  " + cola.dequeue());
        for (String s : cola) {
            System.out.println(s.toString());
        }

    }
}
