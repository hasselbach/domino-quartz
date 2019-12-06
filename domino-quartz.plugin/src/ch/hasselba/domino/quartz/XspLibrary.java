package ch.hasselba.domino.quartz;

import com.ibm.xsp.library.AbstractXspLibrary;

public class XspLibrary extends AbstractXspLibrary {

	public static final String LIBRARY_ID = XspLibrary.class.getName();

	public XspLibrary() {

		System.out.println("Loading Quartz (" + getPluginId() + ")");

	}

	@Override

	public String getPluginId() {

		return Activator.PLUGIN_ID;

	}

	public String getLibraryId() {

		return LIBRARY_ID;

	}

}
