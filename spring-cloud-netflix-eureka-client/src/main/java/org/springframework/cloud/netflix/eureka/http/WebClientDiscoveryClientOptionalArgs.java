/*
 * Copyright 2017-2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.cloud.netflix.eureka.http;

import java.util.function.Supplier;

import com.netflix.discovery.AbstractDiscoveryClientOptionalArgs;

import org.springframework.web.reactive.function.client.WebClient;

/**
 * @author Daniel Lavoie
 * @author Haytham Mohamed
 */
public class WebClientDiscoveryClientOptionalArgs
		extends AbstractDiscoveryClientOptionalArgs<Void> {

	@Deprecated
	public WebClientDiscoveryClientOptionalArgs() {
		this(WebClient::builder);
	}

	public WebClientDiscoveryClientOptionalArgs(Supplier<WebClient.Builder> builder) {
		setTransportClientFactories(new WebClientTransportClientFactories(builder));
	}

}
