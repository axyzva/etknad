package com.entellitrak;

import static org.testng.AssertJUnit.*;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.testng.PowerMockTestCase;
import org.testng.IObjectFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.ObjectFactory;
import org.testng.annotations.Test;

import com.entellitrak.component.ComponentContext;
import com.entellitrak.component.ComponentFactory;
import com.entellitrak.component.ComponentPage;
import com.entellitrak.ui.base.BaseWidget;
import com.entellitrak.ui.layout.VerticalPanel;
import com.entellitrak.ui.layout.RootPanel;
import com.entellitrak.ui.link.Link;

@PrepareForTest()
public class NadTest extends PowerMockTestCase implements ComponentPage {

    
    private ComponentContext ctx;
    private VerticalPanel vPanel;
    
    // TestNG specific
    @ObjectFactory
    public IObjectFactory getObjectFactory() {
        return new org.powermock.modules.testng.PowerMockObjectFactory();
    }
   
    @BeforeMethod
    public void setup() {
	ctx = mock(ComponentContext.class);
	vPanel = mock(VerticalPanel.class);
	when(vPanel.add(any(BaseWidget.class))).thenReturn(vPanel);
    }
    
    @Test
    public void test() {
	
	action(ctx);

    }

    // implement the ComponentPage interface
    @Override
    public void action(ComponentContext ctx) {

	buildNADHomePage();
    }
    
    /**
     * This method builds the home page.
     * Instead of building all the pages, it only builds the home page, other pages are built by different event handlers.
     * In other words, different event will determine what content page to be built. 
     * 
     * All the page contents are contained by the RootPanel. Different event will trigger different event handlers, these
     * event handlers will build content that will replace what is inside the RootPanel - thus this is single page model MVC model.
     */
    public void buildNADHomePage() {
	
	// layout: links are vertically positioned
	vPanel = ComponentFactory.createVerticalPanel();
	
	// add links
	Link link1 = ComponentFactory.createLink(
		"searchDetermination", 
		"Search Determination", 
		new NadLinkClickHandler());
	
	Link link2 = ComponentFactory.createLink(
		"registration", 
		"eFile Registration", 
		new NadLinkClickHandler());
	
	vPanel.add(link1)
	      .add(link2);
	
	// associate with the RootPanel
	RootPanel.get("nad").add(vPanel);
    }


}
