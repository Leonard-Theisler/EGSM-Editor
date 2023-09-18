The is a repository for my bachelor thesis at Denmark's Technical University.
The project is titled "A visual editor for E-GSM models" aims to build a standalone visual editor for E-GSM.

E-GSM is an artifact-driven modeling language suited to autonomously monitor business processes, making it possible to achieve runtime conformance checking. To simplify the adoption of E-GSM, tools to generate models from other process diagrams, such as BPMN, have been developed. However, E-GSM lacks tools to create models from scratch and edit existing models visually and easily. The goal of this project is to build a standalone visual editor for E-GSM models. The visual editor will allow users to create and edit E-GSM models compatible with the PASO E-GSM engine.

How to run the editor:
- Install Obeo Designer (https://www.obeodesigner.com/en/download)
- Clone the repository
- Import metaModelv3, metaModelv3.edit, and metaModelv3.editor into your workspace (you will find these files on the "update" branch).
- Launch a new runtime
- Import the EGSM project and Editor.design projects into the new runtime
- In the EGSM project, expand the EGSMeditor3.metamodel file and right click on the topmost stage
- Select new representation->new model
- The editor should open
