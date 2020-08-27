# coding-challenge
Simple web-services challenge on Spring-Boot and H2

### Requirement
* Create a microservice to retrieve an **Employee** record for the given employee-id.
  * Initial requirement - No need of mapping **Employee** to **Department** and **Address**
  * Once the initial requirement is achieved (if time permits) - Map the entities
* Before sending the record, add a new field to the **Employee** record named `encodedName` and add the Base64 encoded value of *[firstName]_[lastName]* of the already retrieved **Employee** record 
* Use the provided code for the **_Encode_** microservice and pass the above values to get the Base64 encoded value
* Implement a **Global Exception Handler**

### The following are available for you
* A H2 database (provided as the DB and as the SQL Script in the `db` directory) as your persistence store.
  * ER diagram of the DB schema is available below
* Encode service (Rest Controller, Service Interface and Service Implementation)
* Domain entity classes for Employee, Department and Address

### Following is the ER diagram for the DB.

![ER Diagram](/images/er.png)

### Service Output

```json
{
  "id": 1,
  "firstName": "Nick",
  "lastName": "Fury",
  "departmentId": 1,
  "encodedName" : "Tmlja19GdXJ5"
}
```
