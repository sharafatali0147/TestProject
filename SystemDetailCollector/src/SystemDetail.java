import javax.swing.*;

class SystemDetail{
	private String department;
	private String employeeName;
	private String lapTopMake;
	private String model;
	private String cpu;
	private String ram;
	private String hardDisk;
	private String ipAddress;

	private static int countSystems = 0;

	

	public SystemDetail(String department, String employeeName, String lapTopMake, String model, String cpu, String ram, String hardDisk, String ipAddress){
		setDepartment(department);
		setEmployeeName(employeeName);
		setLapTopMake(lapTopMake);
		setModel(model);
		setCPU(cpu);
		setRAM(ram);
		setHardDisk(hardDisk);
		setIpAddress(ipAddress);

		countSystems++;
	}

	public void setDepartment(String department){
		this.department = department;
	}
	public void setEmployeeName(String employeeName){
		this.employeeName = employeeName;
	}
	public void setLapTopMake(String lapTopMake){
		this.lapTopMake = lapTopMake;
	}
	public void setModel(String model){
		this.model = model;
	}
	public void setCPU(String cpu){
		this.cpu = cpu;
	}
	public void setRAM(String ram){
		this.ram = ram;
	}
	public void setHardDisk(String hardDisk){
		this.hardDisk = hardDisk;
	}
	public void setIpAddress(String ipAddress){
		this.ipAddress = ipAddress;
	}

	public String getDepartment(){
		return department;
	}
	public String getEmployeeName(){
		return employeeName;
	}
	public String getLapTopMake(){
		return lapTopMake;
	}
	public String getModel(){
		return model;
	}
	public String getCPU(){
		return cpu;
	}
	public String getRAM(){
		return ram;
	}
	public String getHardDisk(){
		return hardDisk;
	}
	public String getIpAddress(){
		return ipAddress;
	}

	public void print(){
// department employeeName lapTopMake model CPU ram hardDisk ipAddress;
		JOptionPane.showMessageDialog(null, " Department:   " + department + "\n Employee Name:   " + employeeName + "\n LapTop Make:   " + 
	lapTopMake + "\n Model:   " + model + "\n CPU:   " + cpu + "\n RAM:   " + ram + "\n Hard Disk:   " + hardDisk + "\n IP Address:   " + ipAddress);

	}

	public void finalize(){
		countSystems--;
		System.out.println("Remaining objects are " + countSystems);
	}
}