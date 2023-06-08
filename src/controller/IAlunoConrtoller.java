package controller;

import java.awt.event.ActionEvent;
import java.io.IOException;

public interface IAlunoConrtoller {

	public void actionPerformed(ActionEvent e);
	public void RegistraAluno() throws IOException;
	public boolean VerificaRa() throws IOException;
}
