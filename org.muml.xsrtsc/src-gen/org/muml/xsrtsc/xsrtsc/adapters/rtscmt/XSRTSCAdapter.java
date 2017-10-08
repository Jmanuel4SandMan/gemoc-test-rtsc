package org.muml.xsrtsc.xsrtsc.adapters.rtscmt;

import fr.inria.diverse.melange.adapters.ResourceAdapter;
import java.io.IOException;
import java.util.Set;
import org.eclipse.emf.common.util.URI;
import org.muml.rtsc.RTSCMT;
import org.muml.rtsc.RtscFactory;

@SuppressWarnings("all")
public class XSRTSCAdapter extends ResourceAdapter implements RTSCMT {
  public XSRTSCAdapter() {
    super(org.muml.xsrtsc.xsrtsc.adapters.rtscmt.RTSCMTAdaptersFactory.getInstance());
  }
  
  @Override
  public RtscFactory getRtscFactory() {
    return new org.muml.xsrtsc.xsrtsc.adapters.rtscmt.rtsc.RtscFactoryAdapter();
  }
  
  @Override
  public Set getFactories() {
    java.util.Set<org.eclipse.emf.ecore.EFactory> res = new java.util.HashSet<org.eclipse.emf.ecore.EFactory>();
    res.add(getRtscFactory());
    return res;
  }
  
  @Override
  public void save(final String uri) throws IOException {
    this.adaptee.setURI(URI.createURI(uri));
    this.adaptee.save(null);
  }
}
