package inter;
import java.util.ArrayList; 
import java.util.List; 

public class Hospital {
	public List<Illness> ills = new ArrayList<Illness>();
	public void Add(Illness newIll){
		ills.add(newIll);
	}
	public void DesribeAll(){
		for(Illness ill: ills) {
			ill.describe();
		}
	}
}
