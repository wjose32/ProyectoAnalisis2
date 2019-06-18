package Analisis2.Proyecto.TransferObject;

import java.util.Vector;
import java.util.Date;

public class CambioStockTO {

  public String codigo;

  public String codigoProducto;

  public int cantidad;

  public String tipo;

  public Date fecha;

    public Vector  CreaUsa;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Vector getCreaUsa() {
        return CreaUsa;
    }

    public void setCreaUsa(Vector CreaUsa) {
        this.CreaUsa = CreaUsa;
    }

  

  

}