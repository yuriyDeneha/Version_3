package inter;
import java.util.List;

public class Appendicitis extends IsCurable{
	boolean isSharp;
	String resultOfSurgery;
	Appendicitis (List<String> symptoms, boolean isSharp, String resultOfSurgery){
		this.symptoms = symptoms;
		this.isSharp = isSharp;
		this.resultOfSurgery = resultOfSurgery;		
	}
	public String treatment(){
		return Surgery();
	}
	public String listSymptoms(){
		String list = new String();
		
		for(String s: symptoms) {
			list+= (s + ", ");
		}
		return list;
	}
	public String Surgery(){
		return resultOfSurgery;
	}
	public void describe(){
		System.out.println( "Appendicitis: symptoms - " + this.listSymptoms() + "; is Sharp- " + this.isSharp + "  treatment- " + this.treatment()+ "\n");
	} 
}
