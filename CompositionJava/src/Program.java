import computerParts.*;

public class Program {

	public static void main(String[] args) {
		Computer computer = new Computer();
		Cpu cpu = new Cpu();
		VideoCard videocard = new VideoCard();
		
		cpu.setBrand("intel");
		cpu.setModel("i7");
		cpu.setMemory(4096);
		
		videocard.setBrand("nvidia");
		videocard.setModel("630m");
		videocard.setMemory(2046);
		
		computer.setBrand("HP");
		computer.setModel("Sleekbook 15");
		computer.setCpu(cpu);
		computer.setVideoCard(videocard);
		
		System.out.println("Your computer"+":"+computer.getBrand()+" "+computer.getModel());
		System.out.println("CPU"+":"+cpu.getBrand()+" "+cpu.getModel()+" "+cpu.getMemory());
		System.out.println("VideoCard"+":"+videocard.getBrand()+" "+videocard.getModel()+" "+videocard.getMemory());
	}

}
