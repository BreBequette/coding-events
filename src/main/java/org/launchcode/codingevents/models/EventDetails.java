package org.launchcode.codingevents.models;

import javax.persistence.Entity;
import javax.validation.constraints.*;

@Entity
public class EventDetails extends AbstractEntity{
    @Size(max = 500, message = "Description must be less than 500 characters")
    private String description;

    @Email(message = "Invalid email")
    @NotBlank(message = "This field cannot be left blank")
    private String contactEmail;


    @NotNull(message = "Please make a selection")
    @AssertTrue(message = "Must be marked 'true'")
    private boolean requiresRegistration;

    //@NotBlank(message = "This field cannot be left blank")
    @NotNull(message = "This field cannot be left blank")
    @Min(value = 1, message = "Please enter a positive integer")
    private Integer numberOfAttendees;

    private String date;

    public EventDetails(@Size(max = 500, message = "Description must be less than 500 characters") String description, @Email(message = "Invalid email") @NotBlank(message = "This field cannot be left blank") String contactEmail, @NotNull(message = "Please make a selection") @AssertTrue(message = "Must be marked 'true'") boolean requiresRegistration, @NotNull(message = "This field cannot be left blank") @Min(value = 1, message = "Please enter a positive integer") Integer numberOfAttendees, String date) {
        this.description = description;
        this.contactEmail = contactEmail;
        this.requiresRegistration = requiresRegistration;
        this.numberOfAttendees = numberOfAttendees;
        this.date = date;
    }

    public EventDetails(){}

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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
