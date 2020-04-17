# Getting Started

1. Start both microservices

then run

```
POST / HTTP/1.1
Host: localhost:8080
Content-Type: application/json

{
	"orderId" : 1,
	"price" : 100,
	"products" : [1,2,3]
}
```

Check logs