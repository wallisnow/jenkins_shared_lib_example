package com.wj

class Student {
    private String name
    private String course

    Student(String name, String course) {
        this.name = name
        this.course = course
    }

    static String showStudent() {
        return "name: " + this.name + " has course: " + this.course
    }
}
