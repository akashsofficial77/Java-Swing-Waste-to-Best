/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.models.User;

import business.models.Employee.Employee;
import business.models.Role.Role;
import business.models.workQueue.workQueue;

/**
 *
 * @author tinyteddybear
 */
public class User {
    private String userID;
    private String name;
    private Employee employee;
    private workQueue workQueue;
    private String password;
    private String location;
    private Role role;
    
    public User() {
        workQueue = new workQueue();
    }

    public workQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(workQueue workQueue) {
        this.workQueue = workQueue;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
    
    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }    
    
    @Override
    public String toString(){
        return userID;
    }
}
