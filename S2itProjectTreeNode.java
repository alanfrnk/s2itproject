package s2itprojecttree;

/**
 *
 * @author alanfrank
 */
public class S2itProjectTreeNode {
    public int data;
    public S2itProjectTreeNode left;
    public S2itProjectTreeNode right;

    public S2itProjectTreeNode(int num) {
        this.data = num;
        this.left = null;
        this.right = null;
    }

    public S2itProjectTreeNode() {
        this.left = null;
        this.right = null;
    }

    public static S2itProjectTreeNode createNode(int number) {
        return new S2itProjectTreeNode(number);
    }
}
