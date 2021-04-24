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

package org.netbeans.modules.cnd.makefile.parser;

import java.util.Collections;
import java.util.List;
import org.netbeans.modules.cnd.api.makefile.MakefileElement;
import org.netbeans.modules.csl.api.Error;
import org.netbeans.modules.csl.spi.ParserResult;
import org.netbeans.modules.parsing.api.Snapshot;

/**
 */
public class MakefileParseResult extends ParserResult {

    private final List<MakefileElement> elements;

    public MakefileParseResult(Snapshot snapshot, List<MakefileElement> elements) {
        super(snapshot);
        this.elements = Collections.unmodifiableList(elements);
    }

    public List<MakefileElement> getElements() {
        return elements;
    }

    @Override
    public List<? extends Error> getDiagnostics() {
        return Collections.emptyList();
    }

    @Override
    protected void invalidate() {
    }
}
