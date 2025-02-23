package com.blurdel.springai.services;

import com.blurdel.springai.model.Question;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@RequiredArgsConstructor
@Service
public class OpenAIServiceImpl implements OpenAIService {

    @Override
    public byte[] getImage(Question question) {

        return null;
    }

}
