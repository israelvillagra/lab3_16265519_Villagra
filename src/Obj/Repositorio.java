/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Obj;

import Obj.Utiles.ZonasDeTrabajoEnum;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ivillagra
 */
public class Repositorio {
    public List<ZonaDeTrabajo> _ListaZonasDeTrabajo;
    public String _Nombre;
    public String _Autor;
    
    public int gitInit(String p_Nombre, String p_Autor)
    {
        if(p_Nombre !="" && p_Autor !="")
        {
            this._Nombre = p_Nombre;
            this._Autor= p_Autor;
            _ListaZonasDeTrabajo = new ArrayList<ZonaDeTrabajo>();
            
            ZonaDeTrabajo zonaDeTrabajo = new ZonaDeTrabajo();
            zonaDeTrabajo.NombreZonaDeTrabajo = ZonasDeTrabajoEnum.Workspace;
            
            _ListaZonasDeTrabajo.add(zonaDeTrabajo);
            
            zonaDeTrabajo = new ZonaDeTrabajo();
            zonaDeTrabajo.NombreZonaDeTrabajo = ZonasDeTrabajoEnum.Index;
            _ListaZonasDeTrabajo.add(zonaDeTrabajo);
            
            zonaDeTrabajo = new ZonaDeTrabajo();
            zonaDeTrabajo.NombreZonaDeTrabajo = ZonasDeTrabajoEnum.LocalRepository;
            _ListaZonasDeTrabajo.add(zonaDeTrabajo);
            
            zonaDeTrabajo = new ZonaDeTrabajo();
            zonaDeTrabajo.NombreZonaDeTrabajo = ZonasDeTrabajoEnum.RemoteRepository;
            _ListaZonasDeTrabajo.add(zonaDeTrabajo);
            return 1;
        }
        else    
        {
            return 0;
        }
    }
}
