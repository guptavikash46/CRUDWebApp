package com.vikas.Service.University;

import com.vikas.Model.University;
import com.vikas.Repository.UnivRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddUniversityServiceImpl implements AddUniversityService{

    @Autowired
    private UnivRepository univRepository;


    @Override
    public void addUniversity(University university) {
        University newUniObject = new University();
        newUniObject.setUniv_name(university.getUniv_name());
        newUniObject.setUniv_country(university.getUniv_country());

        univRepository.save(newUniObject);
    }
}
