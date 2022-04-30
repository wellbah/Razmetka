package com.company;

public class Letter implements  Comparable<Letter>{
    private String theme;
    private String text;
    private int priority;

    public Letter(String theme, String text, int priority) {
        this.theme = theme;
        this.text = text;
        this.priority = priority;
    }

@Override
public int compareTo(Letter altLetter) {
    return altLetter.priority - this.priority;
}
@Override
public String toString() {
    return String.format("%s (%d)\n %s \n", theme, priority, text);
              //toDo     %s это theme, (%d) это priority но в скобках, %s это text
              //toDo                 \n новая строка                  \n новая строка
    }
}
