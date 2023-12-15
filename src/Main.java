import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Prodotto prodotto1 = new Prodotto("pane", 2.00);
        Prodotto prodotto2 = new Prodotto("crema", 3.00);
        Prodotto prodotto3 = new Prodotto("pane", 2.00);
        List<Prodotto> lista = new ArrayList<>();
        lista.add(prodotto1);
        lista.add(prodotto2);
        lista.add(prodotto3);
        System.out.println(lista);
        System.out.println(listaUnici(lista));
    }
    public static ArrayList<Prodotto> listaUnici (List<Prodotto> prodotti) {
        Set<Prodotto> listaPulita = new HashSet<>(prodotti);
        listaPulita.addAll(prodotti);
        return new ArrayList<>(listaPulita);
    }
}
