package org.launchcode.codingevents.models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.*;

@Entity
public class Event extends AbstractEntity{

    @NotBlank(message = "This field cannot be left blank")
    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters")
    private String name;

    @Size(max = 500, message = "Description must be less than 500 characters")
    private String description;

    @Email(message = "Invalid email")
    @NotBlank(message = "This field cannot be left blank")
    private String contactEmail;

    @NotBlank(message = "This field cannot be left blank")
    @NotNull(message = "This field cannot be left blank")
    @Size(min = 3, max = 50, message = "Location must be between 3 and 50 characters")
    private String location;

    @NotNull(message = "Please make a selection")
    @AssertTrue(message = "Must be marked 'true'")
    private boolean requiresRegistration;

    //@NotBlank(message = "This field cannot be left blank")
    @NotNull(message = "This field cannot be left blank")
    @Min(value = 1, message = "Please enter a positive integer")
    private Integer numberOfAttendees;

    //@Future(message = "Must be in the future")
    //private Date date;
    private String date;

    @ManyToOne
    @NotNull(message="Category is required")
    private EventCategory eventCategory;

    public Event(String name, String description, String contactEmail, String location, Boolean requiresRegistration, Integer numberOfAttendees, String date, EventCategory eventCategory) {
        this.name = name;
        this.description = description;
        this.contactEmail = contactEmail;
        this.eventCategory = eventCategory;
        this.location = location;
        this.requiresRegistration = requiresRegistration;
        this.numberOfAttendees = numberOfAttendees;
        this.date = date;
    }

    public Event(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isRequiresRegistration() {
        return requiresRegistration;
    }

    public void setRequiresRegistration(boolean requiresRegistration) {
        this.requiresRegistration = requiresRegistration;
    }

    public Integer getNumberOfAttendees() {
        return numberOfAttendees;
    }

    public void setNumberOfAttendees(Integer numberOfAttendees) {
        this.numberOfAttendees = numberOfAttendees;
    }

    public EventCategory getEventCategory() {
        return eventCategory;
    }

    public void setEventCategory(EventCategory eventCategory) {
        this.eventCategory = eventCategory;
    }

    //    public Date getDate() {
//        return date;
//    }
//
//    public void setDate(Date date) {
//        this.date = date;
//    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


    //no setter for ID because it should never be changed

    @Override
    public String toString() {
        return name;
    }


}
