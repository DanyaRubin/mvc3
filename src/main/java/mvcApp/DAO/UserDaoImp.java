package mvcApp.DAO;

import mvcApp.model.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoImp implements UserDao{

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    @Override
    public List<User> getAllUsers() {
        List<User> resultList = entityManager.createQuery("select u from User as u", User.class).getResultList();
        return resultList;
    }
    @Transactional
    @Override
    public void add(User user) {
        entityManager.persist(user);

    }
    @Transactional
    @Override
    public void delete(User user) {

    }
    @Transactional
    @Override
    public void edit(User user) {

    }
    @Transactional
    @Override
    public User getById(long id) {
        return null;
    }
    @Transactional
    @Override
    public void create(String name, int age) {
        User user = new User (name, age);
//        entityManager.getTransaction().begin();
        entityManager.persist(user);
//        entityManager.getTransaction().commit();
//        entityManager.close();
    }
}
