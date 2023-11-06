package newEditor.design;

import java.util.ArrayList;
import java.util.UUID;

import org.eclipse.emf.ecore.EObject;

import application.CompositeApplicationType;
import application.ConditionType;
import application.DataFlowGuardType;
import application.MilestoneType;
import application.StageType;
import application.SubStageType;
import application.impl.ComponentTypeImpl;
import application.impl.ConditionTypeImpl;
import application.impl.DataFlowGuardTypeImpl;
import application.impl.DataItemTypeImpl;
import application.impl.EventModelTypeImpl;
import application.impl.EventTypeImpl;
import application.impl.GuardedStageModelTypeImpl;
import application.impl.InformationModelTypeImpl;
import application.impl.MilestoneTypeImpl;
import application.impl.StageTypeImpl;
import application.impl.SubStageTypeImpl;

public class ModelElementFactory {
	
	Checker check = new Checker();
	UUIDFactory idmaker = new UUIDFactory();
	
	int stagenum = 0;
	int eventnum = 0;
	int stageIndex;
	String id;
	String name;
	String failure = "You must create a model";
	ArrayList<String> alreadyGen = new ArrayList<String>();
	ArrayList<String> eventCheck = new ArrayList<String>();
	
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

	    	
	    	
	    	System.out.println(app.getComponent().get(0).getGuardedStageModel().getStage().get(app.getComponent().get(0).getGuardedStageModel().getStage().size() -1).getDataFlowGuard());
	    	app.getComponent().get(0).getGuardedStageModel().getStage().get(app.getComponent().get(0).getGuardedStageModel().getStage().size() -1).setDFG(data);
	    	

	    	System.out.println(app.getComponent().get(0).getGuardedStageModel().getStage().get(app.getComponent().get(0).getGuardedStageModel().getStage().size() -1).getMilestone());
	    	app.getComponent().get(0).getGuardedStageModel().getStage().get(app.getComponent().get(0).getGuardedStageModel().getStage().size() -1).setMilestone(mile);

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

	    	
	    	
	    	System.out.println(stage.getSubStage().get(stage.getSubStage().size() -1).getDataFlowGuard());
	    	stage.getSubStage().get(stage.getSubStage().size() -1).setDFG(data);

	    	System.out.println(stage.getSubStage().get(stage.getSubStage().size() -1).getMilestone());
	    	stage.getSubStage().get(stage.getSubStage().size() -1).setMilestone(mile);

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
	 
	 public void createEvent(CompositeApplicationType app) {
	    	
	    	EventTypeImpl event = new EventTypeImpl();
	    	
	    	id = UUID.randomUUID().toString().substring(0,4);
	    	event.setId("Event " + id);

	    	
	    	app.getEventModel().setEvent(event);     	
	    	
	    }
	    
	public void makeEvents(CompositeApplicationType app) {
	    	
	    	ArrayList<String> dupeCheck = new ArrayList<String>();
	    	
	    	generateEvents(app);
	    	
	    	   	
	    	if (alreadyGen.size() > 0) {
	    		//eventcheck is the new events
	    		//alreadygen is all of the events
	    		   		
	    		for (int j = 0; j < alreadyGen.size(); j++) {
	        		if ( !eventCheck.contains(alreadyGen.get(j))) {
	        			for (int k = 0; k < app.getEventModel().getEvent().size(); k++) {
	        				if (app.getEventModel().getEvent().get(k).getId() == alreadyGen.get(j)) {
	        					app.getEventModel().getEvent().remove(k);
	        					alreadyGen.remove(j);
	        				}
	        			}
	        		}
	        	}
	    		
	    	}
	    	
			removeDupes(app, dupeCheck);

	    }
	    
	    public void removeDupes(CompositeApplicationType app, ArrayList<String> list) {
	    	for (int i = 0; i < app.getEventModel().getEvent().size(); i++) {
				if (!list.contains(app.getEventModel().getEvent().get(i).getId())){
					list.add(app.getEventModel().getEvent().get(i).getId());
				}
				else {
					app.getEventModel().getEvent().remove(i);
				}
				if (app.getEventModel().getEvent().get(i).getId() == "") {
					app.getEventModel().getEvent().remove(i);
				}
			}
	    }
	    
	    public void generateEvents(CompositeApplicationType app) {
	    	
	    	eventCheck.clear();
	    	
	    	int stages = app.getComponent().get(0).getGuardedStageModel().getStage().size();
	    	
	    	if (stages == 0) {
	    		app.getEventModel().getEvent().clear();
	    	}
	    	
	    	for (int i = 0; i < stages; i++) {
	    		for (int j = 0; j < app.getComponent().get(0).getGuardedStageModel().getStage().get(i).getMilestone().size(); j++) {
	    			if (app.getComponent().get(0).getGuardedStageModel().getStage().get(i).getMilestone().get(j).getEventIds() != null) {
	    				
	    				String eventID = app.getComponent().get(0).getGuardedStageModel().getStage().get(i).getMilestone().get(j).getEventIds();
	    				
	    				eventCheck.add(eventID);

	    				if (!alreadyGen.contains(eventID)) {
	    					
	    					EventTypeImpl event = new EventTypeImpl();
	    					event.setId(eventID);
	    					event.setName(eventID);
	        				alreadyGen.add(eventID);
	    				
	    					app.getEventModel().setEvent(event);
	    				}
	    			}
	    		
	    		}
	    		
	    		for (int j = 0; j < app.getComponent().get(0).getGuardedStageModel().getStage().get(i).getDataFlowGuard().size(); j++) {
	    			if (app.getComponent().get(0).getGuardedStageModel().getStage().get(i).getDataFlowGuard().get(j).getEventIds() != null) {
	    				
	    				String eventID = app.getComponent().get(0).getGuardedStageModel().getStage().get(i).getDataFlowGuard().get(j).getEventIds();
	    				
	    				eventCheck.add(eventID);

	    				if (!alreadyGen.contains(eventID)) {
	    					
	    					EventTypeImpl event = new EventTypeImpl();
	    					event.setId(eventID);
	    					event.setName(eventID);
	        				alreadyGen.add(eventID);
	    				
	    					app.getEventModel().setEvent(event);
	    				}
	    			}
	    		
	    		}
	    		
	    		for (int j = 0; j < app.getComponent().get(0).getGuardedStageModel().getStage().get(i).getFaultLogger().size(); j++) {
	    			if (app.getComponent().get(0).getGuardedStageModel().getStage().get(i).getFaultLogger().get(j).getEventIds() != null) {
	    				
	    				String eventID = app.getComponent().get(0).getGuardedStageModel().getStage().get(i).getFaultLogger().get(j).getEventIds();
	    				
	    				eventCheck.add(eventID);

	    				if (!alreadyGen.contains(eventID)) {
	    					
	    					EventTypeImpl event = new EventTypeImpl();
	    					event.setId(eventID);
	    					event.setName(eventID);
	        				alreadyGen.add(eventID);
	    				
	    					app.getEventModel().setEvent(event);
	    				}
	    			}
	    		
	    		}
	    		
	    		if (app.getComponent().get(0).getGuardedStageModel().getStage().get(i).getSubStage().size() != 0) {
	    			substageEventID(app.getComponent().get(0).getGuardedStageModel().getStage().get(i), app);
	    		}
	    	}
	    }
	    
	    public void substageEventID(EObject stage, CompositeApplicationType app) {
	    	
	    	if (stage instanceof StageType) {
	    		
	    		int subStages = ((StageType) stage).getSubStage().size();
	    	
	    		for (int i = 0; i < subStages; i++) {
	    			for (int j = 0; j < ((StageType) stage).getSubStage().get(i).getMilestone().size(); j++) {
	    				if (((StageType) stage).getSubStage().get(i).getMilestone().get(j).getEventIds() != null) {
	    				
	    					String eventID = ((StageType)stage).getSubStage().get(i).getMilestone().get(j).getEventIds();
	    				
	        				eventCheck.add(eventID);

	    					if (!alreadyGen.contains(eventID)) {
	    					
	    						EventTypeImpl event = new EventTypeImpl();
	    						event.setId(eventID);
	    						event.setName(eventID);
	    						alreadyGen.add(eventID);
	        				
	    						app.getEventModel().setEvent(event);
	    				}
	    			}
	    		
	    		}
	    		
	    			for (int j = 0; j < ((StageType) stage).getSubStage().get(i).getDataFlowGuard().size(); j++) {
	    				if (((StageType) stage).getSubStage().get(i).getDataFlowGuard().get(j).getEventIds() != null) {
	    				
	    					String eventID = ((StageType) stage).getSubStage().get(i).getDataFlowGuard().get(j).getEventIds();
	    				
	        				eventCheck.add(eventID);

	    					if (!alreadyGen.contains(eventID)) {
	    					
	    						EventTypeImpl event = new EventTypeImpl();
	    						event.setId(eventID);
	    						event.setName(eventID);
	        					alreadyGen.add(eventID);
	    				
	        					app.getEventModel().setEvent(event);
	    					}
	    				}
	    		
	    			}
	    			for (int j = 0; j < ((StageType) stage).getSubStage().get(i).getFaultLogger().size(); j++) {
	    				if (((StageType) stage).getSubStage().get(i).getFaultLogger().get(j).getEventIds() != null) {
	    				
	    					String eventID = ((StageType) stage).getSubStage().get(i).getFaultLogger().get(j).getEventIds();
	    				
	        				eventCheck.add(eventID);

	    					if (!alreadyGen.contains(eventID)) {
	    					
	    						EventTypeImpl event = new EventTypeImpl();
	    						event.setId(eventID);
	    						event.setName(eventID);
	        					alreadyGen.add(eventID);
	    				
	        					app.getEventModel().setEvent(event);
	    					}
	    				}
	    		
	    			}
	    		
	    			if (((StageType) stage).getSubStage().get(i).getSubStage().size() != 0) {
	    				substageEventID(((StageType)stage).getSubStage().get(i), app);
	    			}
	    		}
	    	}
	    	
	    	else if (stage instanceof SubStageType) {
	 
	    		int subStages = ((SubStageType) stage).getSubStage().size();
	    	
	    		for (int i = 0; i < subStages; i++) {
	    			for (int j = 0; j < ((SubStageType) stage).getSubStage().get(i).getMilestone().size(); j++) {
	    				if (((SubStageType) stage).getSubStage().get(i).getMilestone().get(j).getEventIds() != null) {
	    				
	    					String eventID = ((SubStageType)stage).getSubStage().get(i).getMilestone().get(j).getEventIds();
	    				
	        				eventCheck.add(eventID);

	    					if (!alreadyGen.contains(eventID)) {
	    					
	    						EventTypeImpl event = new EventTypeImpl();
	    						event.setId(eventID);
	    						event.setName(eventID);
	    						alreadyGen.add(eventID);
	        				
	    						app.getEventModel().setEvent(event);
	    				}
	    			}
	    		
	    		}
	    		
	    			for (int j = 0; j < ((SubStageType) stage).getSubStage().get(i).getDataFlowGuard().size(); j++) {
	    				if (((SubStageType) stage).getSubStage().get(i).getDataFlowGuard().get(j).getEventIds() != null) {
	    				
	    					String eventID = ((SubStageType) stage).getSubStage().get(i).getDataFlowGuard().get(j).getEventIds();
	    				
	        				eventCheck.add(eventID);

	    					if (!alreadyGen.contains(eventID)) {
	    					
	    						EventTypeImpl event = new EventTypeImpl();
	    						event.setId(eventID);
	    						event.setName(eventID);
	        					alreadyGen.add(eventID);
	    				
	        					app.getEventModel().setEvent(event);
	    					}
	    				}
	    		
	    			}
	    			
	    			for (int j = 0; j < ((SubStageType) stage).getSubStage().get(i).getFaultLogger().size(); j++) {
	    				if (((SubStageType) stage).getSubStage().get(i).getFaultLogger().get(j).getEventIds() != null) {
	    				
	    					String eventID = ((SubStageType) stage).getSubStage().get(i).getFaultLogger().get(j).getEventIds();
	    				
	        				eventCheck.add(eventID);

	    					if (!alreadyGen.contains(eventID)) {
	    					
	    						EventTypeImpl event = new EventTypeImpl();
	    						event.setId(eventID);
	    						event.setName(eventID);
	        					alreadyGen.add(eventID);
	    				
	        					app.getEventModel().setEvent(event);
	    					}
	    				}
	    		
	    			}
	    		
	    			if (((SubStageType) stage).getSubStage().get(i).getSubStage().size() != 0) {
	    				substageEventID(((SubStageType)stage).getSubStage().get(i), app);
	    			}
	    		}
	    	}
	    	
	    }     
}
