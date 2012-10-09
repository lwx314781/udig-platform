/*
 *    uDig - User Friendly Desktop Internet GIS client
 *    http://udig.refractions.net
 *    (C) 2012, Refractions Research Inc.
 *
 *    This library is free software; you can redistribute it and/or
 *    modify it under the terms of the GNU Lesser General Public
 *    License as published by the Free Software Foundation;
 *    version 2.1 of the License.
 *
 *    This library is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *    Lesser General Public License for more details.
 */
package net.refractions.udig.project.internal.impl;

import net.refractions.udig.project.IPersister;

import org.eclipse.ui.IMemento;

public class CPersister extends IPersister<C> {

	public static boolean enabled = true;
	
	@Override
	public Class<C> getPersistee() {
		if (enabled) return C.class;
		return null;
	}

	@Override
	public C load(IMemento memento) {
		return new C("c"); //$NON-NLS-1$
	}

	@Override
	public void save(C object, IMemento memento) {
		memento.putString("message", object.getMessage()); //$NON-NLS-1$
	}
	
}