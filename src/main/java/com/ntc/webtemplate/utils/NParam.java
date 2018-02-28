/*
 * Copyright 2015 nghiatc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ntc.webtemplate.utils;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author nghiatc
 * @since May 10, 2015
 */
public class NParam {
    private static String getParameterAsString(HttpServletRequest req, String paramName) throws Exception {
		if (paramName == null) {
			throw new Exception("Parameter name is null");
		}
		paramName = paramName.trim();
		if (paramName.isEmpty()) {
			throw new Exception("Parameter name is empty");
		}
		String value = req.getParameter(paramName);
		if (value == null){
		    throw new Exception("Parameter null");
		}
		return value;
	}
    
    public static Boolean parseBoolean(String strVal) {
		if (strVal != null) {
			strVal = strVal.trim();
			if (strVal.equalsIgnoreCase("true")) {
				return true;
			} else if (strVal.equalsIgnoreCase("false")) {
				return false;
			} else if (strVal.equalsIgnoreCase("yes")) {
				return true;
			} else if (strVal.equalsIgnoreCase("no")) {
				return false;
			} else if (strVal.equalsIgnoreCase("on")) {
				return true;
			} else if (strVal.equalsIgnoreCase("off")) {
				return false;
			} else if (strVal.equalsIgnoreCase("1")) {
				return true;
			} else if (strVal.equalsIgnoreCase("0")) {
				return false;
			}
		}
		return null;
	}

	public static boolean parseBoolean(String strVal, boolean defaultVal) {
		Boolean ret = parseBoolean(strVal);
		if (ret != null) {
			return ret.booleanValue();
		} else {
			return defaultVal;
		}
	}

	////////////////////////////////////////////////////////////////////////////
	// parse param with throwing exceptions
	public static Boolean getBoolean(HttpServletRequest req, String paramName) throws Exception, NumberFormatException {
		String strVal = getParameterAsString(req, paramName);
		Boolean ret = parseBoolean(strVal);
		if (ret != null) {
			return ret;
		} else {
			throw new NumberFormatException("Wrong format while parsing boolean");
		}
	}

	public static Byte getByte(HttpServletRequest req, String paramName) throws Exception, NumberFormatException {
		return Byte.valueOf(getParameterAsString(req, paramName));
	}

	public static Double getDouble(HttpServletRequest req, String paramName) throws Exception, NumberFormatException {
		return Double.valueOf(getParameterAsString(req, paramName));
	}

	public static Float getFloat(HttpServletRequest req, String paramName) throws Exception, NumberFormatException {
		return Float.valueOf(getParameterAsString(req, paramName));
	}

	public static Integer getInt(HttpServletRequest req, String paramName) throws Exception, NumberFormatException {
		return Integer.valueOf(getParameterAsString(req, paramName));
	}

	public static Long getLong(HttpServletRequest req, String paramName) throws Exception, NumberFormatException {
		return Long.valueOf(getParameterAsString(req, paramName));
	}

	public static Short getShort(HttpServletRequest req, String paramName) throws Exception, NumberFormatException {
		return Short.valueOf(getParameterAsString(req, paramName));
	}

	public static String getString(HttpServletRequest req, String paramName) throws Exception {
		return getParameterAsString(req, paramName);
	}

	////////////////////////////////////////////////////////////////////////////
	// parse param without throwing exception (use defaultVal instead)
	public static Boolean getBoolean(HttpServletRequest req, String paramName, Boolean defaultVal) {
		try {
			return getBoolean(req, paramName);
		} catch (Exception ex) {
			return defaultVal;
		}
	}

	public static Byte getByte(HttpServletRequest req, String paramName, Byte defaultVal) {
		try {
			return getByte(req, paramName);
		} catch (Exception ex) {
			return defaultVal;
		}
	}

	public static Double getDouble(HttpServletRequest req, String paramName, Double defaultVal) {
		try {
			return getDouble(req, paramName);
		} catch (Exception ex) {
			return defaultVal;
		}
	}

	public static Float getFloat(HttpServletRequest req, String paramName, Float defaultVal) {
		try {
			return getFloat(req, paramName);
		} catch (Exception ex) {
			return defaultVal;
		}
	}

	public static Integer getInt(HttpServletRequest req, String paramName, Integer defaultVal) {
		try {
			return getInt(req, paramName);
		} catch (Exception ex) {
			return defaultVal;
		}
	}

	public static Long getLong(HttpServletRequest req, String paramName, Long defaultVal) {
		try {
			return getLong(req, paramName);
		} catch (Exception ex) {
			return defaultVal;
		}
	}

	public static Short getShort(HttpServletRequest req, String paramName, Short defaultVal) {
		try {
			return getShort(req, paramName);
		} catch (Exception ex) {
			return defaultVal;
		}
	}

	public static String getString(HttpServletRequest req, String paramName, String defaultVal) {
		try {
			return getString(req, paramName);
		} catch (Exception ex) {
			return defaultVal;
		}
	}

	////////////////////////////////////////////////////////////////////////////
	// parse param without throwing exception return null
	public static Boolean getBooleanOrNull(HttpServletRequest req, String paramName) {
		return getBoolean(req, paramName, null);
	}

	public static Byte getByteOrNull(HttpServletRequest req, String paramName) {
		return getByte(req, paramName, null);
	}

	public static Double getDoubleOrNull(HttpServletRequest req, String paramName) {
		return getDouble(req, paramName, null);
	}

	public static Float getFloatOrNull(HttpServletRequest req, String paramName) {
		return getFloat(req, paramName, null);
	}

	public static Integer getIntOrNull(HttpServletRequest req, String paramName) {
		return getInt(req, paramName, null);
	}

	public static Long getLongOrNull(HttpServletRequest req, String paramName) {
		return getLong(req, paramName, null);
	}

	public static Short getShortOrNull(HttpServletRequest req, String paramName) {
		return getShort(req, paramName, null);
	}

	public static String getStringOrNull(HttpServletRequest req, String paramName) {
		return getString(req, paramName, null);
	}
}
