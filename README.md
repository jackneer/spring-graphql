# spring_graphql

A boilerplate project of applying graphql on Spring Boot.

## Requirements

- JDK 8
- gradle
- MySQL

## Setup

- Create a database
- Modify application.properties for database connection
- Run with command

```
gradle bootrun
```

- Open browser at

```
localhost:8080/graphiql
```

- Insert some data to database (Person and Article)
- Run with

```
{
    person(uuid: 1) {
        name
        age
    }
    people {
        name
        age
        articles {
            title
            content
        }
    }
}
```

## Development

### Query
- Add schema at src/main/resource/graphql/*.graphqls
- Add query functions in src/main/java/com/box/graphql/query/Query/java
- Call service/repository for retriving data