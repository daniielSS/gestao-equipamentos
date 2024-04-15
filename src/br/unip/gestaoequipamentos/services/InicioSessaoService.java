package br.unip.gestaoequipamentos.services;

import br.unip.gestaoequipamentos.interfacesImpl.CadastroUsuarioImpl;
import br.unip.gestaoequipamentos.models.UsuarioSistema;

import java.io.IOException;
import java.util.Scanner;

public class InicioSessaoService {

    private static UsuarioSistema usuarioSistema;

    public static void inicioSessao() throws IOException {

        CadastroUsuarioImpl cadastroUsuarioImpl = new CadastroUsuarioImpl();

        Scanner scan = new Scanner(System.in);
        int opcaoSelecionada = scan.nextInt();

        switch (opcaoSelecionada){
            case 1:
                System.out.println("Tela Login em construção!");
                break;
            case 2:
                cadastroUsuarioImpl.inserirNome(usuarioSistema);
                break;
            default:
                System.out.println("Opção Inválida!");

        }

    }

}
