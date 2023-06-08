package controller;

import java.awt.event.ActionEvent;

public interface IConsultarAreaController {

	public void actionPerformed(ActionEvent e);
	public void TabelaDeEspalhamento() throws Exception;
	public void VerificaLista(int hash, String vtarea, String[] vtlinha) throws Exception;
	public int HashCode(String area);
	public void Consulta() throws Exception;
	public void LimpaLista() throws Exception;
	
}
