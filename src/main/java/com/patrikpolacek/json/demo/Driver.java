package com.patrikpolacek.json.demo;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class Driver {

    public static void main(String[] args) {
        try {

//            create object mapper
            ObjectMapper mapper = new ObjectMapper();

//            read JSON file and map/convert to Java Pojo: data/sampe-lite.json

            Student theStudent = mapper.readValue(new File("C:\\Users\\Patrik Polaček\\IdeaProjects\\jackson-databinding-json-demo\\data" +
                    "\\sample-full.json"), Student.class);

//            print first name and last name

            System.out.println(theStudent.getFirstName());

//            print adress and city

            Address tempAdress = theStudent.getAddress();
            System.out.println(tempAdress.getCity());
            System.out.println(tempAdress.getZip());

//            print out the languages


            for (String tempLang : theStudent.getLanguages()){
                System.out.println(tempLang);
            }

        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

}
