package com.accenture.tcf.bars.file;

import java.io.File;
import java.util.logging.Logger;

public abstract class AbstractOutputFile {
	
	private File file;
	
	protected Logger logger;

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

}
