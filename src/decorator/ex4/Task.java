package decorator.ex4;

import java.util.List;

public class Task {
	private String name;
	private List<ProjectItem> projectItems;
	private Contact owner;
	private double timeRequired;

	public String getName() {
		return name;
	}

	public List<ProjectItem> getProjectItems() {
		return projectItems;
	}

	public Contact getOwner() {
		return owner;
	}

	public double getTimeRequired() {
		return timeRequired;
	}
	
	public void addProjectItem(ProjectItem element) {
		this.projectItems.add(element);
	}
	
	public boolean removeProjectItem(ProjectItem element) {
		return this.projectItems.remove(element);
	}

}
