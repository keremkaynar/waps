package com.waps.core.application;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WapsServer {

	private static final Logger LOGGER = Logger.getLogger(WapsServer.class.getName());

	public static void main(String[] args) {
		ClassPathXmlApplicationContext wapsContext = new ClassPathXmlApplicationContext("wapscore.xml");
		Object synchObj = new Object();
		synchronized (synchObj) {
			try {
				synchObj.wait();
			} catch (InterruptedException e) {
				LOGGER.log(Level.SEVERE, e.getMessage());
			}
		}
		wapsContext.close();
	}
}
