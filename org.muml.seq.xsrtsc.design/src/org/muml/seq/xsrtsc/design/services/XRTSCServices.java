package org.muml.seq.xsrtsc.design.services;

import java.lang.reflect.InvocationTargetException;
import java.util.stream.Collectors;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.muml.seq.xsrtsc.xsrtsc.rtsc.Message;
import org.muml.seq.xsrtsc.xsrtsc.rtsc.MessageBuffer;
import org.muml.seq.xsrtsc.xsrtsc.rtsc.MessageType;
import org.muml.seq.xsrtsc.xsrtsc.rtsc.Port;
import org.muml.seq.xsrtsc.xsrtsc.rtsc.RtscFactory;
import org.muml.seq.xsrtsc.xsrtsc.rtsc.State;
import org.muml.seq.xsrtsc.xsrtsc.rtsc.Transition;

/** RTSC services.
 * 
* @author <a href="mailto:didier.vojtisek@inria.fr">Didier Vojtisek</a>
 * 
 */
public class XRTSCServices {

	public String getTypeString(EObject o) {
		return o.getClass().toString();
	}
	
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
		if (!transition.getClockConstraints().isEmpty()){
			res.append("\n");	
			res.append("[");
			res.append(transition.getClockConstraints().stream().map(cc->{
				String s = cc.getClock().getName();
				s += ">=";
				s+= cc.getBound();
				return s;
			}).collect(Collectors.joining(" && ")));
			res.append("]");
		}
		if (!transition.getTriggerMessage().isEmpty()){
			res.append("\n");	
			res.append(transition.getTriggerMessage().stream().map(tm->{
				return tm.getName()+"?";
			}).collect(Collectors.joining(" ")));
		}
		return res.toString();
	}
	
	public boolean isCurrentState(EObject o){
		if(o instanceof State){
			return ((State)o).isActive();
		} else {
			return false;
		}
	}
	
	public void addMessage(EObject o){
		System.out.println(o);
		if (o instanceof MessageBuffer){
			MessageBuffer buffer = (MessageBuffer) o ;
			Message message = RtscFactory.eINSTANCE.createMessage();
			MessageType type = RtscFactory.eINSTANCE.createMessageType();
			type.setName("TestMessage");
			message.setType(type);
			buffer.addMessage(message);
		}
	}

}
