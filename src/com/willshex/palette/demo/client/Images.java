//
//  Images.java
//  palette-gwt-demo
//
//  Created by William Shakour (billy1380) on 24 Jun 2015.
//  Copyright © 2015 WillShex Limited. All rights reserved.
//
package com.willshex.palette.demo.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;

/**
 * @author billy1380
 *
 */
public interface Images extends ClientBundle {
	public static final Images INSTANCE = GWT.create(Images.class);

	@Source("res/abstract.jpg")
	ImageResource abstractImage ();

	@Source("res/bread.jpg")
	ImageResource breadImage ();

	@Source("res/city.jpg")
	ImageResource cityImage ();

	@Source("res/food.jpg")
	ImageResource foodImage ();

}
