/* infoScoop OpenSource
 * Copyright (C) 2010 Beacon IT Inc.
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License version 3
 * as published by the Free Software Foundation.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/lgpl-3.0-standalone.html>.
 */

package org.infoscoop.admin.exception;

import java.util.List;

public class MenusIllegalEditException extends Exception{
	private static final long serialVersionUID = MenusIllegalEditException.class.getName().hashCode();
	List<String> errorSitetopIdList;
	
	public MenusIllegalEditException(List<String> errorSitetopIdList) {
		this.errorSitetopIdList = errorSitetopIdList;
	}
	
	public List<String> getErrorSitetopIdList() {
		return errorSitetopIdList;
	}
}
