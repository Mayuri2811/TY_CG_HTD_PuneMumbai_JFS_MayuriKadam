package com.capgemini.springmvc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.capgemini.springmvc.beans.EmployeeInfoBean;

@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO{

	@PersistenceUnit
	private EntityManagerFactory emf;
	//private EntityManagerFactory emf=Persistence.createEntityManagerFactory("EmployeePersistenceUnit");
	@Override
	public EmployeeInfoBean getEmployee(int empId) {

		
		EntityManager em= emf.createEntityManager();
		
		EmployeeInfoBean employeeInfoBean=em.find(EmployeeInfoBean.class, empId);
		//emf.close();
		
		return employeeInfoBean;
	}//End Of getEmployee

	@Override
	public EmployeeInfoBean authenticate(int empId, String pwd) {
		EntityManager manager=emf.createEntityManager();
		//EmployeeInfoBean employeeInfoBean=manager.find(EmployeeInfoBean.class, empId);
		String jpql="from EmployeeInfoBean where empId=:empId and password=:pwd";
		Query query=manager.createQuery(jpql);
		query.setParameter("empId",empId);
		query.setParameter("pwd", pwd);
		
		EmployeeInfoBean employeeInfoBean=null;
		try {
			employeeInfoBean = (EmployeeInfoBean) query.getSingleResult();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return employeeInfoBean;
//		manager.close();
//		if(pwd.equals(employeeInfoBean.getPassword())) {
//			return employeeInfoBean;
//		}else {
//		return null;
//		}
//		
	}//End of authenticate

	@Override
	public boolean addEmployee(EmployeeInfoBean employeeInfoBean) {
		EntityManager manager=emf.createEntityManager();
		EntityTransaction tx=manager.getTransaction();
		boolean isAdded=false;
		try {
			tx.begin();
			manager.persist(employeeInfoBean);
			tx.commit();
			isAdded=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		manager.close();
		return isAdded;
	}//End of AddEmployee

	@Override
	public boolean updateEmployee(EmployeeInfoBean employeeInfoBean) {
		
		EntityManager manager= emf.createEntityManager();
		
		 EmployeeInfoBean existingemployeeInfoBean=manager.find(EmployeeInfoBean.class, employeeInfoBean.getEmpId());
		
		EntityTransaction tx=manager.getTransaction();
		boolean isUpdated=false;
		if(employeeInfoBean!=null) {
			if(employeeInfoBean.getEmpName()!=null) {
				employeeInfoBean.setEmpName(employeeInfoBean.getEmpName());
			}
		}
		try {
			tx.begin();
			manager.persist(employeeInfoBean);
			tx.commit();
			isUpdated=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		manager.close();
		
		return isUpdated;
		
	}

	@Override
	public boolean deleteEmployee(int empId) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("employeePersistenceUnit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		boolean isDeleted = false;

		try {
			EntityTransaction tx = entityManager.getTransaction();
			tx.begin();
			EmployeeInfoBean employeeInfoBean= entityManager.find(EmployeeInfoBean.class, empId);
			entityManager.remove(employeeInfoBean);
			tx.commit();
			isDeleted = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		entityManager.close();
		return isDeleted;
	}// End of deleteEmployee()

	@Override
	public List<EmployeeInfoBean> getAllEmployees() {
		EntityManager manager = emf.createEntityManager();
		String jpql = "from EmployeeInfoBean";
		Query query = manager.createQuery(jpql);
		
		List<EmployeeInfoBean> employeesList = null;
		try {
			employeesList = query.getResultList();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return employeesList;
		
	}// End of getAllEmployees()
	
}//End of Class
