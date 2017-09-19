package realtimestatechart.xdsml.debug.design.services;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.gemoc.executionframework.extensions.sirius.services.AbstractGemocAnimatorServices;

import realtimestatechart.xdsml.xrtsc.realtimestatechart.State;
import realtimestatechart.xdsml.xrtsc.realtimestatechart.Transition;
import realtimestatechart.xdsml.xrtsc.realtimestatechart.Vertex;

public class XrtscAnimatorServices extends AbstractGemocAnimatorServices {

	@Override
	protected List<StringCouple> getRepresentationRefreshList() {
		final List<StringCouple> res = new ArrayList<StringCouple>();

		res.add(new StringCouple("XRTSC", "Animation"));

		return res;
	}

}
