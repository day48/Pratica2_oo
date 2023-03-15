package AtvAv2;
import java.util.Scanner;

public class Estoque {

    static Scanner ler = new Scanner(System.in);

    private int codProduto;
    private String nome;
    private static int qtdAtual;
    private static int qtdMinima;



    public Estoque() {

    }
    public Estoque(String nome, int qtdAtual, int qtdMinima,int codProduto) { //codProduto=variavel
        this.nome = nome;
        this.codProduto =codProduto; //codProduto atributo
        this.qtdAtual = qtdAtual;  //modificador que indica que a varivael e da classe
        this.qtdMinima = qtdMinima;
    }

                                       //public Estoque (int cod,String produto){this.codProduto= cod; this.nome= produto;
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCodProduto(int codProduto){
        this.codProduto= codProduto;
    }
    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }

    public void setQtdMinima(int qtdMinima) {
        this.qtdMinima = qtdMinima;
    }

    public String getNome() {
        return nome;
    }

    public Integer getQtdAtual() {
        return qtdAtual;
    }

    public Integer getQtdMinima() {
        return qtdMinima;
    }

    public void darBaixa() {
        //conferir estoque zerado.
        //verificar se atingiu a quantidade minima.
        //fazer a baixa no estoque.

        if (qtdAtual <= 0) {
            System.out.println("Estoque vazio");
        } else {
            boolean b = precisaRepor();
            if (b == true) {
                System.out.println("Estoque atingiu a quantidade minina!");
            }
        }
        System.out.println("Digite a quantidade para dar baixa");
        int qtd = ler.nextInt();
        if (qtd > qtdAtual) {
            System.out.println("Quantidade a  dar baixa ,ultrapassou o estoque atual ");

        } else {

            qtdAtual = qtdAtual -= qtd;
            System.out.println("A quantidade atual do estoque e : " + getQtdAtual());
        }
    }

    public boolean precisaRepor() {
        if (qtdAtual <= qtdMinima)
            return true;
        else
            return false;

    }

        public String mostra(){
            String mostra1 = String.valueOf(qtdAtual);
            String mostra2 = String.valueOf(qtdMinima);
            String Mostra = nome + mostra1 + mostra2;
               return "O produto "+ getNome() +"Possui a quantidade atual de :"+mostra1 + "E a quantidade minima de :"+mostra2;
        }



}
