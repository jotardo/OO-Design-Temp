package decorator.ex4;

public abstract class ProjectDecorator implements ProjectItem{

	private ProjectItem projectItem;
	
	public ProjectDecorator(ProjectItem projectItem) {
		this.projectItem = projectItem;
	}
	
	@Override
	public double getTimeRequired() {
		return projectItem.getTimeRequired();
	}

}
