package controller;

import java.awt.event.ActionEvent;
import java.io.IOException;

import model.Aluno;

public interface IGruposController {

	public void actionPerformed(ActionEvent e);
	public void GravarGrupos() throws Exception;
	public void GravaGruposArq() throws Exception;
	public boolean VerificaArquivoGrupos() throws IOException;
	public boolean LeraqrGp() throws IOException;
	public void LimpaLista() throws Exception;
	public String ColetaRa() throws IOException;
	public boolean ExisteAluno(String Ra) throws IOException;
	public void AdicionarAluno(Aluno aluno);
	
}
