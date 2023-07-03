// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

    BinarySearchTree bst=new BinarySearchTree();

    bst.insert(50);
    bst.insert(20);
    bst.insert(70);
    bst.insert(10);
    bst.insert(30);
    bst.insert(70);
    bst.insert(40);
    bst.insert(80);

    bst.preOrder();
    bst.inOrder();

    }
}