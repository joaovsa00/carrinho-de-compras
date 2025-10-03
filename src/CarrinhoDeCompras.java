import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        itemList.add(new Item(nome,preco,quantidade));
    }

    public void removerItem(String nome){
        List<Item> itemListRemove = new ArrayList<>();

        for(Item i : itemList) {
            if (nome.equalsIgnoreCase(i.getNome())){
                itemListRemove.add(i);
            }
        }
        itemList.removeAll(itemListRemove);
    }

    public double calcularValorTotal(){

        double valorTotal = 0;

        for (Item i : itemList){
            valorTotal += i.getPreco() * i.getQuantidade();
        }

        return valorTotal;
    }

    public void exibirItens(){
        //itemList.forEach(i -> System.out.println(i));
        itemList.forEach(System.out::println);
    }
}
