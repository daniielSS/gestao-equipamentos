package br.unip.gestaoequipamentos.application;

import br.unip.gestaoequipamentos.interfaces.InicioSessao;
import br.unip.gestaoequipamentos.interfacesImpl.InicioSessaoImpl;

public class App {
    public static void main(String[] args) {

        InicioSessao inicio = new InicioSessaoImpl();
        inicio.inicioSessao();

    }
}