

	package br.com.fiap.jdbc.factory;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;

	import javax.swing.JOptionPane;

	public class ConnectionFactory {

		private String schema = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
		private String usuario = JOptionPane.showInputDialog("Digite o usuário: ");
		private String senha = JOptionPane.showInputDialog(null, "Digite a senha: ");

		public Connection conectar() {
			
				try {
					return DriverManager.getConnection(schema, usuario, senha);
				} catch (SQLException e) {
					JOptionPane.showMessageDialog(null, "Erro de conexão");
					throw new RuntimeException(e);
				}
				
		}
	}

