
public class Overloading {
	public static void main (String[]  args){
		new Tree();
		for (int i=1; i<5; i++){
			Tree t=new Tree(i);
			t.info();
			t.info("Перегруженный метод") ;
		}
		
	}
}
