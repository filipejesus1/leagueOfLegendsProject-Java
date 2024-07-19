package Models;

import java.util.Scanner;

public class champion {

//ATRIBUTOS DA CLASSE

    //Parametros String
    private String nome;
    private String titulo;
    private String regiao;
    private String tipoDano;
    private String dataLancamento;
    private String classe;

    //Parametros Inteiros
    private int dificuldade;

    private int dano;
    private int resistencia;
    private int controleGrupo;
    private int mobilidade;
    private int utilidade;

//CONSTRUTORES DA CLASSE
    public champion(String nome, String titulo,String classe,int dificuldade, String regiao, String dataLancamento) {

        this.nome = nome;
        this.titulo = titulo;
        this.regiao = regiao;
        this.dataLancamento = dataLancamento;
        this.dificuldade = dificuldade;
        this.classe = classe;
    }

//GETERS
    public String getNome() {
        return nome;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getRegiao() {
        return regiao;
    }

    public String getTipoDano() {
        return tipoDano;
    }

    public String getDataLancamento() {
        return dataLancamento;
    }

    public String getClasse() {
        return classe;
    }

    public int getDificuldade() {
        return dificuldade;
    }

    public int getDano() {
        return dano;
    }

    public int getResistencia() {
        return resistencia;
    }

    public int getControleGrupo() {
        return controleGrupo;
    }

    public int getMobilidade() {
        return mobilidade;
    }

    public int getUtilidade() {
        return utilidade;
    }

//SETERS
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public void setTipoDano(String tipoDano) {
        this.tipoDano = tipoDano;
    }

    public void setDataLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public void setClase(String classe) {
        this.classe = classe;
    }

    public void setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public void setControleGrupo(int controleGrupo) {
        this.controleGrupo = controleGrupo;
    }

    public void setMobilidade(int mobilidade) {
        this.mobilidade = mobilidade;
    }

    public void setUtilidade(int utilidade) {
        this.utilidade = utilidade;
    }
//MÉTODOS DA CLASSE
    public void exibeFichaTecnica(){
        System.out.println("Nome: "+ nome);
        System.out.println("Titulo: "+ titulo);
        System.out.println("Classe: "+ classe);
        System.out.println("Região: "+regiao);
        System.out.println("Dificuldade: "+dificuldade);
        System.out.println("Data de lancaçmento: "+ dataLancamento);
    }

    public void cadastrarNovo(){
        Scanner leitura = new Scanner(System.in);
        champion a = new champion();
    }

    @Override
    public String toString() {
        return "Nome:'" + nome + '\'' +
                ", Titulo:'" + titulo + '\'' +
                ", Classe:'" + classe + '\'' +
                ", Regiao:'" + regiao + '\'' +
                ", Data de Lançamento:'" + dataLancamento + '\'' +
                '}';
    }
}
