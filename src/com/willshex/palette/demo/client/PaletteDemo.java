package com.willshex.palette.demo.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class PaletteDemo implements EntryPoint {

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad () {
		RootPanel.get().add(new DemoPage());
	}
}