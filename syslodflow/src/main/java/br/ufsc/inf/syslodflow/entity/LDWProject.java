package br.ufsc.inf.syslodflow.entity;


public class LDWProject extends BaseModel {
	
	private Person creator;
	private Homepage homePage;
	private LDWorkflow ldWorkFlow;
	private Report report;
	private String goal;
	private String description;
	private String name;
	private String fileName;
	private String uri;
	
	public LDWProject(String name, String description,
			String goal, Person creator,
			Homepage homePage, Report report,
			LDWorkflow ldWorkFlow, String uri) {
		
		this.creator = creator;
		this.homePage = homePage;
		this.ldWorkFlow = ldWorkFlow;
		this.report = report;
		this.goal = goal;
		this.description = description;
		this.name = name;
		this.uri = uri;
		
	}

	public LDWProject() {
		homePage = new Homepage();
		creator = new Person();
		report = new Report();
	}

	public Person getCreator() {
		return creator;
	}

	public void setCreator(Person creator) {
		this.creator = creator;
	}

	public Homepage getHomePage() {
		return homePage;
	}

	public void setHomePage(Homepage homePage) {
		this.homePage = homePage;
	}
	
	public LDWorkflow getLdWorkFlow() {
		return ldWorkFlow;
	}

	public void setLdWorkFlow(LDWorkflow ldWorkFlow) {
		this.ldWorkFlow = ldWorkFlow;
	}

	public Report getReport() {
		return report;
	}

	public void setReport(Report report) {
		this.report = report;
	}

	public String getGoal() {
		return goal;
	}

	public void setGoal(String goal) {
		this.goal = goal;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	@Override
	public String getUri() {
		return uri;
	}

	@Override
	public void setUri(String uri) {
		this.uri = uri;
	}

	@Override
	public String toString() {
		return "ldwProject";
	}
	
	
}