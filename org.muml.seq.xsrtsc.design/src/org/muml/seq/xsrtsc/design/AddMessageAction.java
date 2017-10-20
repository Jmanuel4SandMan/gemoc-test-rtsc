package org.muml.seq.xsrtsc.design;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.diagram.DNodeList;
import org.eclipse.sirius.diagram.DNodeListElement;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.muml.seq.xsrtsc.xsrtsc.aspects.MessageBufferAspect;
import org.muml.seq.xsrtsc.xsrtsc.rtsc.Message;
import org.muml.seq.xsrtsc.xsrtsc.rtsc.MessageBuffer;
import org.muml.seq.xsrtsc.xsrtsc.rtsc.MessageType;
import org.muml.seq.xsrtsc.xsrtsc.rtsc.RtscFactory;

import com.sun.org.apache.xerces.internal.dom.DeepNodeListImpl;

public class AddMessageAction implements IExternalJavaAction {

	public AddMessageAction() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> arg0) {
		//System.out.println(arg0.toString());
		return true;//arg0.stream().allMatch(o -> o instanceof MessageType);
	}
	
	@Override
	public void execute(Collection<? extends EObject> arg0, Map<String, Object> arg1) {
		Object typeObject = arg1.get("type");
		Object bufferObject = arg1.get("buffer");
		if (typeObject instanceof MessageType){
			MessageType type = (MessageType) typeObject;
			if (bufferObject instanceof DNodeList){
				if (((DNodeList) bufferObject).getTarget() instanceof MessageBuffer){
					MessageBuffer buffer = (MessageBuffer) ((DNodeList) bufferObject).getTarget();
					
					//Create new message instance in message buffer
					Message message = RtscFactory.eINSTANCE.createMessage();
					message.setType(type);
					MessageBufferAspect.addMessage(buffer, message);
				}
			}
		}
		
		
	}

}
