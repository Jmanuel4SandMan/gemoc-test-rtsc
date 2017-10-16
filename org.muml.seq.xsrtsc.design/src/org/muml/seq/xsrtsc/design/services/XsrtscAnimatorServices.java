package org.muml.seq.xsrtsc.design.services;

import java.util.ArrayList;
import java.util.List;

import org.gemoc.executionframework.extensions.sirius.services.AbstractGemocAnimatorServices;

public class XsrtscAnimatorServices extends AbstractGemocAnimatorServices {

	@Override
	protected List<StringCouple> getRepresentationRefreshList() {
		final List<StringCouple> res = new ArrayList<StringCouple>();

		res.add(new StringCouple("RTSC", "Animation"));
		res.add(new StringCouple("XRTSC", "Animation"));

		return res;
	}

}
