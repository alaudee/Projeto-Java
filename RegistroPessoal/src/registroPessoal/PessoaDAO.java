package registroPessoal;

import javax.swing.JOptionPane;

public class PessoaDAO {
	
	public void revisaIdade(int idade) {
		
		if(idade < 18) {
			JOptionPane.showMessageDialog(null, "Você é menor de idade");
			System.exit(0);
		}else {
			JOptionPane.showMessageDialog(null ,"Pode continuar");
		}
	}
	
	
	public void revisaCidade (String cidade) {
		
		String [] sigla = {"SP", "RJ", "MT", "BA", "AM"};
		
		for(int x = 0; x < sigla.length; x++) {
			
			if (cidade != sigla[x]) {
				
				JOptionPane.showMessageDialog(null, "Essa sigla não existe");
			}
		}
	}
}
