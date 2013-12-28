/*
 * Copyright 2013 Peter Lawrey
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.openhft.chronicle.sandbox;

public class VanillaChronicleConfig {
    private String cycleFormat = "yyyyMMdd";
    private int cycleLength = 24 * 60 * 60 * 1000; // MILLIS_PER_DAY
    private long indexBlockSize = 16 << 20; // 16 MB
    private long dataBlockSize = 64 << 20; // 16 MB

    public VanillaChronicleConfig cycleFormat(String cycleFormat) {
        this.cycleFormat = cycleFormat;
        return this;
    }

    public String cycleFormat() {
        return cycleFormat;
    }

    public VanillaChronicleConfig cycleFormat(int cycleLength) {
        this.cycleLength = cycleLength;
        return this;
    }

    public int cycleLength() {
        return cycleLength;
    }

    public VanillaChronicleConfig indexBlockSize(int indexBlockSize) {
        this.indexBlockSize = indexBlockSize;
        return this;
    }

    public long indexBlockSize() {
        return indexBlockSize;
    }

    public VanillaChronicleConfig dataBlockSize(int dataBlockSize) {
        this.dataBlockSize = dataBlockSize;
        return this;
    }

    public long dataBlockSize() {
        return dataBlockSize;
    }
}