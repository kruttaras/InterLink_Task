package com.okrutiak.person;


import com.okrutiak.person.consciousness.Knowledge;

public class Student {

    private String name;
    private Knowledge knowledge;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "\n" + "Student{" +
                "name='" + name + '\'' +
                ", knowledge=" + knowledge.getLevel() +
                '}';
    }

    public Student(String name, Knowledge knowledge) {
        this.name = name;
        this.knowledge = knowledge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKnowledge() {
        return knowledge.getLevel();
    }

    public void setKnowledge(Knowledge knowledge) {
        this.knowledge = knowledge;
    }
}
