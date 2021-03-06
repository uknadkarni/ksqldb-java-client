/*
 * Copyright 2012-2019 the original author or authors.
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

package dev.daniellavoie.ksqldb.client.tests.ksql;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import dev.daniellavoie.ksqldb.client.api.ksql.KsqlRequest;
import dev.daniellavoie.ksqldb.client.api.ksql.TablesResponse;
import dev.daniellavoie.ksqldb.client.tests.EndpointTest;

public class ShowTableTest extends EndpointTest {
	@Test
	public void assertShowTable() {
		TablesResponse response = ksqlDBClient.tables(new KsqlRequest("SHOW TABLES;")).blockFirst();

		Assertions.assertNotNull(response);
	}
}
