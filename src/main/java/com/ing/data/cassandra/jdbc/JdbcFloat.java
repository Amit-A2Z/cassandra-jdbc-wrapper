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
package com.ing.data.cassandra.jdbc;

import java.sql.Types;

/**
 * JDBC description of {@code FLOAT} CQL type (corresponding Java type: {@link Float}).
 * <p>CQL type description: 32-bit IEEE-754 floating point.</p>
 */
public class JdbcFloat extends AbstractJdbcType<Float> {

    private static final int FLOAT_SCALE = 40;
    private static final int FLOAT_PRECISION = 7;

    /**
     * Gets a {@code JdbcFloat} instance.
     */
    public static final JdbcFloat instance = new JdbcFloat();

    JdbcFloat() {
    }

    public boolean isCaseSensitive() {
        return false;
    }

    public int getScale(final Float obj) {
        return FLOAT_SCALE;
    }

    public int getPrecision(final Float obj) {
        return FLOAT_PRECISION;
    }

    public boolean isCurrency() {
        return false;
    }

    public boolean isSigned() {
        return true;
    }

    public String toString(final Float obj) {
        if (obj != null) {
            return obj.toString();
        } else {
            return null;
        }
    }

    public boolean needsQuotes() {
        return false;
    }

    public Class<Float> getType() {
        return Float.class;
    }

    public int getJdbcType() {
        return Types.FLOAT;
    }

    public Float compose(final Object value) {
        return (Float) value;
    }

    public Object decompose(final Float value) {
        return value;
    }

}
