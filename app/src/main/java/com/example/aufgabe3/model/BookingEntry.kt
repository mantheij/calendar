package com.example.aufgabe3.model

import java.time.LocalDate

// Data class for a booking entry
data class BookingEntry(
    val arrivalDate: LocalDate,
    val departureDate: LocalDate,
    val name: String
)