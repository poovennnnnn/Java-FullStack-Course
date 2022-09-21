package com.hibernate.onetomany;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Root;

public class StudentMain1 {

	public static void main(String[] args) {
		
//		criteriaSelectFewColumns();
		criteriaWithWhere();

	}
	
	public static void criteriaSimpleSelect() {
		
		 EntityManagerFactory emf = Persistence.createEntityManagerFactory("test1");
		 EntityManager em = emf.createEntityManager();
		 
		 CriteriaBuilder crtbulider = em.getCriteriaBuilder();
		 CriteriaQuery<Student> cq = crtbulider.createQuery(Student.class);
		 
		 
		 Root<Student> root = cq.from(Student.class);
		 TypedQuery<Student> tq = em.createQuery(cq);
		 List<Student> studentList = tq.getResultList();
		 
		 
		 studentList.forEach((s)->{
			 System.out.println(s.getStudentName()+"--"+s.getAge());
		 });
		 
 		 
	}
	
	
	public static void criteriaSelectFewColumns() {
		
		 EntityManagerFactory emf = Persistence.createEntityManagerFactory("test1");
		 EntityManager em = emf.createEntityManager();
		 
//		 Root<Student> root = em.getCriteriaBuilder()
//				                .createQuery(Object[].class)
//				                .from(Student.class);
		 
		 CriteriaBuilder crtbulider = em.getCriteriaBuilder();
		 CriteriaQuery<Object[]> cq = crtbulider.createQuery(Object[].class);
		 
		 
		 Root<Student> root = cq.from(Student.class);
		 cq.select(crtbulider.array(root.get("studentId"),root.get("studentName")));
		 TypedQuery<Object[]> tq = em.createQuery(cq);
		 
		 tq.getResultList().forEach(s->{
			System.out.println(s[0]+"---"+s[1]);
		});
		 
	}

	
	public static void criteriaWithWhere() {
		
		 EntityManagerFactory emf = Persistence.createEntityManagerFactory("test1");
		 EntityManager em = emf.createEntityManager();
		 
//		 Root<Student> root = em.getCriteriaBuilder()
//				                .createQuery(Object[].class)
//				                .from(Student.class);
		 
		 CriteriaBuilder crtbulider = em.getCriteriaBuilder();
		 CriteriaQuery<Student> cq = crtbulider.createQuery(Student.class);
		 
		 
		 Root<Student> root = cq.from(Student.class);
		 ParameterExpression<Integer> p1 = crtbulider.parameter(Integer.class);
		 cq.select(root).where(crtbulider.gt(root.get("age"), p1));
		 
		 TypedQuery<Student> tq = em.createQuery(cq);
		 tq.setParameter(p1, 20);
		 
		 tq.getResultList().forEach(s->{
			 System.out.printf("%10s -- %3d",s.getStudentName(),s.getAge());
			 System.out.println("");
		 });
		 
		
		 
	}

}
