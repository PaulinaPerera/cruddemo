package com.luv2code.springboot.cruddemo.service;

import com.luv2code.springboot.cruddemo.entity.CinemaRoom;

import java.util.List;

public interface CinemaRoomService {
    List<CinemaRoom> findAll();

    CinemaRoom findById(int theCinemaRoomID);

    CinemaRoom save(CinemaRoom theCinemaRoom);

    void deleteById(int theCinemaRoomID);
}


