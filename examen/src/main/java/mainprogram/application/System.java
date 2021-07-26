package mainprogram.application;


import mainprogram.application.database.CentroDatabase;
import mainprogram.classes.Usuario;

import java.text.MessageFormat;
import java.util.logging.Logger;

public class System {
    static System instance;
    static LoginSystem loginInstance = LoginSystem.getInstance();
    static CentroDatabase centroDatabase = CentroDatabase.getInstance();
    static Logger logger = Logger.getLogger(System.class.getName());

    private System(){
    }

    private Integer showAvanceVacunacion(){
        int suma=0;
        for(var i = 0 ; i < centroDatabase.centros.size() ;i++){
            if(centroDatabase.centros.get(i).isStatus()){
                suma = suma + centroDatabase.centros.get(i).getCantidadvacunados();
            }
        }
        return suma;
    }


    public static synchronized System getInstance() {
        if (instance == null) {
            instance = new System();
        }
        return instance;
    }

    public void showAndSelectoption(int option){
        logger.info("Mostrando opciones: ");
        logger.info("1 ---> Ver Toda la informacion");
        logger.info("2 ---> Dar de alta a centro de vacunacion" );
        logger.info("3 ---> Dar de baja a centro de vacunacion" );
        logger.info("4 ---> Cerrar sesion" );

        switch (option){
            case 1:
                logger.info("Cantidad de vacunados " + String.format("%d", showAvanceVacunacion()));
                break;
            case 2:

                break;
            case 3:
                break;
            case 4:
                break;
            default:
                break;
        }


    }
    public void logout(Usuario user){
        loginInstance.remove(user);
    }

}
