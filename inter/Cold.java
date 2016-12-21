package inter;
import java.util.List;

public class Cold extends IsCurable{
	int agePatient;
	double temperature;
	String pills;
	String antipyretic;
	Cold (List<String> symptoms, int agePatient,double temperature){
		this.symptoms = symptoms;
		this.agePatient = agePatient;
		this.temperature=temperature;
		this.pills = NeededPills(agePatient);
		this.antipyretic=Antipyretic(temperature);
	}
	public String treatment(){
		return pills;
	}	
	public static String NeededPills(int agePatient){
		if  (agePatient< 8) 
			return "BabyPillIT"; 
		else
			return "OldPillIT";
	}
	public static String Antipyretic(double temperature){
		if  (temperature< 39.0) 
			return "LowFeverPill"; 
		else
			return "HighFeverPill";
	}
	public String listSymptoms(){
		String list = new String();
		for(String s: symptoms) {
			list += (s + ", ");
		}
		return list;
	}
	public  void describe(){
		System.out.println("Cold: symptoms - " + this.listSymptoms() + "; treatment- " + this.treatment()+ "Fever pills - "+ this.antipyretic +"\n" );
	}    
}