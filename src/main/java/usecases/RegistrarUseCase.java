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

    public void ejecutar(String username, String name, String password) throws Exception {
        User existente = userRepository.findByUsername(username);

        if (existente != null) {
            throw new Exception("Username ya existe, elige otro");
        }
        
        String passwordEncriptada = encriptador.encriptar(password);
       
        User user = User.create(username, name, passwordEncriptada);
        
        userRepository.agregar(user);
    }

}
