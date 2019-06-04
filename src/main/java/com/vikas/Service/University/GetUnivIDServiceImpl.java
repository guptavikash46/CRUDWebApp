package com.vikas.Service.University;

import com.vikas.Repository.UnivRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetUnivIDServiceImpl implements GetUnivIDService {

    @Autowired
    private UnivRepository univRepository;

    @Override
    public Integer getUniID(String name) {
        return univRepository.getUniID(name);
    }
}
