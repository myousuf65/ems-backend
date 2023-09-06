# Setting Up Your Environment for running the project


1. Clone the project to your PC
```
git clone https://github.com/myousuf65/ems-backend.git
```

2. change directory to the project
```
cd ems-backend
```

3. launch the project the IntelliJ IDEA
```
idea .
```

### Setting Up PostgreSQL database
1. Start a PostgreSQL server (either through the app or the command line)
2. Create a database called "ems"
```java
CREATE DATABASE ems;
```

3. Grant all privileges to yourself so that you can perform CRUD operations on the database
```java
GRANT ALL PRIVILEGES ON DATABASE ems TO <<your_username>>;
```

3. Open application.properties file in the source codes and fill in your username
   ```java
   spring.datasource.username=<<put_your_username_here>>
   ```
4. Run the project

5. Head back to the PSQL server

Use ```/l``` command to check if the database if created or not 

Use ```/c ems``` command to connect to the ems database

Use ```\dt``` to check if the tables are created or not

<br>
<aside>
💡 This is only the backend... Head to the Frontend Repository to Set Up the Frontend
</aside>
