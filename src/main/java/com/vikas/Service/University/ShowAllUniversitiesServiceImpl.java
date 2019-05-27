package com.vikas.Service.University;

import com.vikas.Model.University;
import com.vikas.Repository.UnivRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShowAllUniversitiesServiceImpl implements ShowAllUniversitiesService {

    @Autowired
    private UnivRepository univRepository;

    @Override
    public List<University> showAllUniversities() {
        return univRepository.showAllUniversities();
    }
}
