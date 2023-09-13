package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Registro {

    Scanner teclado = new Scanner(System.in);
    Cliente cliente = new Cliente();

    Bibliotecario bibliotecario = new Bibliotecario();

    public String escolhas;
    public String escolhaRegistro;


    public void escolha(){

        System.out.println("Deseja entrar como Cliente ou Bibliotecário");
        escolhas = teclado.nextLine();
        System.out.println(" ");

        switch (escolhas.toLowerCase()) {
            case "Cliente":
                clienteRegistro();
                break;
            case "Bibliotecario":
                bibliotecarioRegistro();
                break;
        }

        System.out.println(" ");
    }
    public Cliente clienteRegistro(){
        System.out.println("...........CLIENTE REGISTRO...........");
        System.out.println("Digite o seu nome: ");
        cliente.nome = teclado.nextLine();
        System.out.println("Digite o seu E-mail: ");
        cliente.email = teclado.nextLine();
        System.out.println("Digite o seu número de celular: ");
        cliente.numero = teclado.nextInt();
        System.out.println("Digite o seu endereço: ");
        cliente.endereco = teclado.nextLine();


        return cliente;
    }

    public Bibliotecario bibliotecarioRegistro(){
        System.out.println("...........BIBLIOTECARIO REGISTRO...........");
        System.out.println("Digite o seu nome: ");
        bibliotecario.nome = teclado.nextLine();
        System.out.println("Digite o seu E-mail: ");
        bibliotecario.email = teclado.nextLine();
        System.out.println("Digite o seu número de celular: ");
        bibliotecario.numero = teclado.nextInt();
        System.out.println("Digite o seu endereço: ");
        bibliotecario.endereco = teclado.nextLine();
        System.out.println("Informe seu id: ");
        bibliotecario.id = teclado.nextInt();


        return bibliotecario;
    }

}

