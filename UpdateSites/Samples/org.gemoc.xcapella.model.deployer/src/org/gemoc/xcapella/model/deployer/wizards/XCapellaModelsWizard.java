package org.gemoc.xcapella.model.deployer.wizards;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.gemoc.xcapella.model.deployer.Activator;
import org.gemoc.xcapella.model.deployer.wizards.AbstractExampleWizard.ProjectDescriptor;


public class XCapellaModelsWizard
	extends AbstractExampleWizard {
	
	protected Collection<ProjectDescriptor> getProjectDescriptors() {		

		List<ProjectDescriptor> projects = new ArrayList<ProjectDescriptor>(1);
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/Dataflow.zip", "Dataflow"));
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/ModeAutomata.zip", "ModeAutomata"));
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/Coordination.zip", "Coordination"));
		return projects;
	}

	@Override
	protected AbstractUIPlugin getContainerPlugin() {
		
		return Activator.getDefault();
	}
}