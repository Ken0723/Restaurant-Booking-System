package com.example.fyp;

public class Table {
    int id, tableNum, tableSize;
    String status;

    public Table() {
        this.id = 0;
        this.tableNum = 0;
        this.tableSize = 0;
        this.status = "";
    }
    public Table(int id, int tableNum, int tableSize, String status) {
        this.id = id;
        this.tableNum = tableNum;
        this.tableSize = tableSize;
        this.status = status;
    }
    public int getID() {
        return this.id;
    }
    public int getTableNum() {
        return this.tableNum;
    }
    public int getTableSize() {
        return this.tableSize;
    }
    public String getStatus() {
        return this.status;
    }
    public void setId(int nID) {
        this.id = nID;
    }
    public void setTableNum(int nTableNum) {
        this.tableNum = nTableNum;
    }
    public void setTableSize(int ntableSize) {
        this.tableSize = ntableSize;
    }
    public void setStatus(String nStatus) {
        this.status = nStatus;
    }
}
