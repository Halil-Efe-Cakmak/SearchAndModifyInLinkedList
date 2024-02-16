import java.io.IOException;
public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        try {
            linkedList.insertUniqueValueFromFile(linkedList, "src/Source.txt");
            linkedList.display();
        } catch (IOException E) {
            long startSecond = System.nanoTime();

            linkedList.searchAndMoveFromFile("src/Search.txt");

            long finishSecond = System.nanoTime();

            System.out.println(finishSecond - startSecond);
        }
    }
}

