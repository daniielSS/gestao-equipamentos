package br.unip.gestaoequipamentos.services;

import br.unip.gestaoequipamentos.interfacesImpl.CadastroUsuarioImpl;
import br.unip.gestaoequipamentos.models.UsuarioSistema;

import java.util.Scanner;

public class CadastroUsuarioService {

    public static void inserirNome(UsuarioSistema usuarioSistema){

        CadastroUsuarioImpl cadastroUsuarioImpl = new CadastroUsuarioImpl();

        Scanner scan = new Scanner(System.in);
        String nomeSelecionado = scan.nextLine();

        if(nomeSelecionado == null){
            System.out.println("O campo não pode estar vazio!");
            cadastroUsuarioImpl.inserirNome(usuarioSistema);
        }

        CadastroUsuarioService.salvarNome(usuarioSistema);

    }

    public static void salvarNome(UsuarioSistema usuarioSistema){

        

    }

}
