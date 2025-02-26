/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package pancer.dreams;

import models.Assistant;
import models.DreamRepository;
import models.Encriptador;
import models.UserRepository;
import usecases.AnalyzeDreamUseCase;
import usecases.GetDreamsUseCase;
import usecases.IniciarSesionUseCase;
import usecases.RecordDreamUseCase;
import usecases.RegistrarUseCase;
import vistas.Login;

/**
 *
 * @author Montse Caballero
 */
public class Dreams {

    public static void main(String[] args) {
        try {
            UserRepository userRepository = new UserRepository("usuarios.csv");
            Encriptador encriptador = new Encriptador();
            IniciarSesionUseCase iniciarSesionUseCase = new IniciarSesionUseCase(userRepository, encriptador);
            RegistrarUseCase registrarUseCase = new RegistrarUseCase(userRepository, encriptador);
            DreamRepository dreamRepository = new DreamRepository("dreams.csv");
            Assistant assistant = new Assistant();
            AnalyzeDreamUseCase analyzeDreamUseCase = new AnalyzeDreamUseCase(dreamRepository, assistant);
            GetDreamsUseCase getDreamsUseCase = new GetDreamsUseCase(dreamRepository);
            RecordDreamUseCase recordDreamUseCase = new RecordDreamUseCase(dreamRepository);
            
            new Login(iniciarSesionUseCase, registrarUseCase).setVisible(true);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
