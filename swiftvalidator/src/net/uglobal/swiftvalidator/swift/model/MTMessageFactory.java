package net.uglobal.swiftvalidator.swift.model;

import net.uglobal.swiftvalidator.xml.beans.MT541;
import net.uglobal.swiftvalidator.xml.beans.MTMessage;
import net.uglobal.swiftvalidator.xml.beans.MTType;

/**
 * A simple factory class that creates MTxxx object
 */
public class MTMessageFactory {
	private static MTMessageFactory instance;

	private MTMessageFactory() {
	}

	public static MTMessageFactory getInstance() {
		if (instance == null) {
			return new MTMessageFactory();
		}
		return instance;
	}

	public MTMessage getMTMessage(MTType mtType) {
		if (mtType.equals(MTType.MT541)) {
			return new MT541();
		}

		return null;
	}
}
