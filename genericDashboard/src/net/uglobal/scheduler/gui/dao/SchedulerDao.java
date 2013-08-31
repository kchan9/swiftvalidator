package net.uglobal.scheduler.gui.dao;

public interface SchedulerDao {
	public Integer getActionSequence();

	public Integer getSequenceByName(String seqName);

	public boolean updateActionSequenceByName(Integer seq);

	public boolean updateSequenceByName(Integer seq, String name);
}
