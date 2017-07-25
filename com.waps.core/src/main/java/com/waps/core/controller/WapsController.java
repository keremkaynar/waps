package com.waps.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.waps.core.data.ScanInfo;

@Controller
public class WapsController {

	private static final String ScanInfo = "scanInfo";

	@RequestMapping("/waps")
	public String defaultPage(Model model) {
		model.addAttribute(ScanInfo, new ScanInfo());
		return "scan";
	}

	@RequestMapping(value = "/operators", method = RequestMethod.POST)
	public String operators(ScanInfo scanInfo, RedirectAttributes redirectAttributes) {
		redirectAttributes.addFlashAttribute(ScanInfo, scanInfo);
		return "redirect:/operators/requestParameters";
	}

	@RequestMapping(value = "/operators/requestParameters")
	public String requestParameters() {
		return "requestParameters";
	}
}
