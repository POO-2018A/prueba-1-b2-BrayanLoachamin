/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebabimestre2;

/**
 *
 * @author ESFOT
 */
public class InformacionFrutas {
    
    private String nombre;
    private String codigo;
    private double precio;

    public InformacionFrutas(String nombre, String codigo, double precio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "InformacionFrutas{" + "nombre=" + nombre + ", codigo=" + codigo + ", precio=" + precio + '}';
    }
    
}
