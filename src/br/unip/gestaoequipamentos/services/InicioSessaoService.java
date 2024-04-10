package br.unip.gestaoequipamentos.services;

import br.unip.gestaoequipamentos.interfaces.CadastroUsuario;
import br.unip.gestaoequipamentos.interfacesImpl.InicioSessaoImpl;
import br.unip.gestaoequipamentos.models.UsuarioSistema;

import java.util.Scanner;

public class InicioSessaoService {

    private static InicioSessaoImpl inicioSessaoImpl;
    private static CadastroUsuario cadastroUsuario;
    private static UsuarioSistema usuarioSistema;

    public static void inicioSessao(){

        Scanner scan = new Scanner(System.in);
        int opcaoSelecionada = scan.nextInt();

        switch (opcaoSelecionada){
            case 1:
                System.out.println("Tela Login em construção!");
                break;
            case 2:
                cadastroUsuario.inserirNome(usuarioSistema);
                break;
            default:
                System.out.println("Opção Inválida!");

        }

    }

}
