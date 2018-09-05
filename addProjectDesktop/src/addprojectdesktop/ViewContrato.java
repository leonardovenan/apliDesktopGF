package addprojectdesktop;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import java.awt.FlowLayout;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import java.awt.Font;
import java.awt.Frame;

import javax.swing.JTable;
import javax.swing.border.CompoundBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.SwingConstants;
import net.miginfocom.swing.MigLayout;

public class ViewContrato extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtBanco;
	private JTextField txtBenef;
	private JTextField txtContrato;
	private JTable table;
	private String colunas[] = {"Banco", "Benefício", "Contrato"};
	Object [] [] dados = {};
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewContrato frame = new ViewContrato();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ViewContrato() {
		setTitle("Contratos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1366, 720);
		setVisible(true);
		setLocationRelativeTo(null);
		setExtendedState(Frame.MAXIMIZED_BOTH);
		contentPane = new JPanel();
		contentPane.setBorder(new MatteBorder(5, 0, 1, 1, (Color) new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[75px][44px][102px][10px][208px][10px][11px][2px][76px][10px][209px][89px][10px][14px][3px][126px][10px][89px][10px][222px]", "[23px][11px][47px][72px][38px][240px][14px][174.00][]"));
		
		txtBanco = new JTextField();
		txtBanco.setFont(new Font("Arial", Font.PLAIN, 15));
		txtBanco.setText("");
		contentPane.add(txtBanco, "cell 4 3,growx,aligny center");
		txtBanco.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBorder(new CompoundBorder());
		contentPane.add(panel, "cell 2 3,growx,aligny center");
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblBanco = new JLabel("Banco:");
		panel.add(lblBanco);
		lblBanco.setFont(new Font("Arial", Font.BOLD, 15));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new CompoundBorder());
		contentPane.add(panel_1, "cell 6 3 3 1,growx,aligny center");
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel label = new JLabel("Benefício:");
		label.setFont(new Font("Arial", Font.BOLD, 15));
		panel_1.add(label);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new CompoundBorder());
		contentPane.add(panel_2, "cell 11 3,growx,aligny center");
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel label_1 = new JLabel("Contrato:");
		label_1.setFont(new Font("Arial", Font.BOLD, 15));
		panel_2.add(label_1);
		
		txtBenef = new JTextField();
		txtBenef.setText("");		
		txtBenef.setFont(new Font("Arial", Font.PLAIN, 15));
		txtBenef.setColumns(10);
		contentPane.add(txtBenef, "cell 10 3,growx,aligny center");
		
		txtContrato = new JTextField();
		txtContrato.setText("");
		txtContrato.setFont(new Font("Arial", Font.PLAIN, 15));
		txtContrato.setColumns(10);
		contentPane.add(txtContrato, "cell 13 3 3 1,growx,aligny center");
		
		JButton btnNewButton = new JButton("Filtrar");
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		contentPane.add(btnNewButton, "cell 19 3,alignx left,aligny center");
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.setForeground(Color.RED);
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtBanco.setText("");
				txtBenef.setText("");
				txtContrato.setText("");
			}
		});
		contentPane.add(btnNewButton_1, "cell 17 3,growx,aligny center");
		
		table = new JTable(dados, colunas);
		table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table.setFont(new Font("Arial", Font.PLAIN, 12));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"Banco", "Benef\u00EDcio", "Contrato"
			}
		));
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		contentPane.add(table, "cell 0 5 20 1,growx,aligny top");
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InicialPage frame = new InicialPage(); 
				frame.setVisible(true);
				frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
				dispose();
			}
		});
		btnVoltar.setForeground(Color.BLUE);
		btnVoltar.setFont(new Font("Arial", Font.BOLD, 12));
		contentPane.add(btnVoltar, "cell 0 0,growx,aligny top");
		
		JLabel label_4 = new JLabel("Contrato");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(label_4, "cell 15 4 5 1,growx,aligny center");
		label_4.setFont(new Font("Arial", Font.BOLD, 15));
		
		JLabel label_2 = new JLabel("Banco");
		contentPane.add(label_2, "cell 0 4 7 1,growx,aligny center");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Arial", Font.BOLD, 15));
		
		JLabel label_3 = new JLabel("Benefício");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(label_3, "cell 8 4 6 1,growx,aligny center");
		label_3.setFont(new Font("Arial", Font.BOLD, 15));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		contentPane.add(panel_4, "cell 10 0 1 2,grow");
		
		JLabel label_5 = new JLabel("Contrátos");
		panel_4.add(label_5);
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("Arial", Font.BOLD, 19));
		
		JLabel lblAplicaoDesktop = new JLabel("Aplica\u00E7\u00E3o Desktop");
		lblAplicaoDesktop.setFont(new Font("Arial", Font.PLAIN, 11));
		lblAplicaoDesktop.setForeground(Color.GRAY);
		contentPane.add(lblAplicaoDesktop, "cell 10 8,alignx center,aligny top");
	}
}
