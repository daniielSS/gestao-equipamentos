package br.unip.gestaoequipamentos.interfacesImpl;

import br.unip.gestaoequipamentos.interfaces.InicioSessao;
import br.unip.gestaoequipamentos.services.InicioSessaoService;

import java.io.IOException;

public class InicioSessaoImpl implements InicioSessao {

    private InicioSessaoService inicioSessaoService;

    /**
     * Método para iniciar a sessão no sistema
     * @author Daniel Soares SIlva
     */
    @Override
    public void inicioSessao() throws IOException {

        System.out.println("********************************************************");
        System.out.println("*                                                      *");
        System.out.println("*                    Colégio Vencer                    *");
        System.out.println("*                                                      *");
        System.out.println("* Seja bem-vindo ao sistema de gestão de equipamentos. *");
        System.out.println("*                                                      *");
        System.out.println("********************************************************");
        System.out.println("*                                                      *");
        System.out.println("* Selecione o valor correspondente a opção desejada:   *");
        System.out.println("*                                                      *");
        System.out.println("* 1- Login                                             *");
        System.out.println("*                                                      *");
        System.out.println("* 2- Primeiro Acesso                                   *");
        System.out.println("*                                                      *");
        System.out.println("********************************************************");
        System.out.println("*                                                      *");
        System.out.print("Terminal: ");

        InicioSessaoService.inicioSessao();

    }

}
