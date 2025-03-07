package com.learnSphere.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.learnSphere.entity.Course;
import com.learnSphere.entity.Lesson;
import com.learnSphere.services.StudentServices;
import com.learnSphere.services.TrainerService;

@Controller
public class StudentController {
	@Autowired
	StudentServices service;
	
	@Autowired
	TrainerService tService;
	
	@PostMapping("/goToLesson")
	public String myLesson(@RequestParam("lessonId")int lessonId,
							Model model) {
		Lesson lesson = service.getLesson(lessonId);
		model.addAttribute("lesson",lesson);
		System.out.println(lesson);
		return "myLesson";
	}

	@GetMapping("/purchase")
	public String showCourses(Model model) {
		List<Course> courseList=tService.courseList();
		model.addAttribute("courseList",courseList);
	//	System.out.println(courseList);
		return "purchase";
	}
}
