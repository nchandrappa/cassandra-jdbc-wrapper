/*
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
package com.github.adejanovski.cassandra.jdbc;

import java.sql.Types;

public class JdbcUTF8 extends AbstractJdbcType<String> {
    public static final JdbcUTF8 instance = new JdbcUTF8();

    public JdbcUTF8() {
    }

    public boolean isCaseSensitive() {
        return true;
    }

    public int getScale(String obj) {
        return -1;
    }

    public int getPrecision(String obj) {
        return (obj == null) ? Integer.MAX_VALUE : obj.length();
    }

    public boolean isCurrency() {
        return false;
    }

    public boolean isSigned() {
        return false;
    }

    public String toString(String obj) {
        return obj;
    }

    public boolean needsQuotes() {
        return true;
    }

    public String getString(Object bytes) {
        return (bytes == null) ? null : bytes.toString();
    }

    public Class<String> getType() {
        return String.class;
    }

    public int getJdbcType() {
        return Types.VARCHAR;
    }

    public String compose(Object obj) {
        return getString(obj);
    }

    public Object decompose(String value) {
        return value;
    }
}
