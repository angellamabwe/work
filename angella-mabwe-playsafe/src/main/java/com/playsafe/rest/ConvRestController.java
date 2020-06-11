package com.playsafe.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/conversion")
public class ConvRestController {
	
	@GetMapping("/distance")
	public double milesTokm(double distanceInMiles) {
        return distanceInMiles * 1.60934;
    }
	
	@GetMapping("/temperature")
	public double kelvinToCelcius(double temperatureInKelvin) {
		return temperatureInKelvin - 273.15F;
	}
	
	@GetMapping("/weight")
	public double poundsToKilos(double weightInPounds) {
		return weightInPounds * 0.453592;
	}

}
