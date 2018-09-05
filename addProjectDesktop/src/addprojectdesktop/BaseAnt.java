package addprojectdesktop;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.border.EtchedBorder;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import net.miginfocom.swing.MigLayout;

public class BaseAnt extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;
	private String colunas[] = {"CPF", "Nome", "Agencia", "Cidade", "UF Cliente"};
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
					BaseAnt frame = new BaseAnt();
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
	public BaseAnt() {
		setTitle("Base Antiga");
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
		contentPane.setLayout(new MigLayout("", "[75px][63px][83.00px][21.00px][116px][-7.00px][-12.00px][88.00px][1px][-49.00px][125px][10px][55px][18.00px][34.00][52.00px][60.00px][-17.00px][15.00px][8.00][12.00px][][24.00px][42px][1px][][4.00px][10px][203px]", "[70px][72px][38px][240px][14px][198.00][]"));
		btnVoltar.setForeground(Color.BLUE);
		btnVoltar.setFont(new Font("Arial", Font.BOLD, 12));
		contentPane.add(btnVoltar, "cell 0 0,growx,aligny top");
		
		textField = new JTextField();
		textField.setText("");
		textField.setFont(new Font("Arial", Font.PLAIN, 15));
		textField.setColumns(10);
		contentPane.add(textField, "cell 3 1 2 1,alignx center,aligny center");
		
		JPanel panel = new JPanel();
		panel.setBorder(new CompoundBorder());
		contentPane.add(panel, "cell 2 1,alignx right,aligny center");
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel label = new JLabel("Agência:");
		label.setFont(new Font("Arial", Font.BOLD, 15));
		panel.add(label);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new CompoundBorder());
		contentPane.add(panel_1, "flowx,cell 6 1 3 1,alignx left,aligny center");
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new CompoundBorder());
		contentPane.add(panel_2, "cell 12 1,alignx left,aligny center");
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel label_2 = new JLabel("Nome:");
		label_2.setFont(new Font("Arial", Font.BOLD, 15));
		panel_2.add(label_2);
		
		textField_2 = new JTextField();
		textField_2.setText("");
		textField_2.setFont(new Font("Arial", Font.PLAIN, 15));
		textField_2.setColumns(10);
		contentPane.add(textField_2, "cell 13 1 4 1,growx,aligny center");
		
		JButton button = new JButton("Filtrar");
		button.setFont(new Font("Arial", Font.BOLD, 12));
		contentPane.add(button, "cell 28 1,alignx left,aligny center");
		
		JButton button_1 = new JButton("Cancelar");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
			}
		});
		button_1.setForeground(Color.RED);
		button_1.setFont(new Font("Arial", Font.BOLD, 12));
		contentPane.add(button_1, "cell 23 1 4 1,growx,aligny center");
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new CompoundBorder());
		contentPane.add(panel_4, "flowx,cell 20 1,alignx left,aligny center");
		panel_4.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel label_3 = new JLabel("UF:");
		panel_4.add(label_3);
		label_3.setFont(new Font("Arial", Font.BOLD, 15));
		
		JLabel label_8 = new JLabel("UF Cliente");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setFont(new Font("Arial", Font.BOLD, 14));
		contentPane.add(label_8, "cell 20 2 6 1,growx,aligny center");
		
		table = new JTable(dados, colunas);
		table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table.setFont(new Font("Arial", Font.PLAIN, 12));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"ID", "Nome", "Ag\u00EAncia", "Conv\u00EAnio", "UF Cliente", "Conta"
			}
		));
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		contentPane.add(table, "cell 0 3 29 1,growx,aligny top");
		
		JLabel label_4 = new JLabel("ID");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Arial", Font.BOLD, 14));
		contentPane.add(label_4, "cell 0 2 3 1,growx,aligny center");
		
		JLabel label_5 = new JLabel("Nome");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("Arial", Font.BOLD, 14));
		contentPane.add(label_5, "cell 3 2 5 1,growx,aligny center");
		
		JLabel label_6 = new JLabel("Agência");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("Arial", Font.BOLD, 14));
		contentPane.add(label_6, "cell 8 2 6 1,alignx center,aligny center");
		
		JLabel label_7 = new JLabel("Convênio");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setFont(new Font("Arial", Font.BOLD, 14));
		contentPane.add(label_7, "cell 14 2 5 1,alignx center,aligny center");
		
		JLabel label_9 = new JLabel("Conta");
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setFont(new Font("Arial", Font.BOLD, 14));
		contentPane.add(label_9, "cell 26 2 3 1,growx,aligny center");
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		contentPane.add(panel_6, "cell 13 0 3 1,alignx center,aligny center");
		
		JLabel label_10 = new JLabel("Base Antiga");
		panel_6.add(label_10);
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setFont(new Font("Arial", Font.BOLD, 19));
		
		JComboBox<String> comboBox_1 = new JComboBox(itens);
		comboBox_1.setFont(new Font("Arial", Font.BOLD, 15));
		contentPane.add(comboBox_1, "cell 20 1,alignx right,aligny center");
		
		JLabel lblAplicaoDesktop = new JLabel("Aplica\u00E7\u00E3o Desktop");
		lblAplicaoDesktop.setFont(new Font("Arial", Font.PLAIN, 11));
		lblAplicaoDesktop.setForeground(Color.GRAY);
		contentPane.add(lblAplicaoDesktop, "cell 14 6,alignx left,aligny top");
		
		textField_1 = new JTextField();
		textField_1.setText("");
		textField_1.setFont(new Font("Arial", Font.PLAIN, 15));
		textField_1.setColumns(10);
		contentPane.add(textField_1, "cell 8 1 3 1,alignx center,aligny center");
		
		JLabel label_1 = new JLabel("Convênio:");
		contentPane.add(label_1, "cell 7 1,alignx center");
		label_1.setFont(new Font("Arial", Font.BOLD, 15));
	}
}
