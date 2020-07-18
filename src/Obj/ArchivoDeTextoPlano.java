/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Obj;
import java.util.Date;
/**
 *
 * @author ivillagra
 */
public class ArchivoDeTextoPlano {

    private String _Nombre;
    private int _Version;
    private Date _FechaModificacion;
    private String _Contenido;

    /**
     * @return the _Nombre
     */
    public String getNombre() {
        return _Nombre;
    }

    /**
     * @param _Nombre the _Nombre to set
     */
    public void setNombre(String _Nombre) {
        this._Nombre = _Nombre;
    }

    /**
     * @return the _Version
     */
    public int getVersion() {
        return _Version;
    }

    /**
     * @param _Version the _Version to set
     */
    public void setVersion(int _Version) {
        this._Version = _Version;
    }

    /**
     * @return the _FechaModificacion
     */
    public Date getFechaModificacion() {
        return _FechaModificacion;
    }

    /**
     * @param _FechaModificacion the _FechaModificacion to set
     */
    public void setFechaModificacion(Date _FechaModificacion) {
        this._FechaModificacion = _FechaModificacion;
    }

    /**
     * @return the _Contenido
     */
    public String getContenido() {
        return _Contenido;
    }

    /**
     * @param _Contenido the _Contenido to set
     */
    public void setContenido(String _Contenido) {
        this._Contenido = _Contenido;
    }
}
