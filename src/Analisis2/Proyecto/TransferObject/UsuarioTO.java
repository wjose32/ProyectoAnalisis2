package Analisis2.Proyecto.TransferObject;

import java.util.Vector;

public class UsuarioTO extends PersonaTO {

  private String tipo;

  private String contrasena;

    public Vector  CreaUsa;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Vector getCreaUsa() {
        return CreaUsa;
    }

    public void setCreaUsa(Vector CreaUsa) {
        this.CreaUsa = CreaUsa;
    }


    
}