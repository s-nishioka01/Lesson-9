package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExaminationController {

	private final ExaminationService examinationService;

	public ExaminationController(ExaminationService examinationService) {
		this.examinationService = examinationService;
	}

	@GetMapping("/result")
	public String result(@RequestParam("math") int mathScore, @RequestParam("science") int scienceScore)
			throws Exception {
		try {
			return examinationService.passOrFail(mathScore, scienceScore);
		} catch (Exception e) {
			return e.getMessage();
		}

	}
}
