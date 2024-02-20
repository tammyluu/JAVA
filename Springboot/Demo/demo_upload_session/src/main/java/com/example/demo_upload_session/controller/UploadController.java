package com.example.demo_upload_session.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/upload")
public class UploadController {
    private String location ="upload-dir"; // create this folder in root of project
    @GetMapping("/form")
    public String showForm(){
        return "upload-form";
    }
    @PostMapping("/submitform")
    public String  submitForm(@RequestParam("image")MultipartFile image) throws IOException {
        // image taken by name="image" in <input type="file" name="image"> upload-form
        //destination file & which name? (.resolve: verify if it exist good) ( multipartFile = getOriginalFilename : take this file)
        Path destinationFile = Paths.get(location).resolve(Paths.get(image.getOriginalFilename())).toAbsolutePath();
       //  recupere dans le requestbody & put in InputStream with methode get
        InputStream stream = image.getInputStream();
        //options: replace which exising file
        Files.copy(stream,destinationFile, StandardCopyOption.REPLACE_EXISTING);
        System.out.println(image.getOriginalFilename());
        return "redirect:/upload/files";
    }
    @GetMapping("/files")
    @ResponseBody
    public List<String> getFiles() throws IOException {
        List<String> liste = new ArrayList<>();
        Files.walk(Paths.get(location)).forEach(path -> {
            liste.add(path.getFileName().toString());
        });
        return liste;
    }


}
