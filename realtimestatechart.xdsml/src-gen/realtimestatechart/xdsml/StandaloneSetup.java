package realtimestatechart.xdsml;

import fr.inria.diverse.melange.resource.MelangeRegistry;
import fr.inria.diverse.melange.resource.MelangeRegistryImpl;
import fr.inria.diverse.melange.resource.MelangeResourceFactoryImpl;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

@SuppressWarnings("all")
public class StandaloneSetup {
  public static void doSetup() {
    StandaloneSetup setup = new StandaloneSetup();
    setup.doEMFRegistration();
    setup.doAdaptersRegistration();
  }
  
  public void doEMFRegistration() {
    EPackage.Registry.INSTANCE.put(
    	realtimestatechart.RealtimestatechartPackage.eNS_URI,
    	realtimestatechart.RealtimestatechartPackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	realtimestatechart.xdsml.xrtsc.realtimestatechart.RealtimestatechartPackage.eNS_URI,
    	realtimestatechart.xdsml.xrtsc.realtimestatechart.RealtimestatechartPackage.eINSTANCE
    );
    
    Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
    	"*",
    	new XMIResourceFactoryImpl()
    );
    Resource.Factory.Registry.INSTANCE.getProtocolToFactoryMap().put(
    	"melange",
    	new MelangeResourceFactoryImpl()
    );
  }
  
  public void doAdaptersRegistration() {
    MelangeRegistry.LanguageDescriptor rTSC = new MelangeRegistryImpl.LanguageDescriptorImpl(
    	"realtimestatechart.xdsml.RTSC", "", "http://rtsc", "realtimestatechart.xdsml.RTSCMT"
    );
    MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"realtimestatechart.xdsml.RTSC",
    	rTSC
    );
    MelangeRegistry.LanguageDescriptor xRTSC = new MelangeRegistryImpl.LanguageDescriptorImpl(
    	"realtimestatechart.xdsml.XRTSC", "", "http://realtimestatechart.xdsml.xrtsc/realtimestatechart/", "realtimestatechart.xdsml.XRTSCMT"
    );
    xRTSC.addAdapter("realtimestatechart.xdsml.RTSCMT", realtimestatechart.xdsml.xrtsc.adapters.rtscmt.XRTSCAdapter.class);
    xRTSC.addAdapter("realtimestatechart.xdsml.XRTSCMT", realtimestatechart.xdsml.xrtsc.adapters.xrtscmt.XRTSCAdapter.class);
    MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"realtimestatechart.xdsml.XRTSC",
    	xRTSC
    );
    MelangeRegistry.ModelTypeDescriptor rTSCMT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"realtimestatechart.xdsml.RTSCMT", "", "http://realtimestatechart.xdsml.rtscmt/"
    );
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"realtimestatechart.xdsml.RTSCMT",
    	rTSCMT
    );
    MelangeRegistry.ModelTypeDescriptor xRTSCMT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"realtimestatechart.xdsml.XRTSCMT", "", "http://realtimestatechart.xdsml.xrtscmt/"
    );
    xRTSCMT.addSuperType("realtimestatechart.xdsml.RTSCMT");
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"realtimestatechart.xdsml.XRTSCMT",
    	xRTSCMT
    );
  }
}
