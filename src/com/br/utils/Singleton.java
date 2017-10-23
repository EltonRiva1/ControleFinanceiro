/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author 39-01424
 */
public class Singleton {

    private static EntityManager connection;
    private static EntityManagerFactory emf;

    /**
     * @return the connection
     */
    public static EntityManager getConnection() {
        if (connection == null) {
            setConnection();
        }
        return connection;
    }

    /**
     */
    public static void setConnection() {
        emf = Persistence.createEntityManagerFactory("JPA");
        connection = emf.createEntityManager();
    }
}
