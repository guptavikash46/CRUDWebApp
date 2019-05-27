package com.vikas.Controller;


import com.vikas.Model.University;
import com.vikas.Service.University.AddUniversityService;
import com.vikas.Service.University.ShowAllUniversitiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class UniversityController {

    @Autowired
    private AddUniversityService addUniversityService;
    @Autowired
    private ShowAllUniversitiesService showAllUniversitiesService;

    @PostMapping("/app/addUniv")
    public University addUniversity(@RequestParam(value = "UniName") String UniName,
                                    @RequestParam(value = "UniCountry") String UniCountry){
        University university = new University();
        university.setUniv_name(UniName);
        university.setUniv_country(UniCountry);

        addUniversityService.addUniversity(university);
        return university;

    }
    @GetMapping("/app/universities")

    public List<University> showAllUniversities(){
        return showAllUniversitiesService.showAllUniversities();
    }

    @DeleteMapping("/app/deleteUniv/{id}")
    public String deleteUniById(@PathVariable Integer id){

        return "Item not found!";
    }
}
