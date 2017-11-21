package computerParts;

public class Computer {
	private String brand;
	private String model;
	private VideoCard vd;
	private Cpu cpu;
	
	public void setBrand(String val) {
		this.brand = val;
	}
	public String getBrand() {
		return this.brand;
	}
	public void setModel(String val) {
		this.model = val;
	}
	public String getModel() {
		return this.model;
	}
	public Cpu getCpu() {
		return this.cpu;
	}
	public void setCpu(Cpu CPU) {
		this.cpu = CPU;
	}
	public VideoCard getVideoCard() {
		return this.vd;
	}
	public void setVideoCard(VideoCard videocard) {
		this.vd = videocard;
	}

}
