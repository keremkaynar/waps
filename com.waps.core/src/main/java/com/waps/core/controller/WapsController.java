package com.waps.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.waps.core.data.ScanInfo;

@Controller
@SessionAttributes("scanInfo")
public class WapsController {

	private static final String ScanInfo = "scanInfo";

	@ModelAttribute(ScanInfo)
	public ScanInfo getScanInfo() {
		return new ScanInfo();
	}

	@RequestMapping("/waps")
	public String defaultPage() {
		return "scan";
	}

	@RequestMapping(value = "/operators", method = RequestMethod.POST)
	public String operators(@ModelAttribute(ScanInfo) ScanInfo scanInfo) {
		return "redirect:/operators/requestParameters";
	}

	@RequestMapping(value = "/operators/requestParameters")
	public String requestParameters() {
		return "requestParameters";
	}
}
