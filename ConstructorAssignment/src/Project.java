
public class Project {
	private int projectid;
	private String projectName;
	private String clientName;

	public Project(int projid, String projName, String cliName) {
		super();
		this.projectid = projid;
		this.clientName = cliName;
		this.projectName = projName;
	}

	@Override
	public String toString() {
		return "\nProject - [id: " + projectid + ", Project name: " + projectName + ", Client name: " + clientName + "]";
	}

}
