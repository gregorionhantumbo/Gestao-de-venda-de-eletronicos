package gregorio.veiw;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import gregorio.veiw.Login;

public class Init extends JFrame {
		Init(){
			setVisible(true);
			setSize(500, 200);
			setTitle("Gestao de venda de eletronicos");
			setResizable(false);
			setLocationRelativeTo(null);
			
			
			JPanel conteiner = new JPanel();
			conteiner.setBackground(new Color(18,102,229));		
			setContentPane(conteiner);
			conteiner.setLayout(null);
			
			JLabel lbl = new JLabel("Gestao de venda de eletronicos");
			lbl.setBounds(80, 30, 300, 40);
			lbl.setFont(new Font("Arial", Font.ITALIC, 20));
			add(lbl);
			
			JButton btnEntrar = new JButton("Login");
			btnEntrar.setBounds(90, 90, 100, 30);
			btnEntrar.setFont(new Font("Arial", Font.BOLD, 16));
			add(btnEntrar);
			btnEntrar.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					Login entrar = new Login();
					entrar.login();
					setVisible(false);
				}
			});
			
			JButton btnNovoCadastro = new JButton("Novo cadastro");
			btnNovoCadastro.setBounds(250, 90, 150, 30);
			btnNovoCadastro.setFont(new Font("Arial", Font.BOLD, 16));
			add(btnNovoCadastro);
			btnNovoCadastro.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					 Cadastro c = new Cadastro();
					 c.cadastro();
					setVisible(false);
				}
			});
		}
}
