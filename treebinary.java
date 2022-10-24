import java.util.*;
public class treebinary {

	
		
		public static class TreeNode
		{
			int data;
			TreeNode left;
			TreeNode right;
			TreeNode(int data)
			{
				this.data=data;
			}
		}
	 
		
		public static  int getLeafCountOfBinaryTree(TreeNode node)
		{
			if(node == null)      
				return 0;
			if(node.left ==null && node.right==null)     
				return 1;           
			else
				return getLeafCountOfBinaryTree(node.left)+ getLeafCountOfBinaryTree(node.right);     
		}
	 
		public static void main(String[] args)
		{
			
			TreeNode rootNode=createBinaryTree();
			System.out.println("leaf nodes: "+getLeafCountOfBinaryTree(rootNode));
		}
	 
		public static TreeNode createBinaryTree()
		{
	 
			TreeNode rootNode =new TreeNode(40);
			TreeNode node14=new TreeNode(14);
			TreeNode node65=new TreeNode(65);
			TreeNode node88=new TreeNode(88);
			TreeNode node26=new TreeNode(26);
			TreeNode node72=new TreeNode(72);
			TreeNode node33=new TreeNode(33);
	 
			rootNode.left=node14;
			rootNode.right=node26;
	 
			node14.left=node65;
			node14.right=node88;
	 
			node26.left=node72;
			node26.right=node33;
	 
			return rootNode;
		}
	
	}
