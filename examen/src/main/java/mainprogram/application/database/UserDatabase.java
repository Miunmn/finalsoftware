package mainprogram.application.database;


import mainprogram.classes.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UserDatabase {
    static UserDatabase instance;
    public final List<Usuario> usuarios = new ArrayList<>();

    private UserDatabase(){
    }

    public static synchronized UserDatabase getInstance() {
        if (instance == null) {
            instance = new UserDatabase();
        }
        return instance;
    }

    public void add (Usuario user) {
        usuarios.add(user);
    }

    public Usuario getUserFromUser(String username){

        for(var i = 0 ; i < usuarios.size(); i++){
            if(usuarios.get(i).getUser().equals(username))
                return usuarios.get(i);
        }

        return null;
    }


}
