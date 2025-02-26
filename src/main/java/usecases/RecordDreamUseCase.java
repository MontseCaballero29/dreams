package usecases;

import java.time.Instant;
import java.util.Date;
import models.Dream;
import models.DreamRepository;
import models.Sesion;

public class RecordDreamUseCase {

    private DreamRepository dreamRepository;

    public RecordDreamUseCase(DreamRepository dreamRepository) {
        this.dreamRepository = dreamRepository;
    }

    public void ejectuar(String titulo, String descripcion) throws Exception {
        Date fecha = Date.from(Instant.now());
        String userId = Sesion.obtenerObjetoCreado().getUser().getId();

        Dream dream = Dream.create(userId, titulo, descripcion, fecha);

        this.dreamRepository.agregar(dream);
    }
}
