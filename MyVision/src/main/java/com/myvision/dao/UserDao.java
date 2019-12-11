package com.myvision.dao;

import com.myvision.bean.User;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UserDao {
    public User findUserByNameAndPassword(User user) throws IOException {
        String username = user.getUsername();
        String password = user.getPassword();
        FileReader fileReader = new FileReader("C:\\Users\\梁瑞腾\\IdeaProjects\\Work\\MyVision\\src\\main\\resources\\userinfo.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while ((line=bufferedReader.readLine())!=null){
            String[] s = line.split(" ");
            if(s[0].equals(username) && s[1].equals(password)){
                bufferedReader.close();
                fileReader.close();
                return user;
            }
        }
        bufferedReader.close();
        fileReader.close();
        return null;
    }


}
