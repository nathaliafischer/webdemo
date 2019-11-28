package webdemo.controllers;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.NotImplementedException;

import webdemo.entidades.Usuario;

public class Controller {
	
	private HttpServletRequest request;
	private HttpServletResponse response;
	
	public HttpServletRequest getRequest() { return request; }
	public HttpServletResponse getResponse() { return response; }
	
	public Controller(HttpServletRequest request, HttpServletResponse response) {
		this.request = request;
		this.response = response;
	}
	
	public void list() throws ServletException, IOException { 
		throw new NotImplementedException("Ação não implementada"); 
	}
	
	public void show(int id) throws ServletException, IOException { 
		throw new NotImplementedException("Ação não implementada"); 
	}
	
	public void create() throws ServletException, IOException { 
		throw new NotImplementedException("Ação não implementada"); 
	}
	
	public void create(Map<String, String> formData) throws ServletException, IOException  { 
		throw new NotImplementedException("Ação não implementada"); 
	}
	
	public void edit(int id) throws ServletException, IOException{ 
		throw new NotImplementedException("Ação não implementada"); 
	}
	
	public void edit(int id, Map<String, String> formData) throws ServletException, IOException  { 
		throw new NotImplementedException("Ação não implementada"); 
	}
	
	public void delete(int id) throws ServletException, IOException { 
		throw new NotImplementedException("Ação não implementada"); 
	}
	
	public void fazerRequest (String caminho) throws ServletException, IOException {
		getRequest() .getRequestDispatcher("/WEB-INF/templates/"+caminho) .forward(getRequest(), getResponse());
	}

	public void alterarAtributo(String nomeAtributo, List usuarios) {
		getRequest().setAttribute(nomeAtributo, usuarios);
	}

	public void alterarAtributo (String nomeAtributo, Usuario usuario) {
		getRequest().setAttribute(nomeAtributo, usuario);
	}
}