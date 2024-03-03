/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entidadFinanciera;

/**
 * La clase CCuenta representa una cuenta bancaria.
 * @author manur
 */
public class CCuenta {
   
    /**
     * Método apara obtener el nombre del titular de la cuenta.
     * @return El nombre del titular de la cuenta.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para estrablecer el nombre del titular de la cuenta.
     * @param nombre El nombre del titular de la cuenta.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para obtener el número de cuenta.
     * @return El número de la cuenta.
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Método para establecer el número de la cuenta.
     * @param cuenta El número de la cuenta.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Método para obtener el saldo actual de la cuenta.
     * @return Saldo actual de la cuenta,
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Método para establecer el saldo actual de la cuenta.
     * @param saldo Saldo actual de la cuenta.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Método para obtener el tipo de interés de la cuenta.
     * @return El tipo de interés de la cuenta.
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Método para establecer el tipo de interés de la cuenta.
     * @param tipoInterés El tipo de interés de la cuenta.
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * Nombre de la persona titular.
     */
    private String nombre;
    /**
     * Número de la cuenta.
     */
    private String cuenta;
    /**
     * Saldo actual de la cuenta.
     */
    private double saldo;
    /**
     * Tipo de interés de la cuenta.
     */
    private double tipoInterés;
    
    /**
     * Constructor por defecto de la CCuenta.
     */
    public CCuenta()
    {
    }
    
    /**
     * Constructor con parametros.
     * @param nom Nombre del titular de la cuenta.
     * @param cue Número de cuenta.
     * @param sal Saldo inicial de la cuenta.
     * @param tipo Tipo de interés de la cuenta.
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInterés=tipo;
    }
    /**
     * Obtiene el saldo de la cuenta.
     * @return El saldo actual de la cuenta.
     */
    public double estado(){
        return this.getSaldo();
    }
    /**
     * Añade una cantidad al saldo actual, en caso de saldo negativo se lanzará una excepción.
     * @param cantidad La cantidad a ingresar.
     * @throws Exception Si la cantidad es negativa.
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception(ERRORCANTIDADNEGATIVA);
        setSaldo(getSaldo() + cantidad);
    }
    private static final String ERRORCANTIDADNEGATIVA = "No se puede ingresar una cantidad negativa";
    /**
     * Retira una cantidad al saldo actual, es caso de cantidad o saldo negativo se lanzará una excepción.
     * @param cantidad La cantidad a retirar.
     * @throws Exception Si la cantidad es negativa o no hay suficiente saldo.
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (getSaldo() < cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}


    
   