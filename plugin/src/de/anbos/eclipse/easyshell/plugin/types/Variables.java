/**
 * Copyright (c) 2014-2021 Andre Bossert <anb0s@anbos.de>.
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */

package de.anbos.eclipse.easyshell.plugin.types;

import java.util.HashMap;
import java.util.Map;

public class Variables {
    static Map<String, IVariableResolver> map = new HashMap<String, IVariableResolver>();
    public static Map<String, IVariableResolver> getMap() {
        return map;
    }
    static {
        for(int i=0;i<Variable.values().length;i++) {
            map.put(Variable.values()[i].getName(), Variable.values()[i].getResolver());
        }
    }
}
