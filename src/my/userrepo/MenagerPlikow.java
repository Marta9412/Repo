/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.userrepo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author szady
 */
public class MenagerPlikow {

    /**
     *
     * @param fileS
     * @return
     */
    public List<Student> getStudents(File fileS) throws IOException {
        List<String> readAllLines = Files.readAllLines(fileS.toPath(), Charset.defaultCharset());
        List<Student> students = new ArrayList<Student>();

        for (String line : readAllLines) {
            String[] studentValues = line.split(",");
            Student student = new Student();
            student.setName(studentValues[0]);
            student.setLastName(studentValues[1]);
            student.setTelNumber(studentValues[2]);
            student.setAddress(studentValues[3]);
            student.setMarkFiest(Integer.parseInt(studentValues[4]));
            student.setMarkSecond(Integer.parseInt(studentValues[5]));
            student.setMarkThird(Integer.parseInt(studentValues[6]));
            student.setMarkPracticl(Integer.parseInt(studentValues[7]));
            students.add(student);
        }

        return students;
    }

    public boolean saveSudents(List<Object> students, File fileS) throws IOException {
        FileWriter writer = new FileWriter(fileS);
        for (Object student : students) {
            Student s = (Student) student;
            writer.write(s.toString());
            writer.write('\n');
        }
        writer.close();
        return true;
    }

}
