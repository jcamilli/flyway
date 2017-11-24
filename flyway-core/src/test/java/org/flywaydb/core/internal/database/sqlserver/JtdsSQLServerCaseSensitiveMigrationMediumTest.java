/*
 * Copyright 2010-2017 Boxfuse GmbH
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
package org.flywaydb.core.internal.database.sqlserver;

import org.flywaydb.core.internal.util.jdbc.DriverDataSource;
import org.junit.experimental.categories.Category;
import org.flywaydb.core.DbCategory;

import javax.sql.DataSource;
import java.util.Properties;

import static org.flywaydb.core.internal.database.sqlserver.SQLServerMigrationTestCase.JDBC_PASSWORD;
import static org.flywaydb.core.internal.database.sqlserver.SQLServerMigrationTestCase.JDBC_PORT;
import static org.flywaydb.core.internal.database.sqlserver.SQLServerMigrationTestCase.JDBC_USER;

/**
 * Test to demonstrate the migration functionality using SQL Server with the Jtds driver.
 */
@Category(DbCategory.SQLServer.class)
public class JtdsSQLServerCaseSensitiveMigrationMediumTest extends SQLServerCaseSensitiveMigrationTestCase {
    @Override
    protected DataSource createDataSource(Properties customProperties) {
        return new DriverDataSource(Thread.currentThread().getContextClassLoader(), null,
                "jdbc:jtds:sqlserver://localhost:"+ JDBC_PORT +"/flyway_db_jtds_case_sensitive", JDBC_USER, JDBC_PASSWORD);
    }
}