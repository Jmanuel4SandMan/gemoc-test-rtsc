package realtimestatechart.xdsml.xrtsc.adapters.rtscmt.realtimestatechart;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import realtimestatechart.xdsml.xrtsc.adapters.rtscmt.RTSCMTAdaptersFactory;
import realtimestatechart.xdsml.xrtsc.realtimestatechart.NamedElement;

@SuppressWarnings("all")
public class NamedElementAdapter extends EObjectAdapter<NamedElement> implements realtimestatechart.NamedElement {
  private RTSCMTAdaptersFactory adaptersFactory;
  
  public NamedElementAdapter() {
    super(realtimestatechart.xdsml.xrtsc.adapters.rtscmt.RTSCMTAdaptersFactory.getInstance());
    adaptersFactory = realtimestatechart.xdsml.xrtsc.adapters.rtscmt.RTSCMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getName() {
    return adaptee.getName();
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return realtimestatechart.RealtimestatechartPackage.eINSTANCE.getNamedElement();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case realtimestatechart.RealtimestatechartPackage.NAMED_ELEMENT__NAME:
    		return getName();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case realtimestatechart.RealtimestatechartPackage.NAMED_ELEMENT__NAME:
    		return getName() != NAME_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case realtimestatechart.RealtimestatechartPackage.NAMED_ELEMENT__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
