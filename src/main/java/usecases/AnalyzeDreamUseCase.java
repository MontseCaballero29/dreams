package usecases;

import models.Assistant;
import models.Dream;
import models.DreamRepository;

public class AnalyzeDreamUseCase {

    private DreamRepository dreamRepository;
    private Assistant assistant;

    public AnalyzeDreamUseCase(
            DreamRepository dreamRepository,
            Assistant assistant
    ) {
        this.dreamRepository = dreamRepository;
        this.assistant = assistant;
    }

    public String ejectuar(String dreamId) {
        Dream dream = this.dreamRepository.obtenerPorId(dreamId);        
        return this.assistant.analizar(dream);
    }
}
