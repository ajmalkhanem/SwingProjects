package SwingProjects;
 import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.SystemColor;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import javax.swing.JToggleButton;
import javax.swing.JSeparator;
import javax.swing.border.TitledBorder;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Project2 {

	private JFrame frame;
	private JTextField tid;
	private JTextField fname;
	private JTextField srname;
	private JTextField total;
	private JTextField avge;
	private JTextField rank;
	private JTextField tmt;
	private JTextField te;
	private JTextField tb;
	private JTextField tc;
	private JTextField tch;
	private JTextField tp;
	private JTextField tt;
	private JTextField tml;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Project2 window = new Project2();
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
	public Project2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.textHighlight);
		frame.setBounds(100, 100, 1121, 631);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Student Details", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		panel.setBounds(10, 11, 510, 366);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		tid = new JTextField();
		tid.setBounds(135, 25, 86, 20);
		panel.add(tid);
		tid.setColumns(10);
		
		fname = new JTextField();
		fname.setBounds(135, 69, 86, 20);
		panel.add(fname);
		fname.setColumns(10);
		
		srname = new JTextField();
		srname.setBounds(135, 113, 86, 20);
		panel.add(srname);
		srname.setColumns(10);
		
		total = new JTextField();
		total.setBounds(135, 239, 86, 20);
		panel.add(total);
		total.setColumns(10);
		
		avge = new JTextField();
		avge.setBounds(135, 283, 86, 20);
		panel.add(avge);
		avge.setColumns(10);
		
		rank = new JTextField();
		rank.setBounds(135, 324, 86, 20);
		panel.add(rank);
		rank.setColumns(10);
		
		tmt = new JTextField();
		tmt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char num=evt.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) {
                    evt.consume();
                }
			}
		});
		tmt.setBounds(377, 25, 86, 20);
		panel.add(tmt);
		tmt.setColumns(10);
		
		te = new JTextField();
		te.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char num=evt.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) {
                    evt.consume();
                }
			}
		});
		te.setBounds(377, 69, 86, 20);
		panel.add(te);
		te.setColumns(10);
		
		tb = new JTextField();
		tb.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char num=evt.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) {
                    evt.consume();
                }
			}
		});
		tb.setBounds(377, 113, 86, 20);
		panel.add(tb);
		tb.setColumns(10);
		
		tc = new JTextField();
		tc.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char num=evt.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) {
                    evt.consume();
                }
			}
		});
		tc.setBounds(377, 163, 86, 20);
		panel.add(tc);
		tc.setColumns(10);
		
		tch = new JTextField();
		tch.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char num=evt.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) {
                    evt.consume();
                }
			}
		});
		tch.setBounds(377, 211, 86, 20);
		panel.add(tch);
		tch.setColumns(10);
		
		tp = new JTextField();
		tp.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char num=evt.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) {
                    evt.consume();
                }
			}
		});
		tp.setBounds(377, 252, 86, 20);
		panel.add(tp);
		tp.setColumns(10);
		
		tt = new JTextField();
		tt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char num=evt.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) {
                    evt.consume();
                }
			}
		});
		tt.setBounds(377, 295, 86, 20);
		panel.add(tt);
		tt.setColumns(10);
		
		tml = new JTextField();
		tml.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char num=evt.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) {
                    evt.consume();
                }
			}
		});
		tml.setBounds(377, 335, 86, 20);
		panel.add(tml);
		tml.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"111032E", "111032B", "111032C", "111032A"}));
		comboBox.setBounds(138, 163, 86, 20);
		panel.add(comboBox);
		
		JLabel lblNewLabel = new JLabel("Student_ID");
		lblNewLabel.setBounds(25, 28, 67, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("First Name");
		lblNewLabel_1.setBounds(25, 69, 67, 17);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Surname");
		lblNewLabel_2.setBounds(25, 116, 46, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Total Score");
		lblNewLabel_3.setBounds(25, 242, 59, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Average");
		lblNewLabel_4.setBounds(25, 286, 46, 14);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Maths");
		lblNewLabel_5.setBounds(266, 28, 46, 14);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Course Code");
		lblNewLabel_6.setBounds(25, 166, 67, 14);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Ranking");
		lblNewLabel_7.setBounds(25, 327, 46, 14);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("English");
		lblNewLabel_8.setBounds(266, 72, 46, 14);
		panel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Biology");
		lblNewLabel_9.setBounds(266, 116, 46, 14);
		panel.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Computer");
		lblNewLabel_10.setBounds(266, 166, 59, 14);
		panel.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Chemistry");
		lblNewLabel_11.setBounds(266, 214, 59, 14);
		panel.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Physics");
		lblNewLabel_12.setBounds(266, 255, 46, 14);
		panel.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Tamil");
		lblNewLabel_13.setBounds(266, 298, 46, 14);
		panel.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Malayalam");
		lblNewLabel_14.setBounds(266, 338, 67, 14);
		panel.add(lblNewLabel_14);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 211, 238, 9);
		panel.add(separator);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Student report", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		panel_1.setBounds(567, 0, 528, 366);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(21, 25, 483, 280);
		panel_1.add(textArea);
		
		JButton btnNewButton_5 = new JButton("Clear");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(null);
			}
		});
		btnNewButton_5.setBounds(218, 321, 89, 34);
		panel_1.add(btnNewButton_5);
		
		JButton btnNewButton = new JButton("Add Report");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			double t=Double.parseDouble(tmt.getText());
			double t1=Double.parseDouble(te.getText());
			double t2=Double.parseDouble(tb.getText());
			double t3=Double.parseDouble(tc.getText());
			double t4=Double.parseDouble(tch.getText());
			double t5=Double.parseDouble(tp.getText());
			double t6=Double.parseDouble(tt.getText());
			double t7=Double.parseDouble(tml.getText());
			double tot=t+t1+t2+t3+t4+t5+t6+t7;
			double avg=tot/8;
			 String tot1=String.format("%.2f", tot);	
			 total.setText(tot1);
			 String avg1=String.format("%.2f", avg);	
			 avge.setText(avg1);
			 if(tot>700)
				{
					
					rank.setText("1");
				}
			 if(tot>600 && tot<700)
				{
					
					rank.setText("2");
				}
			 if(tot>500 && tot<600)
				{
					
					rank.setText("3");
				}
			 if(tot<500 )
				{
					
					rank.setText("Fail");
				}
			 
				DefaultTableModel model=(DefaultTableModel)table.getModel();
				model.addRow(new String[] {tid.getText(),(String)comboBox.getSelectedItem(),tmt.getText(),te.getText(),tb.getText(),tc.getText(),tch.getText(),tp.getText(),tt.getText(),tml.getText(),total.getText(),avge.getText(),rank.getText()});
				
			}
			
		});
		btnNewButton.setBounds(67, 544, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Delete");
		btnNewButton_1.addActionListener(new ActionListener() {
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
		btnNewButton_1.setBounds(243, 544, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Show Report");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("student Record\n"
                        +"Student Name :\t\t"+fname.getText()+" "+srname.getText()
                        +"\n=================================================="
                        +"\nMath :\t\t"+tmt.getText()
                        +"\nEnglish :\t\t"+te.getText()
                        +"\nBiology :\t\t"+tb.getText()
                        +"\ncomputer :\t\t"+tc.getText()
                        +"\nChemistry :\t\t"+tch.getText()
                        +"\nPhysics :\t\t"+tp.getText()
                        +"\nTamil :\t\t"+tt.getText()
                        +"\nMalayalam :\t\t"+tml.getText()
                        +"\n================================================"
                        +"\nTotal Score :\t\t"+total.getText()
                        +"\nAverage :\t\t"+avge.getText()
                        +"\nRanking :\t\t"+rank.getText());
			}
		});
		btnNewButton_2.setBounds(404, 544, 116, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Exit");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame=new JFrame("Exit");
                if(JOptionPane.showConfirmDialog(frame, "Comfirm","Exit",JOptionPane.YES_OPTION)==JOptionPane.YES_NO_OPTION)
                {
                System.exit(0);
                }
			}
		});
		btnNewButton_3.setBounds(567, 544, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Reset");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fname.setText(null);
				srname.setText(null);
				total.setText(null);
				avge.setText(null);
				rank.setText(null);
				tmt.setText(null);
				te.setText(null);
				tc.setText(null);
				tb.setText(null);
				tch.setText(null);
				tp.setText(null);
				tt.setText(null);
				tml.setText(null);
				tid.setText(null);
			}
		});
		btnNewButton_4.setBounds(751, 544, 89, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		JPanel panel_2 = new JPanel();
		panel_2.setForeground(Color.MAGENTA);
		panel_2.setBackground(Color.MAGENTA);
		panel_2.setBounds(32, 492, 967, -74);
		frame.getContentPane().add(panel_2);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Student id", "Course Name", "Maths", "English", "Biology", "Computer", "Chemistry", "Physics", "Tamil", "Malayalam", "Toatl Score", "Average", "Ranking"},
			},
			new String[] {
				"Student id", "Course Name", "Maths", "English", "Biology", "Computer", "Chemistry", "Physics", "Tamil", "Malayalam", "Toatl Score", "Average", "Ranking"
			}
		));
		table.setBounds(31, 410, 1064, 101);
		frame.getContentPane().add(table);
	}
}
