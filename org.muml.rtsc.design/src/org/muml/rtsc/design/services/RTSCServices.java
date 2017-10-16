package org.muml.rtsc.design.services;

import java.util.stream.Collectors;

import org.muml.rtsc.Transition;

/** RTSC services.
 * 
 * @author <a href="mailto:didier.vojtisek@inria.fr">Didier Vojtisek</a>
 * 
 */
public class RTSCServices {

	/**
	 * Gets the label for the given {@link Transition}.
	 * 
	 * @param transition
	 *            the {@link Transition}
	 * @return the label for the given {@link Transition}
	 */
	public String getLabel(Transition transition) {
		final StringBuilder res = new StringBuilder();

		res.append(transition.getName());
		res.append("\n");	
		if (!transition.getGuards().isEmpty()){
			res.append("[");
			res.append(transition.getGuards().stream().map(g->{
				String s = g.getVariable().getName();
				s += "=";
				s+= g.getValue();
				return s;
			}).collect(Collectors.joining(" && ")));
			res.append("]");
		}
		res.append("\n");	
		if (!transition.getClockConstraints().isEmpty()){
			res.append("[");
			res.append(transition.getClockConstraints().stream().map(cc->{
				String s = cc.getClock().getName();
				s += ">=";
				s+= cc.getBound();
				return s;
			}).collect(Collectors.joining(" && ")));
			res.append("]");
		}
		return res.toString();
	}

}
