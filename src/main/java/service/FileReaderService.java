package service;

import domain.entities.Person;
import service.exception.FileReaderException;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FileReaderService {

    public List<Person> personList(String fileName) {
        try(FileInputStream fis = new FileInputStream(fileName);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);) {

            List<Person> personList = new ArrayList<>();

            String line = br.readLine();
            while (line != null) {
                String[] data = line.split(",");
                Person person = new Person();
                person.setFirstName(data[0]);
                person.setLastName(data[1]);
                person.setEmail(data[2]);
                person.setGender(data[3].charAt(0));
                person.setPhoneNumber(data[4]);
                person.setCountry(data[5]);
                person.setState(data[6]);
                person.setCity(data[7]);
                person.setZipCode(data[8]);
                personList.add(person);
                line = br.readLine();
            }
            return personList;
        } catch (IOException e) {
            throw new FileReaderException(e.getMessage());
        }
    }
}
