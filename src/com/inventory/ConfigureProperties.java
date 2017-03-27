/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.inventory;

/**
 *
 * @author rajan.chaturvedi
 */

import java.io.FileInputStream;
import java.util.Properties;
public class ConfigureProperties {
    public static Properties loadProperties()throws Exception{
         FileInputStream fis = null;
         Properties properties = new Properties();
		try
		{
			fis = new FileInputStream("DbSetting.properties");
			properties.load(fis);
             
		}
		catch (Exception e)
		{
                    e.printStackTrace();
			throw new Exception("Failed to Load Properties");
		}
		finally
		{
			try
			{
				if (fis != null)
					fis.close();
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
               return properties;
    }
}
