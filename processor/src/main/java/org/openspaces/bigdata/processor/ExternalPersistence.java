/*
* Copyright (c) 2012 GigaSpaces Technologies Ltd. All rights reserved
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

/**
 * Interface for accessing an external persistence layer for persisting data.
 * 
 * @author Dotan Horovits
 */
package org.openspaces.bigdata.processor;

import java.io.IOException;

public interface ExternalPersistence {

	public abstract void write(Object data) throws IOException;

	public abstract void writeBulk(Object[] dataArray) throws IOException;

}