package Solution.Employees;

public class Program {

	public static void main(String[] args) {
		Manager mgr 
		   = new Manager("Sue Dunlop", "Boss");
		TechnicalAuthor ta 
		   = new TechnicalAuthor("Jim Ronald", "Technical Author");
		SecurityGuard secG 
		   = new SecurityGuard("Bobby Gee", "Security Guard");
		Draughtsman drman 
		   = new Draughtsman("Fred Morris", "Draughtsman");
		Employee oj = new Employee("Billy Bowen", "Office Junior");

		// assign employees to manager
		mgr.addEmployee(ta);
		mgr.addEmployee(secG);
		mgr.addEmployee(drman);
		mgr.addEmployee(oj);

		// give Tech Auth a single skill
		ta.setSkill("Technical writing");

		// give Sec Guard a single skill and
		// set his work preference
		secG.setSkill("Watching TV");
		secG.setPrefersNightWork(true);

		// give DrMan 3 skills
		drman.setSkill("Technical drawing");
		drman.setSkill("CAD/CAM");
		drman.setSkill("Mentoring");

//		 mgr.showInfo();
//		 ta.showInfo();
//		 secG.showInfo();
//		 drman.showInfo();
//		 oj.showInfo();

		Employee[] employees = { mgr, ta, secG, drman, oj };
		for (Employee e : employees) {
			e.showInfo();
		}

	}

}
