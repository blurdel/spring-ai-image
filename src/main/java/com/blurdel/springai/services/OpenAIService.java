package com.blurdel.springai.services;

import com.blurdel.springai.model.Question;
import org.springframework.web.multipart.MultipartFile;

public interface OpenAIService {

    byte[] getImage(Question question);

    String getDescription(MultipartFile file);
}
