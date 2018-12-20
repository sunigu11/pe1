import java.io.File;
public class Checkff{
	public static void main(String args[]){
		File f = new File("ff1.txt");
		if(f.exists()){
			System.out.println("file exist"+ f.getName());
		}else{
			System.out.println(" file doesnot exist");
		}
	}
}