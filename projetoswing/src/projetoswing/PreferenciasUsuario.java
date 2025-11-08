package projetoswing;

import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JSlider;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JScrollPane;

public class PreferenciasUsuario extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	
	private JComboBox<String> cmbTema;
	private JCheckBox chkNotificacoes;
	private JSlider sldVolume;
	private JButton btnSalvar;
	private JTextArea txtAreaPreferencias;
    private JLabel lblTema;
    private JLabel lblNotificacoes;
    private JLabel lblVolume;
    
	
	private final Usuario usuario = new Usuario();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PreferenciasUsuario frame = new PreferenciasUsuario();
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
	public PreferenciasUsuario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 400); 
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null); 

		lblTema = new JLabel("Tema");
		lblTema.setBounds(30, 20, 80, 20);
		contentPane.add(lblTema);
		
		cmbTema = new JComboBox<>(new String[]{"Claro", "Escuro"});
		cmbTema.setBounds(120, 20, 100, 20);
		contentPane.add(cmbTema);
		
		
		lblNotificacoes = new JLabel("Notificações");
		lblNotificacoes.setBounds(30, 60, 80, 20);
		contentPane.add(lblNotificacoes);
		
		chkNotificacoes = new JCheckBox("Habilitar");
		chkNotificacoes.setBounds(120, 60, 100, 20);
		contentPane.add(chkNotificacoes);

	
		lblVolume = new JLabel("Volume");
		lblVolume.setBounds(30, 100, 80, 20);
		contentPane.add(lblVolume);
		
		sldVolume = new JSlider(0, 100, 50); 
		sldVolume.setMajorTickSpacing(25);
		sldVolume.setPaintTicks(true);
		sldVolume.setPaintLabels(true);
		sldVolume.setBounds(120, 100, 280, 45);
		contentPane.add(sldVolume);

		btnSalvar = new JButton("Salvar Preferências");
		btnSalvar.setBounds(150, 170, 160, 30);
		contentPane.add(btnSalvar);
		
		txtAreaPreferencias = new JTextArea();
		txtAreaPreferencias.setEditable(false);
		
		JScrollPane scrollPane = new JScrollPane(txtAreaPreferencias);
		scrollPane.setBounds(30, 220, 380, 120);
		contentPane.add(scrollPane);
		
	
		aplicarPreferenciasIniciais();
		adicionarListeners();
	}

	
	private void adicionarListeners() {
	
		btnSalvar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				salvarPreferencias();
			}
		});

		
		cmbTema.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					mudarCorTema((String) cmbTema.getSelectedItem());
				}
			}
		});
	}

	
	private void salvarPreferencias() {
		String temaSelecionado = (String) cmbTema.getSelectedItem();
		boolean notifHabilitadas = chkNotificacoes.isSelected();
		int volumeAtual = sldVolume.getValue();

		usuario.setTema(temaSelecionado);
		usuario.setNotificacoesHabilitadas(notifHabilitadas);
		usuario.setVolume(volumeAtual);

		mudarCorTema(usuario.getTema());
		txtAreaPreferencias.setText(usuario.toString());
        JOptionPane.showMessageDialog(this, "Preferências salvas com sucesso!", "Salvo", JOptionPane.INFORMATION_MESSAGE);
	}

	private void mudarCorTema(String tema) {
		Color novaCor;
		Color corTexto;
		
		if (tema.equals("Escuro")) {
			novaCor = new Color(50, 50, 50); 
			corTexto = Color.WHITE;
		} else {
			novaCor = new Color(240, 240, 240);
			corTexto = Color.BLACK;
		}

		
		contentPane.setBackground(novaCor);
		
		
		lblTema.setForeground(corTexto);
		lblNotificacoes.setForeground(corTexto);
		lblVolume.setForeground(corTexto);
		txtAreaPreferencias.setBackground(novaCor);
		txtAreaPreferencias.setForeground(corTexto);
        
        
        if (tema.equals("Escuro")) {
             sldVolume.setBackground(new Color(60, 60, 60)); 
             sldVolume.setForeground(corTexto);
        } else {
             sldVolume.setBackground(novaCor);
             sldVolume.setForeground(corTexto);
        }

		repaint();
	}
	
	private void aplicarPreferenciasIniciais() {
	   
	    cmbTema.setSelectedItem(usuario.getTema());
	    chkNotificacoes.setSelected(usuario.isNotificacoesHabilitadas());
	    sldVolume.setValue(usuario.getVolume());
	    
	   
	    mudarCorTema(usuario.getTema());
	    txtAreaPreferencias.setText(usuario.toString());
	}
}