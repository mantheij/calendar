package com.example.aufgabe3.viewmodel

import androidx.lifecycle.ViewModel
import com.example.aufgabe3.model.BookingEntry
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class SharedViewModel : ViewModel() {
    private val _bookingsEntries = MutableStateFlow<List<BookingEntry>>(emptyList())
    val bookingsEntries: StateFlow<List<BookingEntry>> = _bookingsEntries

    // Method to add a new booking entry
    fun addBookingEntry(bookingEntry: BookingEntry) {
        // Add the new booking entry to the list
        _bookingsEntries.value = _bookingsEntries.value + bookingEntry
    }

    // Method to delete a booking entry
    fun deleteBookingEntry(bookingEntry: BookingEntry) {
        // Remove the specified booking entry from the list
        _bookingsEntries.value = _bookingsEntries.value.filter { it != bookingEntry }
    }
}