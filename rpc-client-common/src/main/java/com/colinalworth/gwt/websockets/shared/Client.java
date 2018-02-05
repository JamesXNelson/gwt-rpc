/*
 * #%L
 * rpc-client-common
 * %%
 * Copyright (C) 2011 - 2018 Vertispan LLC
 * %%
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
 * #L%
 */
package com.colinalworth.gwt.websockets.shared;

/**
 * Starting interface for building the methods the server may call on the client. User code may
 * provide an instance of this type to a Server instance created using GWT.create, and Client
 * instances will be created automatically on the server as connections are created.
 *
 * @see Server
 *
 */

public interface Client<C extends Client<C,S>, S extends Server<S,C>> {

	/**
	 * Callback called when the connection to the server has been established. Should not be called
	 * directly from the server.
	 */
	void onOpen();

	/**
	 * Callback called when the connection to the server has been closed. Should not be called
	 * directly from the server.
	 */
	void onClose();

	/**
	 * Called when an error occurs while trying to send a message to the server.
	 * @param error the error that occurred.
	 */
	void onError(Throwable error);
}
