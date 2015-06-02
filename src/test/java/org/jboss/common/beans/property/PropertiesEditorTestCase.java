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

import java.util.Comparator;
import java.util.Properties;

import org.junit.Before;

/**
 * @author baranowb
 */
public class PropertiesEditorTestCase extends PropertyEditorTester<Properties> {

    private Properties testedProperties;

    @Before
    public void initProperties() {
        testedProperties = new Properties();
        testedProperties.setProperty("prop1", "value1");
        testedProperties.setProperty("prop2", "value2");
        testedProperties.setProperty("prop3", "value3");
        testedProperties.setProperty("prop32", "value3");
    }

    @Override
    public String[] getInputData() {
        return new String[]{"prop1=value1\nprop2=value2\nprop3=value3\nprop32=value3\n"};
    }

    @Override
    public Object[] getOutputData() {
        // The expected instance for each inputData value

        return new Object[]{testedProperties};
    }

    @Override
    public String[] getConvertedToText() {
        return new String[]{testedProperties.toString()};
    }

    @Override
    public Comparator<Properties> getComparator() {
        return null;
    }

    @Override
    public Class getType() {
        return Properties.class;
    }

}
