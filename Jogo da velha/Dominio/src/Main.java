import Game.Jogador;
import Game.Play;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Play play = new Play();
        Jogador playerOne = new Jogador();
        Jogador playerTwo = new Jogador();


        System.out.println("Bem vindo ao jogo da velha");


        System.out.println("Para nos conhecermos melhor, digite o nome do player 1:");
        playerOne.name = scanner.nextLine();
        System.out.println("Informe o nome do player 2:");
        playerTwo.name = scanner.nextLine();


        System.out.println("Sr."+ playerOne.name + " e Sr." + playerTwo.name +", aqui vai algumas regras :");
        System.out.println("1 - O jogo é jogado em um tabuleiro 3x3.");
        System.out.println("2 - O jogador 1 é o X e o jogador 2 é o O.");
        System.out.println("3 - Não é uma regra, apenas um boa sorte ;).");

        System.out.println("-------------------------------------------------------------------");

        System.out.println(playerOne.name + " é o 'x' e inicia o game, " + playerTwo.name + " ficou com o 'o' ");

        play.execute();

        if (play.player == 1) {
            System.out.println("O Player '"+playerOne.name+"' ganhou");
        } else if (play.player == 0) {
            System.out.println("O Player '"+playerTwo.name+"' ganhou");
        } else {
            System.out.println("Deu velha");
        }
    }
    }