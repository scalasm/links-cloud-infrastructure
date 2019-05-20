/*******************************************************************************
 * Copyright (c) 2019 Link Management & Technology S.p.A. 
 * via R. Scotellaro, 55 - 73100 - Lecce - http://www.linksmt.it
 * All rights reserved. 
 *
 * Contributors:
 *     Links Management & Technology S.p.A. - initial API and implementation
 *******************************************************************************/
package it.linksmt.helloclient;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author mario
 *
 */
public interface GreetingController {
	@RequestMapping( "/greeting" )
	String greeting();
}