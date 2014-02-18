package com.entellitrak;

import com.entellitrak.ui.event.ClickEvent;
import com.entellitrak.ui.event.handler.ClickHandler;

public class NadLinkClickHandler implements ClickHandler {

    @Override
    public void onClick(ClickEvent event) {
	
	// TODO perform different actions (build different content) based on the actual event object.
	if( event.getSource() != null ){
	    buildSearchNADDeterminantions();
	}
    }

    public void buildSearchNADDeterminantions() {
	
    }
}
