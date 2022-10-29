package io;

import model.Serializable;

/*
 * Interface for database. The data base source can be a text file, binary file
 * or any type of storage hosted on the local machine or remotely. 
 */
public interface IDatabase<S extends Serializable> {
    /*
     * Attempt to open the database.
     */
    public abstract void open() throws Exception;


    /*
     * Attempts to close the database.
     */
    public abstract void close() throws Exception;

    public void add(S obj);

    // public void remove(S obj)
    // public void get()

}