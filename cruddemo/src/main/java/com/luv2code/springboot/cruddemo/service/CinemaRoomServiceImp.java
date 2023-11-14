package com.luv2code.springboot.cruddemo.service;
import com.luv2code.springboot.cruddemo.dao.CinemaRoomDAO;
import com.luv2code.springboot.cruddemo.entity.CinemaRoom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CinemaRoomServiceImp implements CinemaRoomService {

    private CinemaRoomDAO cinemaRoomDAO;

    //Constructor injection
    @Autowired
    public CinemaRoomServiceImp(CinemaRoomDAO theCinemaRoomDAO){
        cinemaRoomDAO = theCinemaRoomDAO;
    }

    @Override
    public List<CinemaRoom> findAll() {
    return cinemaRoomDAO.findAll();
    }

    @Override
    public CinemaRoom findById(int theCinemaRoomID) {
        return cinemaRoomDAO.findById( theCinemaRoomID);
    }

    @Transactional
    @Override
    public CinemaRoom save(CinemaRoom theCinemaRoom) {
        return cinemaRoomDAO.save(theCinemaRoom);
    }

    @Transactional
    @Override
    public void deleteById(int theCinemaRoomID) {
        cinemaRoomDAO.deleteByID(theCinemaRoomID);
    }
}
