// This file is part of DiverCity
// DiverCity is based on MicropolisJ
// Copyright (C) 2013 Jason Long
// Portions Copyright (C) 1989-2007 Electronic Arts Inc.
//
// MicropolisJ is free software; you can redistribute it and/or modify
// it under the terms of the GNU GPLv3, with additional terms.
// See the README file, included in this distribution, for details.

package micropolisj;

import javax.swing.*;

import micropolisj.gui.MainWindow;
import micropolisj.gui.SplashScreen;

import java.io.FileNotFoundException;
import java.util.Locale;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main
{
	static String filePath = "language";
	static FileReader fileReader;
	static BufferedReader reader;
	public static String language;
	public static String country;

	public static String getLanguage(){
		try {
			fileReader = new FileReader(filePath);
			reader = new BufferedReader(fileReader);
			String text = reader.readLine();
			language = text.substring(0,2);
			country = text.substring(3,5);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// Fechar o reader
			try {
				if (reader != null) {
					reader.close();
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		return language;
	}

	public static String getCountry(){
		getLanguage();
		return country;
	}

	public static Locale getLocale(String language, String country){
		return new Locale(language, country);
	}

	public static Locale locale = getLocale(getLanguage(), getCountry());
	public static SplashScreen splash = new SplashScreen();

//	public static MainWindow win = new MainWindow();
	
	static void createAndShowGUI()
	{
		splash.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		splash.setSize(800,600);
		splash.setResizable(false);
		splash.setVisible(true);
		//MainWindow win = new MainWindow();
		//win.setVisible(true);
		//win.doNewCity(true);
	}

	public static void main(String [] args)
	{
		SwingUtilities.invokeLater(new Runnable() {
		public void run() {
			createAndShowGUI();
		}});
	}
}
