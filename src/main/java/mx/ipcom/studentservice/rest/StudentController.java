package mx.ipcom.studentservice.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mx.ipcom.studentservice.model.Student;
import mx.ipcom.studentservice.service.StudentService;

@RestController
@RequestMapping(value = "/students")
public class StudentController {
	
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String hello() {
		return "hola";
	}
	
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public Student addStudent(@RequestBody Student newStudent) {
		return studentService.addSudent(newStudent);
	}
	
	@RequestMapping(value = "/students", method = RequestMethod.GET)
	public List<Student> getStudents() {
		return studentService.getStudents();
	}

}
