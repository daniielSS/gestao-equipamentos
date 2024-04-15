package br.unip.gestaoequipamentos.interfaces;

import br.unip.gestaoequipamentos.models.UsuarioSistema;

import java.io.IOException;

public interface CadastroUsuario {

    /**
     * @author Daniel Soares Silva
     * @param usuarioSistema
     */
    void inserirNome(UsuarioSistema usuarioSistema) throws IOException;

    /**
     * @author Daniel Soares Silva
     * @param usuarioSistema
     */
    void inserirUsuario(UsuarioSistema usuarioSistema) throws IOException;

    /**
     * @author Daniel Soares Silva
     * @param usuarioSistema
     */
    void inserirEmail(UsuarioSistema usuarioSistema) throws IOException;

    /**
     * @author Daniel Soares Silva
     * @param usuarioSistema
     */
    void inserirCargo(UsuarioSistema usuarioSistema) throws IOException;

    /**
     * @author Daniel Soares Silva
     * @param usuarioSistema
     */
    void inserirSenha(UsuarioSistema usuarioSistema);

}
