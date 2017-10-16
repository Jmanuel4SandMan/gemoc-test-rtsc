package org.muml.rtsc.k3dsa.timekeeper

import org.muml.udbm.UDBMClock
import org.muml.udbm.FederationFactory
import org.muml.udbm.Federation
import org.muml.udbm.java.JavaFederationFactory
import java.util.HashSet
import org.muml.rtsc.Clock
import java.util.Map
import java.util.HashMap
import org.muml.rtsc.Realtimestatechart

class TimeKeeper {
	private static FederationFactory ff = new JavaFederationFactory();
	private static Map<String, Federation> federations = new HashMap
	private static Map<String, UDBMClock> clockMapping = new HashMap
		
	def public static void addClock(String rtscId, String clockId){
		//create UDBM clocks
		getFederation(rtscId).addClock(getUClock(clockId))
	}
	
	def private static UDBMClock getUClock(String clock){
		if (!clockMapping.containsKey(clock)){
			clockMapping.put(clock, new UDBMClock(clock, clock))
		}
		clockMapping.get(clock)
	}
	
	def private static Federation getFederation(String rtsc){
		if (!federations.containsKey(rtsc)){
			federations.put(rtsc, ff.createZeroFederation(new HashSet))
		}
		federations.get(rtsc)
	}
}