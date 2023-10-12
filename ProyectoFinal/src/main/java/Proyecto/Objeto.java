package Proyecto;

/**
 *
 * @author javb
 */
public class Objeto {
    private String nombre;
    private String autor;
    private int año;
    private float costo;
    
    public Objeto(String nom, String aut, int a, float c) {
        nombre = nom;
        autor = aut;
        año = a;
        costo = c;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }
    
}
