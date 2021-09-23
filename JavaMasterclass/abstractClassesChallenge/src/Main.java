
public class Main {

    public static void main(String[] args) {
        SearchTree tree =new SearchTree(null);

        String stringData = "2 2 4 6 8 7 1 3 2 5 2 8 5 0 7 ";

        String[] data = stringData.split(" ");
        for (String s : data) {
            tree.addItem(new Node(s));
        }


    }



}
