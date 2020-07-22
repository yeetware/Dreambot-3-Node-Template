package java;

import java.awt.Graphics;
import java.node.Node;
import java.node.nodes.BankNode;
import java.node.nodes.LootNode;
import java.node.nodes.WalkNode;

import org.dreambot.api.methods.Calculations;
import org.dreambot.api.script.AbstractScript;
import org.dreambot.api.script.Category;
import org.dreambot.api.script.ScriptManifest;

@ScriptManifest(author = "your name here", category = Category.MISC, name = "your script name here", version = 1.234)
public class Script extends AbstractScript
{

	/** the node array ORDER MATTERS! */
	private final Node[] nodes = new Node[] { new BankNode(this), new WalkNode(this), new LootNode(this) };

	/**
	 * Script loop.
	 */
	@Override
	public int onLoop()
	{
		log("onLoop called");

		for (Node node : nodes) {
			if (node.activate()) {
				node.execute();
			}
		}
		return Calculations.random(100, 1000);
	}

	/**
	 * Canvas paint call.
	 */
	@Override
	public void onPaint(Graphics graphics)
	{
		graphics.drawString("drawing muh string", 1, 2);
	}

	/**
	 * Default on start action. Can be removed if not needed.
	 */
	@Override
	public void onStart()
	{
		log("INFO - Default onStart() method called");
	}

	/**
	 * On start with paramters. Can be removed if not needed.
	 */
	@Override
	public void onStart(String... args)
	{
		log("INFO - Parameterized onStart(String... args) method called");

		// List all of the script arguments
		log("--- Argument list ---");
		for (int i = 0; i < args.length; i++) {
			log("Argument " + i + " = " + args[i]);
		}

		// INSERT ARGUMENT HANDELING HERE

		// For actions both onStart methods share place them all in the
		// non-parameterized onStart().
		onStart();
	}

	/**
	 * Executed when the script stops. Can be removed if not needed.
	 */
	@Override
	public void stop()
	{
		log("INFO - Stop() called");
	}
}
