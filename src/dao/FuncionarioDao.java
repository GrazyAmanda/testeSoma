package dao;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import interceptor.AuditInterceptor;

import java.util.List;

import org.hibernate.FetchMode;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Property;
import org.hibernate.criterion.Restrictions;

@RequestScope
@Component

public class FuncionarioDao extends GenericDao {

	public FuncionarioDao(AuditInterceptor audit) {
		super(audit);
		// TODO Auto-generated constructor stub
	}

}
