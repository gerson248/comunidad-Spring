package com.proyecto.comunidadautonoma.dao;

import java.util.List;

import com.proyecto.comunidadautonoma.model.ParqueNatural;


public interface ParqueNaturalDao {
	void saveTeacher(ParqueNatural parqueNatural);
	
	void deleteTeacherById(Long idParqueNatural);
	
	void updateTeacher(ParqueNatural parqueNatural);
	
	List<ParqueNatural>findAllTeachers();
	
	ParqueNatural findById(Long idParqueNatural);
	
	ParqueNatural findByName(String name);
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