The is a repository for my bachelor thesis at Denmark's Technical University.
The project is titled "A visual editor for E-GSM models" aims to build a standalone visual editor for E-GSM.
This repository contains the code of the editor itself, the metamodel can be found in another repository linked here: 
https://github.com/Leonard-Theisler/MetaModel

E-GSM is an artifact-driven modeling language suited to autonomously monitor business processes, making it possible to achieve runtime conformance checking. To simplify the adoption of E-GSM, tools to generate models from other process diagrams, such as BPMN, have been developed. However, E-GSM lacks tools to create models from scratch and edit existing models visually and easily. The goal of this project is to build a standalone visual editor for E-GSM models. The visual editor will allow users to create and edit E-GSM models compatible with the PASO E-GSM engine.

How to run the editor:

Deployment has caused some bugs, and as such, the deployed version of the editor does not reflect the final product. Nevertheless, it is available in a google drive folder at the following url: https://drive.google.com/drive/folders/1ofOCi6xHDwY6-aRAcO-HiRiADHx7jit1?usp=sharing
Setup instructions, as well as a README introducing the user to the tool and documenting the bugs are available in this folder.

The editor can also be run using the source code, which showcases all of the features. In order to do so, you will need to install Eclipse, as well as Sirius.
To install Sirius, copy this link: https://download.eclipse.org/sirius/updates/releases/7.2.1/2023-03
and, in Eclipse, navigate to Help -> Install new software, and paste the link. The following steps are presented below:

- Clone the other repository, and import gsm_derived, gsm_derived.edit, and gsm_derived.editor into your workspace.
- Launch a new runtime
- Import the newModel2 project and newEditor.design projects into the new runtime (you will find them in this repository)
- In the top right corner of your screen, switch to the Sirius perspective.
- Expand the newModel2 project until you find the newModel2.gsm_derived file
- Expand this file, and open MVP3. The editor should open.
- If this does not work, or MVP3 does not appear, make a new diagram by right clicking the composite application and using new representation -> new newmodel
