package org.muml.xsrtsc.trace.tracemanager;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.BatchModelChangeListener;

import fr.inria.diverse.trace.gemoc.api.IStepFactory;
import fr.inria.diverse.trace.gemoc.api.ITraceConstructor;
import fr.inria.diverse.trace.gemoc.api.ITraceExplorer;
import fr.inria.diverse.trace.gemoc.api.ITraceExtractor;
import fr.inria.diverse.trace.gemoc.api.ITraceNotifier;
import fr.inria.diverse.trace.gemoc.traceaddon.AbstractTraceAddon;

public class RtscTraceEngineAddon extends AbstractTraceAddon {

	private RtscTraceStepFactory factory = null;

	@Override
	public ITraceConstructor constructTraceConstructor(Resource modelResource, Resource traceResource,
			Map<EObject, EObject> exeToTraced) {
		return new RtscTraceConstructor(modelResource, traceResource, exeToTraced);
	}

	@Override
	public ITraceExplorer constructTraceExplorer(Resource traceResource) {
		RtscTraceExplorer explorer = new RtscTraceExplorer();
		EObject root = traceResource.getContents().get(0);
		if (root instanceof rtscTrace.SpecificTrace) {
			explorer.loadTrace((rtscTrace.SpecificTrace) root);
			return explorer;
		}
		return null;
	}

	@Override
	public ITraceExplorer constructTraceExplorer(Resource modelResource, Resource traceResource,
			Map<EObject, EObject> tracedToExe) {
		RtscTraceExplorer explorer = new RtscTraceExplorer(tracedToExe);
		EObject root = traceResource.getContents().get(0);
		if (root instanceof rtscTrace.SpecificTrace) {
			explorer.loadTrace(modelResource, (rtscTrace.SpecificTrace) root);
			return explorer;
		}
		return null;
	}

	@Override
	public ITraceExtractor constructTraceExtractor(Resource traceResource) {
		RtscTraceExtractor extractor = new RtscTraceExtractor();
		EObject root = traceResource.getContents().get(0);
		if (root instanceof rtscTrace.SpecificTrace) {
			extractor.loadTrace((rtscTrace.SpecificTrace) root);
			return extractor;
		}
		return null;
	}

	@Override
	public ITraceNotifier constructTraceNotifier(BatchModelChangeListener traceListener) {
		return new RtscTraceNotifier(traceListener);
	}

	@Override
	public IStepFactory getFactory() {
		if (factory == null)
			factory = new RtscTraceStepFactory();
		return factory;
	}

	@Override
	public boolean isAddonForTrace(EObject root) {
		return root instanceof rtscTrace.SpecificTrace;
	}

}