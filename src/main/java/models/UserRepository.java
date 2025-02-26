package models;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
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
                String[] values = line.split(",");  // id,username,name,password
                User user = new User(values[0], values[1], values[2], values[3]);
                users.add(user);
            }
        }
    }

    public void agregar(User user) throws Exception {
        users.add(user);

        Runnable guardarEnArchivo = () -> {
            try {
                Path filePath = Paths.get(this.archivo);

                StringBuilder stringBuilder = new StringBuilder();

                stringBuilder.append(user.getId());
                stringBuilder.append(',');
                stringBuilder.append(user.getUsername());
                stringBuilder.append(',');
                stringBuilder.append(user.getName());
                stringBuilder.append(',');
                stringBuilder.append(user.getPassword());
                stringBuilder.append(System.lineSeparator());

                Files.write(filePath, stringBuilder.toString().getBytes(), StandardOpenOption.APPEND);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        };

        Thread hilo = new Thread(guardarEnArchivo);

        hilo.start();
    }

    public User findByUsername(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }

        return null;
    }
}
