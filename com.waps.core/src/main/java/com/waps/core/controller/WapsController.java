package com.waps.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.waps.core.data.ScanInfo;

@Controller
public class WapsController {

	@RequestMapping("/waps")
	public String defaultPage(Model model) {
		model.addAttribute("scanInfo", new ScanInfo());
		return "scan";
	}
}
