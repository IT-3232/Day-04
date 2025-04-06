package lk.ac.vau.fas.ict.Controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.ac.vau.fas.ict.model.Student;

@RestController
@RequestMapping("/app")
public class Controllers {
	
	
	Student ob1 = new Student("2020ict30","Thilan",25,"IT",3.0);
	Student ob2 = new Student("2020ict21","Sandeepa",25,"IT",6.0);
	Student ob3 = new Student("2020ict49","goka",25,"IT",4.0);
	Student ob4 = new Student("2020ict32","baiyamalliteshan",25,"IT",4.0);
	//Student[] arr = {ob1,ob2,ob3,ob4};
	/*@GetMapping("/list")
	public Student[] getdetails() {
		return arr;
	}*/
	
	private Map<String,Student> mstudent = new HashMap<String,Student>();
	
	@GetMapping("/addDetails")
	public void addobjects() {
		mstudent.put(ob1.getRegNo(),ob1);
		mstudent.put(ob2.getRegNo(),ob2);
		mstudent.put(ob3.getRegNo(),ob3);
		mstudent.put(ob4.getRegNo(),ob4);
	}
	
	@GetMapping("/details")
	public Map<String,Student> getdetails(){
		return mstudent;
	}
	
	
	
	
}
