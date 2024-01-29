package com.ts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dao.StudentDao;
import com.model.Student;

@RestController
public class StudentController {
	@Autowired
	StudentDao studentDao;
	
	@GetMapping("getAllStudents")
	public List<Student> getAllStudents() {		
		return studentDao.getAllStudents();
	}
	
	@GetMapping("getStudentById/{studentId}")
	public Student getStudentById(@PathVariable("studentId") int studentId) {
		return studentDao.getStudentById(studentId);	
	}
	
	@GetMapping("getStudentByName/{studentName}")
	public List<Student> getStudentByName(@PathVariable("studentName") String studentName){
		return studentDao.getStudentByName(studentName);
	}
	
	@PostMapping("addStudent")
	public Student addStudent(@RequestBody Student student){
		return studentDao.addStudent(student);
	}
	
	@PutMapping("updateStudent")
	public Student updateStudent(@RequestBody Student student){
		return studentDao.updateStudent(student);
	}
	
	@DeleteMapping("deleteStudentById/{studentId}")
	public Student deleteStudentById(@PathVariable("studentId") int studentId){
		return studentDao.deleteStudentById(studentId);
	}

	
}