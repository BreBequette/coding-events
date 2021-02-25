package org.launchcode.codingevents.models;

import javax.validation.constraints.*;
import java.util.Objects;

public class Event {

    private int id;
    private static int nextId = 1;

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

    //doesn't need validation because of the nature of enums
    private EventType type;

    public Event(String name, String description, String contactEmail, EventType type, String location, Boolean requiresRegistration, Integer numberOfAttendees, String date) {
        this();
        this.name = name;
        this.description = description;
        this.contactEmail = contactEmail;
        this.type = type;
        this.location = location;
        this.requiresRegistration = requiresRegistration;
        this.numberOfAttendees = numberOfAttendees;
        this.date = date;
    }

    public Event(){
        this.id = nextId;
        nextId++;
    }

    public EventType getType() {
        return type;
    }

    public void setType(EventType type) {
        this.type = type;
    }

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

    public int getId() {
        return id;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return id == event.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
