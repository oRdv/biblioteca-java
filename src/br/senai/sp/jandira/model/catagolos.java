package br.senai.sp.jandira.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class catagolos {
    public String escolhas;

    Scanner teclado = new Scanner(System.in);

    public void escolha(){

        System.out.println("Deseja Registrar um livro ou Pegar Emprestado");
        escolhas = teclado.nextLine();
        System.out.println(" ");

        switch (escolhas.toLowerCase()) {
            case "Regitrar":
                livroRegistro();
                break;
            case "Pegar"
                livroEmprestimo();
                break;
        }

        System.out.println(" ");
    }

    public Livros livroRegistro(){


        return catagolos;
    }

    List <Livros> Livros =new ArrayList<>();

    public void AdcionarLivro (Livros livros){

        Livros.add(livros);
    }

    public void ListarLivros(){

        for(Livros livro : Livros){
            System.out.println(livro.nome);
            System.out.println(livro.autor);
        }
    }


}

