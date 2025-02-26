package models;

import java.util.UUID;

public class User {

    private String id;
    private String username;
    private String name;
    private String password;

    public User(String id, String username, String name, String password) {
        this.id = id;
        this.username = username;
        this.name = name;
        this.password = password;
    }

    public static User create(String username, String name, String password) {
        return new User(UUID.randomUUID().toString(), username, name, password);
    }

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "username: " + username + ", name: " + name;
    }

}
