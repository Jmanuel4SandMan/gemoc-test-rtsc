package realtimestatechart.xdsml.xrtsc.adapters.xrtscmt.realtimestatechart;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import realtimestatechart.xdsml.xrtsc.adapters.xrtscmt.XRTSCMTAdaptersFactory;
import realtimestatechart.xdsml.xrtscmt.realtimestatechart.NamedElement;
import realtimestatechart.xdsml.xrtscmt.realtimestatechart.Realtimestatechart;
import realtimestatechart.xdsml.xrtscmt.realtimestatechart.RealtimestatechartFactory;
import realtimestatechart.xdsml.xrtscmt.realtimestatechart.RealtimestatechartPackage;
import realtimestatechart.xdsml.xrtscmt.realtimestatechart.State;
import realtimestatechart.xdsml.xrtscmt.realtimestatechart.StatePoint;
import realtimestatechart.xdsml.xrtscmt.realtimestatechart.Transition;

@SuppressWarnings("all")
public class RealtimestatechartFactoryAdapter extends EFactoryImpl implements RealtimestatechartFactory {
  private XRTSCMTAdaptersFactory adaptersFactory = realtimestatechart.xdsml.xrtsc.adapters.xrtscmt.XRTSCMTAdaptersFactory.getInstance();
  
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
    return realtimestatechart.xdsml.xrtscmt.realtimestatechart.RealtimestatechartPackage.eINSTANCE;
  }
}
