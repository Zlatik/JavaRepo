package project;

public class ATypeName {
	private String name;
	private String value;
	private boolean enumerable;
	
	
	public ATypeName(String name,String value,boolean enumerable) {
		this.name = name;
		this.value = value;
		this.enumerable = enumerable;
	}
	
	public String getName() {
		return this.name;
	};
	
	public void setName(String val) {
		this.name = val;
	};
	public String getValue() {
		return this.value;
	};
	
	public void setValue(String val) {
		this.value = val;
	};
	
	public boolean isEnumerable() {
		return this.enumerable;
	};
	
	public void setName(boolean val) {
		this.enumerable = val;
	}

}
