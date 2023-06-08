package controller;

import java.awt.event.ActionEvent;
import java.io.IOException;

public interface IVerificaCadastro {

	public void actionPerformed(ActionEvent e);
	public void FazCadastro() throws IOException;
	public boolean VerificaExistencia() throws IOException;
	
}
