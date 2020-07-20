/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio3.usach.cl;

import Obj.Repositorio;
import Obj.ZonaDeTrabajo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ivillagra
 */
public class Laboratorio3UsachCl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Repositorio repositorio = new Repositorio();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String opcion = "";
        
        System.out.println("Para Inicar la Aplicación debe Crear un Repositorio");
        System.out.println("Función \"gitInit\"");
        String nombre = "";
        String autor ="";
        
        while(nombre.equals("") && autor.equals(""))
        {
            System.out.print("Ingrese su nombre:");
            autor = reader.readLine();

            System.out.print("Ingrese el nombre del Reporitorio:");
            nombre = reader.readLine();
        }
        int resultado = repositorio.gitInit(nombre, autor);
        if(resultado>0)
        {
            System.out.println("Repositorio creado: Directorios:");
            repositorio._ListaZonasDeTrabajo.stream().forEach((p)-> {
                System.out.println(p.NombreZonaDeTrabajo.name());
            });
        }else       
        {
            System.out.print("Ha ocurrido un problema al iniciar el repositorio");
        }
        
        while(opcion != "7")
        {
            System.out.println("### SIMULACIÓN DE GIT ###");
            System.out.println("Escoja su opción:");
            System.out.println("1. add");
            System.out.println("2. commit");
            System.out.println("3. pull");
            System.out.println("4. push");
            System.out.println("5. status");
            System.out.println("6. Crear nuevo archivo");
            System.out.println("7. Salir");
            System.out.println("INTRODUZCA SU OPCIÓN: _");
            
            opcion = reader.readLine();
            
            int result =0;
            try {
                result = Integer.parseInt(opcion); 
            } 
            catch (Exception e){ 
                System.err.println("Debe ingresar un número"); 
            }

            switch (result) {
              case 1:
                System.out.println("Monday");
                break;
              case 2:
                System.out.println("Tuesday");
                break;
              case 3:
                System.out.println("Wednesday");
                break;
              case 4:
                System.out.println("Thursday");
                break;
              case 5:
                System.out.println("Friday");
                break;
              case 6:
                System.out.println("Saturday");
                break;
              case 7:
                System.out.println("Sunday");
                break;
            }
        }
    }
}
