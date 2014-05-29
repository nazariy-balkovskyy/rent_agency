package com.balkovskyy.rentagency.web.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import com.balkovskyy.rentagency.web.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
}
