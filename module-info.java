module cleaningServiceApp {
    requires spring.context;
    requires spring.beans;
    requires java.sql;
    requires org.slf4j;

    opens cleaningServiceApp;
    opens cleaningServiceApp.config;
    opens cleaningServiceApp.entities;
    opens cleaningServiceApp.repository;
    opens cleaningServiceApp.service;
    opens cleaningServiceApp.view;

}