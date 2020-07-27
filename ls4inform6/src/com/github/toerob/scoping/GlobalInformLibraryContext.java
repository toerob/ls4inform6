package com.github.toerob.scoping;

import java.io.File;
import java.util.concurrent.ConcurrentHashMap;

public class GlobalInformLibraryContext {

	public ConcurrentHashMap<String, File> libraryFilePaths = new ConcurrentHashMap<>();

	private static GlobalInformLibraryContext instance;

	private GlobalInformLibraryContext() {
	}

	public static GlobalInformLibraryContext getInstance() {
		if (instance == null) {
			instance = new GlobalInformLibraryContext();
		}
		return instance;
	}

	public ConcurrentHashMap<String, File> getLibraryFilePaths() {
		return libraryFilePaths;
	}

}