package org.muml.xsrtsc.xsrtsc.adapters.rtscmt.rtsc;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.muml.xsrtsc.xsrtsc.adapters.rtscmt.RTSCMTAdaptersFactory;
import org.muml.xsrtsc.xsrtsc.rtsc.Vertex;

@SuppressWarnings("all")
public class VertexAdapter extends EObjectAdapter<Vertex> implements org.muml.rtsc.Vertex {
  private RTSCMTAdaptersFactory adaptersFactory;
  
  public VertexAdapter() {
    super(org.muml.xsrtsc.xsrtsc.adapters.rtscmt.RTSCMTAdaptersFactory.getInstance());
    adaptersFactory = org.muml.xsrtsc.xsrtsc.adapters.rtscmt.RTSCMTAdaptersFactory.getInstance();
  }
  
  @Override
  public EClass eClass() {
    return org.muml.rtsc.RtscPackage.eINSTANCE.getVertex();
  }
}
