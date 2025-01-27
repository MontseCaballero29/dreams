package models;

// https://refactoring.guru/design-patterns/singleton/java/example
public class Sesion {

    private static Sesion sesion;
    
    private Sesion(){}

    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public static Sesion obtenerObjetoCreado() {
        if (sesion == null) {
            sesion = new Sesion();
        }
        
        return sesion;
    }
}
