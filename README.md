# วิธีรันโปรแกรม
**รันคำสั่งนี้ใน terminal (เข้ามาในโฟลเดอร์ก่อน)**
1.Clean Project
รัน `mvn clean`
2.Run โปรแกรม
รัน `mvn spring-boot:run`

# ตัวอย่างการเรียก API
## 1. GET ทั้งหมด
GET http://localhost:8080/coffees
###### ผลลัพธ์
[
  { "id": 1, "name": "Espresso", "price": 45.0 },
  { "id": 2, "name": "Latte",    "price": 55.0 }
]
## 2. GET ตาม id
GET http://localhost:8080/coffees/1   
###### ผลลัพธ์
{ "id": 1, "name": "Espresso", "price": 45.0 }

## 3. POST เพิ่มเมนูใหม่
POST http://localhost:8080/coffees
###### ตัวอย่างข้อมูลที่ใส่เข้าไป
Body (JSON):
{ "name": "Cappuccino", "price": 60.0 }

## 4. PUT แก้ไข
PUT http://localhost:8080/coffees/2
###### ตัวอย่างข้อมูลที่ใส่เข้าไป
Body (JSON):
{ "name": "Latte", "price": 50.0 }
###### ผลลัพธ์
{ "id": 2, "name": "Latte", "price": 50.0 }    ราคาเปลี่ยนแล้ว

## 5. DELETE ลบ
DELETE http://localhost:8080/coffees/3
###### ผลลัพธ์
"Deleted Successfully"


