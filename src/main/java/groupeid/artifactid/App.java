package groupeid.artifactid;

import org.apache.maven.plugin.MojoExecutionException;

/**
 * Hello world!
 *
 */
public class App 
{
	private String msg;
	public App() {
		msg = "Hello, world.";
	}
    public static void main( String[] args ) throws MojoExecutionException
    {
        new GreedingMojo(new App().msg).execute();
    }
}
