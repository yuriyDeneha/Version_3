package inter;
import java.util.List;
import java.util.ArrayList;

public class OOPtask {
	public static void main(String[] args)
	{
		List<String> symptoms_1 = new ArrayList<String>();
		symptoms_1.add("Stomachache");
		symptoms_1.add("Intense pain");
		List<String> symptoms_2 = new ArrayList<String>();
    	symptoms_2.add("Cough");
    	symptoms_2.add("Intense pain");
        symptoms_2.add("Blood in urine");
        symptoms_2.add("Hard breathing");
		List<String> symptoms_3 = new ArrayList<String>();
	    symptoms_3.add("Cough");
	    symptoms_3.add("Fever");
	    
		Hospital hospital = new Hospital();		
		Illness c1 = new Cold(symptoms_3, 3, 41.2);
		Illness c2 = new Cold(symptoms_3, 25, 39.4);
		 // list of symptoms, age of patient for effective treatment, temperature
		Illness l1 = new LungsCancer(symptoms_2,"You've lungsCancer and its incurable ",true);
		Illness l2 = new LungsCancer(symptoms_2,"That is lungsCancer and a chemotherapy dont help, i'm sorry",false);
		 // list of symptoms, informing patient about it, is needed chemotherapy or not
		Illness a1 = new Appendicitis(symptoms_1,false,"Surgery was successful!");	
		Illness a2 = new Appendicitis(symptoms_1,true,"Surgery was difficult, but now everything is fine!");	
		// list of symptoms, is appendicitis acute or not , result of surgery;
		hospital.Add(c1);
		hospital.Add(c2);
		hospital.Add(a1);
		hospital.Add(a2);
		hospital.Add(l1);
		hospital.Add(l2);
		hospital.DesribeAll();
	}
}
