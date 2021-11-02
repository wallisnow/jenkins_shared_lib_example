package com.wj

class Student {
    private String name
    private String course

    static String showStudent() {
        return "name: " + this.name + " has course: " + this.course
    }
}
