/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author pc
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String Nombres = JOptionPane.showInputDialog("Ingrese el nombre");
        String Apellidos = JOptionPane.showInputDialog("Ingrese el apellido");
        String Direccion = JOptionPane.showInputDialog("Ingrese la direccion");
        int Edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"));
        double Peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso en Kilogramos"));
        double Estatura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la estatura en metros"));

        Persona Persona1 = new Persona(Nombres, Apellidos, Direccion, Edad, Peso, Estatura);

        System.out.println("\t =========== Información =============");
        System.out.println("Nombre    : " + Persona1.getNombres());
        System.out.println("Apellido  : " + Persona1.getApellidos());
        System.out.println("Dirección : " + Persona1.getDireccion());
        System.out.println("Edad      : " + Persona1.getEdad() + " Años");
        System.out.println("Peso      : " + Persona1.getPeso() + " Kg");
        System.out.println("Estatura  : " + Persona1.getEstatura() + " metros");
        Persona1.mayorEdad(Edad);
        if(Persona1.Imc(Peso, Estatura)>0 && Persona1.Imc(Peso, Estatura)<=18.4){
            System.out.println("El IMC es: " + Persona1.Imc(Peso, Estatura) + ". Insuficiencia ponderal");
        } 
        else if(Persona1.Imc(Peso, Estatura)>18.4 && Persona1.Imc(Peso, Estatura)<=24.9){
            System.out.println("El IMC es: " + Persona1.Imc(Peso, Estatura) + ". Normal");
        }
        else if(Persona1.Imc(Peso, Estatura)>24.9 && Persona1.Imc(Peso, Estatura)<=29.9){
            System.out.println("El IMC es: " + Persona1.Imc(Peso, Estatura) + ". Sobrepeso");
        }
        else if(Persona1.Imc(Peso, Estatura)>29.9 && Persona1.Imc(Peso, Estatura)<=34.9){
            System.out.println("El IMC es: " + Persona1.Imc(Peso, Estatura) + ". Obesidad I");
        }
        else if(Persona1.Imc(Peso, Estatura)>34.9 && Persona1.Imc(Peso, Estatura)<=39.9){
            System.out.println("El IMC es: " + Persona1.Imc(Peso, Estatura) + ". Obesidad II");
        }
        else if(Persona1.Imc(Peso, Estatura)>39.9){
            System.out.println("El IMC es: " + Persona1.Imc(Peso, Estatura) + ". Obesidad III");
        }
        

        System.out.println("\n #######################");
        System.out.println("\t Datos Persona 2");
        
        Scanner dato = new Scanner(System.in);

        System.out.print("Ingrese el nombre: ");
        String Nombres2 = dato.nextLine();
        System.out.print("Ingrese el apellido: ");
        String Apellidos2 = dato.nextLine();
        System.out.print("Ingrese la direccion: ");
        String Direccion2 = dato.nextLine();
        System.out.print("Ingrese la edad: ");
        int Edad2 = Integer.parseInt(dato.nextLine());
        System.out.print("Ingrese el peso: ");
        double Peso2 = Double.parseDouble(dato.nextLine());
        System.out.print("Ingrese la estatura: ");
        double Estatura2 = Double.parseDouble(dato.nextLine());

        Persona Persona2 = new Persona();
        Persona2.setNombres(Nombres2);
        Persona2.setApellidos(Apellidos2);
        Persona2.setDireccion(Direccion2);
        Persona2.setEdad(Edad2);
        Persona2.setPeso(Peso2);
        Persona2.setEstatura(Estatura2);
        
        Persona2.mostrarDatos();
        Persona2.mayorEdad(Edad);
        if(Persona2.Imc(Peso2, Estatura2)>0 && Persona2.Imc(Peso2, Estatura2)<=18.4){
            System.out.println("El IMC es: " + Persona2.Imc(Peso2, Estatura2) + ". Insuficiencia ponderal");
        } 
        else if(Persona2.Imc(Peso2, Estatura2)>18.4 && Persona2.Imc(Peso2, Estatura2)<=24.9){
            System.out.println("El IMC es: " + Persona2.Imc(Peso2, Estatura2) + ". Normal");
        }
        else if(Persona2.Imc(Peso2, Estatura2)>24.9 && Persona2.Imc(Peso2, Estatura2)<=29.9){
            System.out.println("El IMC es: " + Persona2.Imc(Peso2, Estatura2) + ". Sobrepeso");
        }
        else if(Persona2.Imc(Peso2, Estatura2)>29.9 && Persona2.Imc(Peso2, Estatura2)<=34.9){
            System.out.println("El IMC es: " + Persona2.Imc(Peso2, Estatura2) + ". Obesidad I");
        }
        else if(Persona2.Imc(Peso2, Estatura2)>34.9 && Persona2.Imc(Peso2, Estatura2)<=39.9){
            System.out.println("El IMC es: " + Persona2.Imc(Peso2, Estatura2) + ". Obesidad II");
        }
        else if(Persona2.Imc(Peso2, Estatura2)>39.9){
            System.out.println("El IMC es: " + Persona2.Imc(Peso2, Estatura2) + ". Obesidad III");
        }

    }

}
