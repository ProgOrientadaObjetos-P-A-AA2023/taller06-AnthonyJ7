/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal;

import java.util.Scanner;
import paquete2.*;

/**
 *
 * @author ASUS
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // pedir datos
        
        // Variables
        
        String nomHospital, direccHospital, nomciud, nomprov;
        int espe, cMed, cEnf;
        //Ingreso de datos
        
        
        System.out.print("Ingrese el nombre de la institucion: ");
        nomHospital = sc.nextLine();
        
        System.out.print("Ingrese la direccion del hospital: ");
        direccHospital = sc.nextLine();
        
        System.out.print("Ingrese el nombre de la Ciudad: ");
        nomciud = sc.nextLine();
        
        System.out.print("Ingrese el nombre de la Provincia: ");
        nomprov = sc.nextLine();
        
        
        CiudHospital cd = new CiudHospital(nomciud, nomprov);
        
        System.out.println("Ingrese el nro de especialidades: ");
        espe = sc.nextInt(); 
        System.out.println("Ingrese la cantidad de Medicos a ingresar");
        cMed = sc.nextInt();
        System.out.println("Ingrese la cantidad de Enfermeros a ingresar");
        cEnf = sc.nextInt();
        
        // creacion de vectro
        
        Medico[] med = new Medico[cMed];
        Enfermero [] enf = new Enfermero[cEnf];
        
        String nombre;

        String especialidad;
        String tipo;
        double sueldoMensual;
   
        sc.nextLine();
        
        for (int i=0; i<cMed; i++) {
            System.out.println("Ingrese el nombre del médico "+(i+1)+" :");
            nombre = sc.next();
            

            
            System.out.println("Ingrese la especialidad:");
            especialidad = sc.next();
            
            System.out.println("Ingrese el sueldo mensual del médico "+(i+1)+" :");
            sueldoMensual = sc.nextDouble();
            
            med[i]= new Medico(nombre,especialidad,
                    sueldoMensual);
       
        }
        
        sc.nextLine();
        
        for (int i=0; i<cEnf; i++) {
            
            System.out.println("Ingrese el nombre del enfermero "+(i+1)+" :");
            nombre = sc.next();
            

            
            System.out.println("Ingrese el tipo (nombramiendo o contrato):");
            tipo = sc.next();
            
            System.out.println("Ingrese el sueldo mensual del enfermero "+(i+1)+" :");
            sueldoMensual = sc.nextDouble();
            
            enf[i]= new Enfermero(nombre,tipo,
                    sueldoMensual);
          
        }    

  
       
        Hospital h = new Hospital(nomHospital,cd,espe,med,enf,direccHospital);

        
    
        h.calcularSueldoTotal(med, enf);
        

        System.out.printf("\n%s\n", h);
         h.calcularSueldoTotal(med, enf);
        
    
        System.out.printf("\n%s\n", h);
    }
}
