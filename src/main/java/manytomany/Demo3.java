package Manytomany;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager em= Persistence.createEntityManagerFactory("studentUnit").createEntityManager();
		
		Student s= em.find(Student.class, 1);
		 
		 List<Course> c=s.getCourse();
		 
		 for(Course a:c) {
			 System.out.println(a);
		 }
	}

}