package com.itava0.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email
) {

}
