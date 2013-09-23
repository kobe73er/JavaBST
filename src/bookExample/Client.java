package bookExample;

import java.util.ArrayList;

import bookExample.BinaryTree.TreeNode;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTree<String> bt=new BinaryTree<String>();
		bt.insert("a");
		bt.insert("b");
		bt.insert("c");
		bt.insert("d");
		bt.insert("e");
		bt.insert("f");
		
		System.out.println(bt.search("f"));
		bt.breadthFirstTraversal(bt.root);
		System.out.println(bt.breadthFirstTraverHashSet);
				
//       System.out.println(bt.breadthFirstTraverHashSet);		
		

	}

}
