package org.muml.xsrtsc;

import fr.inria.diverse.melange.lib.IModelType;
import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.muml.xsrtsc.xsrtscmt.rtsc.RtscFactory;

@SuppressWarnings("all")
public interface XSRTSCMT extends IModelType {
  public abstract EList<EObject> getContents();
  
  public abstract RtscFactory getRtscFactory();
  
  public abstract void save(final String uri) throws IOException;
}
