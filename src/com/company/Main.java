package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
      Queue<Letter> storage = new PriorityQueue();

        storage.offer(new Letter("неважное письмо", "какойто текст", 0));
        storage.offer(new Letter("письмо", " текст", 1));
        storage.offer(new Letter("Важное письмо", "Важный текст", 2));
        storage.offer(new Letter("Очень важное письмо", "Очень важный текст", 3));

    while (storage.peek() != null){
    System.out.println(storage.poll());
    }
  }
}
