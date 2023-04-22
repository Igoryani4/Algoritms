public class Tree {
    public static <RBTree> void main(String[] args) {
        RedBlackTree node = new RedBlackTree();

        node.insert(13);
        node.inorder();
        System.out.println("\n");
        node.insert(6);
        node.inorder();
        System.out.println("\n");
        node.insert(23);
        node.inorder();
        System.out.println("\n");
        node.insert(66);
        node.inorder();
        System.out.println("\n");
        node.insert(-135);
        node.inorder();
        System.out.println("\n");
        node.insert(-6658);
        node.inorder();
        System.out.println("\n");
        node.insert(5);
        node.inorder();
        System.out.println("\n");
        node.insert(152);
        node.inorder();

    }
}
