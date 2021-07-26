package mainprogram;


import mainprogram.application.LoginSystem;
import mainprogram.application.System;
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
        var system = System.getInstance();


        List<Usuario> usersToLogin = new ArrayList<>();

        usersToLogin.add(new Usuario("Esteban","nabetsE"));

        //usersToLogin.add(new Usuario("Ana", "anA"));

        for (Usuario usuario : usersToLogin) {
            userDatabase.add(usuario);
        }

        var logged = false;
        logger.info("Ingrese su usuario y password");
        for (Usuario usuario : usersToLogin) {
            logger.info(usuario.getUser());
            logger.info(usuario.getPassword());
            logged=loginSystem.authenticate(usuario);
        }
        if (logged){
            system.showoptions();
        }


    }
}