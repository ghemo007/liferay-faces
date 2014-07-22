/**
 * Copyright (c) 2000-2014 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
package com.liferay.faces.alloy.component.accordion;

import javax.faces.component.UIComponent;
import javax.faces.component.behavior.Behavior;

import com.liferay.faces.alloy.component.tab.Tab;
import com.liferay.faces.alloy.component.tab.TabEvent;


/**
 * @author  Neil Griffin
 */
public class AccordionTabEvent extends TabEvent {

	// Public Constants
	public static final String TAB_COLLAPSED = "tabCollapsed";
	public static final String TAB_EXPANDED = "tabExpanded";

	/// serialVersionUID
	private static final long serialVersionUID = 7578789532730713902L;

	public AccordionTabEvent(UIComponent uiComponent, Behavior behavior, String name, Tab tab, Object rowData) {
		super(uiComponent, behavior, name, tab, rowData);
	}
}
