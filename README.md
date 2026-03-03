<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>

<h1 align="center">CSV Data Ingestion with JPA & PostgreSQL</h1>

<p>
  Java backend application that reads a CSV file, maps records to <code>Person</code> entities,
  and persists them into a PostgreSQL database using JPA (Hibernate).
</p>

<hr>

<h2>📁 Repository Overview</h2>

<p>
This repository contains a simple but practical data ingestion pipeline demonstrating:
</p>
<ul>
  <li>CSV file parsing</li>
  <li>Entity mapping with JPA (Hibernate)</li>
  <li>PostgreSQL data persistence</li>
  <li>Layered application structure</li>
</ul>

<p>
The CSV file <code>personsList.csv</code> in the root exemplifies input data format used by the application. :contentReference[oaicite:2]{index=2}
</p>

<hr>

<h2>🧱 Project Structure</h2>

<pre>
.
├── .idea/
├── src/
│   └── main/
│       └── java/
│           └── application
|           └── domain.entities
|           └── service
├── personsList.csv
├── pom.xml
└── README.html
</pre>

<p>
Fully Java-based, no frameworks like Spring Boot required — the project uses vanilla JPA + Hibernate. :contentReference[oaicite:3]{index=3}
</p>

<hr>

<h2>📘 Getting Started</h2>

<ol>
  <li>Install Java 17+ and Maven</li>
  <li>Install and run PostgreSQL</li>
  <li>Create a database for this project</li>
  <li>Update <code>persistence.xml</code> with PostgreSQL connection details</li>
  <li>Build and run the application with Maven:</li>
</ol>

<pre>
mvn clean install
mvn exec:java
</pre>

<hr>

<h2>🗂 CSV Input Format</h2>

<p>
The CSV file must use comma-separated values with one person per line. Example:
</p>

<pre>
John,Doe,john@example.com,...
Ana,Smith,ana@example.com,...
Carlos,Silva,carlos@example.com,...
</pre>

<hr>

<h2>🛠 Key Components</h2>

<ul>
  <li><strong>Entity</strong>: JPA mapped <code>Person</code></li>
  <li><strong>Utility</strong>: <code>JpaUtil</code> for managing <code>EntityManagerFactory</code></li>
  <li><strong>Reader</strong>: CSV parser using <code>BufferedReader</code></li>
  <li><strong>Main</strong>: Orchestrates ingestion and persistence</li>
</ul>

<hr>

<h2>📌 Database Persistence</h2>

<p>
Hibernate auto-generates the schema based on your entity definitions. PostgreSQL is used as the target RDBMS — make sure the driver dependency in <code>pom.xml</code> is correct. :contentReference[oaicite:4]{index=4}
</p>

<p>
Hibernate may generate columns in alphabetical order, but column order does not affect correctness — only names matter for mapping. <!-- explained separately earlier -->
</p>

<hr>

<h2>🚀 Features</h2>

<ul>
  <li>CSV ingestion with error handling</li>
  <li>Object mapping to Java POJOs</li>
  <li>JPA lifecycle management</li>
  <li>PostgreSQL persistence</li>
</ul>

<hr>

<h2>🔖 Topics</h2>

<p>
java • jpa • hibernate • postgresql • data-ingestion • csv • persistence • orm • database
</p>
</body>
</html>
