# SDIS-2-Server

### To compile (compile from src):
#### Windows
 ``` javac -cp ".;./lib/json-20090211.jar;" */*.java ```

Alternatively,  ``` javac -cp ".;./lib/json-20090211.jar;" server/*.java handler/*.java states/*.java ```

#### Linux
 ``` javac -cp ".:./lib/json-20090211.jar:" */*.java ``` 

### To open server execute:
#### Windows:
 ``` java -classpath ".;sqlite-jdbc-3.16.1.jar;./lib/json-20090211.jar;" server/GameServer  ```

#### Linux:
 ``` java -classpath ".:sqlite-jdbc-3.16.1.jar:./lib/json-20090211.jar:" server/GameServer  ```
