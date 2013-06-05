/**
 *  Copyright 2011 Colin Alworth
 * 
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */
package samples.easychatroom.shared;

import org.webbitserver.gwt.shared.Server;

import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * Simple example of methods a server can have that can be invoked by a client.
 *
 */
@RemoteServiceRelativePath("/chat")
public interface ChatServer extends Server<ChatServer, ChatClient> {
	/**
	 * Brings the user into the chat room, with the given username
	 * @param username the name to use
	 */
	void login(String username);

	/**
	 * Sends the given message to the chatroom
	 * @param message the message to say to the room
	 */
	void say(String message);
}
