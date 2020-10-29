package com.forbitbd.androidutils.models;

public class SharedProject {

    private String _id;
    private Project project;
    private User user;
    private Permission activity;
    private Permission finance;
    private Permission store;
    private Permission employee;

    public SharedProject() {
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Permission getActivity() {
        return activity;
    }

    public void setActivity(Permission activity) {
        this.activity = activity;
    }

    public Permission getFinance() {
        return finance;
    }

    public void setFinance(Permission finance) {
        this.finance = finance;
    }

    public Permission getStore() {
        return store;
    }

    public void setStore(Permission store) {
        this.store = store;
    }

    public Permission getEmployee() {
        return employee;
    }

    public void setEmployee(Permission employee) {
        this.employee = employee;
    }

    public class Permission{
        private boolean read;
        private boolean write;
        private boolean update;
        private boolean delete;


        public Permission() {
        }

        public boolean isRead() {
            return read;
        }

        public void setRead(boolean read) {
            this.read = read;
        }

        public boolean isWrite() {
            return write;
        }

        public void setWrite(boolean write) {
            this.write = write;
        }

        public boolean isUpdate() {
            return update;
        }

        public void setUpdate(boolean update) {
            this.update = update;
        }

        public boolean isDelete() {
            return delete;
        }

        public void setDelete(boolean delete) {
            this.delete = delete;
        }
    }
}
