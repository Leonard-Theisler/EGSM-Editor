The is a repository for my bachelor thesis at Denmark's Technical University.
The project is titled "A visual editor for E-GSM models" aims to build a standalone visual editor for E-GSM.

E-GSM is an artifact-driven modeling language suited to autonomously monitor business processes, making it possible to achieve runtime conformance checking. To simplify the adoption of E-GSM, tools to generate models from other process diagrams, such as BPMN, have been developed. However, E-GSM lacks tools to create models from scratch and edit existing models visually and easily. The goal of this project is to build a standalone visual editor for E-GSM models. The visual editor will allow users to create and edit E-GSM models compatible with the PASO E-GSM engine.

How to run the editor:
- Install Obeo Designer (https://www.obeodesigner.com/en/download)
- Clone the repository
- Import gs_derived, gs_derived.edit, and gs_derived.editor into your workspace (you will find these files on the "MetaModel" branch)
- Launch a new runtime
- Import the newModel2 project and newEditor.design projects into the new runtime (you will find these on the "master" branch)
- Expand the newModel2 project until you find newModel2.gsm_derived file
- Expand this file, and open MVP3. The editor should open.
- If this does not work, or MVP3 does not appear, make a new diagram by right clicking the composite application and using new representation -> new newmodel
