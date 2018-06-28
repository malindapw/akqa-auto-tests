/*
 * Copyright (c) Orchestral Developments Ltd and the Orion Health group of companies (2001 - 2018).
 *
 * This document is copyright. Except for the purpose of fair reviewing, no part
 * of this publication may be reproduced or transmitted in any form or by any
 * means, electronic or mechanical, including photocopying, recording, or any
 * information storage and retrieval system, without permission in writing from
 * the publisher. Infringers of copyright render themselves liable for
 * prosecution.
 */
package com.akqa.test.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverUtil {

	public static WebDriver getDefaultDriver() {
		System.setProperty("webdriver.chrome.driver", "//Users//malindaw//Downloads//chromedriver");
		// System.setProperty("webdriver.gecko.driver", "./geckodriver");
		final WebDriver driverDefault = new ChromeDriver();
		return driverDefault;
	}
}

