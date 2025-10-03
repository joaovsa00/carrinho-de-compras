public class Main {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Arroz",20,5);
        carrinhoDeCompras.adicionarItem("Feijão",10.59,2);
        carrinhoDeCompras.adicionarItem("Macarrão",4.80,1);
        carrinhoDeCompras.adicionarItem("Arroz",20,5);

        carrinhoDeCompras.exibirItens();
        System.out.printf("O valor total da compra é de: %s\n",
                String.format("%.2f",carrinhoDeCompras.calcularValorTotal()));

        carrinhoDeCompras.removerItem("Arroz");

        System.out.println("");

        carrinhoDeCompras.exibirItens();
        System.out.printf("O valor total da compra é de: %s\n",
                String.format("%.2f",carrinhoDeCompras.calcularValorTotal()));

        carrinhoDeCompras.removerItem("Feijão");

        System.out.println("");

        carrinhoDeCompras.exibirItens();
        System.out.printf("O valor total da compra é de: %s\n",
                String.format("%.2f",carrinhoDeCompras.calcularValorTotal()));
    }
}
