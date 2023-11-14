package com.luv2code.springboot.cruddemo.entity;

import jakarta.persistence.*;

@Entity
@Table(name="cinema_room")
public class CinemaRoom {
    //definir campos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="cinema_RoomID")
    private int cinemaRoomID;
    @Column(name="rows")
    private int rows;
    @Column(name="columns")
    private int columns;
    @Column(name="total_Seats")
    private int totalSeats;
    @Column(name="seat_Price")
    private int seatPrice;

    //definir constructores
    public CinemaRoom(){

    }
    public CinemaRoom(int rows, int columns, int totalSeats, int seatPrice){
        this.rows=rows;
        this.columns=columns;
        this.totalSeats=totalSeats;
        this.seatPrice=seatPrice;
    }

    public int getCinemaRoomID() {
        return cinemaRoomID;
    }

    public void setCinemaRoomID(int cinemaRoomID) {
        this.cinemaRoomID = cinemaRoomID;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    public int getSeatPrice() {
        return seatPrice;
    }

    public void setSeatPrice(int seatPrice) {
        this.seatPrice = seatPrice;
    }

    @Override
    public String toString() {
        return "Cinema Room{" +
                "id=" + cinemaRoomID +
                ", rows='" + rows + '\'' +
                ", columns='" + columns + '\'' +
                ", total seats='" + totalSeats + '\'' +
                ", seat price='" + seatPrice + '\'' +
                '}';
    }
}
