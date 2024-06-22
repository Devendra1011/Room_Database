package com.example.roomdatabase.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.roomdatabase.db.entity.Contact;

@Database(entities = {Contact.class},version = 1)
public abstract class ContactsAppDatabase extends RoomDatabase {


    // linking the DAO with our database
     public abstract ContactDAO getContactDAO();





}
