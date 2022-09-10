package inheritance;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager em= Persistence.createEntityManagerFactory("studentUnit").createEntityManager();
		
		Employee emp=new Employee();
		
	      emp.setName("Abbas");
	      emp.setHomeAddress(new Address("gj","jam","453234"));
	      emp.setOfficeAddress(new Address("gj","raj","768394"));
	      emp.setSalary(34567);
	      
	      
	      
	      
	      em.getTransaction().begin();
	      em.persist(emp);
	      em.getTransaction().commit();
	      
	      em.close();

	}

}
