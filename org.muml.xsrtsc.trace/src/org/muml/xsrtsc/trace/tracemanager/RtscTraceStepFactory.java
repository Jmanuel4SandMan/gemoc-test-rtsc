
package org.muml.xsrtsc.trace.tracemanager;

import java.util.List;
import fr.inria.diverse.trace.gemoc.api.IStepFactory;

public class RtscTraceStepFactory implements IStepFactory {

	@Override
	public fr.inria.diverse.trace.commons.model.trace.Step createStep(
			fr.inria.diverse.trace.commons.model.trace.MSE mse, List<Object> parameters, List<Object> result) {

		fr.inria.diverse.trace.commons.model.trace.Step step = null;
		org.eclipse.emf.ecore.EClass ec = mse.getCaller().eClass();
		String stepRule = fr.inria.diverse.trace.commons.EcoreCraftingUtil.getFQN(ec, ".") + "."
				+ mse.getAction().getName();

		if (mse.getAction().getName().equalsIgnoreCase("initRTSC")
				&& (ec.getClassifierID() == org.muml.xsrtsc.xsrtsc.rtsc.RtscPackage.eINSTANCE.getRealtimestatechart()
						.getClassifierID()))

		{
			step = rtscTrace.Steps.StepsFactory.eINSTANCE.createRtsc_Realtimestatechart_InitRTSC();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("initialize")
				&& (ec.getClassifierID() == org.muml.xsrtsc.xsrtsc.rtsc.RtscPackage.eINSTANCE.getRealtimestatechart()
						.getClassifierID()))

		{
			step = rtscTrace.Steps.StepsFactory.eINSTANCE.createRtsc_Realtimestatechart_Initialize();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("step")
				&& (ec.getClassifierID() == org.muml.xsrtsc.xsrtsc.rtsc.RtscPackage.eINSTANCE.getRealtimestatechart()
						.getClassifierID()))

		{
			step = rtscTrace.Steps.StepsFactory.eINSTANCE.createRtsc_Realtimestatechart_Step();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("canFire")
				&& (ec.getClassifierID() == org.muml.xsrtsc.xsrtsc.rtsc.RtscPackage.eINSTANCE.getTransition()
						.getClassifierID()))

		{
			step = rtscTrace.Steps.StepsFactory.eINSTANCE.createRtsc_Transition_CanFire();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("fire")
				&& (ec.getClassifierID() == org.muml.xsrtsc.xsrtsc.rtsc.RtscPackage.eINSTANCE.getTransition()
						.getClassifierID()))

		{
			step = rtscTrace.Steps.StepsFactory.eINSTANCE.createRtsc_Transition_Fire();
		}

		else {
			step = fr.inria.diverse.trace.commons.model.trace.TraceFactory.eINSTANCE.createGenericSequentialStep();
		}

		fr.inria.diverse.trace.commons.model.trace.MSEOccurrence mseocc = fr.inria.diverse.trace.commons.model.trace.TraceFactory.eINSTANCE
				.createMSEOccurrence();
		mseocc.setMse(mse);
		mseocc.getParameters().addAll(parameters);
		mseocc.getResult().addAll(result);
		step.setMseoccurrence(mseocc);

		return step;
	}
}
