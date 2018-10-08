package org.apache.velocity.test;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;

/**
 * This class tests passing expressions as method arguments
 */

public class DashInIdentifiersTestCase extends BaseTestCase
{
    public DashInIdentifiersTestCase(final String name)
    {
        super(name);
    }

    protected void setUpEngine(VelocityEngine engine)
    {
        engine.addProperty("parser.allows.dash.in.identifiers", true);
    }

    public void testDash()
    {
        assertEvalEquals("6","#set($var-1 = 7)#set($var-2 = $var-1 - 1)$var-2");
    }
}
