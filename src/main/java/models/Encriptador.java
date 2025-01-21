package models;

public class Encriptador {

    public String encriptar(String texto) {
        StringBuilder res = new StringBuilder();
        res.append(texto);
        return res.reverse().toString();
    }

    public String desencriptar(String texto) {
        StringBuilder res = new StringBuilder();
        res.append(texto);
        return res.reverse().toString();
    }
}
