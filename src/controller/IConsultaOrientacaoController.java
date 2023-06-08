package controller;

import java.awt.event.ActionEvent;
import java.io.IOException;

public interface IConsultaOrientacaoController {

	public void actionPerformed(ActionEvent e);
	public void montaPilha() throws IOException;
	public void UltimaOrientacao() throws Exception;
	public void TodasOrientacao() throws Exception;
	
}
