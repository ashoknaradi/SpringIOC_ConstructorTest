package Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import Pojos.AddressCon;
import Pojos.EmployeeCon;
import Pojos.QuestionCon;
import Pojos.StudentCon;

@Controller
public class ConstructorInj {

	@Autowired
	EmployeeCon ec1;
	@Autowired
	AddressCon ac1;
	@Autowired
	QuestionCon qc1;
	
	@RequestMapping(value = "constructorInjectionController")
	private String constInjDetails(Model model) {
		System.out.println("Entered into Constructor IOC and Scope Test Controller");
		System.out.println(ac1.toString());
		System.out.println(ec1.toString());
		/*qc1.id = 111;
		qc1.name ="aaa";
		qc2.id = 222;
		qc2.name = "bbb";*/
		System.out.println(qc1);

		return "Const";
	}
}
