package com.luv2code.springboot.cruddemo.dao;

import com.luv2code.springboot.cruddemo.entity.CinemaRoom;

import java.util.List;

public interface CinemaRoomDAO {
    List<CinemaRoom> findAll();

    CinemaRoom findById(int theCinemaRoomID);

    CinemaRoom save(CinemaRoom theCinemaRoom);

    void deleteByID(int theCinemaRoomID);
}
