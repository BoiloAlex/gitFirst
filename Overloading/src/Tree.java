//import static net.mindview.until.Print.*;
class Tree {
int height;
Tree() {
	System.out.println("������ ������");
	height=0;
}
Tree (int initialHeight){
 		height=initialHeight;
 		System.out.println("�������� ������ ������ ������� "+height+"�.");
	}
void info(){
	System.out.println("������ ������� "+height+" �.");
	
}
void info (String s){
	System.out.println(s+": ������ ������� "+height+" �.");
}
}