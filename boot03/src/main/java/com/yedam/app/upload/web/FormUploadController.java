package com.yedam.app.upload.web;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class FormUploadController {

	private String uploadPath = "D:/upload/";

	@GetMapping("formUpload")
	// classpath:/templates/upload.html
	public void getUploadPage() {
	}

	@PostMapping("uploadForm")
	public String formUploadFile(@RequestPart MultipartFile file) {
		log.info(uploadPath);
		log.info(file.getContentType()); // 파일의 종류 및 확장자
		log.info(file.getOriginalFilename()); // 파일 이름
		log.info(String.valueOf(file.getSize())); // 파일 크기
		String fileName = file.getOriginalFilename();
		String saveName = uploadPath + File.separator + fileName;
		log.debug("saveName : " + saveName);
		// Paths.get() 메서드는 특정 경로의 파일 정보를 반환 ( 경로 정의 )
		Path savePath = Paths.get(saveName);
		try {

			// 실제로 파일을 업로드 ( 저장 ) 하는 메서드 transferTo(file)
			file.transferTo(savePath);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "redirect:formUpload";
	}
}
