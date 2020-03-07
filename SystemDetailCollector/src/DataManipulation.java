import java.util.*;
//import javax.swing.*;
//import java.io.*;

class DataManipulation{
	ArrayList<SystemDetail> arrayList;

	public DataManipulation(){

		arrayList = new ArrayList<SystemDetail>();
		//loadSystemDetail();
	}
//====================&&&&&&&&&&&  Add function &&&&&&&&&&&====================
	public void addSystemDetail(String department, String employeeName, String lapTopMake, String model, String cpu, String ram, String hardDisk, String ipAddress){

//		String department = JOptionPane.showInputDialog("Enter the Department: ");
//		String employeeName = JOptionPane.showInputDialog("Enter the Employee Name: ");
//		String lapTopMake = JOptionPane.showInputDialog("Enter the LapTop Company Name: ");
//		String model = JOptionPane.showInputDialog("Enter the LapTop Model: ");
//		String cpu = JOptionPane.showInputDialog("Enter the CPU: ");
//		String ram = JOptionPane.showInputDialog("Enter the RAM: ");
//		String hardDisk = JOptionPane.showInputDialog("Enter the Had Disk: ");
//		String ipAddress = JOptionPane.showInputDialog("Enter the IP Address: ");

		SystemDetail systemObj = new SystemDetail(department, employeeName, lapTopMake, model, cpu, ram, hardDisk, ipAddress);

		arrayList.add(systemObj);
	}

	public SystemDetail searchSystemDetail(String name){
		for (int i = 0; i < arrayList.size(); i++) {

			SystemDetail obj = (SystemDetail)arrayList.get(i);

			if(name.equals(obj.getEmployeeName())){
				//obj.print();
				return obj;
			}
		}
		return null;
	}

	public void deleteSystemDetail(String name){
		for (int i = 0; i < arrayList.size(); i++) {

			SystemDetail obj = (SystemDetail)arrayList.get(i);

			if(name.equals(obj.getEmployeeName())){
				arrayList.remove(i);
				obj.finalize();	//obj.finalize(i);	 for testing 	
			}
		}
	}

	//>>>>>>>>>>>>>>>>>>>>>>>>Data reading from file<<<<<<<<<<<<<<<<<<<<<<<<
//	public void loadSystemDetail(){
//		String tokens[] = null;
//		String department, employeeName, lapTopMake, model, cpu, ram, hardDisk, ipAddress;//name, add, ph;
//
//		try{
//			FileReader fr = new FileReader("SystemDetail.txt");
//			BufferedReader br = new BufferedReader(fr);
//
//			String line = br.readLine();
//
//			while(line != null){
//
//				tokens = line.split(",");
//
//				department = tokens[0];
//				employeeName = tokens[1];
//				lapTopMake = tokens[2];
//				model = tokens[3];
//				cpu = tokens[4];
//				ram = tokens[5];
//				hardDisk = tokens[6];
//				ipAddress = tokens[7];
//
//				SystemDetail obj = new SystemDetail(department, employeeName, lapTopMake, model, cpu, ram, hardDisk, ipAddress);
//				arrayList.add(obj);
//
//				line = br.readLine();
//			}
//
//			br.close();
//			fr.close();
//		}catch (IOException ioEx) {
//			System.out.println(ioEx);
//		}
//	}
	//>>>>>>>>>>>>>>>>>>>>>>>>Data Writing in file  <<<<<<<<<<<<<<<<<<<<<<<<
//	public void saveSystemDetail(){
//		try{
//			SystemDetail obj;
//			String line;
//
//			FileWriter fw = new FileWriter("SystemDetail.txt");
//			PrintWriter pw = new PrintWriter(fw);
//
//			for(int i = 0; i < arrayList.size(); i++){
//
//				obj = (SystemDetail)arrayList.get(i); 
//
//				line = obj.getDepartment() + ", " + obj.getEmployeeName() + ", " + obj.getLapTopMake() + ", " + obj.getModel() + ", " + 
//				obj.getCPU() + ", " + obj.getRAM() + ", " + obj.getHardDisk() + ", " + obj.getIpAddress();
//
//				// writes line to file (persons.txt)
//				pw.println(line);
//			}
//
//			pw.flush();
//			pw.close();
//			fw.close();
//
//		}catch (IOException ioEx) {
//			System.out.println(ioEx);
//		}
//	}

}