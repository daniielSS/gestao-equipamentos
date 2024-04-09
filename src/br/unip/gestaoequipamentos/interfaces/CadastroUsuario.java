package br.unip.gestaoequipamentos.interfaces;

import br.unip.gestaoequipamentos.models.UsuarioSistema;

public interface CadastroUsuario {

    /**
     * @author Daniel Soares Silva
     * @param usuarioSistema
     */
    void inserirNome(UsuarioSistema usuarioSistema);

    /**
     * @author Daniel Soares Silva
     * @param usuarioSistema
     */
    void inserirUsuario(UsuarioSistema usuarioSistema);

    /**
     * @author Daniel Soares Silva
     * @param usuarioSistema
     */
    void inserirEmail(UsuarioSistema usuarioSistema);

    /**
     * @author Daniel Soares Silva
     * @param usuarioSistema
     */
    void inserirCargo(UsuarioSistema usuarioSistema);

    /**
     * @author Daniel Soares Silva
     * @param usuarioSistema
     */
    void inserirSenha(UsuarioSistema usuarioSistema);

}
