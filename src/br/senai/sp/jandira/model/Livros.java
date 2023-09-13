package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Livros{

    public String nome, genero, autor;
    public int isbm;

    Scanner teclado = new Scanner(System.in);

    public void cadrastroLivro (){
        System.out.println("Qual é o nome do seu livro: ");
        nome = teclado.nextLine();
        System.out.println("Qual é o genêro do seu livro: ");
        genero = teclado.nextLine();
        System.out.println("Qual é o autor do seu livro: ");
        autor = teclado.nextLine();
        System.out.println("Qual é o ISBM: ");
        isbm = teclado.nextInt();
    }

}
