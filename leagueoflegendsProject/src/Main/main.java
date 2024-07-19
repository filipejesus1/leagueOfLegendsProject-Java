package Main;

import Models.champion;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws IOException {


        //Adicionando um campeão para testes e controles
        champion meuChampion = new champion("Aphelios", "A arma dos devotos", "Atirador", 3, "Targon", "11-12-2019");
    //    meuChampion.exibeFichaTecnica();
        champion meuChampion2 = new champion("Lucian", "O purificador", "Atirador", 2, "Demacia", "22-08-2013");
    //    meuChampion.exibeFichaTecnica();

        //Criando um arquivo txt e salvando lá
        OutputStream os = new FileOutputStream("ListaCampeoes.txt"); //Criação do arquivo
        Writer writer = new OutputStreamWriter(os); //Criação do escritor
        BufferedWriter br = new BufferedWriter(writer);

        br.write(meuChampion.toString());
        br.newLine();
        br.write(meuChampion2.toString());
        br.close();

   //     manipuladorArquivo mA = new manipuladorArquivo("C:\\Curso Java\\leagueoflegendsProject\\ListaCampeoes.txt");
   //     mA.lerArquivo();

        //Array list de campeoes
        ArrayList<champion> listaCampeoes = new ArrayList<>();
        listaCampeoes.add(meuChampion);
        listaCampeoes.add(meuChampion2);

        //Loop while para navegação em menu
        //*****************************************----******************************************/
        //Variavel para controle de mneu
        int menu = 0;
        while (menu == 0) {
            //Mostrar o menu principal da aplicação
            System.out.println("\n*******************MENU*******************");
            System.out.println("1-Listar novo campeão");
            System.out.println("2-Pesquisar no banco de dados");
            System.out.println("0-Sair");
            System.out.println("Digite a opção escolhida: ");

            Scanner leitura = new Scanner(System.in);
            int opcao = leitura.nextInt();

            //*************************************OPÇÕES MENU***************************************************************
            //***************************************************************************************************************
            //***************************************************************************************************************
            switch (opcao){
                case 1:{
                    for(int i =0 ; i<listaCampeoes.size();i++) {
                    System.out.println("Campeão na lista: " + listaCampeoes.get(i).getNome());}
                }case 2:{
                    manipuladorArquivo mA = new manipuladorArquivo("C:\\Curso Java\\leagueoflegendsProject\\ListaCampeoes.txt");
                    mA.lerArquivo();

                }case 0:{
                    System.out.println("Você escolheu sair, finalizando menu");
                    menu = 1;
                }
            }
        }






    }
}
