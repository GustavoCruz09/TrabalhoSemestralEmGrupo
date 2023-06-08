package controller;

import java.awt.event.ActionEvent;
import java.io.IOException;

public interface IOrientacoesController {

	public void actionPerformed(ActionEvent e);
	public boolean LeraqrGp() throws IOException;
	public void InsereOrientacao(boolean status) throws IOException;
}
