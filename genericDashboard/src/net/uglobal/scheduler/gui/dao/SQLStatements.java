package net.uglobal.scheduler.gui.dao;

public interface SQLStatements {
	public static final String GET_SEQ_BY_NAME = "select seq from sequences where name = ?";
	public static final String UPDATE_SEQ_BY_NAME = "update sequences set seq=? where name=? ";
}
