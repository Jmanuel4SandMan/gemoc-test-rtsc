package org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.XSRTSCMTAdaptersFactory;
import org.muml.xsrtsc.xsrtsc.rtsc.Behavior;

@SuppressWarnings("all")
public class BehaviorAdapter extends EObjectAdapter<Behavior> implements org.muml.xsrtsc.xsrtscmt.rtsc.Behavior {
  private XSRTSCMTAdaptersFactory adaptersFactory;
  
  public BehaviorAdapter() {
    super(org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.XSRTSCMTAdaptersFactory.getInstance());
    adaptersFactory = org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.XSRTSCMTAdaptersFactory.getInstance();
  }
  
  @Override
  public EClass eClass() {
    return org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.eINSTANCE.getBehavior();
  }
}
