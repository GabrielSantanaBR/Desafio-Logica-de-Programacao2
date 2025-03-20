import java.util.Scanner;

public class SistemaRankeamento {

    public static int calcularSaldoRankeadas(int vitorias, int derrotas) {
        return vitorias - derrotas;
    }

    public static String classificarJogador(int saldoRankeadas) {
        if (saldoRankeadas >= 101) {
            return "Lendário";
        } else if (saldoRankeadas >= 91) {
            return "Ouro";
        } else if (saldoRankeadas >= 81) {
            return "Ouro";
        } else if (saldoRankeadas >= 51) {
            return "Ouro";
        } else if (saldoRankeadas >= 21) {
            return "Prata";
        } else if (saldoRankeadas >= 11) {
            return "Bronze";
        } else if (saldoRankeadas >= 1) {
            return "Ferro";
        } else {
            return "Desclassificado";
        }
    }

    public static void exibirDetalhesJogador(String nome, int vitorias, int derrotas) {
        int saldoRankeadas = calcularSaldoRankeadas(vitorias, derrotas);
        String classificacao = classificarJogador(saldoRankeadas);

        System.out.println("\nDetalhes do Jogador:");
        System.out.println("Nome: " + nome);
        System.out.println("Vitórias: " + vitorias);
        System.out.println("Derrotas: " + derrotas);
        System.out.println("Saldo de Rankeadas: " + saldoRankeadas);
        System.out.println("Classificação: " + classificacao);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Sistema de Rankeamento de Jogadores!");

        while (true) {
            System.out.print("\nDigite o nome do jogador (ou 'sair' para encerrar): ");
            String nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.print("Digite o número de vitórias: ");
            int vitorias = scanner.nextInt();

            System.out.print("Digite o número de derrotas: ");
            int derrotas = scanner.nextInt();


            scanner.nextLine();

            exibirDetalhesJogador(nome, vitorias, derrotas);
        }

        System.out.println("\nPrograma encerrado. Obrigado por usar o Sistema de Rankeamento!");
        scanner.close();
    }
}