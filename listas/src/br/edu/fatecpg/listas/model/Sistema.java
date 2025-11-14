package br.edu.fatecpg.listas.model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Sistema extends JFrame {

    
    private Empresa minhaEmpresa;

    private JTabbedPane tabbedPane;
    private JTextArea outputArea; 

    
    private JTextField clienteNomeField;
    private JTextField clienteEmailField;

   
    private JTextField funcNomeField;
    private JTextField funcCargoField;
    private JTextField funcSalarioField;

    public Sistema() {
       
        minhaEmpresa = new Empresa("Minha Empresa Tech");

        
        setTitle("Sistema de Gestão Empresarial");
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10)); 

        tabbedPane = new JTabbedPane();

      
        tabbedPane.addTab("Adicionar Cliente (P1)", createClientePanel());
        tabbedPane.addTab("Adicionar Funcionário (P2)", createFuncionarioPanel());
        tabbedPane.addTab("Relatórios (P1, P2, P3)", createRelatorioPanel());

        add(tabbedPane, BorderLayout.CENTER);

      
        outputArea = new JTextArea(10, 50); 
        outputArea.setEditable(false);
        outputArea.setFont(new Font("Monospaced", Font.PLAIN, 12));
        JScrollPane scrollPane = new JScrollPane(outputArea);
        add(scrollPane, BorderLayout.SOUTH);

        log("Sistema iniciado. Bem-vindo!");
    }

   
    private JPanel createClientePanel() {
        JPanel panel = new JPanel(new GridBagLayout()); 
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); 
        
        
        gbc.gridx = 0; gbc.gridy = 0;
        gbc.weightx = 0; gbc.fill = GridBagConstraints.NONE; gbc.anchor = GridBagConstraints.WEST;
        panel.add(new JLabel("Nome:"), gbc);

        
        gbc.gridx = 1; gbc.gridy = 0;
        gbc.weightx = 1.0; gbc.fill = GridBagConstraints.HORIZONTAL; gbc.anchor = GridBagConstraints.CENTER;
        clienteNomeField = new JTextField(30);
        panel.add(clienteNomeField, gbc);

        
        gbc.gridx = 0; gbc.gridy = 1;
        gbc.weightx = 0; gbc.fill = GridBagConstraints.NONE; gbc.anchor = GridBagConstraints.WEST;
        panel.add(new JLabel("Email:"), gbc);

        
        gbc.gridx = 1; gbc.gridy = 1;
        gbc.weightx = 1.0; gbc.fill = GridBagConstraints.HORIZONTAL; gbc.anchor = GridBagConstraints.CENTER;
        clienteEmailField = new JTextField(30);
        panel.add(clienteEmailField, gbc);

        
        gbc.gridx = 1; gbc.gridy = 2;
        gbc.weightx = 0; gbc.fill = GridBagConstraints.NONE; gbc.anchor = GridBagConstraints.EAST;
        JButton addButton = new JButton("Adicionar Cliente");
        
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adicionarCliente();
            }
        });
        panel.add(addButton, gbc);

        return panel;
    }

   
    private JPanel createFuncionarioPanel() {
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

    
        gbc.gridx = 0; gbc.gridy = 0;
        gbc.weightx = 0; gbc.fill = GridBagConstraints.NONE; gbc.anchor = GridBagConstraints.WEST;
        panel.add(new JLabel("Nome:"), gbc);
        
   
        gbc.gridx = 1; gbc.gridy = 0;
        gbc.weightx = 1.0; gbc.fill = GridBagConstraints.HORIZONTAL; gbc.anchor = GridBagConstraints.CENTER;
        funcNomeField = new JTextField(30);
        panel.add(funcNomeField, gbc);

        
        gbc.gridx = 0; gbc.gridy = 1;
        gbc.weightx = 0; gbc.fill = GridBagConstraints.NONE; gbc.anchor = GridBagConstraints.WEST;
        panel.add(new JLabel("Cargo:"), gbc);
        
       
        gbc.gridx = 1; gbc.gridy = 1;
        gbc.weightx = 1.0; gbc.fill = GridBagConstraints.HORIZONTAL; gbc.anchor = GridBagConstraints.CENTER;
        funcCargoField = new JTextField(30);
        panel.add(funcCargoField, gbc);

       
        gbc.gridx = 0; gbc.gridy = 2;
        gbc.weightx = 0; gbc.fill = GridBagConstraints.NONE; gbc.anchor = GridBagConstraints.WEST;
        panel.add(new JLabel("Salário (ex: 5000.00):"), gbc);
        
      
        gbc.gridx = 1; gbc.gridy = 2;
        gbc.weightx = 1.0; gbc.fill = GridBagConstraints.HORIZONTAL; gbc.anchor = GridBagConstraints.CENTER;
        funcSalarioField = new JTextField(30);
        panel.add(funcSalarioField, gbc);

 
        gbc.gridx = 1; gbc.gridy = 3;
        gbc.weightx = 0; gbc.fill = GridBagConstraints.NONE; gbc.anchor = GridBagConstraints.EAST;
        JButton addButton = new JButton("Adicionar Funcionário");
        
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adicionarFuncionario();
            }
        });
        panel.add(addButton, gbc);

        return panel;
    }

    private JPanel createRelatorioPanel() {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10)); // Layout simples

     
        JButton btnExibirClientes = new JButton("Exibir Clientes (P1)");
        btnExibirClientes.addActionListener(e -> log(minhaEmpresa.exibirClientes()));
        panel.add(btnExibirClientes);
       
        JButton btnExibirFuncionarios = new JButton("Exibir Funcionários (P2)");
        btnExibirFuncionarios.addActionListener(e -> log(minhaEmpresa.exibirFuncionarios()));
        panel.add(btnExibirFuncionarios);

        
        JButton btnFolhaSalarial = new JButton("Calcular Folha Salarial (P2)");
        btnFolhaSalarial.addActionListener(e -> {
            double total = minhaEmpresa.calcularFolhaSalarial();
            log("--- Folha Salarial Total ---\nTotal: R$ " + String.format("%.2f", total));
        });
        panel.add(btnFolhaSalarial);

      
        JButton btnMediaSalarial = new JButton("Calcular Média Salarial (P3)");
        btnMediaSalarial.addActionListener(e -> log(minhaEmpresa.exibirMediaSalarial()));
        panel.add(btnMediaSalarial);

        return panel;
    }

   
    private void adicionarCliente() {
        String nome = clienteNomeField.getText();
        String email = clienteEmailField.getText();

        if (nome.isEmpty() || email.isEmpty()) {
            log("Erro: Nome e Email do cliente não podem estar vazios.");
            return;
        }

        String resultado = minhaEmpresa.adicionarCliente(nome, email);
        log(resultado); 

        if (resultado.contains("sucesso")) {
            clienteNomeField.setText("");
            clienteEmailField.setText("");
        }
    }

    
    private void adicionarFuncionario() {
        String nome = funcNomeField.getText();
        String cargo = funcCargoField.getText();
        String salarioStr = funcSalarioField.getText();

        if (nome.isEmpty() || cargo.isEmpty() || salarioStr.isEmpty()) {
            log("Erro: Nome, Cargo e Salário do funcionário não podem estar vazios.");
            return;
        }

        try {
            double salario = Double.parseDouble(salarioStr);
            
            String resultado = minhaEmpresa.adicionarFuncionario(nome, cargo, salario);
            log(resultado);

            if (resultado.contains("sucesso")) {
                funcNomeField.setText("");
                funcCargoField.setText("");
                funcSalarioField.setText("");
            }
        } catch (NumberFormatException ex) {
            log("Erro: Salário inválido. Use ponto decimal (ex: 5000.00).");
        }
    }

    
    private void log(String message) {
        outputArea.append(message + "\n\n");
        outputArea.setCaretPosition(outputArea.getDocument().getLength());
    }

    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Sistema().setVisible(true);
            }
        });
    }
}