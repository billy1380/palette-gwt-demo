//
//  PaletteView.java
//  palette-gwt-demo
//
//  Created by William Shakour (billy1380) on 24 Jun 2015.
//  Copyright © 2015 WillShex Limited. All rights reserved.
//
package com.willshex.palette.demo.client.part;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.willshex.palette.shared.Palette;

/**
 * @author billy1380
 *
 */
public class PaletteView extends Composite {

	private static PaletteUiBinder uiBinder = GWT.create(PaletteUiBinder.class);

	interface PaletteUiBinder extends UiBinder<Widget, PaletteView> {}

	@UiField Element elVibrant;
	@UiField Element elVibrantDark;
	@UiField Element elVibrantLight;
	@UiField Element elMuted;
	@UiField Element elMutedDark;
	@UiField Element elMutedLight;

	public PaletteView() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	public void setPalette(Palette palette) {
		setVibrantColour(cssColour(palette.getVibrantColor(0xFF000000)));
		setVibrantDarkColour(cssColour(palette.getDarkVibrantColor(0xFF000000)));
		setVibrantLightColour(cssColour(palette.getLightVibrantColor(0xFFFFFFFF)));
		setMutedColour(cssColour(palette.getMutedColor(0xFF000000)));
		setMutedDarkColour(cssColour(palette.getDarkMutedColor(0xFF000000)));
		setMutedLightColour(cssColour(palette.getLightMutedColor(0xFFFFFFFF)));
	}

	public void setVibrantColour(String value) {
		elVibrant.getStyle().setBackgroundColor(value);
	}

	public void setVibrantDarkColour(String value) {
		elVibrantDark.getStyle().setBackgroundColor(value);
	}

	public void setVibrantLightColour(String value) {
		elVibrantLight.getStyle().setBackgroundColor(value);
	}

	public void setMutedColour(String value) {
		elMuted.getStyle().setBackgroundColor(value);
	}

	public void setMutedDarkColour(String value) {
		elMutedDark.getStyle().setBackgroundColor(value);
	}

	public void setMutedLightColour(String value) {
		elMutedLight.getStyle().setBackgroundColor(value);
	}

	private String cssColour(int colour) {
		return ("#" + Integer.toHexString(colour)).replace("#ff", "#");
	}

}
