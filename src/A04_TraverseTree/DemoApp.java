package A04_TraverseTree;

public class DemoApp {

    public static void main(String[] args) {



        W�rterbuch wb = new W�rterbuch();

        wb.add("Homer");
        wb.add("Flanders");
        wb.add("Maggie");
        wb.add("Marge");
        wb.add("Lisa");
        wb.add("Burns");
        wb.add("Crusty");
        wb.add("Bart");
        wb.add("Manjula");
        wb.add("Marty");


        wb.createList(wb.getRoot());

    }
}
