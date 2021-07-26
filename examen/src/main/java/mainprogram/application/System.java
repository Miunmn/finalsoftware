package mainprogram.application;


import mainprogram.application.database.CentroDatabase;
import mainprogram.application.database.UserDatabase;
import mainprogram.classes.Usuario;

import java.util.logging.Logger;

public class System {
    static Logger logger = Logger.getLogger(System.class.getName());

    private final LoginSystem loginSystem;
    private final  CentroDatabase centroDatabase;

    public System(CentroDatabase centroDatabase , LoginSystem loginSystem) {
        this.centroDatabase = centroDatabase;
        this.loginSystem = loginSystem;
    }

    private Integer showAvanceVacunacion(){
        var suma=0;
        for(var i = 0 ; i < centroDatabase.centros.size() ;i++){
            if(centroDatabase.centros.get(i).isStatus()){
                suma = suma + centroDatabase.centros.get(i).getCantidadvacunados();
            }
        }
        return suma;
    }


    public void showAndSelectoption(int option, Usuario user){
        logger.info("Mostrando opciones");
        logger.info("1 ---> Ver Toda la informacion");
        logger.info("2 ---> Dar de alta a centro de vacunacion");
        logger.info("3 ---> Dar de baja a centro de vacunacion");
        logger.info("4 ---> Cerrar sesion");

        switch (option){
            case 1:
                logger.info(()->"Cantidad de vacunados " +  showAvanceVacunacion());
                break;
            case 2:

                break;
            case 3:
                break;
            case 4:
                logger.info(()->"Cerrar sesion");
                logout(user);
                break;
            default:
                break;
        }


    }
    public void logout(Usuario user){
        loginSystem.remove(user);
    }

}
