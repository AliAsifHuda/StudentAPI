# StudentAPI

## An API with frontend to save students into a database. 

### API GET endpoint

###### Request

``` http://localhost:8080/api/v1/student/ ```
  
###### Response
  
``` 
[
    {
        "id": 1,
        "name": "Verene",
        "email": "Verene@amazon.de",
        "age": 17,
        "dob": "2003-11-01"
    },
    {
        "id": 2,
        "name": "Ilysa",
        "email": "ikyneton3@sciencedaily.com",
        "age": 19,
        "dob": "2002-03-01"
    }
] 
```

### API UPDATE endpoint

###### Request

``` 
http://localhost:8080/api/v1/student/id?name=newName
http://localhost:8080/api/v1/student/id?email=newEmail  
http://localhost:8080/api/v1/student/id?name=newName&email=newEmail
```
  
### API DELETE endpoint

###### Request

``` 
http://localhost:8080/api/v1/student/id/
```

### API POST endpoint
  
###### Request

``` 
http://localhost:8080/api/v1/student/
```
   
###### Body
   
```
{
    "name": "Smith",
    "email": "Smith@mail.com",
    "dob": "2002-10-11"
}
 
```

### Frontend to view and delete students

<p align="center">
  <img src="https://user-images.githubusercontent.com/92206929/138507365-e6e57d52-7a65-423e-aad5-93a9c45fa2c1.png" alt="Front-endimage" width=670/>
</p>
