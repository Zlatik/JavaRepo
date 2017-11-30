package project;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		ATypeName callendar = new ATypeName("callendar","11/26/2017",false);
		System.out.println(String.format("type is:%s ;value is:%s ;enumerable:%b", callendar.getName(),callendar.getValue(),callendar.isEnumerable()));
	}

}
