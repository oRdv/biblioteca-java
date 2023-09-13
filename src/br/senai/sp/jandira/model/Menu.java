package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Menu {

    public void menu(){

        Scanner teclado = new Scanner (System.in);

        Registro registro = new Registro();

        Emprestimo emprestimo = new Emprestimo();

        catagolos catagolos = new catagolos();

        boolean exit = false;


        while (!exit){
            System.out.println("__________________________________");
            System.out.println("       - B I B L I O T E C A -    ");
            System.out.println("           - BEM - VINDO -        ");
            System.out.println("__________________________________");
            System.out.println("Escolha uma opção.................");
            System.out.println("1 - Catalogo......................");
            System.out.println("2 - Cadrastro.....................");
            System.out.println("3 - Empréstimo....................");
            System.out.println("4 - Sair..........................");

            int menuEscolha = teclado.nextInt();

            switch (menuEscolha){
                case 1:
                    catagolos.escolha();
                    break;

                case 2:
                    registro.escolha();
                    break;

                case 3:
                    emprestimo.escolha();
                    break;

                case 4:
                    exit = true;
                    break;

            }

        }
    }
}
