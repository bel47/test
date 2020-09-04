package com.ticketing.ts.controller;

import java.io.IOException;
import java.util.List;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ticketing.ts.model.Passenger;
import com.ticketing.ts.service.PassengerService;

@Controller
public class PassengerController {

	@Autowired
	PassengerService passengerService;

	@RequestMapping(value = { "/passenger/save", "/passenger/add" })
	public ModelAndView save(@ModelAttribute("pass") Passenger passObj) {
		ModelAndView mav = new ModelAndView("passList");
		passengerService.save(passObj);

		return mav;
	}

}
