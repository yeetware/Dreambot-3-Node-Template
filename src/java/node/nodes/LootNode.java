package java.node.nodes;

import java.node.Node;

import org.dreambot.api.script.AbstractScript;

public class LootNode extends Node
{

	/**
	 * The LootNode constructor
	 *
	 * @param AbstractScript
	 */
	public LootNode(AbstractScript c)
	{
		// Passing the AbstractScript we passed to the BankNode's constructor up to
		// Node's constructor
		super(c);
	}

	/**
	 * The condition this node requires to be true in order to activate.
	 */
	@Override
	public boolean activate()
	{
		return false;
	}

	/**
	 * The code executed if this code returns true.
	 */
	@Override
	public void execute()
	{

	}

}
