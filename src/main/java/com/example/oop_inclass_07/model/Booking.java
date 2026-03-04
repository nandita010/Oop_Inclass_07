package com.example.oop_inclass_07.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter

public class Booking {
    @Schema(accessMode =Schema.AccessMode.READ_ONLY)
    private Long Id;

    @NotBlank(message = "Booking name is required")
    private String bookingTag;

    @Email(message = "Student email is required")
    private String studentEmail;

    @NotBlank(message = "Booking date is required")
    private String bookingDate;

    @Positive(message = "Cameras can be reserved from 1pm til 5 pm")
    @Min(1)
    private int startHour;
    @Max(5)
    private int durationHours;


}
