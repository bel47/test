package com.ticketing.ts.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.ticketing.ts.model.Passenger;
import com.ticketing.ts.service.PassengerService;

import java.util.List;

@RestController
@RequestMapping(path = { "/passenger" })
public class PassengerController {

	@Autowired
	PassengerService passengerService;

	@PostMapping(value = { "/save", "/add" })
	public void save(@RequestBody Passenger passObj) {
		 passengerService.save(passObj);
	}

	@GetMapping(value="/{id}", produces = "application/json")
	public Passenger get(@PathVariable Long id) {
		return  passengerService.get(id);
	}

	@GetMapping(value="", produces = "application/json")
	public List<Passenger> getList() {
		return  passengerService.get();
	}

	@GetMapping(value="/hello", produces = "application/json")
	public String sayHello() {
		return "Hello there!";
	}

	@DeleteMapping(value="/delete/{id}", produces = "application/json")
	public String delete(@PathVariable Long id) {
		 passengerService.delete(id);
		 return id+" Deleted!";
	}


}
