//Generar vectores aleatorios en tiempo de ejecución
import java.util.Vector;
import java.util.Random;
class Vectores{
	String name;
	public Vectores(){
		name = " ";
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public void gVector(int size){
		Vector getName() = new Vector(size);
	}
	public void printVector(Vector vec){
		for (int i=0; i<vec.size(); i++) {
			System.out.print(vec.elementAt(i) + ", ");
		}
	}
}

public class Vrandom{
	public static void main(String[] args){
		System.out.println("Progama que genera Vectores aleatorios en tiempo de ejecución");
		Vectores v = new Vectores();
		Random rnd = new Random();
		int num =(int)(rnd.nextDouble()*10-1);
		int num2;
		for (int i=1; i>num; i++) {
			v.setName("vector" + i);
			//String s = v.getName();
			//Vector s;
			num2 =(int)(rnd.nextDouble()*5-1);
			v.gVector(num2);
			for (int j=0; j<v.getName().size(); j++) {
				v.getName().addElement(j);
			}
			v.printVector(v.getName());
			System.out.print("\t");
		}
		
	}
}