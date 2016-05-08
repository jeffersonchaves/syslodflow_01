package br.ufsc.inf.syslodflow.dto;

public class LDWStepExecutionDTO {
	
	String name;
	String uri;
	
	public LDWStepExecutionDTO(String name, String uri) {
		this.name = name;
		this.uri = uri;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

}
