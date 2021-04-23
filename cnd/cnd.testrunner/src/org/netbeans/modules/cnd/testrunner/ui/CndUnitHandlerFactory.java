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
package org.netbeans.modules.cnd.testrunner.ui;

import java.util.Collections;
import java.util.List;
import org.netbeans.modules.cnd.testrunner.spi.TestHandlerFactory;
import org.netbeans.modules.cnd.testrunner.spi.TestRecognizerHandler;
import org.netbeans.modules.gsf.testrunner.api.Trouble;

/**
 * An empty TestHandlerFactory.
 */
public class CndUnitHandlerFactory implements TestHandlerFactory {

    @Override
    public List<TestRecognizerHandler> createHandlers() {
        return Collections.emptyList();
    }

    @Override
    public boolean printSummary() {
        return true;
    }

    static Trouble.ComparisonFailure getComparisonFailure(String displayName) {
        return new Trouble.ComparisonFailure(displayName, displayName);
    }

    
}
