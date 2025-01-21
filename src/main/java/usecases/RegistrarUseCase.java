package usecases;

import models.Encriptador;
import models.User;
import models.UserRepository;

public class RegistrarUseCase {

    private UserRepository userRepository;
    private Encriptador encriptador;

    public RegistrarUseCase(UserRepository userRepository, Encriptador encriptador) {
        this.userRepository = userRepository;
        this.encriptador = encriptador;
    }

    public void ejecutar(User user) throws Exception {
        User existente = userRepository.obtenerUsuarioPorUsername(user.getUsername());

        if (existente != null) {
            throw new Exception("Username ya existe, elige otro");
        }
        
        String passwordEncriptada = encriptador.encriptar(user.getPassword());
        user.setPassword(passwordEncriptada);
        userRepository.agregar(user);
    }

}
