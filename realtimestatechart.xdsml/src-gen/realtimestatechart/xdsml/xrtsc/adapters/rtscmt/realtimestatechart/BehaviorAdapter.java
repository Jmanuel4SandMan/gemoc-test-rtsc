package realtimestatechart.xdsml.xrtsc.adapters.rtscmt.realtimestatechart;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import realtimestatechart.xdsml.xrtsc.adapters.rtscmt.RTSCMTAdaptersFactory;
import realtimestatechart.xdsml.xrtsc.realtimestatechart.Behavior;

@SuppressWarnings("all")
public class BehaviorAdapter extends EObjectAdapter<Behavior> implements realtimestatechart.Behavior {
  private RTSCMTAdaptersFactory adaptersFactory;
  
  public BehaviorAdapter() {
    super(realtimestatechart.xdsml.xrtsc.adapters.rtscmt.RTSCMTAdaptersFactory.getInstance());
    adaptersFactory = realtimestatechart.xdsml.xrtsc.adapters.rtscmt.RTSCMTAdaptersFactory.getInstance();
  }
  
  @Override
  public EClass eClass() {
    return realtimestatechart.RealtimestatechartPackage.eINSTANCE.getBehavior();
  }
}
