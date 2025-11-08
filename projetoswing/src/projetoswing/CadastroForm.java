package projetoswing;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastroForm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textnome;
	
	
	private JSpinner spinIdade;
	private JRadioButton rdbtnFeminino;
	private JRadioButton rdbtnMasculino;
	private JButton btnEnviar;
	private JLabel lblResumo; 
	private ButtonGroup grupoSexo; 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroForm frame = new CadastroForm();
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
	public CadastroForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 350); 
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Labels
		JLabel lbl_nome = new JLabel("Nome");
		lbl_nome.setBounds(105, 18, 46, 14);
		contentPane.add(lbl_nome);
		
		JLabel lbl_sexo = new JLabel("Sexo");
		lbl_sexo.setBounds(105, 95, 30, 20);
		contentPane.add(lbl_sexo);
		
		JLabel lbl_idade = new JLabel("Idade");
		lbl_idade.setBounds(105, 57, 46, 14);
		contentPane.add(lbl_idade);
		
		
		textnome = new JTextField();
		textnome.setBounds(161, 15, 86, 20);
		contentPane.add(textnome);
		textnome.setColumns(10);
		
		spinIdade = new JSpinner();
		spinIdade.setBounds(192, 54, 40, 20);
		contentPane.add(spinIdade);
		
		
		rdbtnFeminino = new JRadioButton("Feminino");
		rdbtnFeminino.setBounds(149, 98, 73, 14);
		contentPane.add(rdbtnFeminino);
		
		rdbtnMasculino = new JRadioButton("Masculino");
		rdbtnMasculino.setBounds(225, 94, 73, 23);
		contentPane.add(rdbtnMasculino);
		
		
		grupoSexo = new ButtonGroup();
		grupoSexo.add(rdbtnFeminino);
		grupoSexo.add(rdbtnMasculino);
		
		
		btnEnviar = new JButton("Enviar");
		btnEnviar.setBounds(167, 148, 89, 23);
		contentPane.add(btnEnviar);
		
		
		lblResumo = new JLabel("");
		lblResumo.setBounds(10, 190, 414, 100);
		contentPane.add(lblResumo);
		
	
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enviarDados();
			}
		});
	}
	
	
	private void enviarDados() {
	
	    if (textnome.getText().trim().isEmpty()) {
	        JOptionPane.showMessageDialog(this, "O campo Nome é obrigatório.", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
	        return;
	    }

	    if (grupoSexo.getSelection() == null) {
	        JOptionPane.showMessageDialog(this, "Selecione o Sexo.", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
	        return;
	    }

	   
	    String nome = textnome.getText().trim();
	    int idade = 0;
	    try {
	        
	        idade = (Integer) spinIdade.getValue();
	    } catch (ClassCastException e) {
	       
	        idade = 0; 
	    }

	    String sexo = rdbtnMasculino.isSelected() ? "Masculino" : "Feminino";

	 
	    Cliente cliente = new Cliente(nome, idade, sexo);

	   
	    lblResumo.setText(cliente.toString());
	   
	}
}