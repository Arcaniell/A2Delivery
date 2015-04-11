package com.mobox.model;

import com.mobox.dao.A2DeliverySessionFact;
import org.hibernate.Session;

public class TestDB {

    public static void main(String[] args) {
        Session session = A2DeliverySessionFact.openSession();
        A2DeliverySessionFact.closeSesFact();
    }
}
