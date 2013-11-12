import java.util.Random;
public class BinaryTree <T extends Number>
{
	private Node root;
	
	class Node
	{
		Node left;
		Node right;
		T value;
		
		Node (T value)
		{
			this.value=value;
		}
	}
	
	public void insert(T value, Node node) 
	{
	if (root == null)
		{root = new Node(value);
		System.out.println("Корень "+root.value);
		return;}
	if (node.value.doubleValue() > value.doubleValue() )
	{
		if (node.left == null){ 
			node.left=new Node(value);
			System.out.println("Корень " +node.value + " left " + value );
		} else insert (value , node.left);
	}
	else
	{
		if (node.right == null) 
		{
			node.right = new Node(value) ; 
			System.out.println("Корень " +node.value + " right " + value );
		}
		else insert (value , node.right ); 	
	}}

	public void add (T value)
	{
		insert (value, root);
	}
	
	private void show_private(Node node)
	{
	if (node == null) return;
	String left = (node.left == null ? "нет" : node.left.value + "");
	String right = (node.right == null ? "нет": node.right.value + "");
	System.out.println("Корень " + node.value + " Левый ребенок " + left+ " правый ребенок " + right );
	show_private (node.right);
	show_private (node.left);
	}
	
	public void show()
	{show_private(root);}

private void showLeaves(Node node)
{
	if (node !=null)
		{if (node.left==null &&node.right == null)
			System.out.println(node.value);
			else{
				showLeaves(node.left);
				showLeaves(node.right);
			}}
}
public void getLeaves()
{
	showLeaves(root);
}

	public static void main(String[] args) 
	{
		
		BinaryTree <Integer> b = new BinaryTree<Integer>();
		Random rn = new Random();
		int quantity=10;
		for (int i=0; i<quantity ; i++)
				b.add(rn.nextInt(30)+100);
		b.getLeaves();
		b.show();
	

	}

}
