/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entidadFinanciera;


public class Main {

    public static void main(String[] args) {
        CCuenta objetoCuenta;
        double saldoActual;
        
        objetoCuenta = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = objetoCuenta.estado();
        System.out.println("El saldo actual es "+ saldoActual );  
        
        try {
            probarIngresar(objetoCuenta, 1000, 0);
            saldoActual = objetoCuenta.estado();
            System.out.println("El saldo despues de ingresar es " + saldoActual);
        } catch (Exception e) {
            System.out.println("Error al ingresar: " + e.getMessage());
        }

        try {
            probarRetirar(objetoCuenta, 500, 0); 
            saldoActual = objetoCuenta.estado();
            System.out.println("El saldo despues de retirar es " + saldoActual);
        } catch (Exception e) {
            System.out.println("Error al retirar: " + e.getMessage());
        }          
    }
    
    public static void probarIngresar(CCuenta c, int cantidad, int cantidadEsperada) throws Exception{
        c.ingresar(cantidad);       
    }
    
    public static void probarRetirar(CCuenta c, int cantidad, int cantidadEsperada) throws Exception{
        c.retirar(cantidad);
    }
}
