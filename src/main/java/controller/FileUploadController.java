package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Charchit [charchit.patodi@gmail.com]
 * on 28/03/20.
 */

@Controller
public class FileUploadController {
    public static String uploadDirectory = System.getProperty("user.dir")+"/upload";

    @RequestMapping("/")
    public String uploadPage(Model model) {
        return "uploadview";
    }

    @RequestMapping("/upload")
    public String uploaad(Model model, @RequestParam("files") MultipartFile[] files) {
        StringBuilder fileNames = new StringBuilder();
        for(MultipartFile file : files) {
            Path fileNameAndPath = Paths.get(uploadDirectory, file.getOriginalFilename());
            fileNames.append(file.getOriginalFilename());
            try {
                Files.write(fileNameAndPath, file.getBytes());
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        model.addAttribute("msg", "Successfully uploaded files "+fileNames.toString());
        return "uploadstatusview";
    }

    @PostMapping("/upload_pm")
    public String upload(@RequestParam("files") MultipartFile[] files) {
        StringBuilder fileNames = new StringBuilder();
        for(MultipartFile file : files) {
            Path fileNameAndPath = Paths.get(uploadDirectory, file.getOriginalFilename());
            fileNames.append(file.getOriginalFilename());
            try {
                Files.write(fileNameAndPath, file.getBytes());
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return fileNames.toString();
    }
}
