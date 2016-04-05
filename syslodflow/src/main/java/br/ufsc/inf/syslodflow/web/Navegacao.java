package br.ufsc.inf.syslodflow.web;

/**
 * Constantes usadas na navega&ccedil;&atilde;o e constru&ccedil;&atilde;o do menu.
 * @author carloshp
 * (c)2014-2015 COMDAT Ltda. Todos os direitos reservados.
 */
// FIXME Usar faces-config.xml ?
public interface Navegacao {
	/*RAIZ*/
	public static final String MESMA_PAGINA = null;
	public static final String LOGIN = "login?faces-redirect=true";
	public static final String INDEX = "index?faces-redirect=true";
	/*CADASTRO USUARIO*/
	public static final String USUARIO_LISTAR = "usuario_listar";
	public static final String USUARIO_CADASTRAR= "usuario_cadastrar";
	public static final String USUARIO_PERFIL = "usuario_perfil";


}
