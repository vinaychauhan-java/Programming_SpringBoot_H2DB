# Programming_SpringBoot-H2DB


### **Operations**
- GET
  - localhost:8080/api/users
  - localhost:8080/api/users/101
- POST
  - localhost:8080/api/users
- PUT
  - localhost:8080/api/users/101
- DELETE
  - localhost:8080/api/users/101
  - localhost:8080/api/users


<br>
<hr>

###### Request Body :-
- POST :
  ```json
  {
    "firstName": "Ananya",
    "lastName": "Chauhan",
    "posts": [
        {
            "comment": "Ananya @ Comments - 1"
        }
    ]
  }
  ```
- PUT : 
  ```json
  {
  "firstName": "Avyaan",
  "lastName": "Chauhan",
  "posts": [
    {
      "comment": "Avyaan @ Comments - 1"
    },
    {
      "comment": "Avyaan @ Comments - 2"
    }
    ]
  }
  ```
<br>
<hr>

###### H2-Console Information:-
- URL : http://localhost:8080/h2-console