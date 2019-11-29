package controller;


import model.funcionario;
import model.BaseModel;
import model.extrato;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import dao.FuncionarioDao;
import dao.GenericDao;

@Controller
public class OperacaoController {
	
	private List<BaseModel> dao;
	
	
	@RequestMapping("listaFuncionarios")
	public String listaFuncionarios(){
		dao = ((GenericDao) dao).listarTodos("funcionarios");
	 
	 return "funcionario/listaFuncionarios";
	}
	
	
	@RequestMapping("listarExtratos")
	public String listaExtratos(){
		dao = ((GenericDao) dao).listarTodos("extratos");
	 
	 return "extratos/listaExtratos";
	}
	

}
