package com.yousfi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yousfi.Services.TaskServices;
import com.yousfi.model.Task;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@RestController
@RequestMapping("/api/v1")
@CrossOrigin("*")
@AllArgsConstructor
public class TaskController {
	
	
	private TaskServices taskServices;
	
	@GetMapping("/task")
	public List<Task> getTask(){
		return taskServices.getTasks();
	}

}
