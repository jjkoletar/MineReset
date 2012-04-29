package com.wolvencraft.MineReset.config;

import java.util.List;

import com.wolvencraft.MineReset.CommandManager;

public class Regions
{
	/**
	 * Returns region data from the node
	 * @param node Configuration node
	 * @return String to be returned
	 */
	public static String getString(String node)
	{
		String stringToReturn = CommandManager.getPlugin().getRegionData().getString(node);
		return stringToReturn;
	}
	
	/**
	 * Returns region data from the node
	 * @param node Configuration node
	 * @return boolean to be returned
	 */
	public static boolean getBoolean(String node)
	{
		boolean booleanToReturn = CommandManager.getPlugin().getRegionData().getBoolean(node);
		return booleanToReturn;
	}
	
	/**
	 * Returns region data from the node
	 * @param node Configuration node
	 * @return int to be returned
	 */
	public static int getInt(String node)
	{
		int intToReturn = CommandManager.getPlugin().getRegionData().getInt(node);
		return intToReturn;
	}
	
	/**
	 * Returns region data from the node
	 * @param node Configuration node
	 * @return int to be returned
	 */
	public static double getDouble(String node)
	{
		double intToReturn = CommandManager.getPlugin().getRegionData().getDouble(node);
		return intToReturn;
	}
	
	/**
	 * Returns region data from the node
	 * @param node Configuration node
	 * @return List<String> to be returned
	 */
	public static List<String> getList(String node)
	{
		List<String> listToReturn = CommandManager.getPlugin().getRegionData().getStringList(node);
		return listToReturn;
	}
	
	/**
	 * Sets region data to a designated node
	 * @param node Configuration node
	 * @param data Data to be set
	 */
	public static void setString(String node, String data)
	{
		CommandManager.getPlugin().getRegionData().set(node, data);
	}
	
	/**
	 * Sets region data to a designated node
	 * @param node Configuration node
	 * @param data Data to be set
	 */
	public static void setBoolean(String node, boolean data)
	{
		CommandManager.getPlugin().getRegionData().set(node, data);
	}
	
	/**
	 * Sets region data to a designated node
	 * @param node Configuration node
	 * @param data Data to be set
	 */
	public static void setInt(String node, int data)
	{
		CommandManager.getPlugin().getRegionData().set(node, data);
	}
	
	/**
	 * Sets region data to a designated node
	 * @param node Configuration node
	 * @param data Data to be set
	 */
	public static void setDouble(String node, double data)
	{
		CommandManager.getPlugin().getRegionData().set(node, data);
	}
	
	/**
	 * Sets region data to a designated node
	 * @param node Configuration node
	 * @param data Data to be set
	 */
	public static void setList(String node, List<String> data)
	{
		CommandManager.getPlugin().getRegionData().set(node, data);
	}
	
	/**
	 * Saves region data to a file.
	 * This should not be used too often due to possible server lag
	 */
	public static void saveData()
	{
		CommandManager.getPlugin().saveRegionData();
	}
}
