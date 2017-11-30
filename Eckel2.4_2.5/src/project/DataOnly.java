package project;

public class DataOnly {
	private int numberData;
	private float floatedData;
	private String stringData;
	private boolean booleanData;
	
	public int getNumberData() {
		return this.numberData;
	};
	public float getFloatedData() {
		return this.floatedData;
	};
	public String getStringData() {
		return this.stringData;
	};
	
	public boolean getBooleanData() {
		return this.booleanData;
	};
	
	public void setNumber(int val) {
		this.numberData = val;
	};
	public void setString(String val) {
		this.stringData = val;
	};
	public void setFloat(float val) {
		this.floatedData = val;
	};
	public void setBoolean(boolean val) {
		this.booleanData = val;
	};
	
	public DataOnly() {
		this.numberData = 0;
		this.stringData = "";
		this.floatedData = 0.0f;
		this.booleanData = false;
	}
	
}
