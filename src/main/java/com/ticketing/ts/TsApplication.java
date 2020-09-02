package com.ticketing.ts;

import com.ticketing.ts.model.Address;
import com.ticketing.ts.model.Passenger;
import com.ticketing.ts.repository.PassengerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TsApplication implements CommandLineRunner {
    private final PassengerRepository passengerRepository;

    public TsApplication(PassengerRepository passengerRepository) {
        this.passengerRepository = passengerRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(TsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        passengerRepository.save(new Passenger("Belay","",21, new Address("0911476224")));
        passengerRepository.save(new Passenger("Addisu","",21, new Address("0991430291")));
    }

}
