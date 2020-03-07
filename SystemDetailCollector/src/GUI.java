import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
//import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
//import java.awt.event.MouseAdapter;
//import java.awt.event.MouseEvent;

public class GUI {

	private JFrame frmSystemDetailCollector;
	private JTextField departmentField;
	private JTextField brandField;
	private JTextField modelField;
	private JTextField nameField;
	private JTextField CPUField;
	private JTextField RAMField;
	private JTextField hardDiskField;
	private JTextField IPField;
	private JTextField searchField;
	private JButton btnSubmit;
	private JButton btnClear;
	private JButton btnSearch;
	
	
	DataManipulation dataManipulation_ref = new DataManipulation();
	SystemDetail obj;
	String department, employeeName, lapTopMake, model, cpu, ram, hardDisk, ipAddress;
	String searchName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frmSystemDetailCollector.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSystemDetailCollector = new JFrame();
		frmSystemDetailCollector.getContentPane().setBackground(new Color(0, 255, 255));
		frmSystemDetailCollector.getContentPane().setForeground(Color.BLUE);
		frmSystemDetailCollector.setTitle("System Detail Collector");
		frmSystemDetailCollector.setBounds(100, 100, 416, 276);
		frmSystemDetailCollector.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSystemDetailCollector.getContentPane().setLayout(null);
		// ==============================================================================
		
		JLabel mainLabel = new JLabel("System Detail Collector");
		mainLabel.setForeground(new Color(51, 0, 204));
		mainLabel.setBackground(new Color(51, 0, 204));
		mainLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		mainLabel.setBounds(107, 0, 200, 20);
		frmSystemDetailCollector.getContentPane().add(mainLabel);
		// ==============================================================================
		
		JLabel lblDep = new JLabel("Department");
		lblDep.setForeground(new Color(102, 51, 255));
		lblDep.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDep.setBounds(10, 26, 90, 24);
		frmSystemDetailCollector.getContentPane().add(lblDep);
		
		departmentField = new JTextField();
//		departmentField.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseExited(MouseEvent e) {
//				department = departmentField.getText();
//			}
//		});
		departmentField.setBounds(97, 29, 107, 20);
		frmSystemDetailCollector.getContentPane().add(departmentField);
		departmentField.setColumns(10);
		// ==============================================================================
		
		JLabel lblName = new JLabel("Name");
		lblName.setForeground(new Color(102, 51, 255));
		lblName.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblName.setBounds(239, 29, 48, 14);
		frmSystemDetailCollector.getContentPane().add(lblName);
		
		nameField = new JTextField();
//		nameField.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseExited(MouseEvent e) {
//				employeeName = nameField.getText();
//			}
//		});
		nameField.setBounds(282, 27, 107, 20);
		frmSystemDetailCollector.getContentPane().add(nameField);
		nameField.setColumns(10);
		// ==============================================================================
		
		JLabel lblBrand = new JLabel("Brand");
		lblBrand.setForeground(new Color(102, 51, 255));
		lblBrand.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblBrand.setBounds(10, 79, 48, 14);
		frmSystemDetailCollector.getContentPane().add(lblBrand);
		
		brandField = new JTextField();
//		brandField.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseExited(MouseEvent e) {
//				lapTopMake = brandField.getText(); 
//			}
//		});
		brandField.setBounds(97, 77, 107, 20);
		frmSystemDetailCollector.getContentPane().add(brandField);
		brandField.setColumns(10);
		// ==============================================================================
		
		JLabel lblModel = new JLabel("Model");
		lblModel.setForeground(new Color(102, 51, 255));
		lblModel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblModel.setBounds(239, 79, 48, 14);
		frmSystemDetailCollector.getContentPane().add(lblModel);
		
		modelField = new JTextField();
//		modelField.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseExited(MouseEvent e) {
//				model = modelField.getText();
//			}
//		});
		modelField.setBounds(282, 77, 107, 20);
		frmSystemDetailCollector.getContentPane().add(modelField);
		modelField.setColumns(10);
		// ==============================================================================
		
		JLabel lblCPU = new JLabel("CPU");
		lblCPU.setForeground(new Color(102, 51, 255));
		lblCPU.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCPU.setBounds(10, 124, 48, 14);
		frmSystemDetailCollector.getContentPane().add(lblCPU);
		
		CPUField = new JTextField();
//		CPUField.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseExited(MouseEvent e) {
//				cpu = CPUField.getText();
//			}
//		});
		CPUField.setBounds(97, 122, 107, 20);
		frmSystemDetailCollector.getContentPane().add(CPUField);
		CPUField.setColumns(10);
		// ==============================================================================
		
		JLabel lblRAM = new JLabel("RAM");
		lblRAM.setForeground(new Color(102, 51, 255));
		lblRAM.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblRAM.setBounds(239, 124, 48, 14);
		frmSystemDetailCollector.getContentPane().add(lblRAM);

		RAMField = new JTextField();
//		RAMField.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseExited(MouseEvent e) {
//				ram = RAMField.getText();
//			}
//		});
		RAMField.setBounds(282, 122, 107, 20);
		frmSystemDetailCollector.getContentPane().add(RAMField);
		RAMField.setColumns(10);
		// ==============================================================================
		
		JLabel lblHD = new JLabel("HardDisk");
		lblHD.setForeground(new Color(102, 51, 255));
		lblHD.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblHD.setBounds(10, 166, 81, 14);
		frmSystemDetailCollector.getContentPane().add(lblHD);

		hardDiskField = new JTextField();
//		hardDiskField.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseExited(MouseEvent e) {
//				hardDisk = hardDiskField.getText();
//			}
//		});
		hardDiskField.setBounds(97, 164, 107, 20);
		frmSystemDetailCollector.getContentPane().add(hardDiskField);
		hardDiskField.setColumns(10);
		// ==============================================================================
		
		JLabel lblIP = new JLabel("IP");
		lblIP.setForeground(new Color(102, 51, 255));
		lblIP.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblIP.setBounds(239, 166, 48, 14);
		frmSystemDetailCollector.getContentPane().add(lblIP);

		IPField = new JTextField();
//		IPField.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseExited(MouseEvent e) {
//				ipAddress = IPField.getText();
//			}
//		});
		IPField.setBounds(282, 164, 107, 20);
		frmSystemDetailCollector.getContentPane().add(IPField);
		IPField.setColumns(10);
		// ==============================================================================
		
		JLabel lblSearch = new JLabel("Search by Name");
		lblSearch.setForeground(new Color(102, 51, 255));
		lblSearch.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSearch.setBounds(10, 191, 123, 14);
		frmSystemDetailCollector.getContentPane().add(lblSearch);
		
		searchField = new JTextField();
		searchField.setBounds(10, 209, 108, 20);
		frmSystemDetailCollector.getContentPane().add(searchField);
		searchField.setColumns(10);
		
		btnSearch = new JButton("Search");
		
		InnerClassBtnEventHandler refObjOfBtn = new InnerClassBtnEventHandler();
		btnSearch.addActionListener(refObjOfBtn);	
//		btnSearch.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				
//				searchName = searchField.getText();
//				searchField.setText(null);
//				obj = dataManipulation_ref.searchSystemDetail(searchName);
//				
//				departmentField.setText(obj.getDepartment());
//				nameField.setText(obj.getEmployeeName());
//				brandField.setText(obj.getLapTopMake());
//				modelField.setText(obj.getModel());
//				CPUField.setText(obj.getCPU());
//				RAMField.setText(obj.getRAM());
//				hardDiskField.setText(obj.getHardDisk());
//				IPField.setText(obj.getIpAddress());
//			}
//		});
		btnSearch.setBackground(new Color(30, 144, 255));
		btnSearch.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSearch.setBounds(128, 206, 81, 23);
		frmSystemDetailCollector.getContentPane().add(btnSearch);
	// ==============================================================================	
		
		btnClear = new JButton("Clear");
		btnClear.addActionListener(refObjOfBtn);
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnClear.setBackground(new Color(30, 144, 255));
		btnClear.setBounds(219, 206, 81, 23);
		frmSystemDetailCollector.getContentPane().add(btnClear);
		// ==============================================================================	


		
		
		btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(refObjOfBtn);
//		btnSubmit.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				
//				department = departmentField.getText();
//				departmentField.setText(null);
//				employeeName = nameField.getText();
//				nameField.setText(null);
//				lapTopMake = brandField.getText(); 
//				brandField.setText(null);
//				model = modelField.getText();
//				modelField.setText(null);
//				cpu = CPUField.getText();
//				CPUField.setText(null);
//				ram = RAMField.getText();
//				RAMField.setText(null);
//				hardDisk = hardDiskField.getText();
//				hardDiskField.setText(null);
//				ipAddress = IPField.getText();
//				IPField.setText(null);
//				
//				dataManipulation_ref.addSystemDetail(department, employeeName, lapTopMake, model, cpu, ram, hardDisk, ipAddress);
//			}
//		});
		btnSubmit.setBackground(new Color(30, 144, 255));
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSubmit.setBounds(311, 206, 89, 23);
		frmSystemDetailCollector.getContentPane().add(btnSubmit);
	}
	
	 public class InnerClassBtnEventHandler implements ActionListener{
		 public void actionPerformed(ActionEvent event) {
			 if (event.getSource() == btnSubmit) {
				 	this.valueGetter();
				 	this.clear();
					dataManipulation_ref.addSystemDetail(department, employeeName, lapTopMake, model, cpu, ram, hardDisk, ipAddress);
			}else if(event.getSource() == btnSearch){
				
				searchName = searchField.getText();
				searchField.setText(null);
				obj = dataManipulation_ref.searchSystemDetail(searchName);
				
				this.print(obj);
			}else if (event.getSource() == btnClear) {
				this.clear();
			}

		 }
		 
		 public void print(SystemDetail objprint){
			 
				departmentField.setText(objprint.getDepartment());
				nameField.setText(objprint.getEmployeeName());
				brandField.setText(objprint.getLapTopMake());
				modelField.setText(objprint.getModel());
				CPUField.setText(objprint.getCPU());
				RAMField.setText(objprint.getRAM());
				hardDiskField.setText(objprint.getHardDisk());
				IPField.setText(objprint.getIpAddress());
		 }
		 
		 public void clear() {
			 departmentField.setText(null);
			 nameField.setText(null);
			 brandField.setText(null);
			 modelField.setText(null);
			 CPUField.setText(null);
			 RAMField.setText(null);
			 hardDiskField.setText(null);
			 IPField.setText(null);
		 }
		 
		 public void valueGetter() {
			 	department = departmentField.getText();
				employeeName = nameField.getText();
				lapTopMake = brandField.getText(); 					
				model = modelField.getText();					
				cpu = CPUField.getText();					
				ram = RAMField.getText();				
				hardDisk = hardDiskField.getText();				
				ipAddress = IPField.getText();
		 }
	 }
}
 