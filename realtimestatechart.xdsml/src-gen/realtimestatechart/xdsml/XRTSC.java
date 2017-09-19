package realtimestatechart.xdsml;

import fr.inria.diverse.melange.lib.IMetamodel;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import realtimestatechart.xdsml.RTSCMT;
import realtimestatechart.xdsml.XRTSCMT;

@SuppressWarnings("all")
public class XRTSC implements IMetamodel {
  private Resource resource;
  
  public Resource getResource() {
    return this.resource;
  }
  
  public void setResource(final Resource resource) {
    this.resource = resource;
  }
  
  public static XRTSC load(final String uri) {
    ResourceSet rs = new ResourceSetImpl();
    Resource res = rs.getResource(URI.createURI(uri), true);
    XRTSC mm = new XRTSC();
    mm.setResource(res);
    return mm ;
  }
  
  public RTSCMT toRTSCMT() {
    realtimestatechart.xdsml.xrtsc.adapters.rtscmt.XRTSCAdapter adaptee = new realtimestatechart.xdsml.xrtsc.adapters.rtscmt.XRTSCAdapter() ;
    adaptee.setAdaptee(resource);
    return adaptee;
  }
  
  public XRTSCMT toXRTSCMT() {
    realtimestatechart.xdsml.xrtsc.adapters.xrtscmt.XRTSCAdapter adaptee = new realtimestatechart.xdsml.xrtsc.adapters.xrtscmt.XRTSCAdapter() ;
    adaptee.setAdaptee(resource);
    return adaptee;
  }
}
