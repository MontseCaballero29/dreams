package models;

import java.util.Date;
import java.util.UUID;

public class Dream {

    private String id;
    private String userId;
    private String titulo;
    private String descripcion;
    private Date fecha;

    public Dream(String id, String userId, String titulo, String descripcion, Date fecha) {
        this.id = id;
        this.userId = userId;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    public static Dream create(String userId, String titulo, String descripcion, Date fecha) {
        return new Dream(UUID.randomUUID().toString(), userId, titulo, descripcion, fecha);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

}
