package ru.netology.ticket;

import static org.junit.jupiter.api.Assertions.*;

class TicketTest {
    private Ticket ticket = new Ticket();
    private Ticket ticket1 = new Ticket(30, 12, "DME", "EGO", 12);
    private Ticket ticket2 = new Ticket(23, 521, "AAQ", "ABA", 25);
    private Ticket ticket3 = new Ticket(17, 564, "UFA", "VOZ", 4);


    @org.junit.jupiter.api.Test
    void compareTo() {
//         Ticket expected = first,second,third;
//        int actual = ticket.getPrice();
        assertEquals(-1, ticket1.compareTo(ticket2));
        assertEquals(1, ticket3.compareTo(ticket2));

    }
}

