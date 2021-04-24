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
package org.netbeans.modules.cnd.modelimpl.repository;

import java.io.IOException;
import org.netbeans.modules.cnd.modelimpl.csm.core.CsmObjectFactory;
import org.netbeans.modules.cnd.repository.api.UnitDescriptor;
import org.netbeans.modules.cnd.repository.spi.*;
import org.netbeans.modules.cnd.utils.cache.CndFileUtils;
import org.openide.util.CharSequences;

/**
 *
 */
public final class ReferencesIndexKey extends ProjectContainerKey {

    public static final CharSequence UNIT_NAME = CharSequences.create("Global$$Model$$Data"); // NOI18N

    public ReferencesIndexKey() {
        super(KeyUtilities.getUnitId(new UnitDescriptor(UNIT_NAME, CndFileUtils.getLocalFileSystem())));
        // TODO: ???
//        KeyUtilities.getFileIdByName(getUnitId(), "ReferencesIndexKey$$"); // NOI18N
    }

    public ReferencesIndexKey(KeyDataPresentation presentation) {
        super(presentation);
    }

    @Override
    public String toString() {
        return "RefIndexKey " + getUnitId(); // NOI18N
    }

    @Override
    public PersistentFactory getPersistentFactory() {
        return CsmObjectFactory.instance();
    }

    @Override
    public void write(RepositoryDataOutput aStream) throws IOException {
        super.write(aStream);
    }

    /*package*/ ReferencesIndexKey(RepositoryDataInput aStream) throws IOException {
        super(aStream);
    }

    @Override
    public int getDepth() {
        assert super.getDepth() == 0;
        return 0;
    }

    @Override
    public int getSecondaryDepth() {
        return 1;
    }

    @Override
    public int getSecondaryAt(int level) {
        assert level == 0;
        return getHandler();
    }

    @Override
    public boolean hasCache() {
        return true;
    }

    @Override
    public short getHandler() {
        return KeyObjectFactory.KEY_MODEL_INDEX_KEY;
    }
}
