package gregorio.veiw;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

public class Cadastro extends JFrame{
	public void cadastro() {
		setVisible(true);
		setSize(500, 450);
		setTitle("Gestao de venda de eletronicos");
		setResizable(false);
		setLocationRelativeTo(null);
		
		JPanel conteiner = new JPanel();
		conteiner.setBackground(new Color(18,102,229));		
		setContentPane(conteiner);
		conteiner.setLayout(null);
		
		//Construindo labels...
		JLabel lbl = new JLabel("Cadastro");
		lbl.setBounds(160, 10, 150, 40);
		lbl.setFont(new Font("Arial", Font.ITALIC, 30));
		add(lbl);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setBounds(20, 90, 40, 20);
		lblId.setFont(new Font("Arial", Font.BOLD, 16));
		add(lblId);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setBounds(250, 90, 60, 20);
		lblEstado.setFont(new Font("Arial", Font.BOLD, 16));
		add(lblEstado);
		
		JLabel lblNome = new JLabel("Nome completo:");
		lblNome.setBounds(20, 140, 150, 20);
		lblNome.setFont(new Font("Arial", Font.BOLD, 16));
		add(lblNome);
		
		JLabel lblDataNasc = new JLabel("Data de nascimento:");
		lblDataNasc.setBounds(20, 190, 180, 20);
		lblDataNasc.setFont(new Font("Arial", Font.BOLD, 16));
		add(lblDataNasc);
	
		JLabel lblPw = new JLabel("Password:");
		lblPw.setBounds(20, 240, 90, 20);
		lblPw.setFont(new Font("Arial", Font.BOLD, 16));
		add(lblPw);
		
		JLabel lblCargo = new JLabel("Cargo:");
		lblCargo.setBounds(20, 290, 60, 20);
		lblCargo.setFont(new Font("Arial", Font.BOLD, 16));
		add(lblCargo);
		
		JLabel lblSalario = new JLabel("Salario:");
		lblSalario.setBounds(250, 290, 150, 20);
		lblSalario.setFont(new Font("Arial", Font.BOLD, 16));
		add(lblSalario);
		
		//Construindo as areas de texto...
		JTextField txtId = new JTextField();
		txtId.setBounds(50, 90, 100, 25);
		txtId.setFont(new Font("Arial", Font.BOLD, 16));
		add(txtId);
		
		JTextField txtNome = new JTextField();
		txtNome.setBounds(160, 140, 300, 25);
		txtNome.setFont(new Font("Arial", Font.HANGING_BASELINE, 16));
		add(txtNome);
		
		JTextField txtDataNasc = new JTextField();
		txtDataNasc.setBounds(190, 190, 270, 25);
		txtDataNasc.setFont(new Font("Arial", Font.BOLD, 16));
		add(txtDataNasc);
		
		JTextField txtPw = new JTextField();
		txtPw.setBounds(120, 240, 340, 25);
		txtPw.setFont(new Font("Arial", Font.BOLD, 16));
		add(txtPw);
		
		JTextField txtSalario = new JTextField();
		txtSalario.setBounds(320, 290, 100, 25);
		txtSalario.setFont(new Font("Arial", Font.BOLD, 16));
		add(txtSalario);
		
		
		//Construindo as comboboxs...
		String [] estado = {"Ativo", "Desativo"};
		JComboBox cbxEstado = new JComboBox(estado);
		cbxEstado.setBounds(250, 90, 60, 20);
		cbxEstado.setFont(new Font("Arial", Font.BOLD, 16));
		cbxEstado.add(cbxEstado);
		
		//Construindo os buttes...
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(30, 360, 100, 30);
		btnSalvar.setFont(new Font("Arial", Font.BOLD, 16));
		add(btnSalvar);
		btnSalvar.addAncestorListener(new AncestorListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				btnSalvar.setText("");
				btnSalvar.setText("");	
			}

			@Override
			public void ancestorAdded(AncestorEvent event) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void ancestorRemoved(AncestorEvent event) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void ancestorMoved(AncestorEvent event) {
				// TODO Auto-generated method stub
				
			}
		});
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(180, 360, 100, 30);
		btnLimpar.setFont(new Font("Arial", Font.BOLD, 16));
		add(btnLimpar);
		btnLimpar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				txtId.setText("");
				txtNome.setText("");
				txtDataNasc.setText("");
				txtPw.setText("");
				txtSalario.setText("");
			}
		});
		JButton btnSair = new JButton("Sair");
		btnSair.setBounds(340, 360, 100, 30);
		btnSair.setFont(new Font("Arial", Font.BOLD, 16));
		add(btnSair);
		btnSair.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
					Cadastro cadastro = new Cadastro();
					cadastro.setVisible(false);
			}
		});
	}
	
	public void estado() {
		
	}

}
