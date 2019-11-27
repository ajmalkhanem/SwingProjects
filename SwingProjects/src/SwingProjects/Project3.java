package SwingProjects;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Random;
import java.awt.event.ActionEvent;

public class Project3 {

	private JFrame frame;
	private JTextField name;
	private JTextField tax;
	private JTextField subt;
	private JTextField total;
	private JTable table;
	private JTextField dname;
	private JTextField dfrom;
	private JTextField dto;
	private JTextField dtime;
	private JTextField ddate;
	private JTextField dtik;
	private JTextField dprice;
	private JTextField droute;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Project3 window = new Project3();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Project3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1110, 618);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(239, 11, 715, 67);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblTicketBooking = new JLabel("TICKET BOOKING");
		lblTicketBooking.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblTicketBooking.setBounds(217, 11, 266, 45);
		panel.add(lblTicketBooking);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 4), "Ticket Details", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(627, 89, 429, 332);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		dname = new JTextField();
		dname.setBounds(113, 62, 86, 20);
		panel_1.add(dname);
		dname.setColumns(10);
		
		dfrom = new JTextField();
		dfrom.setBounds(113, 104, 86, 20);
		panel_1.add(dfrom);
		dfrom.setColumns(10);
		
		dto = new JTextField();
		dto.setBounds(113, 145, 86, 20);
		panel_1.add(dto);
		dto.setColumns(10);
		
		dtime = new JTextField();
		dtime.setBounds(113, 189, 86, 20);
		panel_1.add(dtime);
		dtime.setColumns(10);
		
		ddate = new JTextField();
		ddate.setBounds(113, 230, 86, 20);
		panel_1.add(ddate);
		ddate.setColumns(10);
		
		dtik = new JTextField();
		dtik.setBounds(311, 125, 86, 20);
		panel_1.add(dtik);
		dtik.setColumns(10);
		
		dprice = new JTextField();
		dprice.setBounds(311, 181, 86, 20);
		panel_1.add(dprice);
		dprice.setColumns(10);
		
		droute = new JTextField();
		droute.setBounds(311, 230, 86, 20);
		panel_1.add(droute);
		droute.setColumns(10);
		
		
		
		JLabel lblNewLabel_4 = new JLabel("Name");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(24, 65, 46, 14);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("From");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_5.setBounds(24, 107, 46, 14);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("To");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_6.setBounds(24, 148, 46, 14);
		panel_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Time");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_7.setBounds(24, 192, 46, 14);
		panel_1.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Date");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_8.setBounds(24, 233, 52, 14);
		panel_1.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Ticket No");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_9.setBounds(311, 107, 86, 14);
		panel_1.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Price");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_10.setBounds(311, 156, 46, 14);
		panel_1.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Route");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_11.setBounds(311, 212, 46, 14);
		panel_1.add(lblNewLabel_11);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(25, 89, 490, 332);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(24, 21, 67, 27);
		panel_3.add(lblNewLabel);
		
		name = new JTextField();
		name.setBounds(130, 19, 183, 30);
		panel_3.add(name);
		name.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(461, 69, 7, 252);
		panel_3.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(86, 80, 376, -22);
		panel_3.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setBounds(231, 221, 7, -79);
		panel_3.add(separator_2);
		
		JRadioButton rd1 = new JRadioButton("Standard");
		rd1.setFont(new Font("Tahoma", Font.BOLD, 11));
		rd1.setBounds(24, 80, 109, 23);
		panel_3.add(rd1);
		
		JRadioButton rd2 = new JRadioButton("Single ticket");
		rd2.setFont(new Font("Tahoma", Font.BOLD, 11));
		rd2.setBounds(172, 79, 109, 23);
		panel_3.add(rd2);
		
		JRadioButton rd3 = new JRadioButton("Adult");
		rd3.setFont(new Font("Tahoma", Font.BOLD, 11));
		rd3.setBounds(314, 79, 109, 23);
		panel_3.add(rd3);
		
		JRadioButton rd4 = new JRadioButton("First class");
		rd4.setFont(new Font("Tahoma", Font.BOLD, 11));
		rd4.setBounds(24, 105, 109, 23);
		panel_3.add(rd4);
		
		JRadioButton rd5 = new JRadioButton("AC");
		rd5.setFont(new Font("Tahoma", Font.BOLD, 11));
		rd5.setBounds(130, 105, 67, 23);
		panel_3.add(rd5);
		
		JRadioButton rd6 = new JRadioButton("Sleeper");
		rd6.setFont(new Font("Tahoma", Font.BOLD, 11));
		rd6.setBounds(205, 105, 77, 23);
		panel_3.add(rd6);
		
		JRadioButton rd7 = new JRadioButton("Child");
		rd7.setFont(new Font("Tahoma", Font.BOLD, 11));
		rd7.setBounds(314, 105, 109, 23);
		panel_3.add(rd7);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Start", "Trissur", "TVM", "Kannur", "Calicut"}));
		comboBox.setBounds(24, 135, 109, 20);
		panel_3.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"End", "Trissur", "TVM", "Kannur", "Calicut"}));
		comboBox_1.setBounds(172, 135, 102, 20);
		panel_3.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		comboBox_2.setBounds(314, 135, 107, 20);
		panel_3.add(comboBox_2);
		
		JLabel lblNewLabel_1 = new JLabel("Tax");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(24, 192, 46, 14);
		panel_3.add(lblNewLabel_1);
		
		tax = new JTextField();
		tax.setBounds(123, 190, 151, 20);
		panel_3.add(tax);
		tax.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Sub Total");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(24, 221, 67, 14);
		panel_3.add(lblNewLabel_2);
		
		subt = new JTextField();
		subt.setBounds(123, 218, 151, 20);
		panel_3.add(subt);
		subt.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Total");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(24, 251, 46, 23);
		panel_3.add(lblNewLabel_3);
		
		total = new JTextField();
		total.setBounds(123, 249, 151, 20);
		panel_3.add(total);
		total.setColumns(10);
		
		JButton btnNewButton_3 = new JButton("Confirm");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String v=" ";
                if(rd5.isSelected()) {
                    v="AC";
                }
                else {
                    v="NON";
                }
                DefaultTableModel model=(DefaultTableModel)table.getModel();
                model.addRow(new String[] {dname.getText(),dtik.getText(),dfrom.getText(),dto.getText(),(String)comboBox_2.getSelectedItem(),dtime.getText(),ddate.getText(),v,dprice.getText()});
				}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_3.setBounds(176, 279, 89, 23);
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton = new JButton("Total");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				 String v = " "; 
				 String va=" ";
				 String Ac=" ";
				 String non=" ";
				 double no=Double.parseDouble((String)comboBox_2.getSelectedItem());
				  
	                 if ((rd2.isSelected()==true) && (rd5.isSelected()==true) && (rd6.isSelected()==true ))
	                {
	                	 va="3400";
	                	 double nn=Double.parseDouble(va);
	                	 double sub=no*nn;
	                	 Ac="200";
	                	 String aa=String.format("%s",sub);	
		       			 subt.setText(aa);
		       			String a1=String.format("%s", Ac);	
		       			 tax.setText(a1);
	                }
	                
	                 if ((rd2.isSelected()==false) && (rd5.isSelected()==true) && (rd6.isSelected()==true ))
		                {
	                	 va="4000";
	                	 double nn=Double.parseDouble(va);
	                	 double sub=no*nn;
	                	 Ac="200";
	                	 String aa=String.format("%s",sub);	
		       			 subt.setText(aa);
		       			String a1=String.format("%s", Ac);	
		       			 tax.setText(a1);		                }
		                
	                 
	                 if ((rd2.isSelected()==true) && (rd5.isSelected()==false) && (rd6.isSelected()==true ))
		                {
	                	 va="3000";
	                	 double nn=Double.parseDouble(va);
	                	 double sub=no*nn;
	                	 non="100";
	                	 String aa=String.format("%s",sub);	
		       			 subt.setText(aa);
		       			String a1=String.format("%s", non);	
		       			 tax.setText(a1);
		                }
	                 
	                 if ((rd2.isSelected()==false) && (rd5.isSelected()==false) && (rd6.isSelected()==true ))
		                {
	                	 va="3400";
	                	 double nn=Double.parseDouble(va);
	                	 double sub=no*nn;
	                	 non="100";
	                	 String aa=String.format("%s",sub);	
		       			 subt.setText(aa);
		       			String a1=String.format("%s", non);	
		       			 tax.setText(a1);
		                }
		                
	                 if ((rd2.isSelected()==true) && (rd5.isSelected()==true) && (rd6.isSelected()==false ))
		                {
	                	 va="3200";
	                	 double nn=Double.parseDouble(va);
	                	 double sub=no*nn;
	                	 Ac="200";
	                	 String aa=String.format("%s",sub);	
		       			 subt.setText(aa);
		       			String a1=String.format("%s", Ac);	
		       			 tax.setText(a1);
		                }
	                 if ((rd2.isSelected()==false) && (rd5.isSelected()==false) && (rd6.isSelected()==true ))
		                {
	                	 va="3800";
	                	 double nn=Double.parseDouble(va);
	                	 double sub=no*nn;
	                	 non="100";
	                	 String aa=String.format("%s",sub);	
		       			 subt.setText(aa);
		       			String a1=String.format("%s", non);	
		       			 tax.setText(a1);
		                }
	                 if ((rd1.isSelected()==false) && (rd2.isSelected()==false) && (rd3.isSelected()==false ) && (rd4.isSelected()==false)&&(rd5.isSelected()==false)&&(rd6.isSelected()==false)&&(rd7.isSelected()==false))
		                {
	                	 JOptionPane.showMessageDialog(null, "Please choose the facilities");
		                }
	                
	                 if(comboBox.getSelectedItem().toString().equals("Start")){
		                   JOptionPane.showMessageDialog(null, "SELECT Starting place");
		               
		               }
	                 if(comboBox_1.getSelectedItem().toString().equals("End")){
		                   JOptionPane.showMessageDialog(null, "SELECT ending place");
		               
		               }
	               
	               
	  
	                String num=name.getText();
	                dname.setText(num);
	                String num1=(String)comboBox.getSelectedItem();
	                dfrom.setText(num1);
	                String num2=(String)comboBox_1.getSelectedItem();
	                dto.setText(num2);
	                double a=Double.parseDouble(subt.getText());
	                double b=Double.parseDouble(tax.getText());
	                double c=a+b;
	                total.setText(String.valueOf(c));
	                String num3=total.getText();
	                dprice.setText(num3);
	                droute.setText("any");
	                
	                
	                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
	            	LocalDate localDate = LocalDate.now();
	                ddate.setText(dtf.format(localDate));
	                
	                
	                Calendar timer=Calendar.getInstance();
	                timer.getTime();
	                SimpleDateFormat tTime=new SimpleDateFormat("HH:mm:ss");
	                dtime.setText(tTime.format(timer.getTime()));
	                
	                
	                
	               Random ran=new Random();
	               int n=ran.nextInt(1000000)+1;
	               String val=String.valueOf(n);
	               dtik.setText(val);
	               
	               
	               
					
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(33, 298, 89, 23);
		panel_3.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				name.setText(null);
                tax.setText(null);
                subt.setText(null);
                total.setText(null);
                rd1.setSelected(false);
                rd2.setSelected(false);
                rd3.setSelected(false);
                rd4.setSelected(false);
                rd5.setSelected(false);
                rd6.setSelected(false);
                rd7.setSelected(false);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setBounds(185, 298, 89, 23);
		panel_3.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Exit");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame=new JFrame("Exit");
                if(JOptionPane.showConfirmDialog(frame, "Comfirm","Exit",JOptionPane.YES_OPTION)==JOptionPane.YES_NO_OPTION)
                {
                System.exit(0);
                }

			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_2.setBounds(334, 298, 89, 23);
		panel_3.add(btnNewButton_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(10, 168, 452, 2);
		panel_3.add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(0, 291, 460, 2);
		panel_3.add(separator_4);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(34, 60, 1, 2);
		panel_3.add(separator_5);
		
		
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setBounds(10, 67, 452, 2);
		panel_3.add(separator_6);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(25, 432, 1066, 137);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Name", "Booking ID", "From", "To", "No of seats", "Time", "Date", "AC/Non-AC", "Price"},
			},
			new String[] {
				"Name", "Booking ID", "From", "To", "No of seats", "Time", "Date", "AC/Non-AC", "Price"
			}
		));
		table.setBounds(10, 11, 1046, 78);
		panel_2.add(table);
		
		JButton btnNewButton_4 = new JButton("Delete");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DefaultTableModel model=(DefaultTableModel)table.getModel();
				int rowno=table.getSelectedRow();
				
				 try 
			        {
			            int row = table.getSelectedRow();
			            
			            model.removeRow(rowno);

			        } catch (Exception msg) 
			        {
			            JOptionPane.showMessageDialog(null, "Please choose the particular row");
			        }    
			}
		});
		btnNewButton_4.setBounds(297, 100, 89, 23);
		panel_2.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Print");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model=(DefaultTableModel)table.getModel();
				int rowno=table.getSelectedRow();
				
				 if(table.getSelectionModel().isSelectionEmpty()) 
			        {
					 JOptionPane.showMessageDialog(null, "Please choose the particular row");
			            
			           

			        }else
			        {
			        	 JOptionPane.showMessageDialog(null, "Thanks for booking..Happy journey!"
			                        +" \nName :\t\t\t\t"+name.getText()
			                        +"\n=================================================="
			                        +"\nTicket No :\t\t\t\t"+dtik.getText()
			                        +"\nFrom:\t\t\t\t"+dfrom.getText()
			                        +"\nTo :\t\t\t\t"+dto.getText()
			                        +"\nDate :\t\t\t\t"+ddate.getText()
			                        +"\nTime :\t\t\t\t"+dtime.getText()
			                        
			                        +"\nTotal :\t\t\t\t"+dprice.getText()
			                        +"\nRoute :\t\t\t\t"+droute.getText()
			                        
			                        );
			        }    
				
				 
			}
			
		});
		btnNewButton_5.setBounds(467, 100, 89, 23);
		panel_2.add(btnNewButton_5);
	}
}
