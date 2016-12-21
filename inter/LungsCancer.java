package inter;

import java.util.List;

public class LungsCancer extends IsIncurable{
	String inform;
	boolean doChemotherapy;
    LungsCancer (List<String> symptoms, String inform, boolean doChemotherapy){
		this.symptoms = symptoms;
		this.inform = inform;
		this.doChemotherapy = doChemotherapy;
	}
  	public String treatment(){
  		if (doChemotherapy)
  			return Chemotherapy();
  		else 
  			return "prays";
  	}	
  	public String Chemotherapy(){
  		return "chemotherapy done.";
  	}	
    public String listSymptoms(){
      String list = new String();
   		for(String s: symptoms) {
			list+= (s + ", ");
		}
      return list;
    }
  	public void describe(){
  		System.out.println("Symptoms - " + this.listSymptoms() + "; and- " + this.inform + ". treatment - "  + this.treatment() + "\n");
	} 
}
