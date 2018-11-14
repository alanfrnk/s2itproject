package s2itprojecttree;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author alanfrank
 */
public class S2itProjectTreeSumOfChildNodes {
    public static int sumOfChildNodes(S2itProjectTreeNode rootNode) {
        
	Queue<S2itProjectTreeNode> nodeQueue = new LinkedList<>();
	nodeQueue.offer(rootNode);
	
	int sumOfNodes = 0;
	while (!nodeQueue.isEmpty()) {
            
            S2itProjectTreeNode node = nodeQueue.poll();
            sumOfNodes += node.data;
            
            if (node.left != null) {
                nodeQueue.offer(node.left);
            }
            
            if (node.right != null) {
                nodeQueue.offer(node.right);
            }
	}
	return sumOfNodes;
    }
}
