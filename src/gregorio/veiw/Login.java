package gregorio.veiw;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Login extends JFrame{
	public void login(){
		setVisible(true);
		setSize(500, 200);
		setTitle("Gestao de venda de eletronicos");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setBackground(new Color(18,102,229));	
		setLocationRelativeTo(null);
		setLayout(new GridLayout(4,1,5,5));
		
		
		JPanel conteiner = new JPanel();
		//conteiner.setVisible(false);
		conteiner.setBackground(new Color(18,102,229));		
		setContentPane(conteiner);
		conteiner.setLayout(null);
		
		JLabel lbl = new JLabel("Login");
		lbl.setBounds(200, 0, 90, 40);
		lbl.setFont(new Font("Arial", Font.ITALIC, 30));
		add(lbl);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(10, 35, 100, 40);
		lblUsuario.setFont(new Font("Arial", Font.ITALIC, 16));
		add(lblUsuario);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(10, 70, 100, 40);
		lblPassword.setFont(new Font("Arial", Font.ITALIC, 16));
		add(lblPassword);
		
		JTextField txtUsuario = new JTextField();
 		txtUsuario.setBounds(120, 45, 300, 20);
		txtUsuario.setFont(new Font("Arial", Font.ITALIC, 16));
		add(txtUsuario);
		
		JTextField txtPassword = new JTextField();
		txtPassword.setBounds(120, 75, 300, 20);
		txtPassword.setFont(new Font("Arial", Font.ITALIC, 16));
		add(txtPassword);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(90, 115, 100, 30);
		btnLimpar.setFont(new Font("Arial", Font.BOLD, 16));
		add(btnLimpar);
		btnLimpar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				txtUsuario.setText("");
				txtPassword.setText("");	
			}
		});
		
		JButton btnGravar = new JButton("Entrar");
		btnGravar.setBounds(300, 115, 100, 30);
		btnGravar.setFont(new Font("Arial", Font.BOLD, 16));
		add(btnGravar);
		btnLimpar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				 new Home();
				
			}
		});
	}
}
