package mainprogram.application;


import mainprogram.classes.Usuario;

import java.util.logging.Logger;

public class System {
    static System instance;
    static LoginSystem loginInstance = LoginSystem.getInstance();
    static Logger logger = Logger.getLogger(System.class.getName());

    private System(){
    }

    public static synchronized System getInstance() {
        if (instance == null) {
            instance = new System();
        }
        return instance;
    }

    public void showoptions(){
        logger.info("Mostrando opciones: ");
    }
    public void logout(Usuario user){
        loginInstance.remove(user);
    }

}
