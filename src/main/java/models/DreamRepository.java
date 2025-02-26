package models;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

public class DreamRepository {

    private ArrayList<Dream> dreams;
    private String archivo;

    public DreamRepository(String archivo) throws Exception {
        this.archivo = archivo;
        dreams = new ArrayList<>();
        Path filePath = Paths.get(archivo);

        if (Files.notExists(filePath)) {
            filePath.toFile().createNewFile();
        }

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");  // id,userId,titulo,descripcion, fecha
                Dream dream = new Dream(values[0], values[1], values[2], values[3], Date.from(Instant.parse(values[5])));
                dreams.add(dream);
            }
        }
    }

    
    public Dream[] obtenerPorUserId(String userId){
        return null;
    }
    
    public Dream obtenerPorId(String id){
        return null;
    }
    
    
    public void agregar(Dream dream) throws Exception {
        dreams.add(dream);

        Runnable guardarEnArchivo = () -> {
            try {
                Path filePath = Paths.get(this.archivo);

                StringBuilder stringBuilder = new StringBuilder();

                stringBuilder.append(dream.getId());
                stringBuilder.append(',');
                stringBuilder.append(dream.getUserId());
                stringBuilder.append(',');
                stringBuilder.append(dream.getTitulo());
                stringBuilder.append(',');
                stringBuilder.append(dream.getDescripcion());
                stringBuilder.append(',');
                stringBuilder.append(DateTimeFormatter.ISO_INSTANT.format(dream.getFecha().toInstant()));
                stringBuilder.append(System.lineSeparator());

                Files.write(filePath, stringBuilder.toString().getBytes(), StandardOpenOption.APPEND);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        };

        Thread hilo = new Thread(guardarEnArchivo);

        hilo.start();
    }

}
