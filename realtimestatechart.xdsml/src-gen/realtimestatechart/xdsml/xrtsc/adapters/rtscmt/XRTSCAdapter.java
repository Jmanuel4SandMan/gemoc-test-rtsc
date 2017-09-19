package realtimestatechart.xdsml.xrtsc.adapters.rtscmt;

import fr.inria.diverse.melange.adapters.ResourceAdapter;
import java.io.IOException;
import java.util.Set;
import org.eclipse.emf.common.util.URI;
import realtimestatechart.RealtimestatechartFactory;
import realtimestatechart.xdsml.RTSCMT;

@SuppressWarnings("all")
public class XRTSCAdapter extends ResourceAdapter implements RTSCMT {
  public XRTSCAdapter() {
    super(realtimestatechart.xdsml.xrtsc.adapters.rtscmt.RTSCMTAdaptersFactory.getInstance());
  }
  
  @Override
  public RealtimestatechartFactory getRealtimestatechartFactory() {
    return new realtimestatechart.xdsml.xrtsc.adapters.rtscmt.realtimestatechart.RealtimestatechartFactoryAdapter();
  }
  
  @Override
  public Set getFactories() {
    java.util.Set<org.eclipse.emf.ecore.EFactory> res = new java.util.HashSet<org.eclipse.emf.ecore.EFactory>();
    res.add(getRealtimestatechartFactory());
    return res;
  }
  
  @Override
  public void save(final String uri) throws IOException {
    this.adaptee.setURI(URI.createURI(uri));
    this.adaptee.save(null);
  }
}
