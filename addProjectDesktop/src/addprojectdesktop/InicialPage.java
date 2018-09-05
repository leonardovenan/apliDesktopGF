package addprojectdesktop;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.JLayeredPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import net.miginfocom.swing.MigLayout;


//falta fazer as janelas serem responsivas

@SuppressWarnings("unused")
public class InicialPage extends JFrame {
	
	private static final long seralVersionUID = 1L;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InicialPage frame = new InicialPage();
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
	public InicialPage() {
		setTitle("Página Inicial");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1366, 720);
		setVisible(true);
		setLocationRelativeTo(null);
		setExtendedState(Frame.MAXIMIZED_BOTH);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[398px][131px][140px][10px][][138px][136px][377px]", "[70px][17px][120px][17px][28.00px][140.00px][23.00][116.00][50.00][42.00]"));
		
		JLabel lblBaseAntiga = new JLabel("Base Antiga");
		lblBaseAntiga.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblBaseAntiga, "cell 4 1,alignx center,aligny top");
		lblBaseAntiga.setFont(new Font("Arial", Font.BOLD, 14));
		
		JButton bt1 = new JButton("");
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BaseAnt frame = new BaseAnt(); 
				frame.setVisible(true);
				frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
				dispose();
			}
		});
		bt1.setIcon(new ImageIcon("C:/Users/leonardo.correia/eclipse-workspace/imagens proj/dados.jpg"));
		getContentPane().add(bt1, "cell 4 2,alignx center,growy");
		
		JLabel lblPginaInicial = new JLabel("    P\u00E1gina Inicial");
		lblPginaInicial.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblPginaInicial, "cell 0 0 8 1,alignx center,aligny center");
		lblPginaInicial.setFont(new Font("Arial", Font.BOLD, 19));
		
		JButton bt3 = new JButton("");
		bt3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Inss frame = new Inss(); 
				frame.setVisible(true);
				frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
				dispose();
			}
		});
		
		JButton bt2 = new JButton("");
		bt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ViewContrato frame = new ViewContrato(); 
				frame.setVisible(true);
				frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
				dispose();
			}
		});
		
		JLabel label = new JLabel("Contratos");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Arial", Font.BOLD, 14));
		contentPane.add(label, "cell 4 4,alignx center,aligny top");
		bt2.setIcon(new ImageIcon("C:/Users/leonardo.correia/eclipse-workspace/imagens proj/Contratos.png"));
		getContentPane().add(bt2, "cell 4 5,alignx center,aligny top");
		
		JLabel label_1 = new JLabel("INSS");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Arial", Font.BOLD, 14));
		contentPane.add(label_1, "cell 4 6,alignx center,aligny top");
		bt3.setIcon(new ImageIcon("C:/Users/leonardo.correia/eclipse-workspace/imagens proj/logo-inss-final.png"));
		getContentPane().add(bt3, "cell 4 7,alignx center,growy");					
		
		JLabel lblAplicaoDesktop = new JLabel("Aplica\u00E7\u00E3o Desktop");
		lblAplicaoDesktop.setHorizontalAlignment(SwingConstants.CENTER);
		lblAplicaoDesktop.setFont(new Font("Arial", Font.PLAIN, 11));
		lblAplicaoDesktop.setForeground(Color.GRAY);
		contentPane.add(lblAplicaoDesktop, "cell 4 9,growx,aligny top");
		
	}
	
	public void add(String label, JComponent componente) {
		GridBagConstraints cons = new GridBagConstraints();
		cons.fill = GridBagConstraints.NONE;
		cons.anchor = GridBagConstraints.NORTHWEST;
		cons.insets = new Insets(4,4,4,4);
		cons.weightx = 0;
		cons.gridwidth = 1;
		
		this.getContentPane().add(new JLabel(label), cons);
		
		cons.fill = GridBagConstraints.BOTH;
		cons.weightx = 1;
		cons.gridwidth = GridBagConstraints.REMAINDER;
		
		this.getContentPane().add(componente, cons);	
		
	}
	
	public void add(String label, JScrollPane componente) {
		GridBagConstraints cons = new GridBagConstraints();
		cons.fill = GridBagConstraints.NONE;
		cons.anchor = GridBagConstraints.NORTHWEST;
		cons.insets = new Insets(4,4,4,4);
		cons.weightx = 0;
		cons.gridwidth = 1;
		
		this.getContentPane().add(new JLabel(label), cons);
		
		cons.fill = GridBagConstraints.BOTH;
		cons.weightx = 1;
		cons.gridwidth = GridBagConstraints.REMAINDER;
		
		this.getContentPane().add(componente, cons);
	}
	
	public void add(String label, JComponent componente, String label2, JComponent componente2) {
		GridBagConstraints cons = new GridBagConstraints();
		
		cons.fill = GridBagConstraints.BOTH;
		cons.insets = new Insets(4,4,4,4);
		cons.fill = GridBagConstraints.NONE;
		cons.anchor = GridBagConstraints.NORTHWEST;
		cons.weightx = 0;
		cons.gridwidth = 1;
		
		this.getContentPane().add(new JLabel(label), cons);
		
		cons.weightx = 1;
		cons.gridwidth = 1;
		cons.fill = GridBagConstraints.BOTH;
		
		this.getContentPane().add(componente, cons);
		
		cons.fill = GridBagConstraints.NONE;
		cons.weightx = 0;
		cons.gridwidth = 1;
		
		this.getContentPane().add(new JLabel(label2), cons);
		
		cons.weightx = 1;
		cons.fill = GridBagConstraints.BOTH;
		cons.gridwidth = GridBagConstraints.REMAINDER;
		
		this.getContentPane().add(componente2, cons);
	}
}
