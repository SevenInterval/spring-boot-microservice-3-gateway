# Microservice Gateway

## Authorization Endpoints:

### Sign Up:

````
POST /api/authentication/sign-up HTTP/1.1
Host: localhost:5555
Content-Type: application/json
Content-Length: 75

{
    "username": "test1",
    "password": "test",
    "name": "test"
}
````

### Sign In:

````
POST /api/authentication/sign-in HTTP/1.1
Host: localhost:5555
Content-Type: application/json
Content-Length: 54

{
    "username": "test1",
    "password": "test"
}
````

##### ***You need use sign in service for get a token. You have to use Bearer token on the product and transaction services.

## Product Gateway Endpoints:

### Save Product:
````
POST /gateway/product HTTP/1.1
Host: localhost:5555
Authorization: Bearer eyJhbGciOiJSUzUxMiJ9.eyJzdWIiOiJ0ZXN0MSIsInVzZXJJZCI6Miwicm9sZXMiOiJVU0VSIiwiZXhwIjoxNjQyNDQ2NjIzfQ.pZPy4-sJMa0d_corxETh7jTznQKqi2TSqknwpbhY_85p8rInOspeTXNs1r2ic8N4S0QT_RQ6OtXG6vQqIoFOXg-kkS6USMT9BqFTSBibICBkD3dsffAIa9w1mLAvJyM8lbeTbSYgyz6x2zq2zBfDiC8-hXyrZYFdjUp0qEtSvAbXKEQHqm8nmcLY4xT-JOHnEEn2U04qUnqKBiqHi9WOOq4_W7oKqxAVjHyrYwRW7MYJWgjfnQouBuMEWxqtv3ppV7qHS2mIMJNHJffYac0soke2j1WGzUadKdZDC1cfjVC5kkX8etCisg39txP7LOCsOPzNoHjyLeVq7hw791S7kg
Content-Type: application/json
Content-Length: 47

{
    "name": "Product1",
    "price": 1.2
}
````

### Get All Products:
````
GET /gateway/product HTTP/1.1
Host: localhost:5555
Authorization: Bearer eyJhbGciOiJSUzUxMiJ9.eyJzdWIiOiJ0ZXN0MSIsInVzZXJJZCI6Miwicm9sZXMiOiJVU0VSIiwiZXhwIjoxNjQyNDQ2NjIzfQ.pZPy4-sJMa0d_corxETh7jTznQKqi2TSqknwpbhY_85p8rInOspeTXNs1r2ic8N4S0QT_RQ6OtXG6vQqIoFOXg-kkS6USMT9BqFTSBibICBkD3dsffAIa9w1mLAvJyM8lbeTbSYgyz6x2zq2zBfDiC8-hXyrZYFdjUp0qEtSvAbXKEQHqm8nmcLY4xT-JOHnEEn2U04qUnqKBiqHi9WOOq4_W7oKqxAVjHyrYwRW7MYJWgjfnQouBuMEWxqtv3ppV7qHS2mIMJNHJffYac0soke2j1WGzUadKdZDC1cfjVC5kkX8etCisg39txP7LOCsOPzNoHjyLeVq7hw791S7kg
````

### Delete Product
````
DELETE /gateway/product/10 HTTP/1.1
Host: localhost:5555
Authorization: Bearer eyJhbGciOiJSUzUxMiJ9.eyJzdWIiOiJ0ZXN0MSIsInVzZXJJZCI6Miwicm9sZXMiOiJVU0VSIiwiZXhwIjoxNjQyNDQ2NjIzfQ.pZPy4-sJMa0d_corxETh7jTznQKqi2TSqknwpbhY_85p8rInOspeTXNs1r2ic8N4S0QT_RQ6OtXG6vQqIoFOXg-kkS6USMT9BqFTSBibICBkD3dsffAIa9w1mLAvJyM8lbeTbSYgyz6x2zq2zBfDiC8-hXyrZYFdjUp0qEtSvAbXKEQHqm8nmcLY4xT-JOHnEEn2U04qUnqKBiqHi9WOOq4_W7oKqxAVjHyrYwRW7MYJWgjfnQouBuMEWxqtv3ppV7qHS2mIMJNHJffYac0soke2j1WGzUadKdZDC1cfjVC5kkX8etCisg39txP7LOCsOPzNoHjyLeVq7hw791S7kg
````

## Transaction Gateway Endpoints:

### Save Transaction
````
POST /gateway/transaction HTTP/1.1
Host: localhost:5555
Authorization: Bearer eyJhbGciOiJSUzUxMiJ9.eyJzdWIiOiJ0ZXN0MSIsInVzZXJJZCI6Miwicm9sZXMiOiJVU0VSIiwiZXhwIjoxNjQyNDQ2NjIzfQ.pZPy4-sJMa0d_corxETh7jTznQKqi2TSqknwpbhY_85p8rInOspeTXNs1r2ic8N4S0QT_RQ6OtXG6vQqIoFOXg-kkS6USMT9BqFTSBibICBkD3dsffAIa9w1mLAvJyM8lbeTbSYgyz6x2zq2zBfDiC8-hXyrZYFdjUp0qEtSvAbXKEQHqm8nmcLY4xT-JOHnEEn2U04qUnqKBiqHi9WOOq4_W7oKqxAVjHyrYwRW7MYJWgjfnQouBuMEWxqtv3ppV7qHS2mIMJNHJffYac0soke2j1WGzUadKdZDC1cfjVC5kkX8etCisg39txP7LOCsOPzNoHjyLeVq7hw791S7kg
Content-Type: application/json
Content-Length: 42

{
    "userId": 2,
    "productId": 1
}
````

### Get Transaction Of User
````
GET /gateway/transaction HTTP/1.1
Host: localhost:5555
Authorization: Bearer eyJhbGciOiJSUzUxMiJ9.eyJzdWIiOiJ0ZXN0MSIsInVzZXJJZCI6Miwicm9sZXMiOiJVU0VSIiwiZXhwIjoxNjQyNDQ2NjIzfQ.pZPy4-sJMa0d_corxETh7jTznQKqi2TSqknwpbhY_85p8rInOspeTXNs1r2ic8N4S0QT_RQ6OtXG6vQqIoFOXg-kkS6USMT9BqFTSBibICBkD3dsffAIa9w1mLAvJyM8lbeTbSYgyz6x2zq2zBfDiC8-hXyrZYFdjUp0qEtSvAbXKEQHqm8nmcLY4xT-JOHnEEn2U04qUnqKBiqHi9WOOq4_W7oKqxAVjHyrYwRW7MYJWgjfnQouBuMEWxqtv3ppV7qHS2mIMJNHJffYac0soke2j1WGzUadKdZDC1cfjVC5kkX8etCisg39txP7LOCsOPzNoHjyLeVq7hw791S7kg
````

### Delete Transaction
````
DELETE /gateway/transaction/1 HTTP/1.1
Host: localhost:5555
Authorization: Bearer eyJhbGciOiJSUzUxMiJ9.eyJzdWIiOiJ0ZXN0MSIsInVzZXJJZCI6Miwicm9sZXMiOiJVU0VSIiwiZXhwIjoxNjQyNDQ2NjIzfQ.pZPy4-sJMa0d_corxETh7jTznQKqi2TSqknwpbhY_85p8rInOspeTXNs1r2ic8N4S0QT_RQ6OtXG6vQqIoFOXg-kkS6USMT9BqFTSBibICBkD3dsffAIa9w1mLAvJyM8lbeTbSYgyz6x2zq2zBfDiC8-hXyrZYFdjUp0qEtSvAbXKEQHqm8nmcLY4xT-JOHnEEn2U04qUnqKBiqHi9WOOq4_W7oKqxAVjHyrYwRW7MYJWgjfnQouBuMEWxqtv3ppV7qHS2mIMJNHJffYac0soke2j1WGzUadKdZDC1cfjVC5kkX8etCisg39txP7LOCsOPzNoHjyLeVq7hw791S7kg
````