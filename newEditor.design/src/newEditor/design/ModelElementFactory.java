package newEditor.design;

import java.util.UUID;

import org.eclipse.emf.ecore.EObject;

import application.CompositeApplicationType;
import application.ConditionType;
import application.DataFlowGuardType;
import application.MilestoneType;
import application.StageType;
import application.impl.ComponentTypeImpl;
import application.impl.ConditionTypeImpl;
import application.impl.DataFlowGuardTypeImpl;
import application.impl.DataItemTypeImpl;
import application.impl.EventModelTypeImpl;
import application.impl.GuardedStageModelTypeImpl;
import application.impl.InformationModelTypeImpl;
import application.impl.MilestoneTypeImpl;
import application.impl.StageTypeImpl;
import application.impl.SubStageTypeImpl;

public class ModelElementFactory {
	
	Checker check = new Checker();
	UUIDFactory idmaker = new UUIDFactory();
	
	public void EGSMfactory(EObject element) {
		
		if (element instanceof CompositeApplicationType) {
			createStage((CompositeApplicationType) element);
		}
		else if (element instanceof StageType) {
			createStage((StageType) element);
		}
		else if (element instanceof MilestoneType) {
			createCondition((MilestoneType) element);
		}
	}

	private void createStage(CompositeApplicationType app) {
    	
    	
    	if (!check.hierarchyChecker(app)) {
    		createHierarchy(app);
    	}
    	
    	StageTypeImpl stage = new StageTypeImpl(); 

    	stage.setId(idmaker.getUUID(stage));
    	stage.setName(idmaker.getUUID(stage));
  	
    	app.getComponent().get(0).getGuardedStageModel().setStage(stage);
    	
    	populateStage(app);    
    	    	
    	//return false;
    }
	
	private boolean createStage(StageType stage) {
    	
	 	
    	SubStageTypeImpl subStage = new SubStageTypeImpl(); 

   
    	subStage.setId(idmaker.getUUID(subStage));
    	subStage.setName(idmaker.getUUID(subStage));
    	  
    	
    	stage.setSubstage(subStage);
    	
    	populateStage(stage);
    	
    	return false;
    }
	
	 private void populateStage(CompositeApplicationType app) {
	    	
	    	DataFlowGuardType data = new DataFlowGuardTypeImpl();
	    	
	    	data.setId(idmaker.getUUID(data));
	    	data.setName(idmaker.getUUID(data));
	    	
	    	MilestoneType mile = new MilestoneTypeImpl();
	    	
	    	mile.setId(idmaker.getUUID(mile));
	    	mile.setName(idmaker.getUUID(mile));
	    	
	    	ConditionType condition = new ConditionTypeImpl();
	    	
	    	condition.setId(idmaker.getUUID(condition));
	    	condition.setName(idmaker.getUUID(condition));

	    	mile.setCondition(condition);

	    	
	    	
	    	System.out.println(app.getComponent().get(0).getGuardedStageModel().getStage().get(app.getComponent().get(0).getGuardedStageModel().getStage().size() -1).getDataFlowGuard());//.setDFG(new DataFlowGuardTypeImpl());
	    	app.getComponent().get(0).getGuardedStageModel().getStage().get(app.getComponent().get(0).getGuardedStageModel().getStage().size() -1).setDFG(data);
	    	//System.out.println(app.getComponent().get(0).getGuardedStageModel().getStage().get(app.getComponent().get(0).getGuardedStageModel().getStage().size() -1).getDataFlowGuard());//.setDFG(new DataFlowGuardTypeImpl());

	    	System.out.println(app.getComponent().get(0).getGuardedStageModel().getStage().get(app.getComponent().get(0).getGuardedStageModel().getStage().size() -1).getMilestone());//.setDFG(new DataFlowGuardTypeImpl());
	    	app.getComponent().get(0).getGuardedStageModel().getStage().get(app.getComponent().get(0).getGuardedStageModel().getStage().size() -1).setMilestone(mile);
	    	//System.out.println(app.getComponent().get(0).getGuardedStageModel().getStage().get(app.getComponent().get(0).getGuardedStageModel().getStage().size() -1).getMilestone());//.setDFG(new DataFlowGuardTypeImpl());

	    }
	 
	 private void populateStage(StageType stage) {
	    	
	    	DataFlowGuardType data = new DataFlowGuardTypeImpl();
	    	
	    	data.setId(idmaker.getUUID(data));
	    	data.setName(idmaker.getUUID(data));
	    	
	    	MilestoneType mile = new MilestoneTypeImpl();
	    	
	    	mile.setId(idmaker.getUUID(mile));
	    	mile.setName(idmaker.getUUID(mile));
	    	
	    	ConditionType condition = new ConditionTypeImpl();
	    	
	    	condition.setId(idmaker.getUUID(condition));
	    	condition.setName(idmaker.getUUID(condition));

	    	mile.setCondition(condition);

	    	
	    	
	    	System.out.println(stage.getSubStage().get(stage.getSubStage().size() -1).getDataFlowGuard());//.setDFG(new DataFlowGuardTypeImpl());
	    	stage.getSubStage().get(stage.getSubStage().size() -1).setDFG(data);
	    	//System.out.println(app.getComponent().get(0).getGuardedStageModel().getStage().get(app.getComponent().get(0).getGuardedStageModel().getStage().size() -1).getDataFlowGuard());//.setDFG(new DataFlowGuardTypeImpl());

	    	System.out.println(stage.getSubStage().get(stage.getSubStage().size() -1).getMilestone());
	    	stage.getSubStage().get(stage.getSubStage().size() -1).setMilestone(mile);
	    	//System.out.println(app.getComponent().get(0).getGuardedStageModel().getStage().get(app.getComponent().get(0).getGuardedStageModel().getStage().size() -1).getMilestone());//.setDFG(new DataFlowGuardTypeImpl());

	    }
	 
	 private void createCondition(MilestoneType milestone) {
	    	milestone.setCondition(new ConditionTypeImpl());
	    	
	    }
	 
	 public void createHierarchy(CompositeApplicationType app) {
	    	app.setComponent(new ComponentTypeImpl());
	    	app.getComponent().get(0).setId("model");
	    	app.getComponent().get(0).setName("model");
	    	app.getComponent().get(0).setAccessControlModel("AccessControlModel");
	    	
	    	app.getComponent().get(0).setGuardedStageModel(new GuardedStageModelTypeImpl());
	    	
	    	app.getComponent().get(0).setInformationModel(new InformationModelTypeImpl());
	    	app.getComponent().get(0).getInformationModel().setId("infoModel");
	    	app.getComponent().get(0).getInformationModel().setRootDataItemId("infoModel");
	    	app.getComponent().get(0).getInformationModel().setDataItem(new DataItemTypeImpl());    	
	    	app.getComponent().get(0).getInformationModel().getDataItem().setId("infoModel");
	    	app.getComponent().get(0).getInformationModel().getDataItem().setRootElement("infoModel");

	    	
	    	app.setEventModel(new EventModelTypeImpl());
	    	
	    }
}
