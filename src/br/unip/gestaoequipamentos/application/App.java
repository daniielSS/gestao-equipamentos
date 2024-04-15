package br.unip.gestaoequipamentos.application;

import br.unip.gestaoequipamentos.interfaces.InicioSessao;
import br.unip.gestaoequipamentos.interfacesImpl.InicioSessaoImpl;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {

        InicioSessao inicio = new InicioSessaoImpl();
        inicio.inicioSessao();

    }
}