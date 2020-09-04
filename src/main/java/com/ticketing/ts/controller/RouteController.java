package com.ticketing.ts.controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ticketing.ts.model.Route;

public class RouteController {

	@RequestMapping(value = { "/route/save", "/route/add" })
	public ModelAndView save(@ModelAttribute("route") Route routeObj) {
		ModelAndView mav = new ModelAndView("routeList");

		return mav;
	}

}
