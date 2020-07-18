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
        System.out.println("Para Inicar la Aplicación debe Crear un Repositorio");
        String nombre = "";
        String autor ="";
        while(nombre.equals("") && autor.equals(""))
        {
            System.out.print("Ingrese su nombre:");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            autor = reader.readLine();

            System.out.println("Ingrese el nombre del Reporitorio:");
            nombre = reader.readLine();
        }
        int resultado = repositorio.gitInit(nombre, autor);
        
       repositorio._ListaZonasDeTrabajo.stream().forEach((p)-> {
            System.out.println(p.NombreZonaDeTrabajo.name());
        });
    }
}
