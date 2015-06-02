/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2011, Red Hat, Inc., and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.jboss.common.beans.property;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author baranowb
 */
public class LongArrayEditorTestCase extends PropertyEditorTester<long[]> {

    @Override
    public String[] getInputData() {
        return new String[]{"1,-1,0,1000"};
    }

    @Override
    public Object[] getOutputData() {
        return new Object[]{new long[]{1, -1, 0, 1000}};
    }

    @Override
    public String[] getConvertedToText() {
        return getInputData();
    }

    @Override
    public Comparator<long[]> getComparator() {
        return new LongArrayComparator();
    }

    @Override
    public Class getType() {
        return long[].class;
    }

    @Override
    public String logT(long[] t) {
        if (t == null) {
            return "<null>";
        } else {
            return Arrays.toString(t);
        }
    }

    class LongArrayComparator implements Comparator<long[]> {

        @Override
        public int compare(long[] o1, long[] o2) {
            return Arrays.equals(o1, o2) ? 0 : 1;
        }

    }
}
