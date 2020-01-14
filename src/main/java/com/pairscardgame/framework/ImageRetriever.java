package com.pairscardgame.framework;

import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;

public class ImageRetriever {
	
	public ImageRetriever() {
		super();
	}
	
	public static URL getImage(final String pathAndFileName) {
	    final URL url = Thread.currentThread().getContextClassLoader().getResource(pathAndFileName);
	    System.out.println(url);
	    return url;
	}
}
