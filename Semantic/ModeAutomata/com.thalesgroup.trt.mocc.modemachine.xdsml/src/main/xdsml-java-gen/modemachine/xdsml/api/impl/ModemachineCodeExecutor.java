/* GENERATED FILE, do not modify manually                                                    *
 * If you need to modify it, disable the generation in the BuildOptions of the project.xdsml */
package modemachine.xdsml.api.impl;
import org.gemoc.execution.concurrent.ccsljavaengine.dsa.executors.CodeExecutorDispatcher;
import org.gemoc.execution.concurrent.ccsljavaengine.dsa.executors.JavaCodeExecutor;
import org.gemoc.execution.concurrent.ccsljavaengine.extensions.k3.dsa.api.IK3DSAExecutorClassLoader;
import org.gemoc.execution.concurrent.ccsljavaengine.extensions.k3.dsa.impl.Kermeta3AspectsCodeExecutor;

public class ModemachineCodeExecutor extends CodeExecutorDispatcher 
		implements IK3DSAExecutorClassLoader  {
	public ModemachineCodeExecutor(){
	    // add K3 DSA specific executor
		addExecutor(new Kermeta3AspectsCodeExecutor(this,
			"com.thalesgroup.trt.mocc.modemachine.k3dsa"));
		// fall back executor : search classic java method
		addExecutor(new JavaCodeExecutor());
	}
	public String getDSAProjectName(){
		//TODO please implement
		return "";
	}
   @Override
	public Class<?> getClassForName(String className) throws ClassNotFoundException {
		return Class.forName(className);
	}
	@Override
	public java.io.InputStream getResourceAsStream(String resourceName) {
		//this.getClass().getResourceAsStream(resourceName);
		return Thread.currentThread().getContextClassLoader().getResourceAsStream(resourceName);
	}
}