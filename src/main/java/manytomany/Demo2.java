package Manytomany;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager em= Persistence.createEntityManagerFactory("studentUnit").createEntityManager();
		
		 Course c= em.find(Course.class, 2);
		 
		 List<Student> s=c.getStudent();
		 
		 for(Student a:s) {
			 System.out.println(a);
		 }
	}

}
