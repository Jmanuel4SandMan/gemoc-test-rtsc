package org.muml.xsrtsc;

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
    	org.muml.rtsc.RtscPackage.eNS_URI,
    	org.muml.rtsc.RtscPackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	org.muml.xsrtsc.xsrtsc.rtsc.RtscPackage.eNS_URI,
    	org.muml.xsrtsc.xsrtsc.rtsc.RtscPackage.eINSTANCE
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
    	"org.muml.xsrtsc.RTSC", "", "http://www.muml.org/rtsc", "org.muml.xsrtsc.RTSCMT"
    );
    MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"org.muml.xsrtsc.RTSC",
    	rTSC
    );
    MelangeRegistry.LanguageDescriptor xSRTSC = new MelangeRegistryImpl.LanguageDescriptorImpl(
    	"org.muml.xsrtsc.XSRTSC", "", "http://org.muml.xsrtsc.xsrtsc/rtsc/", "org.muml.xsrtsc.XSRTSCMT"
    );
    xSRTSC.addAdapter("org.muml.xsrtsc.RTSCMT", org.muml.xsrtsc.xsrtsc.adapters.rtscmt.XSRTSCAdapter.class);
    xSRTSC.addAdapter("org.muml.xsrtsc.XSRTSCMT", org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.XSRTSCAdapter.class);
    MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"org.muml.xsrtsc.XSRTSC",
    	xSRTSC
    );
    MelangeRegistry.ModelTypeDescriptor rTSCMT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"org.muml.xsrtsc.RTSCMT", "", "http://org.muml.xsrtsc.rtscmt/"
    );
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"org.muml.xsrtsc.RTSCMT",
    	rTSCMT
    );
    MelangeRegistry.ModelTypeDescriptor xSRTSCMT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"org.muml.xsrtsc.XSRTSCMT", "", "http://org.muml.xsrtsc.xsrtscmt/"
    );
    xSRTSCMT.addSuperType("org.muml.xsrtsc.RTSCMT");
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"org.muml.xsrtsc.XSRTSCMT",
    	xSRTSCMT
    );
  }
}
