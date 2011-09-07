/*
 * Copyright 2011 Mikhail Lopatkin
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.bitbucket.mlopatkin.android.liblogcat;

import java.util.HashMap;
import java.util.Map;

/**
 * Simple wrapper around the Map class that performs conversion from a PID to a
 * process name.
 */
public class PidToProcessConverter {

    private Map<Integer, String> pidToName = new HashMap<Integer, String>();

    public synchronized void put(int pid, String name) {
        pidToName.put(pid, name);
    }

    public synchronized String getProcessName(int pid) {
        return pidToName.get(pid);
    }
}
