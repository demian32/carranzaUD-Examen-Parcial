/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.carranza.web.examenbimestral;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



/**
 *
 * @author T107
 */
public class DAO {
    private static final ThreadLocal ti =new ThreadLocal();
     private static final SessionFactory sessionFactory =new Configuration()
             .configure("hibernate.cfg.xml").buildSessionFactory();

    public DAO() {}
        
    public static Session GetSession(){
        Session session =(Session)DAO.ti.get();
        if (session==null){
            session=sessionFactory.openSession();
            DAO.ti.set(session);
        }
        return session;
    }
    protected void begin(){
        GetSession().beginTransaction();
    }
    protected void commit(){
        GetSession().getTransaction().commit();
    }
    protected void rollback(){
        try{
            
            GetSession().getTransaction().rollback();
            GetSession().close();
        }catch(HibernateException e){}
        DAO.ti.set(null);
    }
    public static void close(){
        GetSession().close();
        DAO.ti.set(null);
    }
    
}
