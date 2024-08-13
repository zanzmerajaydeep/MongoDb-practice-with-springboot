package com.einfochips.jwt.repo;

import java.util.List;

import javax.security.auth.Subject;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.einfochips.jwt.model.Students;

public interface StudentRepo  extends MongoRepository<Students ,String >{

	List<Students> findFirstByEmail(String email);
	
	Students findByName(String name);
	
	List<Students> findByEmailAndName(String email,String name);
	
	List<Students> findByDepartmentDepartmentName(String departname);
	
	List<Students> findByEmailOrName (String email,String name);
	
	//List<Students> findByNameAndEmail(String name,String email);
	
	//List<Students> findByDepartmentdepartmentName(String departmentName); 
	
	List<Students> findByEmailIsLike(String email);
	
	List<Students> findByNameStartsWith(String name);
	
	//after dividation==========
	
	List<Students> findByDepartmentId(String department);
	
	@Query("{\"name\":\"?0\"}")
	List<Students> getStudentByName(String name);
	
	@Query("{\"name\":\"?0\", \"email\":\"?1\"}")
	List<Students> getStudentByNameAndEmail(String name, String email);
	
	
	//========================
	
//	 List<InterviewFeedback> findByCandidateCandidateEmailId(String emailId);
//	 
//	 List<InterviewFeedback> findByTechnicalEvaluationSkillRegex(String skillRegex);
//	 

//
//	 long count(); // return number of available entries
//	 
//	 List<InterviewFeedback> findAllByOrderByDateOfInterviewAsc();
//	 
	
	//====================
	
//	 List<Booking> findByReturnDateGreaterThanEqualAndTravelDateLessThanEqual(
//		        LocalDate startDate, LocalDate endDate
//		    );
	
	//================================
	
	//List<Product> findByIdIn(List<String> productIds);
	
	//=========================
	//  List<Product> findTop3ByOrderByTimestampDesc(); // Replace "timestamp" with the actual field used for sorting.
	
	//i want to last 3 records high salary
	// List<Employee> findTop3ByOrderBySalaryDesc();
	
	//
	//last 3 for particular category
	// List<Employee> findTop3ByCategoryOrderBySalaryDesc(String category);
	
	//List<Employee> findByCategoryAndSalaryGreaterThan(String category, int salary);

	//long countByCategory(String category);
	
	//long countBySalaryGreaterThan(int salary);
	

}
