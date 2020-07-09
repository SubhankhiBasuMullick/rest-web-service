package com.Subhankhi.rest.webservices.restfulweb.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import org.springframework.stereotype.Service;
@Service
public class TodoHardCodedService { 
	
	private static List<Todo> todos=new ArrayList<Todo>();
	private static long idCounter=0;
	
	static {
		todos.add(new Todo(++idCounter,"Subhankhi","Learn to Dance", new Date(), false));
		todos.add(new Todo(++idCounter,"Subhankhi","Learn to sing", new Date(), false));
		todos.add(new Todo(++idCounter,"Subhankhi","Learn to draw", new Date(), false));
	}
	
	public List<Todo> findAll()
	{
		return todos;
	}
	public Todo deletebyId(long id)
	{
		Todo todo= findbyId(id);
		if(todo==null)
		{
			return null;
		}
		todos.remove(todo);
		return todo;
	}
	
	public Todo save(Todo todo)
	{
		if(todo.getId()==-1)
		{
			todo.setId(++idCounter);
			todos.add(todo);
		}
		else
		{
			deletebyId(todo.getId());
			todos.add(todo);
		}
		return todo;
	}
	public Todo findbyId(long id) {
		// TODO Auto-generated method stub
		for(Todo todo:todos)
			if(todo.getId()==id)
			{
				return todo;
			}
		return null;
	}

}
