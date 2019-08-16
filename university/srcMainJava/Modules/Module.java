package Modules;

import grades.Grade;

public class Module {
	
	private String moduleId;
	private String moduleName;
	private String status;
	private Grade grades;
	private int semester;
	
	
	
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}
	public String getModuleId() {
		return moduleId;
	}
	public void setModuleId(String moduleId) {
		this.moduleId = moduleId;
	}
	public String getModuleName() {
		return moduleName;
	}
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Grade getGrades() {
		return grades;
	}
	public void setGrades(Grade grades) {
		this.grades = grades;
	}
	
	
	
	
	
	
	
	
	
	

}
