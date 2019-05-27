package com.vikas.Service.University;

import com.vikas.Repository.UnivRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FindUniversityServiceImpl implements FindUniversityService {

    @Autowired
    private UnivRepository univRepository;

    @Override
    public Boolean isUniversityFound(Integer id) {
        if (univRepository.isUniversityThere(id) != null) {
            return true;
        } else {
            return false;
        }
    }
}
