package MainFrame;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class Screen {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Screen window = new Screen();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * 
	 * @throws SQLException
	 */
	public Screen() throws SQLException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * 
	 * @throws SQLException
	 */

	public void initialize() throws SQLException {

		Ward MaternityWard = new Ward(1);
		Ward MaleMedicalWard = new Ward(7);
		Ward ObservationWard = new Ward(9);
		Ward RecoveryWard = new Ward(10);
		Ward SuspectWard = new Ward(11);
		Ward PsychiatricWard = new Ward(12);
		Ward IsolationWard = new Ward(13);
		Ward Mortuary = new Ward(20);
		Ward Ammenitty = new Ward(19);
		Ward ICU = new Ward(18);
		Ward Gynaecology = new Ward(17);
		Ward EyeWard = new Ward(16);
		Ward Paediatric = new Ward(15);
		Ward ChildWard = new Ward(5);

		JButton btnNewButton = new JButton("Child Ward");
		JButton btnNewButton_1 = new JButton("Male Medical Ward");
		JButton btnNewButton_2 = new JButton("Observation Ward");
		JButton btnNewButton_3 = new JButton("Recovery Ward");
		JButton btnNewButton_4 = new JButton("Suspect Ward");
		JButton btnNewButton_5 = new JButton("Psychiatric Ward");
		JButton btnNewButton_6 = new JButton("Isolation Ward");
		JButton btnNewButton_7 = new JButton("Mortuary");
		JButton btnNewButton_8 = new JButton("Ammenity");
		JButton btnNewButton_9 = new JButton("Intensive Care Unit");
		JButton btnNewButton_12 = new JButton("Paediatric Ward");
		JButton btnNewButton_10 = new JButton("Gynaecology Ward");
		JButton btnNewButton_11 = new JButton("Eye Ward");
		JButton btnNewButton_13 = new JButton("Maternity ");

		JLabel lblCpct = new JLabel("");
		JLabel lblPtnts = new JLabel("");
		JLabel lblBds = new JLabel("");

		frame = new JFrame();
		frame.setBounds(100, 100, 707, 440);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(20, 92, 671, 298);
		frame.getContentPane().add(layeredPane);

		JPanel ward = new JPanel();
		ward.setBackground(new Color(255, 255, 255));
		ward.setBounds(10, 11, 352, 276);
		layeredPane.add(ward);
		ward.setLayout(null);

		JLabel lblWard = new JLabel(" Ward");
		lblWard.setBounds(91, 0, 205, 31);
		ward.add(lblWard);
		lblWard.setFont(new Font("Tahoma", Font.BOLD, 24));

		JLabel lblCapacity = new JLabel(" Bed Capacity:");
		lblCapacity.setFont(new Font("Calisto MT", Font.BOLD, 20));
		lblCapacity.setBounds(10, 45, 143, 26);
		ward.add(lblCapacity);

		JLabel lblNewLabel = new JLabel("Patients");
		lblNewLabel.setFont(new Font("Calisto MT", Font.BOLD, 20));
		lblNewLabel.setBounds(10, 82, 147, 25);
		ward.add(lblNewLabel);

		JLabel lblAvailableBeds = new JLabel("Available Beds");
		lblAvailableBeds.setFont(new Font("Calisto MT", Font.BOLD, 20));
		lblAvailableBeds.setBounds(10, 112, 147, 25);
		ward.add(lblAvailableBeds);

		JLabel lbloccupancy = new JLabel("%Occupancy");
		lbloccupancy.setFont(new Font("Calisto MT", Font.BOLD, 20));
		lbloccupancy.setBounds(10, 148, 147, 25);
		ward.add(lbloccupancy);

		lblCpct.setBounds(206, 42, 74, 20);
		ward.add(lblCpct);

		lblPtnts.setBounds(206, 88, 74, 16);
		ward.add(lblPtnts);

		lblBds.setBounds(206, 118, 74, 16);
		ward.add(lblBds);

		JLabel lblOcpcy = new JLabel("");
		lblOcpcy.setBounds(206, 147, 74, 16);
		ward.add(lblOcpcy);

		JButton btnNewButton_14 = new JButton("Admit");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (lblWard.getText() == "ChildWard") {

					try {
						ChildWard.setWid(5);
						ChildWard.admitpatient(ChildWard.getWid());

					} catch (SQLException e1) {
						e1.printStackTrace();
					}

				}
				if (lblWard.getText() == "Maternity Ward") {

					try {
						MaternityWard.setWid(1);
						MaternityWard.admitpatient(MaternityWard.getWid());
					} catch (SQLException e1) {
						e1.printStackTrace();
					}

				}
				if (lblWard.getText() == "Male Medical Ward") {

					try {
						MaleMedicalWard.setWid(7);
						MaleMedicalWard.admitpatient(MaleMedicalWard.getWid());
					} catch (SQLException e1) {
						e1.printStackTrace();
					}

				}
				if (lblWard.getText() == "Observation Ward") {

					try {
						ObservationWard.setWid(9);
						ObservationWard.admitpatient(ObservationWard.getWid());
					} catch (SQLException e1) {
						e1.printStackTrace();
					}

				}
				if (lblWard.getText() == "Recovery Ward") {

					try {
						RecoveryWard.setWid(10);
						RecoveryWard.admitpatient(RecoveryWard.getWid());
					} catch (SQLException e1) {
						e1.printStackTrace();
					}

				}
				if (lblWard.getText() == "Suspect Ward") {

					try {
						SuspectWard.setWid(11);
						SuspectWard.admitpatient(SuspectWard.getWid());
					} catch (SQLException e1) {
						e1.printStackTrace();
					}

				}
				if (lblWard.getText() == "Psychiatric Ward") {

					try {
						PsychiatricWard.setWid(12);
						PsychiatricWard.admitpatient(PsychiatricWard.getWid());
					} catch (SQLException e1) {
						e1.printStackTrace();
					}

				}
				if (lblWard.getText() == "Isolation Ward") {

					try {
						IsolationWard.setWid(13);
						IsolationWard.admitpatient(IsolationWard.getWid());
					} catch (SQLException e1) {
						e1.printStackTrace();
					}

				}
				if (lblWard.getText() == "Mortuary") {

					try {
						Mortuary.setWid(20);
						Mortuary.admitpatient(Mortuary.getWid());
					} catch (SQLException e1) {
						e1.printStackTrace();
					}

				}
				if (lblWard.getText() == "Ammenity") {

					try {
						Ammenitty.setWid(19);
						Ammenitty.admitpatient(Ammenitty.getWid());
					} catch (SQLException e1) {
						e1.printStackTrace();
					}

				}
				if (lblWard.getText() == "ICU") {

					try {
						ICU.setWid(18);
						ICU.admitpatient(ICU.getWid());
					} catch (SQLException e1) {
						e1.printStackTrace();
					}

				}
				if (lblWard.getText() == "Gynaecology") {

					try {
						Gynaecology.setWid(17);
						Gynaecology.admitpatient(Gynaecology.getWid());
					} catch (SQLException e1) {
						e1.printStackTrace();
					}

				}
				if (lblWard.getText() == "Eye Ward") {

					try {
						EyeWard.setWid(16);
						EyeWard.admitpatient(EyeWard.getWid());
					} catch (SQLException e1) {
						e1.printStackTrace();
					}

				}
				if (lblWard.getText() == "Paediatric") {

					try {
						Paediatric.setWid(15);
						Paediatric.admitpatient(Paediatric.getWid());
					} catch (SQLException e1) {
						e1.printStackTrace();
					}

				}
			}
		});
		btnNewButton_14.setBackground(new Color(95, 158, 160));
		btnNewButton_14.setForeground(new Color(255, 255, 255));
		btnNewButton_14.setFont(new Font("Calisto MT", Font.BOLD, 15));

		btnNewButton_14.setBounds(230, 223, 112, 42);
		ward.add(btnNewButton_14);

		JButton btnNewButton_15 = new JButton("Discharge");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// discharge patient

				if (lblWard.getText() == "ChildWard") {

					try {
						ChildWard.setWid(5);
						ChildWard.dischargepatient(ChildWard.getWid());

					} catch (SQLException e1) {
						e1.printStackTrace();
					}

				}
				if (lblWard.getText() == "Maternity Ward") {

					try {
						MaternityWard.setWid(1);
						MaternityWard.dischargepatient(MaternityWard.getWid());
					} catch (SQLException e1) {
						e1.printStackTrace();
					}

				}
				if (lblWard.getText() == "Male Medical Ward") {

					try {
						MaleMedicalWard.setWid(7);
						MaleMedicalWard.dischargepatient(MaleMedicalWard.getWid());
					} catch (SQLException e1) {
						e1.printStackTrace();
					}

				}
				if (lblWard.getText() == "Observation Ward") {

					try {
						ObservationWard.setWid(9);
						ObservationWard.dischargepatient(ObservationWard.getWid());
					} catch (SQLException e1) {
						e1.printStackTrace();
					}

				}
				if (lblWard.getText() == "Recovery Ward") {

					try {
						RecoveryWard.setWid(10);
						RecoveryWard.dischargepatient(RecoveryWard.getWid());
					} catch (SQLException e1) {
						e1.printStackTrace();
					}

				}
				if (lblWard.getText() == "Suspect Ward") {

					try {
						SuspectWard.setWid(11);
						SuspectWard.dischargepatient(SuspectWard.getWid());
					} catch (SQLException e1) {
						e1.printStackTrace();
					}

				}
				if (lblWard.getText() == "Psychiatric Ward") {

					try {
						PsychiatricWard.setWid(12);
						PsychiatricWard.dischargepatient(PsychiatricWard.getWid());
					} catch (SQLException e1) {
						e1.printStackTrace();
					}

				}
				if (lblWard.getText() == "Isolation Ward") {

					try {
						IsolationWard.setWid(13);
						IsolationWard.dischargepatient(IsolationWard.getWid());
					} catch (SQLException e1) {
						e1.printStackTrace();
					}

				}
				if (lblWard.getText() == "Mortuary") {

					try {
						Mortuary.setWid(20);
						Mortuary.dischargepatient(Mortuary.getWid());
					} catch (SQLException e1) {
						e1.printStackTrace();
					}

				}
				if (lblWard.getText() == "Ammenity") {

					try {
						Ammenitty.setWid(19);
						Ammenitty.dischargepatient(Ammenitty.getWid());
					} catch (SQLException e1) {
						e1.printStackTrace();
					}

				}
				if (lblWard.getText() == "ICU") {

					try {
						ICU.setWid(18);
						ICU.dischargepatient(ICU.getWid());
					} catch (SQLException e1) {
						e1.printStackTrace();
					}

				}
				if (lblWard.getText() == "Gynaecology") {

					try {
						Gynaecology.setWid(17);
						Gynaecology.dischargepatient(Gynaecology.getWid());
					} catch (SQLException e1) {
						e1.printStackTrace();
					}

				}
				if (lblWard.getText() == "Eye Ward") {

					try {
						EyeWard.setWid(16);
						EyeWard.dischargepatient(EyeWard.getWid());
					} catch (SQLException e1) {
						e1.printStackTrace();
					}

				}
				if (lblWard.getText() == "Paediatric") {

					try {
						Paediatric.setWid(15);
						Paediatric.dischargepatient(Paediatric.getWid());
					} catch (SQLException e1) {
						e1.printStackTrace();
					}

				}
				// Discharge Patient
			}
		});
		btnNewButton_15.setFont(new Font("Calisto MT", Font.BOLD, 15));
		btnNewButton_15.setForeground(new Color(255, 255, 255));
		btnNewButton_15.setBackground(new Color(95, 158, 160));

		btnNewButton_15.setBounds(10, 223, 100, 42);
		ward.add(btnNewButton_15);

		JLabel lblFull = new JLabel("Full!");
		lblFull.setBackground(Color.WHITE);
		lblFull.setForeground(Color.RED);
		lblFull.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblFull.setBounds(277, 141, 65, 28);
		lblFull.setVisible(false);
		ward.add(lblFull);

		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setForeground(new Color(165, 42, 42));
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton.setBounds(372, 11, 144, 23);
		layeredPane.add(btnNewButton);

		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setForeground(new Color(165, 42, 42));
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton_1.setBounds(372, 49, 144, 23);
		layeredPane.add(btnNewButton_1);

		btnNewButton_2.setBackground(new Color(255, 255, 255));
		btnNewButton_2.setForeground(new Color(165, 42, 42));
		btnNewButton_2.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton_2.setBounds(372, 89, 144, 23);
		layeredPane.add(btnNewButton_2);

		btnNewButton_3.setBackground(new Color(255, 255, 255));
		btnNewButton_3.setForeground(new Color(165, 42, 42));
		btnNewButton_3.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton_3.setBounds(372, 129, 144, 23);
		layeredPane.add(btnNewButton_3);

		btnNewButton_4.setBackground(new Color(255, 255, 255));
		btnNewButton_4.setForeground(new Color(165, 42, 42));
		btnNewButton_4.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton_4.setBounds(372, 169, 144, 23);
		layeredPane.add(btnNewButton_4);

		btnNewButton_5.setBackground(new Color(255, 255, 255));
		btnNewButton_5.setForeground(new Color(165, 42, 42));
		btnNewButton_5.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton_5.setBounds(372, 208, 144, 23);
		layeredPane.add(btnNewButton_5);

		btnNewButton_6.setBackground(new Color(255, 255, 255));
		btnNewButton_6.setForeground(new Color(165, 42, 42));
		btnNewButton_6.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton_6.setBounds(372, 252, 144, 23);
		layeredPane.add(btnNewButton_6);

		btnNewButton_7.setBackground(new Color(255, 255, 255));
		btnNewButton_7.setForeground(new Color(165, 42, 42));
		btnNewButton_7.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton_7.setBounds(526, 252, 135, 23);
		layeredPane.add(btnNewButton_7);

		btnNewButton_8.setBackground(new Color(255, 255, 255));
		btnNewButton_8.setForeground(new Color(165, 42, 42));
		btnNewButton_8.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton_8.setBounds(526, 208, 135, 23);
		layeredPane.add(btnNewButton_8);

		btnNewButton_9.setBackground(new Color(255, 255, 255));
		btnNewButton_9.setForeground(new Color(165, 42, 42));
		btnNewButton_9.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton_9.setBounds(526, 169, 135, 23);
		layeredPane.add(btnNewButton_9);

		btnNewButton_12.setBackground(new Color(255, 255, 255));
		btnNewButton_12.setBounds(526, 49, 135, 23);
		layeredPane.add(btnNewButton_12);
		btnNewButton_12.setForeground(new Color(165, 42, 42));
		btnNewButton_12.setFont(new Font("Arial", Font.BOLD, 12));

		btnNewButton_10.setBackground(new Color(255, 255, 255));
		btnNewButton_10.setForeground(new Color(165, 42, 42));
		btnNewButton_10.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton_10.setBounds(526, 129, 135, 23);
		layeredPane.add(btnNewButton_10);

		btnNewButton_11.setBackground(new Color(255, 255, 255));
		btnNewButton_11.setForeground(new Color(165, 42, 42));
		btnNewButton_11.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton_11.setBounds(526, 89, 135, 23);
		layeredPane.add(btnNewButton_11);

		btnNewButton_13.setBackground(new Color(255, 255, 255));
		btnNewButton_13.setForeground(new Color(165, 42, 42));
		btnNewButton_13.setFont(new Font("Arial", Font.BOLD, 12));

		btnNewButton_13.setBounds(526, 11, 135, 23);
		layeredPane.add(btnNewButton_13);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 10, 10);
		layeredPane.add(panel);

		JLabel lblIpdWards = new JLabel("INPATIENT WARDS");
		lblIpdWards.setForeground(new Color(165, 42, 42));
		lblIpdWards.setBounds(31, 8, 291, 48);
		lblIpdWards.setFont(new Font("Segoe UI", Font.BOLD, 30));
		frame.getContentPane().add(lblIpdWards);

		JButton btnNewButton_16 = new JButton("Report");
		btnNewButton_16.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_16.setForeground(new Color(245, 245, 220));
		btnNewButton_16.setBackground(new Color(0, 128, 128));
		btnNewButton_16.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				patientreport rep = new patientreport();
				rep.setVisible(true);

			}
		});

		btnNewButton_16.setBounds(572, 23, 109, 33);
		frame.getContentPane().add(btnNewButton_16);

		ActionListener buttonlistener = new ActionListener() {

			@Override

			public void actionPerformed(ActionEvent e) {

				int[] data = null;

				Object o = e.getSource();
				if (o == btnNewButton) {

					try {

						data = Ward.getdata(5);

						lblWard.setText("ChildWard");
						lblCpct.setText(Integer.toString(data[0]));
						lblPtnts.setText(Integer.toString(data[1]));
						lblBds.setText(Integer.toString(data[2]));

						if (data[3] >= 100) {

							lblOcpcy.setText(Integer.toString(data[3]) + "%");
							lblOcpcy.setForeground(Color.RED);
							lblFull.setVisible(true);

						} else {
							lblOcpcy.setText(Integer.toString(data[3]) + "%");
							lblOcpcy.setForeground(Color.black);
							lblFull.setVisible(false);
						}

					} catch (SQLException e1) {

						e1.printStackTrace();
					}

				} else if (o == btnNewButton_1) {
					try {

						data = Ward.getdata(7);

						lblWard.setText("Male Medical Ward");
						lblCpct.setText(Integer.toString(data[0]));
						lblPtnts.setText(Integer.toString(data[1]));
						lblBds.setText(Integer.toString(data[2]));
						if (data[3] >= 100) {

							lblOcpcy.setText(Integer.toString(data[3]) + "%");
							lblOcpcy.setForeground(Color.RED);
							lblFull.setVisible(true);

						} else {
							lblOcpcy.setText(Integer.toString(data[3]) + "%");
							lblOcpcy.setForeground(Color.black);
							lblFull.setVisible(false);
						}

					} catch (SQLException e1) {

						e1.printStackTrace();
					}
				} else if (o == btnNewButton_2) {
					try {

						data = Ward.getdata(9);

						lblWard.setText("Observation Ward");
						lblCpct.setText(Integer.toString(data[0]));
						lblPtnts.setText(Integer.toString(data[1]));
						lblBds.setText(Integer.toString(data[2]));
						if (data[3] >= 100) {

							lblOcpcy.setText(Integer.toString(data[3]) + "%");
							lblOcpcy.setForeground(Color.RED);
							lblFull.setVisible(true);

						} else {
							lblOcpcy.setText(Integer.toString(data[3]) + "%");
							lblOcpcy.setForeground(Color.black);
							lblFull.setVisible(false);
						}

					} catch (SQLException e1) {

						e1.printStackTrace();
					}
				} else if (o == btnNewButton_3) {
					try {

						data = Ward.getdata(10);

						lblWard.setText("Recovery Ward");
						lblCpct.setText(Integer.toString(data[0]));
						lblPtnts.setText(Integer.toString(data[1]));
						lblBds.setText(Integer.toString(data[2]));
						if (data[3] >= 100) {

							lblOcpcy.setText(Integer.toString(data[3]) + "%");
							lblOcpcy.setForeground(Color.RED);
							lblFull.setVisible(true);

						} else {
							lblOcpcy.setText(Integer.toString(data[3]) + "%");
							lblOcpcy.setForeground(Color.black);
							lblFull.setVisible(false);
						}

					} catch (SQLException e1) {

						e1.printStackTrace();
					}
				} else if (o == btnNewButton_4) {
					try {

						data = Ward.getdata(11);

						lblWard.setText("Suspect Ward");
						lblCpct.setText(Integer.toString(data[0]));
						lblPtnts.setText(Integer.toString(data[1]));
						lblBds.setText(Integer.toString(data[2]));
						if (data[3] >= 100) {

							lblOcpcy.setText(Integer.toString(data[3]) + "%");
							lblOcpcy.setForeground(Color.RED);
							lblFull.setVisible(true);

						} else {
							lblOcpcy.setText(Integer.toString(data[3]) + "%");
							lblOcpcy.setForeground(Color.black);
							lblFull.setVisible(false);
						}

					} catch (SQLException e1) {

						e1.printStackTrace();
					}
				} else if (o == btnNewButton_5) {
					try {

						data = Ward.getdata(12);
						lblWard.setText("Psychiatric Ward");
						lblCpct.setText(Integer.toString(data[0]));
						lblPtnts.setText(Integer.toString(data[1]));
						lblBds.setText(Integer.toString(data[2]));
						if (data[3] >= 100) {

							lblOcpcy.setText(Integer.toString(data[3]) + "%");
							lblOcpcy.setForeground(Color.RED);
							lblFull.setVisible(true);

						} else {
							lblOcpcy.setText(Integer.toString(data[3]) + "%");
							lblOcpcy.setForeground(Color.black);
							lblFull.setVisible(false);
						}

					} catch (SQLException e1) {

						e1.printStackTrace();
					}
				} else if (o == btnNewButton_6) {
					try {

						data = Ward.getdata(13);

						lblWard.setText("Isolation Ward");
						lblCpct.setText(Integer.toString(data[0]));
						lblPtnts.setText(Integer.toString(data[1]));
						lblBds.setText(Integer.toString(data[2]));
						if (data[3] >= 100) {

							lblOcpcy.setText(Integer.toString(data[3]) + "%");
							lblOcpcy.setForeground(Color.RED);
							lblFull.setVisible(true);

						} else {
							lblOcpcy.setText(Integer.toString(data[3]) + "%");
							lblOcpcy.setForeground(Color.black);
							lblFull.setVisible(false);
						}

					} catch (SQLException e1) {

						e1.printStackTrace();
					}
				} else if (o == btnNewButton_7) {
					try {

						data = Ward.getdata(20);

						lblWard.setText("Mortuary");
						lblCpct.setText(Integer.toString(data[0]));
						lblPtnts.setText(Integer.toString(data[1]));
						lblBds.setText(Integer.toString(data[2]));
						if (data[3] >= 100) {

							lblOcpcy.setText(Integer.toString(data[3]) + "%");
							lblOcpcy.setForeground(Color.RED);
							lblFull.setVisible(true);

						} else {
							lblOcpcy.setText(Integer.toString(data[3]) + "%");
							lblOcpcy.setForeground(Color.black);
							lblFull.setVisible(false);
						}

					} catch (SQLException e1) {

						e1.printStackTrace();
					}
				} else if (o == btnNewButton_8) {
					try {

						data = Ward.getdata(19);

						lblWard.setText("Ammenity");
						lblCpct.setText(Integer.toString(data[0]));
						lblPtnts.setText(Integer.toString(data[1]));
						lblBds.setText(Integer.toString(data[2]));
						if (data[3] >= 100) {

							lblOcpcy.setText(Integer.toString(data[3]) + "%");
							lblOcpcy.setForeground(Color.RED);
							lblFull.setVisible(true);

						} else {
							lblOcpcy.setText(Integer.toString(data[3]) + "%");
							lblOcpcy.setForeground(Color.black);
							lblFull.setVisible(false);
						}

					} catch (SQLException e1) {

						e1.printStackTrace();
					}
				} else if (o == btnNewButton_9) {
					try {

						data = Ward.getdata(7);
						data = Ward.getdata(18);
						lblWard.setText("ICU");
						lblCpct.setText(Integer.toString(data[0]));
						lblPtnts.setText(Integer.toString(data[1]));
						lblBds.setText(Integer.toString(data[2]));
						if (data[3] >= 100) {

							lblOcpcy.setText(Integer.toString(data[3]) + "%");
							lblOcpcy.setForeground(Color.RED);
							lblFull.setVisible(true);

						} else {
							lblOcpcy.setText(Integer.toString(data[3]) + "%");
							lblOcpcy.setForeground(Color.black);
							lblFull.setVisible(false);
						}

					} catch (SQLException e1) {

						e1.printStackTrace();
					}
				} else if (o == btnNewButton_10) {
					try {

						data = Ward.getdata(17);
						lblWard.setText("Gynaecology Ward");
						lblCpct.setText(Integer.toString(data[0]));
						lblPtnts.setText(Integer.toString(data[1]));
						lblBds.setText(Integer.toString(data[2]));
						if (data[3] >= 100) {

							lblOcpcy.setText(Integer.toString(data[3]) + "%");
							lblOcpcy.setForeground(Color.RED);
							lblFull.setVisible(true);

						} else {
							lblOcpcy.setText(Integer.toString(data[3]) + "%");
							lblOcpcy.setForeground(Color.black);
							lblFull.setVisible(false);
						}

					} catch (SQLException e1) {

						e1.printStackTrace();
					}
				} else if (o == btnNewButton_11) {
					try {

						data = Ward.getdata(16);
						lblWard.setText("Eye Ward");
						lblCpct.setText(Integer.toString(data[0]));
						lblPtnts.setText(Integer.toString(data[1]));
						lblBds.setText(Integer.toString(data[2]));
						if (data[3] >= 100) {

							lblOcpcy.setText(Integer.toString(data[3]) + "%");
							lblOcpcy.setForeground(Color.RED);
							lblFull.setVisible(true);

						} else {
							lblOcpcy.setText(Integer.toString(data[3]) + "%");
							lblOcpcy.setForeground(Color.black);
							lblFull.setVisible(false);
						}

					} catch (SQLException e1) {

						e1.printStackTrace();
					}
				} else if (o == btnNewButton_12) {
					try {

						data = Ward.getdata(15);
						lblWard.setText("Paediatric Ward");
						lblCpct.setText(Integer.toString(data[0]));
						lblPtnts.setText(Integer.toString(data[1]));
						lblBds.setText(Integer.toString(data[2]));
						if (data[3] >= 100) {

							lblOcpcy.setText(Integer.toString(data[3]) + "%");
							lblOcpcy.setForeground(Color.RED);
							lblFull.setVisible(true);

						} else {
							lblOcpcy.setText(Integer.toString(data[3]) + "%");
							lblOcpcy.setForeground(Color.black);
							lblFull.setVisible(false);
						}

					} catch (SQLException e1) {

						e1.printStackTrace();
					}

				} else if (o == btnNewButton_13) {
					try {

						data = Ward.getdata(1);

						lblWard.setText("Maternity Ward");
						lblCpct.setText(Integer.toString(data[0]));
						lblPtnts.setText(Integer.toString(data[1]));
						lblBds.setText(Integer.toString(data[2]));
						if (data[3] >= 100) {

							lblOcpcy.setText(Integer.toString(data[3]) + "%");
							lblOcpcy.setForeground(Color.RED);
							lblFull.setVisible(true);

						} else {
							lblOcpcy.setText(Integer.toString(data[3]) + "%");
							lblOcpcy.setForeground(Color.black);
							lblFull.setVisible(false);
						}

					} catch (SQLException e1) {

						e1.printStackTrace();
					}

				} else if (o == btnNewButton_15) {

				} else if (o == btnNewButton_16) {

				}

			}

		};

		btnNewButton.addActionListener(buttonlistener);
		btnNewButton_1.addActionListener(buttonlistener);
		btnNewButton_2.addActionListener(buttonlistener);
		btnNewButton_3.addActionListener(buttonlistener);
		btnNewButton_4.addActionListener(buttonlistener);
		btnNewButton_5.addActionListener(buttonlistener);
		btnNewButton_6.addActionListener(buttonlistener);
		btnNewButton_7.addActionListener(buttonlistener);
		btnNewButton_8.addActionListener(buttonlistener);
		btnNewButton_9.addActionListener(buttonlistener);
		btnNewButton_10.addActionListener(buttonlistener);
		btnNewButton_11.addActionListener(buttonlistener);
		btnNewButton_12.addActionListener(buttonlistener);
		btnNewButton_13.addActionListener(buttonlistener);

	}
}
