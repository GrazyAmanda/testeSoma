package dao;

import java.util.List;

import org.hibernate.Session;

import factory.HibernateFactory;
import interceptor.AuditInterceptor;
import model.BaseModel;



public abstract class GenericDao {	
	
	protected final Session session;
	
    public GenericDao(AuditInterceptor audit) {
    	this.session = HibernateFactory.getHibernateSession();
    }
    
    public void salvar(BaseModel bm){
    	
    	session.saveOrUpdate(bm);
    }
    
    public void salvarAnexo(BaseModel bm){
    	session.save(bm);
    }
    
    public void updateAnexo(BaseModel bm){
    	session.update(bm);
    }
    
    public void update(BaseModel bm){
    	
    	session.update(bm);
    }
    public void merge(BaseModel bm){
    
    	session.merge(bm);
    }
    
    public void deletar(BaseModel bm){
    	session.delete(bm);
    }
    
    public void desativar(BaseModel bm){
    	bm.setEstaAtivo(false);
    	session.update(bm);
    }
    
    @SuppressWarnings({ "unchecked", "rawtypes" })
	public List<BaseModel> listarTodos(Class bm){
    	return session.createQuery("from "+bm.getName()+" e where e.estaAtivo = true").list();
    }
    
    
    @SuppressWarnings({ "unchecked" })
   	public List<BaseModel> listarTodos(String bm){
       	return session.createQuery("from "+bm+" e where e.estaAtivo = true").list();
       }
    
    @SuppressWarnings({ "unchecked", "rawtypes" })
	public List<BaseModel> listarTodosComLimite(Class bm, Integer limite){
    	return session.createQuery("from "+bm.getName()+" e where e.estaAtivo = true").setMaxResults(limite).list();
    }
    
    @SuppressWarnings("rawtypes")
	public BaseModel selecionarUm(Class bmClass, BaseModel bm){
    	return (BaseModel)session.createQuery("from "+bmClass.getName()+" e where e.id = "+bm.getId()).uniqueResult();
    }
    
    public void executeUpdate(String update)throws Exception{
    	session.createSQLQuery(update).executeUpdate();
    }
    
    
    
    public void detachObject(BaseModel bm) {
    	session.evict(bm);
    }
}
