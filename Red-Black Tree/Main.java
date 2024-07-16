/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rebblacktree;

/**
 *
 * @author Dell
 */
public class Main {
    public static void main(String[] args) {
        RedBlackTree bst = new RedBlackTree();
        bst.insert(8);
    	bst.insert(18);
    	bst.insert(5);
    	bst.insert(15);
    	bst.insert(17);
    	bst.insert(25);
    	bst.insert(40);
    	bst.insert(80);
    	bst.DeleteNode(25);
    	bst.PrintTree();
    }
}
