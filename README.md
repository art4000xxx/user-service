# User Service

Микросервис для хранения информации о пользователях.  
Предоставляет REST API для получения данных о пользователе по его ID.  

## 🚀 Запуск
```bash
mvn spring-boot:run
Endpoint
GET http://localhost:8081/api/users/{userId}
Пример ответа:
{
  "id": 1,
  "fullName": "Иван Иванов",
  "address": "Москва, ул. Ленина, 10",
  "phoneNumber": "+79991234567",
  "email": "ivan@example.com"
}
