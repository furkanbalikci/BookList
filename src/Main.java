import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Duvar", 354, "Ahmet Şık", "05.01.2022"));
        books.add(new Book("Medyum", 300, "Stephan King","03.02.1998"));
        books.add(new Book("Enstitü", 420, "Stephan King", "08.08.2021"));
        books.add(new Book("Psikiyatrist", 335, "Wulf Dorn", "15.03.2017"));
        books.add(new Book("Aforizmalar", 215, "Schopenhauer", "1790"));
        books.add(new Book("Silmarilion", 423, "JJR", "17.7.2010"));

        Map<String,String> stringMap = new TreeMap<>();
        books.forEach(book -> {stringMap.put(book.getBookName(), book.getAuthorName());});
        ArrayList<Book> greaterThan100List = new ArrayList<>();
        books.forEach(i -> {
            if (i.getNumberOfPage() > 100) {
                greaterThan100List.add(i);
            }
        });
        greaterThan100List.forEach(i -> System.out.println(stringMap.get(i.getBookName())));

    }
}