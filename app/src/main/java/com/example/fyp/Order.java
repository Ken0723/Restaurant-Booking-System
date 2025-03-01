package com.example.fyp;

import java.util.ArrayList;

public class Order {

    private String id, reservationId, status, comments;
    private ArrayList foodItemCode, qty;

    public Order() {
        this.id = "";
        this.reservationId = "";
        this.status = "";
        this.comments = "";
        this.foodItemCode = null;
        this.qty = null;
    }
    public Order(String id, String reservationId, String status, String comments, ArrayList foodItemCode, ArrayList qty) {
        this.id = id;
        this.reservationId = reservationId;
        this.status = status;
        this.comments = comments;
        this.foodItemCode = foodItemCode;
        this.qty = qty;
    }
    public String getId() {
        return id;
    }
    public String getReservationId() {
        return reservationId;
    }
    public String getStatus() {
        return status;
    }
    public String getComments() {
        return comments;
    }
    public ArrayList getFoodItemCode() {
        return foodItemCode;
    }
    public ArrayList getQty() {
        return qty;
    }

    public void setId(String nId) {
        this.id = nId;
    }
    public void setReservationId(String nReservationId) {
        this.reservationId = nReservationId;
    }
    public void setStatus(String nStatus) {
        this.status = nStatus;
    }
    public void setComments(String nComments) {
        this.comments = nComments;
    }
    public void setFoodItemCode(ArrayList nFoodItemCode) {
        this.foodItemCode = nFoodItemCode;
    }
    public void setQty(ArrayList nQty) {
        this.qty = nQty;
    }
}
