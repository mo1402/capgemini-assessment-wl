package de.awacademy.capgemini;

import org.springframework.data.repository.CrudRepository;

import de.awacademy.capgemini.Worker;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface WorkerRepository extends CrudRepository<Worker, Integer> {

}
