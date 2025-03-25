import java.util.Scanner;

public class TesteComputador {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {

             // Setter de definição Computador 1 pelo usuário

             Computador pc1 = new Computador();
             System.out.println("\nDigite os dados para o primeiro computador:\n");
             System.out.print("Marca: ");
             pc1.setMarca(scanner.nextLine());
             System.out.print("Processador: ");
             pc1.setProcessador(scanner.nextLine());
             System.out.print("Memória RAM (GB): ");
             pc1.setMemoriaRAM(scanner.nextInt());
             System.out.print("Armazenamento (GB): ");
             pc1.setArmazenamento(scanner.nextInt());
             System.out.print("Preço: R$");
             pc1.setPreco(scanner.nextDouble());
             scanner.nextLine();
 
             // Setter de definição Computador 2 pelo usuário

             Computador pc2 = new Computador();
             System.out.println("\nDigite os dados para o segundo computador:\n");
             System.out.print("Marca: ");
             pc2.setMarca(scanner.nextLine());
             System.out.print("Processador: ");
             pc2.setProcessador(scanner.nextLine());
             System.out.print("Memória RAM (GB): ");
             pc2.setMemoriaRAM(scanner.nextInt());
             System.out.print("Armazenamento (GB): ");
             pc2.setArmazenamento(scanner.nextInt());
             System.out.print("Preço: R$");
             pc2.setPreco(scanner.nextDouble());
             scanner.nextLine();

            // Criação de dois Computadores

            System.out.println("\nDigite os dados para o terceiro Computador:\n");
            System.out.print("Marca: ");
            String marca1 = scanner.nextLine();
            System.out.print("Processador: ");
            String processador1 = scanner.nextLine();
            System.out.print("Memória RAM (GB): ");
            int ram1 = scanner.nextInt();
            System.out.print("Armazenamento (GB): ");
            int armazenamento1 = scanner.nextInt();
            System.out.print("Preço: R$");
            double preco1 = scanner.nextDouble();
            scanner.nextLine();

            Computador pc3 = new Computador(marca1, processador1, ram1, armazenamento1, preco1);

            System.out.println("\nDigite os dados para o quarto Computador:\n");
            System.out.print("Marca: ");
            String marca2 = scanner.nextLine();
            System.out.print("Processador: ");
            String processador2 = scanner.nextLine();
            System.out.print("Memória RAM (GB): ");
            int ram2 = scanner.nextInt();
            System.out.print("Armazenamento (GB): ");
            int armazenamento2 = scanner.nextInt();
            System.out.print("Preço: R$");
            double preco2 = scanner.nextDouble();
            scanner.nextLine();

            Computador pc4 = new Computador(marca2, processador2, ram2, armazenamento2, preco2);

            // Exibição dos atributos de todos os Computadores

            System.out.println("\nComputadores cadastrados:\n");
            System.out.println("Computador 1:\n");
            pc1.imprimir();
            System.out.println("Computador 2:\n");
            pc2.imprimir();
            System.out.println("Computador 3:\n");
            pc3.imprimir();
            System.out.println("Computador 4:\n");
            pc4.imprimir();

            // Menu de Escolha

            System.out.println("\nO que deseja fazer agora?\n");
            System.out.println("Digite 1 para REPETIR");
            System.out.println("Digite 2 para ENCERRAR\n");
            System.out.print("Seleção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

        } while (opcao == 1);

        System.out.println("\nPrograma Encerrado.");
        scanner.close();
    }
}