package br.unip.gestaoequipamentos.interfacesImpl;

import br.unip.gestaoequipamentos.interfaces.CadastroUsuario;
import br.unip.gestaoequipamentos.models.UsuarioSistema;
import br.unip.gestaoequipamentos.services.CadastroUsuarioService;

import java.io.IOException;

public class CadastroUsuarioImpl implements CadastroUsuario {

    private CadastroUsuarioService cadastroUsuarioService;

    public void inserirNome(UsuarioSistema usuarioSistema) throws IOException {

        System.out.println("********************************************************");
        System.out.println("*                                                      *");
        System.out.println("*                    Colégio Vencer                    *");
        System.out.println("*                                                      *");
        System.out.println("********************************************************");
        System.out.println("*                                                      *");
        System.out.println("* Cadastro de Usuário:                                 *");
        System.out.println("*                                                      *");
        System.out.println("* 1º Digite seu nome completo                          *");
        System.out.println("*                                                      *");
        System.out.print("Terminal: ");

        CadastroUsuarioService.inserirNome(usuarioSistema);


    }

    @Override
    public void inserirUsuario(UsuarioSistema usuarioSistema) throws IOException {

        System.out.println("*                                                      *");
        System.out.println("* 2º Digite seu usuário acesso (Ex: user.test)         *");
        System.out.println("*                                                      *");
        System.out.print("Terminal: ");

        CadastroUsuarioService.inserirUsuario(usuarioSistema);

    }

    @Override
    public void inserirEmail(UsuarioSistema usuarioSistema) throws IOException {

        System.out.println("*                                                      *");
        System.out.println("*                                                      *");
        System.out.println("* 3º Digite seu e-mail                                 *");
        System.out.println("*                                                      *");
        System.out.print("Terminal: ");

        CadastroUsuarioService.inserirEmail(usuarioSistema);

    }

    @Override
    public void inserirCargo(UsuarioSistema usuarioSistema) throws IOException {

        System.out.println("*                                                      *");
        System.out.println("*                                                      *");
        System.out.println("* 4º Selecione seu cargo                               *");
        System.out.println("*                                                      *");
        System.out.println("* 1- Professor(a)                                      *");
        System.out.println("* 2- Coordernador(a)                                   *");
        System.out.println("* 3- Administrador(a) (Cargo Restrito)                 *");
        System.out.println("*                                                      *");
        System.out.print("Terminal: ");

        CadastroUsuarioService.inserirCargo(usuarioSistema);

    }

    @Override
    public void inserirSenha(UsuarioSistema usuarioSistema) {

        System.out.println("*                                                      *");
        System.out.println("*                                                      *");
        System.out.println("* 5º Digite uma senha                                  *");
        System.out.println("*                                                      *");
        System.out.print("Terminal: ");

    }
}
