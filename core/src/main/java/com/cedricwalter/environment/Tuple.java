package com.cedricwalter.environment;

/**
 * This file is part of SystemInformation4j.
 * <p>
 * SystemInformation4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * <p>
 * SystemInformation4j is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * <p>
 * You should have received a copy of the GNU General Public License
 * along with SystemInformation4j.  If not, see <http://www.gnu.org/licenses/>.
 *
 * @copyright cedric.walter
 *
 * @param <String>
 */
public class Tuple<String> implements Comparable {
    public final String key;

    public final String value;

    public Tuple(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public int compareTo(Object o) {
        return ((String) o).equals(key) ? 0 : 1;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

}