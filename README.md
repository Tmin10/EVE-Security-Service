# EVE-Security-Service

v.0.2.0

Second prototype

This application is support SSO auth process and can display character information.

## Configuration

For correct work application need `config.json` file in the same directory as the `server.jar`.
```javascript
{
    //EVE SSO auth params
    "client_id": "",
    "scope": "",
    "redirect_uri": "",
    "client_secret": "",

    //Application PostgreSQL db params
    "dbHost": "127.0.0.1",
    "dbPort": "5432",
    "dbName": "",
    "dbUser": "",
    "dbPassword": "",
    "dbSchema": "public"
}
```

## Application start

```
java -jar server.jar
```