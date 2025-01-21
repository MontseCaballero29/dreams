package models;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class UserRepository {

    private ArrayList<User> users;
    private String archivo;

    public UserRepository(String archivo) throws Exception {
        this.archivo = archivo;
        users = new ArrayList<>();
        Path filePath = Paths.get(archivo);
        
        if (Files.notExists(filePath)) {
            filePath.toFile().createNewFile();
        }
        
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");  // username,name,password
                users.add(new User(values[0], values[1], values[2]));
            }
        }
    }

    public void agregar(User user) throws Exception {
        users.add(user);
        Path filePath = Paths.get(this.archivo);
        
        if (Files.notExists(filePath)) {
            filePath.toFile().createNewFile();
        }

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(user.getUsername());
        stringBuilder.append(',');
        stringBuilder.append(user.getName());
        stringBuilder.append(',');
        stringBuilder.append(user.getPassword());
        stringBuilder.append(System.lineSeparator());

        Files.write(filePath, stringBuilder.toString().getBytes(), StandardOpenOption.APPEND);
    }

    public User obtenerUsuarioPorUsername(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }

        return null;
    }
}
