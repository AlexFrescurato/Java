import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
public class Cadastro extends JFrame implements ActionListener{
	private JTextField Nome, Telefone, Telefone2, Telefone3, Endereco, Cpf, Rg, Email, Numero, complemento, cidade, bairro, cep, data_nascimento;
	private JButton cadas, consul, limpa;
	private JLabel nome, endere, tele, tele1, tele2, Cadastro_de, cpf, email, rg, numb, comple, cid, bair, cp, dt_nasc;
	private JComboBox city;
	public Pessoa pa[] = new Pessoa[10];
	Scanner s = new Scanner(System.in);
	private String n1, n2, n3;
	int contador = 0;
	public Cadastro(){
		super("Cadastro de Clientes");
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		cadas = new JButton("Cadastro");
		consul = new JButton("Consulta");
		limpa = new JButton("Limpar");
		nome = new JLabel("Nome:");
		endere = new JLabel("Endere�o:");
		tele = new JLabel("Fone Com:");
		tele1 = new JLabel("Fone Res:");
		tele2 = new JLabel("Cel:");
		Cadastro_de = new JLabel("Cadastro Ecercicio Lp2");
		numb = new JLabel("Numero");
		comple = new JLabel("Complemento");
		bair = new JLabel("Bairro");
		cid = new JLabel("Cidade");
		cp = new JLabel("CEP");
		dt_nasc = new JLabel("Data de Nascimento");
		rg = new JLabel("RG");
		cpf = new JLabel("CPF");
		Numero = new JTextField();
		complemento = new JTextField();
		bairro = new JTextField();
		cidade = new JTextField();
		cep = new JTextField();
		city = new JComboBox();
		//city = new JTextField();
		data_nascimento = new JTextField();
		//Adiciona cidades ao ComboBox
		city.addItem("Vitoria da conquista");
		city.addItem("Itapetinga");
		city.addItem("Barra di Cho�a");
		city.addItem("Brumado");
		city.addItem("Po�oes");
		getContentPane.add(cadas);
		getContentPane.add(consul);
		getContentPane.add(Nome);
		getContentPane.add(Endereco);
		getContentPane.add(Telefone);
		getContentPane.add(Telefone2);
		getContentPane.add(Telefone3);
		getContentPane.add(nome);
		getContentPane.add(tele);
		getContentPane.add(tele1);
		getContentPane.add(tele2);
		getContentPane.add(endere);
		getContentPane.add(Cpf);
		getContentPane.add(Rg);
		getContentPane.add(Email);
		getContentPane.add(Numero);
		getContentPane.add(numb);
		getContentPane.add(comple);
		getContentPane.add(complemento);
		getContentPane.add(bair);
		getContentPane.add(bairro);
		getContentPane.add(cep);
		getContentPane.add(cp);
		getContentPane.add(cidade);
		getContentPane.add(cid);
		getContentPane.add(city);
		getContentPane.add(dt_nasc);
		getContentPane.add(data_nascimento);
		getContentPane.add(rg);
		getContentPane.add(cpf);
		Nome.setBounds(60,90,430,20);
		Endereco.setBounds(60,90,160,20);
		//Telefone.setBounds(60,120,300,20);
		nome.setBounds(0,60,120,20);
		endere.setBounds(0,90,120,20);
		//tele.setBounds(0,120,120,20);
		Cadastro_de.setBounds(120,20,200,20);
		Nome.setBounds(60,90,430,20);
		Endereco.setBounds(60,90,160,20);
		//Telefone.setBounds(60,120,300,20);
		nome.setBounds(0,60,120,20);
		endere.setBounds(0,90,120,20);
		//tele.setBounds(0,120,120,20);
		Cadastro_de.setBounds(120,20,200,20);
		cid.setBounds(0,150,60,20);
		city.setBounds(60,150,120,20);
		//dt_nasc.setBounds(0,180,120,20);
		//data_nascimento.setBounds(120,180,100,20);
		tele.setBounds(0,210,120,20);
		tele1.setBounds(140,210,120,20);
		tele2.setBounds(270,210,120,20);
		Telefone.setBounds(60,210,70,20);
		Telefone2.setBounds(200,210,70,20);
		Telefone3.setBounds(290,210,70,20);
		rg.setBounds(0,180,120,20);
		Rg.setBounds(20,180,100,20);
		Cpf.setBounds(145,180,100,20);
		dt_nasc.setBounds(250,180,120,20);
		data_nascimento.setBounds(370,180,120,20);
		cadas.setBounds(90,250,120,20);
		consul.setBounds(220,250,120,20);
		Cadastro_de.setForeground(Color.RED);
		nome.setForeground(Color.RED);
		endere.setForeground(Color.RED);
		tele.setForeground(Color.RED);
		cadas.addActionListener(this);
		consul.addActionListener(this);
		Nome.addActionListener(this);
		Telefone.addActionListener(this);
		Telefone2.addActionListener(this);
		Telefone3.addActionListener(this);
		Cpf.addActionListener(this);
		Rg.addActionListener(this);
		Email.addActionListener(this);
		city.addActionListener(this);
		complemento.addActionListener(this);
		bairro.addActionListener(this);
		Numero.addActionListener(this);
	}
	public static void main(String[] args) {
		Cadastro obj = new Cadastro();
		obj.setVisible(true);
	}
	public void actionPerfomed(ActionEvent acao){
		if(acao.getSource() = cadas){
			Pessoa p = new Pessoa();
			p.setNome(Nome.getText());
			p.setEndereco(Endereco.getText());
			P.setNumero1(Numero.getText());
			p.setTelefone(Telefone.getText());
			p.setTelefone4(Telefone2.getText());
			p.setTelefone5(Telefone3.getText());
			p.setEmail(Email.getText());
			p.setRG(Rg.setText());
			p.setCpf1(Cpf.getText());
			p.setBairro(bairro.getText());
			p.setComplemento(complemento.getText());
			if(contador == 0){
				pa[0] = p;
				Contador ++;
			}
			else{
				pa[contador] = p;
				contador ++;
			}
		}
		if(acao.getSource() == consul){
			for(int i = 0; i < contador; i ++){
				JOptionPane.showMessageDialog(null,"-----------------------------------------------------------------" + "\nNome:" + pa[i].getNome()+
				"\nEndereço:" + pa[i].getEndereco() + "\nNumero:" + pa[i].getNumero1() + "\nBairro:" + pa[i].getBairro1() + "\nTelefone Residencial:" + pa[i].getTelefone4() + 
				"\nTelefone Comercial:" + pa[i].getTelefone() + "\nTelefone Celular:" + pa[i].getTelefone5());
			
			}
		}
	}
	protected class Pessoa{
		private String nome1, endereco1, telefone1, telefone4, telefone5, rg1, cpf1, email1, cidade1, bairro1, numero1, complemento1, cep1;
		Pessoa(){
			nome1 = endereco1 = telefone1 = telefone4 = telefone5 = bairro1 = cidade1 = rg1 = cpf1 = email1 = numero1 = complemento1 = cep1 = "";
		}
	}
}
