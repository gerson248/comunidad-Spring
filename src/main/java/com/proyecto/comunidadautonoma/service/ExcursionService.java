package com.proyecto.comunidadautonoma.service;

import java.util.List;

import com.proyecto.comunidadautonoma.model.Excursion;


public interface ExcursionService {
	void saveExcursion( Excursion excursion);
	
	void deleteExcursionById(Long idExcursion);
	
	void updateExcursion(Excursion excursion);
	
	List<Excursion>findAllExcursion();
	
	 Excursion findById(long idExcursion);
	
	List<Excursion> findByIdParqueNatural(Long idParqueNatural);
}

/*
 public interface CourseDao {
	
	void saveCourse(Course course);
	
	void deleteCourseById(Long idCourse);
	
	void updateCourse(Course course);
	
	List<Course>findAllCourse();
	
	Course findById(long idCourse);
	
	Course findByName(String name);
	
	List<Course> findByIdTeacher(Long idTeacher);
} 
 */
