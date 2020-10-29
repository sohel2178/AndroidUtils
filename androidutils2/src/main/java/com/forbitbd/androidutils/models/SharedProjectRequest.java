package com.forbitbd.androidutils.models;

public class SharedProjectRequest {

    private String project;
    private String user;
    private SharedProject.Permission activity;
    private SharedProject.Permission finance;
    private SharedProject.Permission store;
    private SharedProject.Permission employee;

    public SharedProjectRequest() {
    }

    public SharedProjectRequest(SharedProject sharedProject) {
        this.project = sharedProject.getProject().get_id();
        this.user = sharedProject.getUser().get_id();
        this.activity = sharedProject.getActivity();
        this.finance = sharedProject.getFinance();
        this.store = sharedProject.getStore();
        this.employee = sharedProject.getEmployee();
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public SharedProject.Permission getActivity() {
        return activity;
    }

    public void setActivity(SharedProject.Permission activity) {
        this.activity = activity;
    }

    public SharedProject.Permission getFinance() {
        return finance;
    }

    public void setFinance(SharedProject.Permission finance) {
        this.finance = finance;
    }

    public SharedProject.Permission getStore() {
        return store;
    }

    public void setStore(SharedProject.Permission store) {
        this.store = store;
    }

    public SharedProject.Permission getEmployee() {
        return employee;
    }

    public void setEmployee(SharedProject.Permission employee) {
        this.employee = employee;
    }
}
