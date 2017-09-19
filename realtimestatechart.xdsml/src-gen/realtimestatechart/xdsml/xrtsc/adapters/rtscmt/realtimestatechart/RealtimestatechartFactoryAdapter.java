package realtimestatechart.xdsml.xrtsc.adapters.rtscmt.realtimestatechart;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import realtimestatechart.NamedElement;
import realtimestatechart.Realtimestatechart;
import realtimestatechart.RealtimestatechartFactory;
import realtimestatechart.RealtimestatechartPackage;
import realtimestatechart.State;
import realtimestatechart.StatePoint;
import realtimestatechart.Transition;
import realtimestatechart.xdsml.xrtsc.adapters.rtscmt.RTSCMTAdaptersFactory;

@SuppressWarnings("all")
public class RealtimestatechartFactoryAdapter extends EFactoryImpl implements RealtimestatechartFactory {
  private RTSCMTAdaptersFactory adaptersFactory = realtimestatechart.xdsml.xrtsc.adapters.rtscmt.RTSCMTAdaptersFactory.getInstance();
  
  private realtimestatechart.xdsml.xrtsc.realtimestatechart.RealtimestatechartFactory realtimestatechartAdaptee = realtimestatechart.xdsml.xrtsc.realtimestatechart.RealtimestatechartFactory.eINSTANCE;
  
  @Override
  public Realtimestatechart createRealtimestatechart() {
    return adaptersFactory.createRealtimestatechartAdapter(realtimestatechartAdaptee.createRealtimestatechart(), null);
  }
  
  @Override
  public State createState() {
    return adaptersFactory.createStateAdapter(realtimestatechartAdaptee.createState(), null);
  }
  
  @Override
  public Transition createTransition() {
    return adaptersFactory.createTransitionAdapter(realtimestatechartAdaptee.createTransition(), null);
  }
  
  @Override
  public NamedElement createNamedElement() {
    return adaptersFactory.createNamedElementAdapter(realtimestatechartAdaptee.createNamedElement(), null);
  }
  
  @Override
  public StatePoint createStatePoint() {
    return adaptersFactory.createStatePointAdapter(realtimestatechartAdaptee.createStatePoint(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getRealtimestatechartPackage();
  }
  
  public RealtimestatechartPackage getRealtimestatechartPackage() {
    return realtimestatechart.RealtimestatechartPackage.eINSTANCE;
  }
}
