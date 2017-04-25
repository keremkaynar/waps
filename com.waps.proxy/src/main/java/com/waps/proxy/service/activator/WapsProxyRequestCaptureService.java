package com.waps.proxy.service.activator;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class WapsProxyRequestCaptureService {

	private static final Logger LOGGER = Logger.getLogger(WapsProxyRequestCaptureService.class.getName());

	private List<String> requestLines = new ArrayList<>();

	public String captureRequestPart(String requestPart) {
		if (requestPart.equals("")) {
			processRequestFromBrowser();
			requestLines.clear();
		} else {
			requestLines.add(requestPart);
		}
		return "echo: " + requestPart;
	}

	private void processRequestFromBrowser() {
		System.out.println("Processing browser request:");
		for (String requestLine : requestLines) {
			System.out.println(requestLine);
		}
	}
}
