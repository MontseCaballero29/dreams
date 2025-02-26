package usecases;

import models.Dream;
import models.DreamRepository;

public class GetDreamsUseCase {

    private DreamRepository dreamRepository;

    public GetDreamsUseCase(DreamRepository dreamRepository) {
        this.dreamRepository = dreamRepository;
    }

    public Dream[] ejectuar(String userId) {
        return this.dreamRepository.obtenerPorUserId(userId);
    }
}
