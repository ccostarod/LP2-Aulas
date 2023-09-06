package applications;

import entities.Cliente;
import entities.Pedido;
import entities.Pizza;

import java.util.Locale;
import java.util.Scanner;

public class ifood {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);


        int pedidosMAX = 10;
        int quantPedidos = 0;


        String nome;
        String sabor;
        String tamanho;
        Pedido[] pedidos = new Pedido[pedidosMAX];

        int x = 1;
        while (true) {
            if (quantPedidos >= pedidosMAX) {
                System.out.println("Limite de pedidos atingido.");
                break; // Sai do loop se atingir o limite máximo de pedidos
            }

            System.out.println("Pedido " + x++ + ": ");
            System.out.print("Nome do cliente: ");
            nome = sc.next();
            sc.nextLine();
            System.out.print("Sabor da Pizza: ");
            sabor = sc.next();
            sc.nextLine();
            System.out.print("Tamanho da Pizza (P | M | G): ");
            tamanho = sc.next();

            Pizza pizza = new Pizza(sabor, tamanho);
            Cliente cliente = new Cliente(nome);

            pedidos[quantPedidos] = new Pedido(cliente.getName(), pizza.getNomePizza(), pizza.setPricePizza(tamanho));
            pedidos[quantPedidos].setTamPizza(tamanho);
            pedidos[quantPedidos].receber();
            pedidos[quantPedidos].preparar();

            quantPedidos++; // Incrementa a quantidade de pedidos
            System.out.println();
            System.out.print("[1] - Novo Pedido | [0] - Sair: ");
            int opcao = sc.nextInt();

            if (opcao == 0) {
                break; // Sai do loop se o usuário digitar 0
            }
        }
        int soma = 0;

        System.out.println("\nLISTA DE PEDIDOS: ");
        for (int j = 0; j < quantPedidos; j++){
            if (pedidos[j] != null){
                System.out.printf("%s, %s, %d\n", pedidos[j].getNomeCliente(), pedidos[j].getSaborPizza(),
                        pedidos[j].getPricePizza());

                soma += pedidos[j].getPricePizza();
            }
        }
        System.out.println("Valor total dos pedidos foi: R$ " + soma);

        for (int k = 0; k < quantPedidos; k++){
            pedidos[k].entregar();
        }
    }
}
