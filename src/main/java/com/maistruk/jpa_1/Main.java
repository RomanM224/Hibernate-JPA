package com.maistruk.jpa_1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    
    public static void main(String[] args) {
        
       // getLaptop();
        
        saveLaptop();
    }
    
    public static void getLaptop() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        
        Laptop laptop = entityManager.find(Laptop.class, 4);
        
        System.out.println(laptop);
    }
    
    public static void saveLaptop() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        
        Laptop laptop = new Laptop();
        laptop.setId(53);
        laptop.setBrand("Asus");
        laptop.setPrice(445);
        entityManager.getTransaction().begin();
        entityManager.persist(laptop);
        entityManager.getTransaction().commit();
    }
}
