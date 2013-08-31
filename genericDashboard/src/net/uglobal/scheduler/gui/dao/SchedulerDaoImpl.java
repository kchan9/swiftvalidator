package net.uglobal.scheduler.gui.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class SchedulerDaoImpl extends JdbcDaoSupport implements SchedulerDao, SQLStatements {

	public Integer getActionSequence() {
		return getSequenceByName("action_seq");
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Integer getSequenceByName(String seqName) {
		final String SQL = GET_SEQ_BY_NAME;

		final List<Integer> list = new ArrayList<Integer>();
		getJdbcTemplate().query(SQL, new Object[] { seqName }, new int[] { java.sql.Types.VARCHAR },
				new ResultSetExtractor() {
					@Override
					public Object extractData(ResultSet rs) throws SQLException, DataAccessException {
						while (rs.next()) {
							Integer s = rs.getInt("seq");
							list.add(s);
						}
						return null;
					}
				});
		return list.size() == 1 ? list.get(0) : null;
	}

	public boolean updateSequenceByName(Integer seq, String name) {
		String SQL = UPDATE_SEQ_BY_NAME;
		int rowsInserted = getJdbcTemplate().update(SQL, new Object[] { seq, name });

		if (rowsInserted != 1) {
			logger.error("Failed to update sequence. name=" + name + ", seq=" + seq);
			return false;
		}
		return true;
	}

	public boolean updateActionSequenceByName(Integer seq) {
		return updateSequenceByName(seq, "action_seq");
	}

}
