package Programming.Unit2.Examenes.Theme3;

import java.util.ArrayList;

public class UsuarioDAO {

    private ArrayList<User> listaUsuarios;
    private static UsuarioDAO dao = null;

    private UsuarioDAO(){
        listaUsuarios = new ArrayList<>();
    }

    public void addUser(User user){
        for (User user1: listaUsuarios){
            if (!user1.equals(user)) listaUsuarios.add(user);
            else System.out.println("El usuario ya existe");
        }
    }

    public ArrayList<User> getListaUsuarios(){
        return listaUsuarios;
    }

    public static UsuarioDAO obtenerInstancia(){
        if (dao == null) dao = new UsuarioDAO();
        else System.out.println("Ya existe una instancia de UsuarioDAO");
        return dao;
    }

}
