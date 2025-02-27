package forohub.apiForoHub.domain.users;

public record DatosUsuario(Long id,
                           String email,
                           String contrasena) {

    public DatosUsuario(Usuario user) {
        this(user.getId(), user.getUsername(), encoder(user.getPassword()));
    }

    private static String encoder(String password){
        return password;
    }
}
