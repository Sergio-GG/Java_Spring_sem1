package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alessandro", "Del Piero", 22);
        String jsonText = "{'firstName':'Francesco','lastName':'Totti','age':24}";

        // toJson
        System.out.println(person);
        person.convertToJson();

        //fromJson
        System.out.println(person.convertFromJson(jsonText));
    }
}