/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author pc
 */
public class Persona {

    private String Nombres;
    private String Apellidos;
    private String Direccion;
    private int Edad;
    private double Peso;
    private double Estatura;

    public Persona(String Nombres, String Apellidos, String Direccion, int Edad, double Peso, double Estatura) {
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Direccion = Direccion;
        this.Edad = Edad;
        this.Peso = Peso;
        this.Estatura = Estatura;
    }
    
    public Persona() {
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    public double getEstatura() {
        return Estatura;
    }

    public void setEstatura(double Estatura) {
        this.Estatura = Estatura;
    }

    public void mayorEdad(int edad) {
        if (edad >= 0 && edad < 18) {
            System.out.println("Menor de edad");
        } else if (edad >= 18) {
            System.out.println("Mayor de edad");
        } else {
            System.out.println("Error. La edad ingresada es incorrecta");
        }
    }

    public void mostrarDatos() {
        System.out.println("\t =========== Información =============");
        System.out.println("Nombre    : " + getNombres());
        System.out.println("Apellido  : " + getApellidos());
        System.out.println("Dirección : " + getDireccion());
        System.out.println("Edad      : " + getEdad() + " Años");
        System.out.println("Peso      : " + getPeso() + " Kg");
        System.out.println("Estatura  : " + getEstatura() + " metros");
    }

    public double Imc(double peso, double estatura) {
        double imc = peso / (estatura * estatura);
        return imc;
    }

}
