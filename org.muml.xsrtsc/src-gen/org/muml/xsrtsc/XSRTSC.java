package org.muml.xsrtsc;

import fr.inria.diverse.melange.lib.IMetamodel;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.muml.rtsc.RTSCMT;
import org.muml.xsrtsc.XSRTSCMT;

@SuppressWarnings("all")
public class XSRTSC implements IMetamodel {
  private Resource resource;
  
  public Resource getResource() {
    return this.resource;
  }
  
  public void setResource(final Resource resource) {
    this.resource = resource;
  }
  
  public static XSRTSC load(final String uri) {
    ResourceSet rs = new ResourceSetImpl();
    Resource res = rs.getResource(URI.createURI(uri), true);
    XSRTSC mm = new XSRTSC();
    mm.setResource(res);
    return mm ;
  }
  
  public RTSCMT toRTSCMT() {
    org.muml.xsrtsc.xsrtsc.adapters.rtscmt.XSRTSCAdapter adaptee = new org.muml.xsrtsc.xsrtsc.adapters.rtscmt.XSRTSCAdapter() ;
    adaptee.setAdaptee(resource);
    return adaptee;
  }
  
  public XSRTSCMT toXSRTSCMT() {
    org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.XSRTSCAdapter adaptee = new org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.XSRTSCAdapter() ;
    adaptee.setAdaptee(resource);
    return adaptee;
  }
}
