// Classe modelo Computador

public class Computador {

    private String marca;
    private String processador;
    private int memoriaRAM;
    private int armazenamento;
    private double preco;

    // Construtor default

    public Computador() {

        this.marca = "Sem Registro";
        this.processador = "Sem Registro";
        this.memoriaRAM = 0;
        this.armazenamento = 0;
        this.preco = 0.0;
    }

    // Construtor com parâmetros

    public Computador(String marca, String processador, int memoriaRAM, int armazenamento, double preco) {

        this.marca = marca;
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
        this.armazenamento = armazenamento;
        this.preco = preco;
    }

    // Getters e Setters

    public String getMarca() {
        return marca;
    }

    public String getProcessador() {
        return processador;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public double getPreco() {
        return preco;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Atributos do Computador
    
    public void imprimir() {

        System.out.println("Marca: " + marca);
        System.out.println("Processador: " + processador);
        System.out.println("Memória RAM: " + memoriaRAM + "GB");
        System.out.println("Armazenamento: " + armazenamento + "GB");
        System.out.println("Preço: R$" + preco);
        System.out.println("----------------------");
    }
}
