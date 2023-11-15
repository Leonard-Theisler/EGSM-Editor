package newEditor.design;

import java.util.UUID;

import org.eclipse.emf.ecore.EObject;

import application.ConditionType;
import application.DataFlowGuardType;
import application.FaultLoggerType;
import application.MilestoneType;
import application.ProcessFlowGuardType;
import application.StageType;
import application.SubStageType;

public class UUIDFactory {
	
	//this class is a simple factory to create UUIDs
	String id;
	String name;
	
	public String getUUID(EObject element) {
		
		id = UUID.randomUUID().toString().substring(0,4);

		if (element instanceof StageType) {
    		name = "Stage ";
    	}
		else if (element instanceof SubStageType) {
    		name = "Nested Stage ";
    	}
    	else if (element instanceof DataFlowGuardType) {
    		name = "Data Flow Guard ";
    	}
    	else if (element instanceof ProcessFlowGuardType) {
    		name = "Process Flow Guard ";
    	}
    	else if (element instanceof MilestoneType) {
    		name = "Milestone ";
    	}
    	else if (element instanceof FaultLoggerType) {
    		name = "Fault Logger ";
    	}
    	else if (element instanceof ConditionType) {
    		name = "Condition ";
    	}
    	
    	
    	return name + id;
	}

}
