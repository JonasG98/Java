package pcomputer;

public class Computer {
	
	protected  String manufacture;
	protected  String processor;
	protected  int ramSize;
	protected  int diskSize;
	private static int count;
	
	

	public Computer(String manufacture, String processor, int ramSize, int diskSize) {
		super();
		this.manufacture = manufacture;
		this.processor = processor;
		this.ramSize = ramSize;
		this.diskSize = diskSize;
		count ++;
	}



	@Override
	public String toString() {
		return "Computer manufacture=" + manufacture + ", processor=" + processor + ", ramSize=" + ramSize
				+ ", diskSize=" + diskSize + "";
	}



	public String getManufacture() {
		return manufacture;
	}

	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public int getRamSize() {
		return ramSize;
	}

	public void setRamSize(int ramSize) {
		this.ramSize = ramSize;
	}

	public int getDiskSize() {
		return diskSize;
	}

	public void setDiskSize(int diskSize) {
		this.diskSize = diskSize;
	}

	public static int getCount() {
		return count;
	}



	

}
