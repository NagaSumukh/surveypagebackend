package com.swe.spring.swe645hw4;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
@RequestMapping(path="/surveys")

public class SurveyController {
    @Autowired
    private SurveyRepository surveyRepository;

//    @GetMapping
//    public List<survey> getAllSurveys() {
//        return surveyRepository.findAll();
//    }
    
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody
    public String Test() {
        return "test";
    }
    
    @GetMapping(path="/all")
    public @ResponseBody Iterable<Survey> getAllSurveys() {
      // This returns a JSON or XML with the users
      return surveyRepository.findAll();
    }
    
//    @PostMapping(path="/add") // Map ONLY POST Requests
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResponseEntity<String> createSurvey(@RequestBody Survey survey) {

      Survey n = new Survey();
      n.setEmail(survey.email);
      n.setFirstName(survey.firstName);
      n.setLastName(survey.lastName);
      n.setStreetAddress(survey.streetAddress);
      n.setCity(survey.city);
      n.setState(survey.state);
      n.setZip(survey.zip);
      n.setTelephoneNumber(survey.telephoneNumber);
      n.setLikedMostAboutCampus(survey.likedMostAboutCampus);
      n.setHowInterestedInUniversity(survey.howInterestedInUniversity);
      n.setLikelihoodOfRecommendation(survey.likelihoodOfRecommendation);
      n.setDateOfSurvey(survey.dateOfSurvey);
      surveyRepository.save(n);
      
      return ResponseEntity.ok("survey recorded successfully");
    }

//    @GetMapping("/{id}")
//    public ResponseEntity<survey> getSurveyById(@PathVariable(value = "id") Long surveyId) {
//        java.util.Optional<survey> survey = surveyRepository.findById(surveyId);
//        if (survey.isPresent()) {
//            return ResponseEntity.ok().body(survey.get());
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }
//
//
//    @PostMapping
//    public survey createSurvey(@Validated @RequestBody survey survey) {
//        return surveyRepository.save(survey);
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deleteSurvey(@PathVariable(value = "id") Long surveyId) {
//    	java.util.Optional<survey> optionalSurvey = surveyRepository.findById(surveyId);
//        if (optionalSurvey.isPresent()) {
//            surveyRepository.deleteById(surveyId);
//            return ResponseEntity.noContent().build();
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }
}

