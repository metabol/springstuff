/**
 * Basic integration tests for esubscription-service  application.
 * @since 2018/06/18
 * @version 0.0.0
 * @author Jonathan Nmaju
 */

package com.jonathan.dal;

import org.springframework.data.repository.CrudRepository;

import com.jonathan.model.User;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Long> {

}
