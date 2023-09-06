package entities;

public class Pizza {
    private String nomePizza;
    private int pricePizza;

    private String tamPizza;

    public Pizza(String nomePizza, String tamPizza) {
        this.nomePizza = nomePizza;
        this.tamPizza = tamPizza;
    }

    public String getNomePizza() {
        return nomePizza;
    }

    public int setPricePizza(String tamPizza) {
        switch (tamPizza) {
            case "P":
                pricePizza = 30;
                break;
            case "M": // Tamanho M
                pricePizza = 38;
                break;
            case "G": // Tamanho G
                pricePizza = 44;
                break;
        }
        return pricePizza;
    }

}