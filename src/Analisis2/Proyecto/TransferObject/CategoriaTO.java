package Analisis2.Proyecto.TransferObject;

import java.util.Vector;

public class CategoriaTO {

  public String idCategoria;

  public String Nombre;

    public Vector  CreaUsa;

    public String getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(String idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Vector getCreaUsa() {
        return CreaUsa;
    }

    public void setCreaUsa(Vector CreaUsa) {
        this.CreaUsa = CreaUsa;
    }


}