package org.tarun.em.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.tarun.em.entity.Event;
import org.tarun.em.repository.EventRepository;

@Repository
public class EventDao {
	@Autowired
	EventRepository er;

	public Event saveEvent(Event event) {
		return er.save(event);
	}

	public List<Event> all() {
		return er.findAll();
	}

	public Event findById(int id) {
		Event e=null;
		Optional<Event> op = er.findById(id);
		if(op.isPresent()) {
			e=op.get();
		}
		return e;
	}

}
