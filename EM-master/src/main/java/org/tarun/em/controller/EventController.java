package org.tarun.em.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tarun.em.entity.Event;
import org.tarun.em.responsestructure.ResponseStructure;
import org.tarun.em.service.EventService;

@RestController
@RequestMapping("/events")
public class EventController {
	 @Autowired
	 EventService service;
	 
	 @PostMapping
	 public ResponseStructure<Event> saveEvent(@RequestBody Event event){
		return service.saveEvent(event);
	 }
	 
	 @GetMapping
	 public ResponseStructure<List<Event>> all(){
		 return service.all();
	 }
	 
	 @GetMapping("/id/{id}")
	 public ResponseStructure<Event> findById(@PathVariable int id){
		 return service.findById(id);
	 }
}
