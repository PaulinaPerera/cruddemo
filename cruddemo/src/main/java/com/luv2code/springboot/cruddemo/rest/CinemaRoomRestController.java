package com.luv2code.springboot.cruddemo.rest;

import com.luv2code.springboot.cruddemo.entity.CinemaRoom;
import com.luv2code.springboot.cruddemo.service.CinemaRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CinemaRoomRestController {
    private CinemaRoomService cinemaRoomService;
    //Inject cinema room dao
    @Autowired
    public CinemaRoomRestController(CinemaRoomService theCinemaRoomService){
        cinemaRoomService =theCinemaRoomService;
    }
    //Expose /cinemaRoom and return list of cinema Rooms
    @GetMapping("/cinemaRoom")
    public List<CinemaRoom> findAll(){
        return cinemaRoomService.findAll();
    }
    //add mapping por GET /cinemaRoom
    @GetMapping("/cinemaRoom/{cinemaRoomID}")
    public CinemaRoom getCinemaRoom(@PathVariable int cinemaRoomID){
        CinemaRoom theCinemaRoom = cinemaRoomService.findById(cinemaRoomID);

        if(theCinemaRoom ==null){
            throw new RuntimeException("The ID: "+ cinemaRoomID +" does not exist");
        }
        return theCinemaRoom;
    }

    @PostMapping("/cinemaRoom")
    public CinemaRoom addCinemaRoom(@RequestBody CinemaRoom theCinemaRoom){
        theCinemaRoom.setCinemaRoomID(0);
        CinemaRoom dbCinemaRoom = cinemaRoomService.save(theCinemaRoom);
        return dbCinemaRoom;
    }

    @PutMapping("/cinemaRoom")
    public CinemaRoom updateCinemaRoom(@RequestBody CinemaRoom theCinemaRoom){
        CinemaRoom dbCinemaRoom = cinemaRoomService.save(theCinemaRoom);
        return dbCinemaRoom;
    }

    @DeleteMapping("/cinemaRoom/{cinemaRoomID}")
    public String deleteCinemaRoom(@PathVariable int cinemaRoomID){
        CinemaRoom tempCinemaRoom = cinemaRoomService.findById(cinemaRoomID);
        //throw exception if id doesn't exist

        if(tempCinemaRoom ==null){
            throw new RuntimeException("The ID: "+ cinemaRoomID +" does not exist");
        }
        cinemaRoomService.deleteById(cinemaRoomID);
        return "Deleted id= " +cinemaRoomID;
    }

}
