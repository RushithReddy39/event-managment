package org.tarun.em.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tarun.em.entity.Event;

public interface EventRepository extends JpaRepository<Event, Integer>{

}
