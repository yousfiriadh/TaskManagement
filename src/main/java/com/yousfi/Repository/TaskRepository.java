package com.yousfi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yousfi.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long>{

}
