/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.postgresql.samples;

/**
 * This sample demonstrates how to connect to an Azure Database for PostgreSQL and how to
 * use SQL statements to query, insert, update, and delete data in the database.
 */

public final class ConnectAndQueryData {
    static String host;
    static String database;
    static String user;
    static String password;
    
    /**
     * Main entry point.
     * @param args the parameters
     */
    public static void main(String[] args) {
        try {
            // Initialize connection variables.
            host = System.getenv("PostgreSQL_HOST");
            database = System.getenv("PostgreSQL_DATABASE");
            user = System.getenv("PostgreSQL_USER");;
            password = System.getenv("PostgreSQL_PASSWORD");;
            
            // runSample(azure);

            System.out.println("Done!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}