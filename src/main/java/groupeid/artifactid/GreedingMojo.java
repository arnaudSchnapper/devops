package groupeid.artifactid;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;
 
/**
 * Says "Hi" to the user.
 *
 */
@Mojo( name = "sayhi")
public class GreedingMojo extends AbstractMojo
{
	String msg;
	public GreedingMojo(String mess)
	{
		msg = mess;
	}
    public void execute() throws MojoExecutionException
    {
        getLog().error(msg);
        
    }
}