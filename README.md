The is a repository for my bachelor thesis at Denmark's Technical University.
The project is titled "A visual editor for E-GSM models" aims to build a standalone visual editor for E-GSM.

E-GSM is an artifact-driven modeling language suited to autonomously monitor business processes, making it possible to achieve runtime conformance checking. To simplify the adoption of E-GSM, tools to generate models from other process diagrams, such as BPMN, have been developed. However, E-GSM lacks tools to create models from scratch and edit existing models visually and easily. The goal of this project is to build a standalone visual editor for E-GSM models. The visual editor will allow users to create and edit E-GSM models compatible with the PASO E-GSM engine.

How to run the editor:
- Install Obeo Designer (https://www.obeodesigner.com/en/download)
- Clone the repository
- In the EGSM project, expand the EGSM.metamodel file and right click on the topmost stage
- Select new representation->new model
- The editor should open

If this does not work, try this instead:
- Install Obeo Designer (https://www.obeodesigner.com/en/download)
- Clone the repository
- In the metaModel project, expand the model folder and open the diagram
- Right click and select generate->all 
- Launch a new runtime
- Import the EGSM project and Editor.design projects into the new runtime
- In the EGSM project, expand the EGSM.metamodel file and right click on the topmost stage
- Select new representation->new model
- The editor should open
