package ec.edu.intsuperior.vista;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Aplicacion {
    public static void main(String[] args) {
            desintegrarNumero(args);
    }
    public static void multiplicacion(String[] args) {
        Scanner leer = new Scanner(System.in);
        int v1, v2, s; 
        System.out.println("Ingresa el primer valor: ");
        v1=leer.nextInt();
        System.out.println("Ingresa el segundo valor: ");
        v2=leer.nextInt();
        s=v1*v2;
        System.out.println("La multiplicacion es: "+s);
    }
    public static void multiploDeTresCuatroCinco(String[] args) {
        Scanner leer=new Scanner(System.in);
        int n1;
        System.out.println("Ingrese un numero");
        n1=leer.nextInt();
        if (n1%3==0) {
            System.out.println("El numero es multiplo de 3");
            } else {
            System.out.println("El numero no es multiplo de 3");
        }
        if (n1%4==0) {
           System.out.println("El numero es multiplo de 4"); 
        } else {
            System.out.println("El numero no es multiplo de 4");
        }
        if (n1%5==0) {
           System.out.println("El numero es multiplo de 5"); 
        } else {
            System.out.println("El numero no es multiplo de 5");
        }
    }
    public static void mayorMenorDeEdad(String[] args) {
        Scanner leer=new Scanner(System.in);
        int edad;
        System.out.println("Ingrese la edad");
        edad=leer.nextInt();
        if (edad>=18) {
            System.out.println("Es mayor de edad");
            
        } else {
            System.err.println("Es menor de edad");}
        
    }
    public static int retornarEdad(String[] args) {
    Scanner leer= new Scanner(System.in);
        int x, ac=2023,edad;
        float y;
        double z;
        System.out.println("Ingresa el año de nacimiento");
        x=leer.nextInt();
        edad=ac-x;
        return edad;
    }   
    public static void desintegrarNumero(String [] args){
        Scanner leer = new Scanner(System.in);
        int num,aux=0;
        System.out.println("Ingresa un numero positivo");
        num= leer.nextInt();
       //aux=numero-numero/10*10;
       while(num>aux){
        aux=num%10;
        num=num/10;
        System.out.println(aux+"    "+num);
       }
    } 
}
