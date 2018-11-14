package s2itprojecttree;

/**
 *
 * @author alanfrank
 */
public class S2itProjectTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Nível 1
        Node A = Node.createNode(10);
	
        //Nível 2
        Node B = Node.createNode(20);
        Node C = Node.createNode(30);
        
        //Nível 3
        Node D = Node.createNode(15);
        Node E = Node.createNode(32);
        Node F = Node.createNode(12);
        Node G = Node.createNode(11);
        
        //Nível 4
        Node H = Node.createNode(14);
        Node I = Node.createNode(8);
        Node J = Node.createNode(23);
        Node K = Node.createNode(36);
        Node L = Node.createNode(21);
        Node M = Node.createNode(24);
        Node N = Node.createNode(77);
        Node O = Node.createNode(91);

        A.left = B;
        A.right = C;

        B.left = D;
        B.right = E;
        C.left = F;
        C.right = G;
        
        D.left = H;
        D.right = I;
        E.left = J;
        E.right = K;
        F.left = L;
        F.right = M;
        G.left = N;
        G.right = O;
                
	int totalSum = SumOfChildNodes.sumOfChildNodes(H);
	System.out.println("Sum of nodes in a node : " + totalSum);
    }    
}
