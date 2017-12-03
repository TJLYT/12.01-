package com.example.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Org;



@Service
@Transactional
public class OrgService {

	
    @PersistenceContext
	private  EntityManager  em;
   
   //删除id
    public void remove(int id) {
    	System.out.println(em);
    	Org o=em.find(Org.class, id);
    	if(o !=null) {
    		em.remove(id);	
    	}
    }
    //查询
    public Org findOrg(long id) {
    	return em.find(Org.class, id);
    }
    //查所有
    public List<Org> findOrg(){
    	TypedQuery<Org> query =em.createQuery("Select o from Org o",Org.class);
		return query.getResultList();	
    } 
    public  Org create(long id,String name) {
    	Org org=new Org();
    	org.setId(1);
    	org.setName("lyt");
		return org;
    	
    }
    
   
    
    
    
    
}
