package entities;

public class Pedido {
    private String nomeCliente;
    private String saborPizza;
    private int pricePizza;

    private String tamPizza;

    public String getTamPizza() {
        return tamPizza;
    }

    public void setTamPizza(String tamPizza) {
        this.tamPizza = tamPizza;
    }

    public Pedido(String nomeCliente, String saborPizza, int pricePizza) {
        this.nomeCliente = nomeCliente;
        this.saborPizza = saborPizza;
        this.pricePizza = pricePizza;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getSaborPizza() {
        return saborPizza;
    }

    public int getPricePizza() {
        return pricePizza;
    }

    public void receber() {
        System.out.println("O pedido do cliente " + getNomeCliente() + " foi recebido! O sabor escolhido foi: " + getSaborPizza() + " (" +
                getTamPizza()+").");
    }
    public void preparar() {
        System.out.println("O pedido já está sendo preparado!");
    }

    public void entregar(){
        System.out.println("\nO pedido do(a) "+getNomeCliente()+" já saiu para entrega!");
    }
}

