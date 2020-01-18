package com.example.jdbc.example;

import org.yaml.snakeyaml.Yaml;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class YamalConfigRunner {

    public static void main(String[] args) {
        if(args.length != 1){
            System.out.println("Usage <file.yaml:");
            return;
        }
        String filePath ="C:\\Users\\poonawala\\IdeaProjects\\DataBaseProject\\src\\main\\resources\\sample.yml";
        Yaml yaml =  new Yaml();
        try(InputStream inputStream = Files.newInputStream(Paths.get(filePath))){
            Configuration configuration = yaml.loadAs(inputStream,Configuration.class);
            System.out.println("Configuration properties "+configuration.toString());

        }catch (IOException ioexcpetion){
            ioexcpetion.printStackTrace();
        }
    }
}
