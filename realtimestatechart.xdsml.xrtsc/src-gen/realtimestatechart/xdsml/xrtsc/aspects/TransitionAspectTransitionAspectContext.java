package realtimestatechart.xdsml.xrtsc.aspects;

import java.util.Map;

import realtimestatechart.xdsml.xrtsc.realtimestatechart.Transition;

@SuppressWarnings("all")
public class TransitionAspectTransitionAspectContext {
  public final static TransitionAspectTransitionAspectContext INSTANCE = new TransitionAspectTransitionAspectContext();
  
  public static TransitionAspectTransitionAspectProperties getSelf(final Transition _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new realtimestatechart.xdsml.xrtsc.aspects.TransitionAspectTransitionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Transition, TransitionAspectTransitionAspectProperties> map = new java.util.WeakHashMap<realtimestatechart.xdsml.xrtsc.realtimestatechart.Transition, realtimestatechart.xdsml.xrtsc.aspects.TransitionAspectTransitionAspectProperties>();
  
  public Map<Transition, TransitionAspectTransitionAspectProperties> getMap() {
    return map;
  }
}
