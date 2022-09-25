
package sc304.lec03;

import examen_cliente_servidor.Cuadrado;
import examen_cliente_servidor.Circulo;
import java.util.Scanner;


public class Inicio {

    
    /*
    
    Ejercicio en Clase:
    
    Sobre este proyecto crear un menú de opciones para que el usuario pueda calcular el área y el perímetro
    de las siguientes figuras geométricas: 
    
    -- Rombo
    -- Rectángulo
    -- Triángulo
    
    Recordar que estas clases deben heredar de la clase abstracta Figura 
    
    */
    
    
    public static void main(String[] args) {
//        herencia_con_clase_abstract();
        //ejemplo_uso_de_interface();
        ejemplo_con_enumerados();
    }
    
    public static void ejemplo_con_enumerados (){
        
        
        Scanner sc= new Scanner (System.in);
        
        int valor;
        
        //Tipo enumerado
        DiaSemana d=null;
        
        do{
            System.out.println("Introduce día de la semana del 1(domingo) al 7(sábado):");
            valor= sc.nextInt();
            
        }while (valor<1 || valor>7);
        
        switch (valor){
            
            case 1: {
                    d= DiaSemana.DOMINGO;
                    System.out.println("El día de la semana es:" + d.toString());
                    break;
            }
            case 2: {
                    d= DiaSemana.LUNES;
                    System.out.println("El día de la semana es:" + d.toString());
                    break;
            }
                  
            case 3: {
                    d= DiaSemana.MARTES;
                    System.out.println("El día de la semana es:" + d.toString());
                    break;
            }
            
             case 4: {
                    d= DiaSemana.MIERCOLES;
                    System.out.println("El día de la semana es:" + d.toString());
                    break;
            }
            
            case 5: {
                    d= DiaSemana.JUEVES;
                    System.out.println("El día de la semana es:" + d.toString());
                    break;
            }
            
            case 6: {
                    d= DiaSemana.VIERNES;
                    System.out.println("El día de la semana es:" + d.toString());
                    break;
            }
            
            case 7: {
                    d= DiaSemana.SABADO;
                    System.out.println("El día de la semana es:" + d.toString());
                    break;
            }

            default:{
                    System.out.println("No se digitó un valor correcto");
                }
            
        }
        
    }
    
    
    
    public static void herencia_con_clase_abstract (){
        
        Cuadrado obj_Cuadrado= new Cuadrado();
        
        obj_Cuadrado.pedir_datos();
        obj_Cuadrado.CalcularArea();
        obj_Cuadrado.CalcularPerimetro();
        
        
        Circulo obj_Circulo = new Circulo();
        
        obj_Circulo.pedir_datos();
        obj_Circulo.CalcularArea();
        obj_Circulo.CalcularPerimetro();
                
        
    }
    
    
    public static void ejemplo_uso_de_interface (){
        
        Mamifero obj_mamifero = new Mamifero();
        
        obj_mamifero.pedir_datos();
        
        obj_mamifero.nombreEspecie("Elefante");
        obj_mamifero.continente();
        
    }
    
}
