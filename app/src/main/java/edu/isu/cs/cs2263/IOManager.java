package edu.isu.cs.cs2263;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class IOManager {
    private static final Type STUDENT_LIST_TYPE = new TypeToken<LinkedList<Student>>(){}.getType();

    public LinkedList<Student> readData(String file){
        Gson gson = new Gson();
        try {
            FileReader f = new FileReader(file);
            LinkedList<Student> data = gson.fromJson(f, STUDENT_LIST_TYPE);
            f.close();
            return data;
        }catch (IOException e){
            e.printStackTrace();
            return null;
        }
    }

    public void writeData(String file, LinkedList<Student> data){
        Gson gson = new Gson();

        String json = gson.toJson(data);
        try {
        FileWriter f = new FileWriter(file);
        f.write(json);
        f.flush();
        f.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
