package com.yousfi.Services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yousfi.Repository.TaskRepository;
import com.yousfi.model.Task;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Service
@AllArgsConstructor
public class TaskServices {
	
	

	private TaskRepository taskRepository;
	
	@Transactional(readOnly = true)
	public List<Task> getTasks(){
		return taskRepository.findAll();
	}
	

		
	
	
}
