package ngc;

import java.util.List;

import dao.GenericDao;
import model.BaseModel;


public abstract class GenericNgc{	
	
	private final GenericDao genericDao;
	
    public GenericNgc(GenericDao genericDao) {
    	this.genericDao = genericDao;
    }
    
    public void salvar(BaseModel bm)throws Exception{
    	genericDao.salvar(bm);
    }
    
    public void salvarAnexo(BaseModel bm)throws Exception{
    	genericDao.salvarAnexo(bm);
    }
 
    public void update(BaseModel bm){
    	genericDao.update(bm);
    }
    
    public void merge(BaseModel bm){
    	genericDao.merge(bm);
    }
    
    public void deletar(BaseModel bm)throws Exception{
    	genericDao.deletar(bm);
    }
    
    public void desativar(BaseModel bm){
    	genericDao.desativar(bm);
    }
      
	@SuppressWarnings("rawtypes")
	public List<BaseModel> listarTodos(Class bm)throws Exception{
    	return genericDao.listarTodos(bm);
    }
      
	

	public List<BaseModel> listarTodos(String bm)throws Exception{
    	return genericDao.listarTodos(bm);
    }
	@SuppressWarnings("rawtypes")
	public List<BaseModel> listarTodosComLimite(Class bm, Integer limite)throws Exception{
    	return genericDao.listarTodosComLimite(bm, limite);
    }
    
    @SuppressWarnings("rawtypes")
	public BaseModel selecionarUm(Class bmClass, BaseModel bm)throws Exception{    	
    	return genericDao.selecionarUm(bmClass,bm);
    }
    
    public void executeUpdate(String update)throws Exception{
    	genericDao.executeUpdate(update);
    } 
}
