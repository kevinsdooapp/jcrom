/**
 * This file is part of the JCROM project.
 * Copyright (C) 2008-2013 - All rights reserved.
 * Authors: Olafur Gauti Gudmundsson, Nicolas Dos Santos
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
package org.jcrom;

import org.jcrom.annotations.JcrFileNode;
import org.jcrom.annotations.JcrReference;

public class JcrFileReferenceByPathParentNode extends AbstractJcrEntity {

	private static final long serialVersionUID = -6552547713989381887L;

	@JcrReference(byPath=true)
	@JcrFileNode
	private ReferenceableJCRFile bRef;

	public JcrFileReferenceByPathParentNode() {
		super();
	}

	public ReferenceableJCRFile getbRef() {
		return bRef;
	}

	public void setbRef(ReferenceableJCRFile bRef) {
		this.bRef = bRef;
	}

}