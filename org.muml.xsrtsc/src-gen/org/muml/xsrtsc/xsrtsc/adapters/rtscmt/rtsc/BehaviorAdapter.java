package org.muml.xsrtsc.xsrtsc.adapters.rtscmt.rtsc;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.muml.xsrtsc.xsrtsc.adapters.rtscmt.RTSCMTAdaptersFactory;
import org.muml.xsrtsc.xsrtsc.rtsc.Behavior;

@SuppressWarnings("all")
public class BehaviorAdapter extends EObjectAdapter<Behavior> implements org.muml.rtsc.Behavior {
  private RTSCMTAdaptersFactory adaptersFactory;
  
  public BehaviorAdapter() {
    super(org.muml.xsrtsc.xsrtsc.adapters.rtscmt.RTSCMTAdaptersFactory.getInstance());
    adaptersFactory = org.muml.xsrtsc.xsrtsc.adapters.rtscmt.RTSCMTAdaptersFactory.getInstance();
  }
  
  @Override
  public EClass eClass() {
    return org.muml.rtsc.RtscPackage.eINSTANCE.getBehavior();
  }
}
