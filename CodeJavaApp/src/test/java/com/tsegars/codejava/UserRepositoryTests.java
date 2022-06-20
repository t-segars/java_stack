package com.tsegars.codejava;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import com.tsegars.codejava.repositories.UserRepository;
import com.tsegars.codejava.users.User;
 
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class UserRepositoryTests {
 
    @Autowired
    private TestEntityManager entityManager;
     
    @Autowired
    private UserRepository repo;
     
    
    
    
    public TestEntityManager getEntityManager() {
		return entityManager;
	}




	public void setEntityManager(TestEntityManager entityManager) {
		this.entityManager = entityManager;
	}




	public UserRepository getRepo() {
		return repo;
	}




	public void setRepo(UserRepository repo) {
		this.repo = repo;
	}




	// test methods go below
    @Test
    public void testCreateUser() {
        User user = new User();
        user.setEmail("tesrname@gmail.com");
        user.setPassword("testing");
        user.setFirstName("Forest");
        user.setLastName("Gump");
         
        User savedUser = repo.save(user);
         
        User existUser = entityManager.find(User.class, savedUser.getId());
         
        assertThat(user.getEmail()).isEqualTo(existUser.getEmail());
         
    }
}