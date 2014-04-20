// CloudCoder - a web-based pedagogical programming environment
// Copyright (C) 2011-2014, Jaime Spacco <jspacco@knox.edu>
// Copyright (C) 2011-2014, David H. Hovemeyer <david.hovemeyer@gmail.com>
//
// This program is free software: you can redistribute it and/or modify
// it under the terms of the GNU Affero General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU Affero General Public License for more details.
//
// You should have received a copy of the GNU Affero General Public License
// along with this program.  If not, see <http://www.gnu.org/licenses/>.

package org.cloudcoder.app.server.persist.txn;

import java.sql.Connection;
import java.sql.SQLException;

import org.cloudcoder.app.server.persist.util.AbstractDatabaseRunnableNoAuthException;
import org.cloudcoder.app.shared.model.Course;
import org.cloudcoder.app.shared.model.OperationResult;
import org.cloudcoder.app.shared.model.Problem;

/**
 * Database transaction to import all {@link Problem}s from an
 * existing course, adding them to given destination course.
 * 
 * @author David Hovemeyer
 */
public class ImportAllProblemsFromCourse extends AbstractDatabaseRunnableNoAuthException<OperationResult> {
	private Course source;
	private Course dest;

	/**
	 * Constructor.
	 * 
	 * @param source the course to import {@link Problem}s from
	 * @param dest   the course to add the {@link Problem}s to
	 */
	public ImportAllProblemsFromCourse(Course source, Course dest) {
		this.source = source;
		this.dest = dest;
	}

	@Override
	public OperationResult run(Connection conn) throws SQLException {
		// TODO: implement
		return new OperationResult(true, "This doesn't actually do anything yet");
	}

	@Override
	public String getDescription() {
		return " import all exercises from course";
	}
}