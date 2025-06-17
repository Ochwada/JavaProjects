package com.example.model;


import com.example.service.IdGenerator;

import java.time.LocalDateTime;

/**
 * *******************************************************
 * Package: com.example.model
 * File: Events.java
 * Author: Ochwada
 * Date: Tuesday, 17.Jun.2025, 3:27 PM
 * Description: Represents an event with its name, description, schedule, category, and physical location.
 *  * This {@code Event} class models a real-world event such as a conference, concert, webinar, or meeting.
 *  * It includes full address information via the {@link Address} class, as well as start and end times.
 * Objective:
 * *******************************************************
 */


public class Event {
    // Field
    private final String id;
    private final String name;
    private final String description;
    private final LocalDateTime startDateTime;
    private final LocalDateTime endDateTime;
    private final String category;
    private final Address location;

    /**
     * Constructs a new {@code Event} instance with the given details.
     * The event ID is automatically generated.
     *
     * @param name          the name or title of the event
     * @param description   a short description of the event
     * @param startDateTime the starting date and time of the event
     * @param endDateTime   the ending date and time of the event
     * @param category      the category of the event (e.g., Workshop, Conference, Webinar)
     * @param location      the physical address of the event
     */
    public Event(String name, String description, LocalDateTime startDateTime, LocalDateTime endDateTime, String category, Address location) {
        this.id = IdGenerator.generateEventsId();
        this.name = name;
        this.description = description;
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
        this.category = category;
        this.location = location;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    public LocalDateTime getEndDateTime() {
        return endDateTime;
    }

    public String getCategory() {
        return category;
    }

    public Address getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "Events{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", startDateTime=" + startDateTime +
                ", endDateTime=" + endDateTime +
                ", category='" + category + '\'' +
                ", location=" + location +
                '}';
    }
}
