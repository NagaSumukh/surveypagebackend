package com.swe.spring.swe645hw4;
import java.time.LocalDate;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@EnableJpaRepositories
@Table(name="surveys")
public class Survey {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
    public String firstName;
    public String lastName;
    public String streetAddress;
    public String city;
	public String state;
    public String zip;
    public String telephoneNumber;
    public String email;
    public LocalDate dateOfSurvey;
    public String likedMostAboutCampus;
    public String howInterestedInUniversity;
    public String likelihoodOfRecommendation;

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDateOfSurvey() {
		return dateOfSurvey;
	}

	public void setDateOfSurvey(LocalDate dateOfSurvey) {
		this.dateOfSurvey = dateOfSurvey;
	}

	public String getLikedMostAboutCampus() {
		return likedMostAboutCampus;
	}

	public void setLikedMostAboutCampus(String likedMostAboutCampus) {
		this.likedMostAboutCampus = likedMostAboutCampus;
	}

	public String getHowInterestedInUniversity() {
		return howInterestedInUniversity;
	}

	public void setHowInterestedInUniversity(String howInterestedInUniversity) {
		this.howInterestedInUniversity = howInterestedInUniversity;
	}

	public String getLikelihoodOfRecommendation() {
		return likelihoodOfRecommendation;
	}

	public void setLikelihoodOfRecommendation(String likelihoodOfRecommendation) {
		this.likelihoodOfRecommendation = likelihoodOfRecommendation;
	}
    
    // constructors, getters, and setters
}




