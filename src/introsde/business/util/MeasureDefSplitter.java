package introsde.business.util;

import introsde.storage.ws.LifeStatus;
import introsde.storage.ws.MeasureDefinition;

import java.util.ArrayList;
import java.util.List;

public class MeasureDefSplitter {
	
	private List<LifeStatus> list;

	public MeasureDefSplitter(List<LifeStatus> list) {
		this.list = list;
	}
	
	
	public List<MeasureDefinition> split(){
		
		List<MeasureDefinition> mDefList = new ArrayList<MeasureDefinition>();
		
		for (LifeStatus lifeS : list) {
			
			MeasureDefinition mDef = lifeS.getMeasureDefinition();
			
			boolean isAlreadyPresent = false;
			
			for (MeasureDefinition measureDefinition : mDefList) {
				
				if(mDef.equals(measureDefinition)){
					isAlreadyPresent = true;
					break;
				}
				
			}
			
			if(!isAlreadyPresent){
				mDefList.add(mDef);
			}
			
		}
		
		
		
		return mDefList;
		
	}
	
}
