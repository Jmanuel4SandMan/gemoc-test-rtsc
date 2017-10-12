package org.muml.xsrtsc.design.services;

import java.util.ArrayList;
import java.util.List;

import org.gemoc.executionframework.extensions.sirius.services.AbstractGemocDebuggerServices;

public class XsrtscDebugServices extends AbstractGemocDebuggerServices {

	@Override
	protected List<StringCouple> getRepresentationRefreshList() {
		final List<StringCouple> res = new ArrayList<StringCouple>();

		res.add(new StringCouple("RTSC", "Debug"));
		res.add(new StringCouple("XRTSC", "Debug"));

		return res;
	}
	
	@Override
	public String getModelIdentifier() {
		return org.gemoc.execution.concurrent.ccsljavaengine.ui.Activator.PLUGIN_ID+".debugModel";
	}
}
