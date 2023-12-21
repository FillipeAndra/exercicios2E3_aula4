import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
    public class Main {
    public static void main(String[] args) {
        Titulo t1 = new Titulo("filme1");
        Titulo t2 = new Titulo("filme4");
        Titulo t3 = new Titulo("filme3");
        Titulo t4 = new Titulo("filme2");

        List<Titulo> lista = new ArrayList<>();
        lista.add(t1);
        lista.add(t2);
        lista.add(t3);
        lista.add(t4);
        Collections.sort(lista);
        System.out.println(lista);
    }
}