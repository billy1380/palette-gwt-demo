//
//  DemoPage.java
//  palette-gwt-demo
//
//  Created by William Shakour (billy1380) on 24 Jun 2015.
//  Copyright © 2015 WillShex Limited. All rights reserved.
//
package com.willshex.palette.demo.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.LoadEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Widget;
import com.willshex.palette.client.CanvasBitmap;
import com.willshex.palette.demo.client.part.PaletteView;
import com.willshex.palette.shared.Palette;

/**
 * @author billy1380
 *
 */
public class DemoPage extends Composite {

	private static DemoPageUiBinder uiBinder = GWT.create(DemoPageUiBinder.class);

	interface DemoPageUiBinder extends UiBinder<Widget, DemoPage> {}

	@UiField PaletteView abstractPalette;
	@UiField PaletteView breadPalette;
	@UiField PaletteView cityPalette;
	@UiField PaletteView foodPalette;

	@UiField Image abstractImage;
	@UiField Image breadImage;
	@UiField Image cityImage;
	@UiField Image foodImage;

	public DemoPage() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@UiHandler({ "abstractImage", "breadImage", "cityImage", "foodImage" })
	void onLoadImage(LoadEvent loadEvent) {
		Image image = (Image) loadEvent.getSource();

		CanvasBitmap c = new CanvasBitmap(image);
		Palette p = new Palette.Builder(c).generate();

		if (image == abstractImage) {
			abstractPalette.setPalette(p);
		} else if (image == breadImage) {
			breadPalette.setPalette(p);
		} else if (image == cityImage) {
			cityPalette.setPalette(p);
		} else if (image == foodImage) {
			foodPalette.setPalette(p);
		}
	}

}
