package com.coronathon.responsiblecitizen;

import controller.FileUploadController;
import controller.ImageUpload;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.io.File;

@SpringBootApplication
@ComponentScan({"com.coronathon.responsiblecitizen", "controller"})
public class ResponsiblecitizenApplication {

	public static void main(String[] args) {
		new File(FileUploadController.uploadDirectory).mkdir();
		new File(ImageUpload.fileBasePath).mkdir();
		SpringApplication.run(ResponsiblecitizenApplication.class, args);
	}

}
