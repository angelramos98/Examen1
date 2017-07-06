package Clases;

/**
 * Created by alumno on 5/07/2017.
 */
public class Canal {
    private Integer Numero;
    private String Tematica;
    private Boolean Permitido;

    public Integer getNumero() {
        return Numero;
    }

    public void setNumero(Integer numero) {
        Numero = numero;
    }

    public String getTematica() {
        return Tematica;
    }

    public void setTematica(String tematica) {
        Tematica = tematica;
    }

    public Boolean getPermitido() {
        return Permitido;
    }

    public void setPermitido(Boolean permitido) {
        Permitido = permitido;
    }

    public Canal(Integer numero, String tematica, Boolean permitido) {
        Numero = numero;
        Tematica = tematica;
        Permitido = permitido;
    }

    public Canal() {
    }
    public static void main(String[] args) {

    }
}
