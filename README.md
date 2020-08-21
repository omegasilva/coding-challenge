# coding-challenge
Simple web-services challenge on Spring-Boot and H2

### Requirement
* Create a microservice to retrieve an **Employee** record for the given employee-id.
* Before sending the record, add a new field to the **Employee** record named `encodedName` and add the Base64 encoded value of *[firstName]_[lastName]* of the already retrieved **Employee** record 
* Use the provided code for the **_Encode_** microservice and pass the above values to get the Base64 encoded value

Use an H2 database (provided as the DB and as the SQL Script in the `db` directory) as your persistence store.

### Following is the ER diagram for the DB.

![ER Diagram](/images/er.png)
