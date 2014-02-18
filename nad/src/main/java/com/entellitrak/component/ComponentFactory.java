package com.entellitrak.component;

import com.entellitrak.ui.button.Button;
import com.entellitrak.ui.event.ClickEvent;
import com.entellitrak.ui.event.handler.ClickHandler;
import com.entellitrak.ui.input.TextBox;
import com.entellitrak.ui.layout.HorizontalPanel;
import com.entellitrak.ui.layout.VerticalPanel;
import com.entellitrak.ui.link.Link;

public abstract class ComponentFactory {
    
    // Widgets
    public static VerticalPanel createVerticalPanel()
    {
	return null;
    }
 
    public static HorizontalPanel createHorizontalPanel()
    {
	return null;
    }
    
    public static Button createButton(){
	return null;
    }
    
    public static Button createButton(String name, String label){
	return null;
    }

    public static TextBox createTextBox(){
	return null;
    }
    
    public static TextBox createTextBox(String name, String label){
	return null;
    }

    public static Link createLink(){
	return null;
    }

    public static Link createLink(String name, String label, ClickHandler handler){
	return null;
    }
    
    
}
