package com.luv2code.springboot.cruddemo.dao;

import com.luv2code.springboot.cruddemo.entity.CinemaRoom;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CinemaRoomDAOJpaImp implements CinemaRoomDAO {
    //Define field for entitymnager

    private EntityManager entityManager;

    @Autowired
    //set up constructor injection
    public CinemaRoomDAOJpaImp(EntityManager theEntityManager) {
        //Hace asignacion
        entityManager=theEntityManager;
    }
    @Override
    public List<CinemaRoom> findAll() {
        //Create Query
        TypedQuery<CinemaRoom> theQuery=entityManager.createQuery("from CinemaRoom", CinemaRoom.class);
        //Execute Query and get result
        List<CinemaRoom> cinemaRooms =theQuery.getResultList();
        return cinemaRooms;
    }

    @Override
    public CinemaRoom findById(int theCinemaRoomID) {
    //get the employee
    CinemaRoom theCinemaRoom = entityManager.find(CinemaRoom.class, theCinemaRoomID);

    //return the employee
        return theCinemaRoom;
    }

    @Override
    public CinemaRoom save(CinemaRoom theCinemaRoom) {
    //save employee
    CinemaRoom dbCinemaRoom = entityManager.merge(theCinemaRoom);

    //return dbEmployee
        return dbCinemaRoom;
    }

    @Override
    public void deleteByID(int theCinemaRoomID) {
    //Find employee
    CinemaRoom theCinemaRoom = entityManager.find(CinemaRoom.class, theCinemaRoomID);
    //Delete Employee
    entityManager.remove(theCinemaRoom);
    }
}
