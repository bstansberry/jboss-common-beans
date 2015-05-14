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

import java.math.BigDecimal;
import java.util.Comparator;

/**
 * @author baranowb
 */
public class BigDecimalEditorTestCase extends PropertyEditorTester<BigDecimal> {

    @Override
    public String[] getInputData() {
        return new String[]{"-1", "+1234567890", "-1234567890"};
    }

    @Override
    public Object[] getOutputData() {
        return new Object[]{new BigDecimal("-1"), new BigDecimal("+1234567890"), new BigDecimal("-1234567890")};
    }

    @Override
    public String[] getConvertedToText() {
        return new String[]{"-1", "1234567890", "-1234567890"};
    }

    @Override
    public Comparator<BigDecimal> getComparator() {
        // BigDecimal is a star class, not like AtomicX, it overrides equals!
        return null;
    }

    @Override
    public Class getType() {
        return BigDecimal.class;
    }
}
