package mainprogram;


import mainprogram.application.Centro;
import mainprogram.application.LoginSystem;
import mainprogram.application.System;
import mainprogram.application.database.CentroDatabase;
import mainprogram.application.database.UserDatabase;
import mainprogram.classes.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Main {
    static Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        var userDatabase = UserDatabase.getInstance();
        var loginSystem = LoginSystem.getInstance();
        var centroDatabase = CentroDatabase.getInstance();

        List<Usuario> usersToLogin = new ArrayList<>();

        centroDatabase.add(new Centro("centro1", 1000,true));
        centroDatabase.add(new Centro("centro2", 1000,true));
        centroDatabase.add(new Centro("centro3", 1000,true));
        centroDatabase.add(new Centro("centro4", 1000,true));
        centroDatabase.add(new Centro("centro5", 1000,true));

        usersToLogin.add(new Usuario("Esteban","nabetsE"));



        var system = new System(centroDatabase,  loginSystem);



        for (Usuario usuario : usersToLogin) {
            userDatabase.add(usuario);
        }

        var logged = false;
        logger.info("Ingrese su usuario y password");
        for (Usuario usuario : usersToLogin) {
            logger.info(usuario.getUser());
            logger.info(usuario.getPassword());
            logged=loginSystem.authenticate(usuario);
            if (logged){
                system.showAndSelectoption(1, usuario);

            }
            else{
                logger.info("Error en la autenticacion");
            }

        }

    }
}