package com.itava0.customer;

import java.util.Objects;

public final class CustomerRegistrationRequest {
    private final String firstName;
    private final String lastName;
    private final String email;

    public CustomerRegistrationRequest(
            String firstName,
            String lastName,
            String email
    ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String firstName() {
        return firstName;
    }

    public String lastName() {
        return lastName;
    }

    public String email() {
        return email;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (CustomerRegistrationRequest) obj;
        return Objects.equals(this.firstName, that.firstName) &&
                Objects.equals(this.lastName, that.lastName) &&
                Objects.equals(this.email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, email);
    }

    @Override
    public String toString() {
        return "CustomerRegistrationRequest[" +
                "firstName=" + firstName + ", " +
                "lastName=" + lastName + ", " +
                "email=" + email + ']';
    }


}
