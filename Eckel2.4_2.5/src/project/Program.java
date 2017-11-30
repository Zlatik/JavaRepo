package project;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DataOnly store = new DataOnly();
		/*store.setNumber(12);
		store.setString("i am single string");
		store.setFloat(1.34f);
		store.setBoolean(false);*/
		
		System.out.println(String.format("number:%d ;string:%s ;float: %f;boolean: %b.",store.getNumberData(),store.getStringData(),store.getFloatedData(),store.getBooleanData()));
	}

}
