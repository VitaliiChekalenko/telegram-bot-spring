package com.VitaliiChekalenko.telegrambotspring.model;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
