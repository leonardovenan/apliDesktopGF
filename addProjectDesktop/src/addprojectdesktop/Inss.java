package addprojectdesktop;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import java.awt.FlowLayout;
import javax.swing.border.EtchedBorder;
import javax.swing.SwingConstants;
import net.miginfocom.swing.MigLayout;

public class Inss extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;
	private JTable table;
	private String colunas[] = {"CPF", "Nome", "Agência", "Cidade",  "UF Cliente"};
	Object [] [] dados = {};
	Object[] itens = {"AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", 
			"MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" };

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inss frame = new Inss();
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
	public Inss() {
		setTitle("INSS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1366, 720);
		setVisible(true);
		setLocationRelativeTo(null);
		setExtendedState(Frame.MAXIMIZED_BOTH);
		contentPane = new JPanel();
		contentPane.setBorder(new MatteBorder(5, 0, 1, 1, (Color) new Color(0, 0, 0)));
		setContentPane(contentPane);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InicialPage frame = new InicialPage(); 
				frame.setVisible(true);
				frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
				dispose();
			}
		});
		contentPane.setLayout(new MigLayout("", "[75px][5px][55.00px][47.00px][7.00px][26.00px][126.00px][121.00px][86.00px][][39.00px][][-16.00px][34px][-19.00px][56px][130.00px][61px][-23.00px][26px][10px][201.00px][22.00][]", "[23px][1px][46px][72px][38px][240px][14px][174.00][]"));
		btnVoltar.setForeground(Color.BLUE);
		btnVoltar.setFont(new Font("Arial", Font.BOLD, 12));
		contentPane.add(btnVoltar, "cell 0 0,growx,aligny top");
		
		textField_2 = new JTextField();
		textField_2.setText("");
		textField_2.setFont(new Font("Arial", Font.PLAIN, 15));
		textField_2.setColumns(10);
		contentPane.add(textField_2, "cell 9 3 4 1,growx,aligny center");
		
		textField = new JTextField();
		textField.setText("");
		textField.setFont(new Font("Arial", Font.PLAIN, 15));
		textField.setColumns(10);
		contentPane.add(textField, "cell 3 3 5 1,growx,aligny center");
		
		JLabel label_2 = new JLabel("Nome Segurado:");
		contentPane.add(label_2, "flowx,cell 2 3,alignx center");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Arial", Font.BOLD, 15));
		
		JPanel panel = new JPanel();
		panel.setBorder(new CompoundBorder());
		contentPane.add(panel, "cell 2 3,alignx center,aligny center");
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new CompoundBorder());
		contentPane.add(panel_2, "flowx,cell 8 3,alignx left,aligny center");
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel label_3 = new JLabel("UF:");
		contentPane.add(label_3, "cell 15 3,alignx right");
		label_3.setFont(new Font("Arial", Font.BOLD, 15));
		
		@SuppressWarnings("rawtypes")
		JComboBox comboBox = new JComboBox(itens);
		comboBox.setFont(new Font("Arial", Font.BOLD, 15));
		contentPane.add(comboBox, "cell 16 3,alignx left,aligny center");
		
		JButton button = new JButton("Filtrar");
		button.setFont(new Font("Arial", Font.BOLD, 12));
		contentPane.add(button, "cell 21 3,alignx left,aligny center");
		
		JButton button_1 = new JButton("Cancelar");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("");
				textField_2.setText("");				
			}
		});
		button_1.setForeground(Color.RED);
		button_1.setFont(new Font("Arial", Font.BOLD, 12));
		contentPane.add(button_1, "cell 17 3 3 1,growx,aligny center");
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new CompoundBorder());
		contentPane.add(panel_3, "cell 13 3,alignx left,aligny center");
		panel_3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		table = new JTable(dados, colunas);
		table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table.setFont(new Font("Arial", Font.PLAIN, 12));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"CPF", "Nome", "Ag\u00EAncia", "Cidade", "UF Cliente"
			}
		));
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		contentPane.add(table, "cell 0 5 22 1,growx,aligny top");
		
		JLabel label_1 = new JLabel("CPF");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Arial", Font.BOLD, 14));
		contentPane.add(label_1, "cell 0 4 4 1,growx,aligny center");
		
		JLabel label_4 = new JLabel("Nome");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Arial", Font.BOLD, 14));
		contentPane.add(label_4, "cell 4 4 4 1,growx,aligny center");
		
		JLabel label_5 = new JLabel("Agência");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("Arial", Font.BOLD, 14));
		contentPane.add(label_5, "cell 8 4 3 1,growx,aligny center");
		
		JLabel label_6 = new JLabel("Cidade");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("Arial", Font.BOLD, 14));
		contentPane.add(label_6, "cell 14 4 3 1,growx,aligny center");
		
		JLabel label_7 = new JLabel("UF Cliente");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setFont(new Font("Arial", Font.BOLD, 14));
		contentPane.add(label_7, "cell 18 4 4 1,alignx center,aligny center");
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		contentPane.add(panel_5, "cell 8 0 6 2,alignx center,growy");
		
		JLabel label_8 = new JLabel("INSS");
		panel_5.add(label_8);
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setFont(new Font("Arial", Font.BOLD, 19));
		
		JLabel lblAplicaoDesktop = new JLabel("Aplica\u00E7\u00E3o Desktop");
		lblAplicaoDesktop.setFont(new Font("Arial", Font.PLAIN, 11));
		lblAplicaoDesktop.setForeground(Color.GRAY);
		contentPane.add(lblAplicaoDesktop, "cell 9 8,alignx right,aligny top");
		
		JLabel label = new JLabel("Ag\u00EAncia:");
		contentPane.add(label, "cell 8 3,alignx center");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Arial", Font.BOLD, 15));
	}
}
