package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;



@Component
public class ControllerUtils {
	
	private final HttpServletRequest req;
	
	private final HttpServletResponse resp;
	
	
	
	public ControllerUtils(HttpServletRequest req,HttpServletResponse resp){
		this.req = req;

		this.resp = resp;
	}
	
	
	
	
	
	public void setAtributoSessao(String chave, Object o){
		req.getSession().setAttribute(chave, o);
	}
	
	public Object getAtributoSessao(String chave){
		return req.getSession().getAttribute(chave);
	}
	
	public void removeAtributoSessao(String chave){
		req.getSession().removeAttribute(chave);
	}
	
	public void logout(){
		req.getSession().removeAttribute("usuario_logado");
	}
	
	public void invalidarSessao(){
		HttpSession session = req.getSession();
		if (session != null)
			session.invalidate();
	}
	

	
	

	public HttpServletRequest getRequest(){
		return req;
	}
	
	public String getRealPath(){
		return req.getServletContext().getRealPath("/");
	}
	
	public HttpServletResponse getResponse(){
		return resp;
	}
	
	
	
}
