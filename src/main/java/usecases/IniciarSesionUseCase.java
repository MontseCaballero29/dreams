package usecases;

import models.Encriptador;
import models.Sesion;
import models.User;
import models.UserRepository;

public class IniciarSesionUseCase {

    private UserRepository userRepository;
    private Encriptador encriptador;

    public IniciarSesionUseCase(UserRepository userRepository, Encriptador encriptador) {
        this.userRepository = userRepository;
         this.encriptador = encriptador;
    }

    public void ejecutar(String username, String password) throws Exception {
        validarCredencialesCorrectas(username, password);
    }

    private void validarCredencialesCorrectas(String username, String password) throws Exception {
        User user = userRepository.findByUsername(username);

        if (user == null) {
            throw new Exception("Usuario no existe");
        }

        if (!encriptador.desencriptar(user.getPassword()).equals(password)) {
            throw new Exception("Password Incorrecto");
        }
        
        Sesion.obtenerObjetoCreado().setUser(user);
    }
}
