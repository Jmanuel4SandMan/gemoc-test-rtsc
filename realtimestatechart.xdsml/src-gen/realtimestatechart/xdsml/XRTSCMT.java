package realtimestatechart.xdsml;

import fr.inria.diverse.melange.lib.IModelType;
import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import realtimestatechart.xdsml.xrtscmt.realtimestatechart.RealtimestatechartFactory;

@SuppressWarnings("all")
public interface XRTSCMT extends IModelType {
  public abstract EList<EObject> getContents();
  
  public abstract RealtimestatechartFactory getRealtimestatechartFactory();
  
  public abstract void save(final String uri) throws IOException;
}
