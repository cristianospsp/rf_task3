package com.robertHalf.application.service;

import com.robertHalf.domain.Gender;
import com.robertHalf.domain.repository.GenderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenderService {

    private final GenderRepository genderRepository;

    public GenderService(GenderRepository genderRepository) {
        this.genderRepository = genderRepository;
    }

    public List<Gender> findAll() {
        return genderRepository.findAll();
    }

}
