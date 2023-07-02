package com.event.repository;

import com.event.entities.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepo extends CrudRepository<Event,Integer> {
    List<Event> findAllByDate(String date);
}
