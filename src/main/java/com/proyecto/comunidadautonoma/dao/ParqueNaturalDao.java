package com.proyecto.comunidadautonoma.dao;

import java.util.List;

import com.proyecto.comunidadautonoma.model.ParqueNatural;


public interface ParqueNaturalDao {
	void saveParqueNatural(ParqueNatural parqueNatural);
	
	void deleteParqueNaturalById(Long idParqueNatural);
	
	void updateParqueNatural(ParqueNatural parqueNatural);
	
	List<ParqueNatural>findAllParqueNaturales();
	
	ParqueNatural findById(Long idParqueNatural);
	
	ParqueNatural findByName(String name);

	List<ParqueNatural> findByIdExcursion(Long idExcursion);
	
	List<ParqueNatural> findByIdPersonal(Long idPersonal);
	
	List<ParqueNatural> findByIdArea(Long idArea);
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