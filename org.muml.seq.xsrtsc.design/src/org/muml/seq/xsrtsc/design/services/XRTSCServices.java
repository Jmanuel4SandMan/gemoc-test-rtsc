package org.muml.seq.xsrtsc.design.services;

import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.muml.seq.xsrtsc.xsrtsc.aspects.ClockAspect;
import org.muml.seq.xsrtsc.xsrtsc.rtsc.Clock;
import org.muml.seq.xsrtsc.xsrtsc.rtsc.ClockResetEvent;
import org.muml.seq.xsrtsc.xsrtsc.rtsc.Event;
import org.muml.seq.xsrtsc.xsrtsc.rtsc.Message;
import org.muml.seq.xsrtsc.xsrtsc.rtsc.MessageBuffer;
import org.muml.seq.xsrtsc.xsrtsc.rtsc.MessageEvent;
import org.muml.seq.xsrtsc.xsrtsc.rtsc.MessageType;
import org.muml.seq.xsrtsc.xsrtsc.rtsc.RtscFactory;
import org.muml.seq.xsrtsc.xsrtsc.rtsc.State;
import org.muml.seq.xsrtsc.xsrtsc.rtsc.Transition;
import org.muml.seq.xsrtsc.xsrtsc.rtsc.Variable;
import org.muml.seq.xsrtsc.xsrtsc.rtsc.VariableAssignmentEvent;

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
		if (!transition.getEvents().isEmpty()){
			res.append("\n/\n");
			res.append(getLabel(transition.getEvents()));
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
	
	public boolean isActive(Transition transition){
		return transition.getStatechart().getActiveTransitions().contains(transition);
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
	
	public String getLabel(Clock clock){
		try {
			return clock.getName()+": "+ClockAspect.printValue(clock);
		} catch (Exception e){
			e.printStackTrace();
		}
		return clock.getName();
	}
	
	public String getLabel(Variable variable){
		return variable.getName()+ " = " +variable.getRuntimeValue();
	}
	
	public String getEventsLabel(State state) {
		StringBuilder builder = new StringBuilder();
		if (!state.getEntryEvents().isEmpty()) {
			builder.append("Entry: {\n");
			builder.append(getLabel(state.getEntryEvents()));
			builder.append("}");
		}
		if (!state.getExitEvents().isEmpty()) {
			if (!state.getExitEvents().isEmpty()) {
				builder.append("\n");
			}
			builder.append("Exit: {\n");
			builder.append(getLabel(state.getExitEvents()));
			builder.append("}");
		}
		return builder.toString();
	}
	
	public String getLabel(EList<Event> events) {
		StringBuilder builder = new StringBuilder();
		events.forEach(e -> {
			builder.append(getLabel(e));
			builder.append("\n");
		});
		return builder.toString();
	}
	
	public String getLabel(Event e) {
		if (e instanceof ClockResetEvent) {
			return getLabel((ClockResetEvent) e);
		} else if (e instanceof VariableAssignmentEvent) {
			return getLabel((VariableAssignmentEvent) e);
		}else if (e instanceof MessageEvent) {
			return getLabel((MessageEvent) e);
		}
		return e.toString();
	}

	public String getLabel(ClockResetEvent e) {
		return e.getClock().getName() + ".reset();";
	}

	public String getLabel(VariableAssignmentEvent e) {
		return e.getVariable().getName() + " := " + e.getValue();
	}
	
	public String getLabel(MessageEvent e) {
		return e.getMessageType().getName() + "!";
	}


}
