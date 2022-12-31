package com.example.phase.serviceprovider;

import com.example.phase.payment.PaymentBody;

import java.util.Map;

public class Vodafone extends Service {
    public Vodafone(String name) {
        super(name);
    }

    @Override
    public String handle(Map<String, ?> body) {
        // Assert that mobile number exists
        if (body.get("mobile number") == null) {
            // Invalid input for Vodafone
            return "Invalid input for Vodafone";
        }
        if (body.get("zip") == null) {
            // Invalid input for Vodafone
            return "Invalid input for vodafone";
        }
        return "charged successfully";
        // API call
    }
}