/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package publicprincipal;

import java.util.ArrayList;
import java.util.Scanner;


public class PublicPrincipal {
private static ArrayList<Publicacion> publicacion = new ArrayList();
static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) {
        
          int opc = 0;
        do{
            System.out.println("Elijac una opcion :  ");
            System.out.println("1.-Alta ");
            System.out.println("2.-Buscar");
            System.out.println("3.-Buscar ");
            System.out.println("4.-Eliminar");
            System.out.println("5.-Salir");
            
            opc = entrada.nextInt();
            
            switch(opc)
            {
                case 1 :
                    int opc2;
                            
                    System.out.println("Elija que tipo de publicacion :");
                    System.out.println("1.- Libro :");
                    System.out.println("2.- Revista :");
                    System.out.println("3.- Periodico :");
                    
                    opc2 = entrada.nextInt();
                    
                    switch(opc2)
                    {
                        case 1 :
                            System.out.println("Ingrese datos del libro : ");
                            entrada.nextLine();
                            String[] datos = entrada.nextLine().split("&");
                            
                            String titulo="";
                            float precio = 0;
                            int numPagina = 0;
                            
                            if(publicacion.isEmpty())
                            {
                                precio = 0;
                                numPagina = 0;
                                System.out.print("Ingrese el titulo");
                                titulo = entrada.nextLine();
                                
                            }else{
                                for(int i = 0 ; i < publicacion.size();i++)
                                {
                                    System.out.print(i+" ==> "+publicacion.get(i).getTitulo());
                                }
                                System.out.println(publicacion.size()+" ===> Disponible ");
                                
                                System.out.println("ingres eel numero d epaginas");
                                numPagina = entrada.nextInt();
                                
                                if(numPagina >= publicacion.size())
                                {
                                    System.out.println("Ingrese el numero de paginas");
                                    entrada.nextInt();
                                    numPagina = entrada.nextInt();
                                    
                                }
                                if(precio >= publicacion.size())
                                {
                                    System.out.println("Ingrese el precio");
                                    entrada.nextInt();
                                    precio = entrada.nextFloat();
                                    
                                    
                                }
                                
                                
                                
                            }
                            
                        break;
                    }
                    
                break;
                case 2 :
                break;
                case 3 :
                break;
                case 4 :
                break;
                case 5 :
                    System.exit(0);
                break;
                default :
                    System.out.println(" Opcion no disponible ");
                break;
                    
            }
            
        }while(opc != 5);
    }//cierre del main
    
    public static void agregarLibro(String titulo, float precio, int numeroPaginas )
    {
        
    }
    public static void buscarlibro()
    {
        
    }
    public static void eliminarlibro()
    {
        
    }
}
