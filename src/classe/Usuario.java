package classe;

import java.util.Objects;

public class Usuario {
	String nome;
	String email;
	
	// Gerado automaticamente pelo eclipse
//	@Override
//	public int hashCode() {
//		return Objects.hash(email, nome);
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Usuario other = (Usuario) obj;
//		return Objects.equals(email, other.email) && Objects.equals(nome, other.nome);
//	}
	
	public boolean equals(Object objeto) {
		if (objeto instanceof Usuario) {
			Usuario outro = (Usuario) objeto;
				
			boolean nomeIgual = outro.nome.equals(this.nome);
			boolean emailIgual = outro.email.equals(this.email);
			return nomeIgual && emailIgual;
		} else {
			return false;
		}
		
		
	}
}
