package org.tarun.em.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tarun.em.dao.EventDao;
import org.tarun.em.entity.Event;
import org.tarun.em.exceptionclasses.InvalidEventIdException;
import org.tarun.em.exceptionclasses.NoEventFoundException;
import org.tarun.em.responsestructure.ResponseStructure;

@Service
public class EventService {
	
	@Autowired
	EventDao dao;

	public ResponseStructure<Event> saveEvent(Event event) {
		Event e=dao.saveEvent(event);
		ResponseStructure<Event> rs = new ResponseStructure<>();
		rs.setStatus(200);
		rs.setMessage("Event Saved Successfully");
		rs.setBody(e);
		return rs;
	}

	public ResponseStructure<List<Event>> all() {
		List<Event> el = dao.all();
		if(el.isEmpty()) {
			throw new NoEventFoundException("No Event Present in Database Table");
		}
		ResponseStructure<List<Event>> rs = new ResponseStructure<>();
		rs.setStatus(200);
		rs.setMessage("Found all Events Successfully");
		rs.setBody(el);
		return rs;
	}

	public ResponseStructure<Event> findById(int id) {
		Event e = dao.findById(id);
		if(e==null) {
			throw new InvalidEventIdException("Invalid Event Id");
		}
		ResponseStructure<Event> rs = new ResponseStructure<Event>();
		rs.setStatus(200);
		rs.setMessage("Event found Successfully");
		rs.setBody(e);
		return rs;
	}
}
