package com.wj

class ObjectCreator {
    static Student crateAStudent(String name = "Joe", String course = "Math") {
        return new Student(name, course)
    }
}
