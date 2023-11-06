package newEditor.design;

import org.eclipse.emf.ecore.EObject;

import application.CompositeApplicationType;

public class Checker {
	
	String failure;
	
	public boolean checkApplication(EObject app) {
    	if (app instanceof CompositeApplicationType) {
    		return true;
    	}
    	return false;
    }

	public boolean checkCorrectness(CompositeApplicationType app) {
		if (!hierarchyChecker(app)) {
    		ErrorMessage EM = new ErrorMessage(failure, true);
    		return false;
    	}
    	else if (!stageChecker(app)) {
    		ErrorMessage EM = new ErrorMessage(failure, false);
    		return true;
    	}
    	else if (app.getComponent().get(0).getGuardedStageModel().getStage().size() == 0) {
    		failure = "No stages were found.";
    		ErrorMessage EM = new ErrorMessage(failure, false);
    		return true;
    	}
    	
    	return true;
	}
	
	
	public boolean hierarchyChecker(CompositeApplicationType app) {
    	if (app.getComponent().size() == 0) {
    		failure = "You must create the hierarchy.";
    		return false;
    	}
    	
    	return true;
    } 
	
	
	public boolean stageChecker(CompositeApplicationType app) {
    	
	   	
   	 for (int j = 0; j < app.getComponent().get(0).getGuardedStageModel().getStage().size(); j++) {
   		 if (app.getComponent().get(0).getGuardedStageModel().getStage().get(j).getDataFlowGuard().size() == 0 || app.getComponent().get(0).getGuardedStageModel().getStage().get(j).getMilestone().size() == 0) {
   			 failure = "All stages should have at least one data flow guard and one milestone.";
   			 return false;
   		 }
   		 else if (app.getComponent().get(0).getGuardedStageModel().getStage().get(j).getMilestone().size() != 0 && app.getComponent().get(0).getGuardedStageModel().getStage().get(0).getMilestone().get(0).getCondition() == null) {
   			 failure = "All milestones should have a condition.";
   			 return false;
   		 }
   		 if (app.getComponent().get(0).getGuardedStageModel().getStage().get(j).getSubStage().size() != 0) {
   			 for (int k = 0; k < app.getComponent().get(0).getGuardedStageModel().getStage().get(j).getSubStage().size(); k++) {
   				 if (app.getComponent().get(0).getGuardedStageModel().getStage().get(j).getSubStage().get(k).getDataFlowGuard().size() == 0 || app.getComponent().get(0).getGuardedStageModel().getStage().get(j).getSubStage().get(k).getMilestone().size() == 0) {
   					 failure = "All nested stages should have at least one data flow guard and one milestone.";
   					 return false;
   	    		 }
   				 else if (app.getComponent().get(0).getGuardedStageModel().getStage().get(j).getSubStage().get(k).getMilestone().get(0).getCondition() == null) {
   					 failure = "All nested stages should have at least one data flow guard and one milestone.";
   					 return false;
   				 }
   			 }
   		 }
   	 }
   	 
   	 return true;	
   }
}
