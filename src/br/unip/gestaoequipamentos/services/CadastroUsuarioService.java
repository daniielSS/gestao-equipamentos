package br.unip.gestaoequipamentos.services;

import br.unip.gestaoequipamentos.interfacesImpl.CadastroUsuarioImpl;
import br.unip.gestaoequipamentos.interfacesImpl.InicioSessaoImpl;
import br.unip.gestaoequipamentos.models.UsuarioSistema;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CadastroUsuarioService {

    public static void inserirNome(UsuarioSistema usuarioSistema) throws IOException {

        CadastroUsuarioImpl cadastroUsuarioImpl = new CadastroUsuarioImpl();
        usuarioSistema = new UsuarioSistema();

        Scanner scan = new Scanner(System.in);
        String nomeSelecionado = scan.nextLine();
        usuarioSistema.setNomeFuncionario(nomeSelecionado);

        if(nomeSelecionado.isEmpty() || nomeSelecionado.equals(" ")){
            System.out.println("O campo não pode estar vazio!");
            cadastroUsuarioImpl.inserirNome(usuarioSistema);
        }

        cadastroUsuarioImpl.inserirUsuario(usuarioSistema);

    }

    public static void inserirUsuario(UsuarioSistema usuarioSistema) throws  IOException {

        CadastroUsuarioImpl cadastroUsuarioImpl = new CadastroUsuarioImpl();
        usuarioSistema = new UsuarioSistema();

        Scanner scan = new Scanner(System.in);
        String nomeUsuario = scan.nextLine();
        usuarioSistema.setNomeUsuario(nomeUsuario);

        if(nomeUsuario.isEmpty() || nomeUsuario.equals(" ")){
            System.out.println("O campo não pode estar vazio!");
            cadastroUsuarioImpl.inserirUsuario(usuarioSistema);
        }

        cadastroUsuarioImpl.inserirEmail(usuarioSistema);

    }

    public static void inserirEmail(UsuarioSistema usuarioSistema) throws IOException {

        CadastroUsuarioImpl cadastroUsuarioImpl = new CadastroUsuarioImpl();
        usuarioSistema = new UsuarioSistema();

        Scanner scan = new Scanner(System.in);
        String email = scan.nextLine();
        usuarioSistema.setEmail(email);

        if(email.isEmpty() || email.equals(" ")){
            System.out.println("O campo não pode estar vazio!");
            cadastroUsuarioImpl.inserirUsuario(usuarioSistema);
        }

        cadastroUsuarioImpl.inserirCargo(usuarioSistema);

    }

    public static void inserirCargo(UsuarioSistema usuarioSistema) throws IOException {

        CadastroUsuarioImpl cadastroUsuarioImpl = new CadastroUsuarioImpl();
        usuarioSistema = new UsuarioSistema();
        InicioSessaoImpl inicioSessaoImpl = new InicioSessaoImpl();

        String resposta = "";
        String chaveSecreta = "teste@123";
        int tentativas = 1;

        Scanner scan = new Scanner(System.in);
        int cargo = scan.nextInt();
        usuarioSistema.setTipoCargo(cargo);

        switch (cargo){
            case 1:
                
        }

        if(cargo == 3){
            System.out.println("Você selecionou o cargo de Administrador, esse é um cargo restrito!");
            System.out.println("Para continuar o cadastro de um administrador, será necessário");
            System.out.println("inserir uma chave secreta. Deseja continuar? [s/n]");

            Scanner respostaScan = new Scanner(System.in);
            resposta = respostaScan.nextLine();

            if(resposta.equals("S") || resposta.equals("s")){
                System.out.print("Certo, digite a chave secreta: ");

                respostaScan = new Scanner(System.in);
                resposta = respostaScan.nextLine();

                while(!resposta.equals(chaveSecreta)){
                    System.out.println("Senha incorreta! [" + tentativas + "/3]");
                    tentativas++;

                    if(tentativas > 3){
                        inicioSessaoImpl.inicioSessao();
                    }

                    System.out.print("Digite a chave secreta: ");
                    respostaScan = new Scanner(System.in);
                    resposta = respostaScan.nextLine();
                }

                usuarioSistema.setNomeCargo("Administrador");

                System.out.println("Sucesso! Continue o cadastro do usuário.");
                cadastroUsuarioImpl.inserirSenha(usuarioSistema);
            }else if(resposta.equals("N") || resposta.equals("n")) {
                cadastroUsuarioImpl.inserirCargo(usuarioSistema);
            }else {
                System.out.println("Opção inválida!");
                cadastroUsuarioImpl.inserirCargo(usuarioSistema);
            }

        }

    }

    public static void salvarNome(UsuarioSistema usuarioSistema) throws IOException {

        /*
        FileWriter user = new FileWriter("/home/daniel/Documentos/Unip/2024/1º Semestre/PIM V/gestao-equipamentos/ge\n" +
                "stao-equipamentos/scriptfiles/users/userTeste.txt");
        */
    }

}
