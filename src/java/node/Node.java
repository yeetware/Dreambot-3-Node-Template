package java.node;

import org.dreambot.api.script.AbstractScript;

public abstract class Node
{

	/** Abstract script reference so we can access the api */
	protected AbstractScript c;

	/** Node constructor */
	public Node(AbstractScript c)
	{
		this.c = c;
	}

	/**
	 * Checking if the script should activate.
	 *
	 * @return
	 */
	public abstract boolean activate();

	/**
	 * The code executed if the script should activate.
	 */
	public abstract void execute();
}